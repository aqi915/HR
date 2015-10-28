package com.hr.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hr.bean.Jcxxb;
import com.hr.dao.JcxxbDao;
import com.hr.util.DBUtil;

public class JcxxbDaoImpl implements JcxxbDao {

	public Jcxxb selectJcxxbId(int ygh) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Jcxxb Jcxxb = null;
		// 获取数据库连接
		conn = DBUtil.getConn();
		System.out.println(ygh);

		try {
			String sql = "select * from t_Jcxxb where ygh=?";
			// 获取执行sql执行对象
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, ygh);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Jcxxb = new Jcxxb(rs.getInt(1), rs.getString(2),
						rs.getString(3), rs.getFloat(4), rs.getString(5));
				/*
				 * user = new User(); user.setygh(rs.getInt(1));
				 * user.setxm(rs.getString(2)); user.setmm(rs.getString(3));
				 * user.setQx(rs.getString(4));
				 */
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeDB(conn, pstmt, null);
		}
		return Jcxxb;
	}

	public boolean insertJcxxb(Jcxxb y) {
		boolean flag = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		// 获取数据库连接
		conn = DBUtil.getConn();
		try {
			String sql = "insert into t_Jcxxb(xm,jclb,fjgz,jcrq) values(?,?,?,?)";
			// 获取执行sql执行对象
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, y.getXm());
			pstmt.setString(2, y.getJclb());
			pstmt.setFloat(3, y.getFjgz());
			pstmt.setString(4, y.getJcrq());
			int n = pstmt.executeUpdate();
			if (n > 0) {
				flag = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeDB(conn, pstmt, null);
		}
		return flag;
	}

	public boolean updateJcxxb(Jcxxb y) {
		boolean flag = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		// 获取数据库连接
		conn = DBUtil.getConn();
		System.out.println("useru");
		try {
			String sql = "update t_Jcxxb set ygh=?,xm=?,jclb=?,fjgz=?,jcrq=? where ygh=?";
			// 获取执行sql执行对象
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, y.getYgh());
			pstmt.setString(2, y.getXm());
			pstmt.setString(3, y.getJclb());
			pstmt.setFloat(4, y.getFjgz());
			pstmt.setString(5, y.getJcrq());
			pstmt.setInt(6, y.getYgh());
			int n = pstmt.executeUpdate();
			if (n > 0) {
				flag = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeDB(conn, pstmt, null);
		}
		return flag;
	}

	public boolean deleteJcxxb(int ygh) {
		boolean flag = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		// 获取数据库连接
		conn = DBUtil.getConn();
		try {
			String sql = "delete from t_Jcxxb where ygh=?";
			// 获取执行sql执行对象
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, ygh);
			int n = pstmt.executeUpdate();
			if (n > 0) {
				flag = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeDB(conn, pstmt, null);
		}
		return flag;
	}

	public List<Jcxxb> selectJcxxbList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Jcxxb Jcxxb = null;
		List<Jcxxb> ylist = new ArrayList<Jcxxb>();
		// 获取数据库连接
		conn = DBUtil.getConn();
		try {
			String sql = "select * from t_Jcxxb order by ygh desc";
			// 获取执行sql执行对象
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Jcxxb = new Jcxxb(rs.getInt(1), rs.getString(2),
						rs.getString(3), rs.getFloat(4), rs.getString(5));
				// user = new User();
				// user.setygh(rs.getInt(1));
				// user.setxm(rs.getString(2));
				// user.setmm(rs.getString(3));
				// user.setQx(rs.getString(4));
				ylist.add(Jcxxb);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeDB(conn, pstmt, null);
		}
		return ylist;

	}

}
