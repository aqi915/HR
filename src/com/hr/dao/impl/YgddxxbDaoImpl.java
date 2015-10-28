package com.hr.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hr.bean.Ygddxxb;
import com.hr.dao.YgddxxbDao;
import com.hr.util.DBUtil;

public class YgddxxbDaoImpl implements YgddxxbDao {

	public Ygddxxb selectYgddxxbId(int ygh) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Ygddxxb Ygddxxb = null;
		// 获取数据库连接
		conn = DBUtil.getConn();
		System.out.println(ygh);

		try {
			String sql = "select * from t_Ygddxxb where ygh=?";
			// 获取执行sql执行对象
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, ygh);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Ygddxxb = new Ygddxxb(rs.getInt(1), rs.getString(2),
						rs.getInt(3), rs.getString(4), rs.getFloat(5),
						rs.getInt(6), rs.getString(7), rs.getFloat(8),
						rs.getString(9));
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
		return Ygddxxb;
	}

	public boolean insertYgddxxb(Ygddxxb y) {
		boolean flag = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		// 获取数据库连接
		conn = DBUtil.getConn();
		try {
			String sql = "insert into t_Ygddxxb(xm,ysbm, yzwmc,ygz,xbmh,xzwmc, xgz,ddsj) values(?,?,?,?,?,?,?,?)";
			// 获取执行sql执行对象
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, y.getXm());
			pstmt.setInt(2, y.getYsbm());
			pstmt.setString(3, y.getYzwmc());
			pstmt.setFloat(4, y.getYgz());
			pstmt.setInt(5, y.getXbmh());
			pstmt.setString(6, y.getXzwmc());
			pstmt.setFloat(7, y.getXgz());
			pstmt.setString(8, y.getDdsj());
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

	public boolean updateYgddxxb(Ygddxxb y) {
		boolean flag = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		// 获取数据库连接
		conn = DBUtil.getConn();
		System.out.println("useru");
		try {
			String sql = "update t_Ygddxxb set ygh=?,xm=?,ysbm=?, yzwmc=?,ygz=?,xbmh=?,xzwmc=?, xgz=?,ddsj=? where ygh=?";
			// 获取执行sql执行对象
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, y.getYgh());
			pstmt.setString(2, y.getXm());
			pstmt.setInt(3, y.getYsbm());
			pstmt.setString(4, y.getYzwmc());
			pstmt.setFloat(5, y.getYgz());
			pstmt.setInt(6, y.getXbmh());
			pstmt.setString(7, y.getXzwmc());
			pstmt.setFloat(8, y.getXgz());
			pstmt.setString(9, y.getDdsj());
			pstmt.setInt(10, y.getYgh());
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

	public boolean deleteYgddxxb(int ygh) {
		boolean flag = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		// 获取数据库连接
		conn = DBUtil.getConn();
		try {
			String sql = "delete from t_Ygddxxb where ygh=?";
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

	public List<Ygddxxb> selectYgddxxbList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Ygddxxb ygddxxb = null;
		List<Ygddxxb> ylist = new ArrayList<Ygddxxb>();
		// 获取数据库连接
		conn = DBUtil.getConn();
		try {
			String sql = "select * from t_Ygddxxb order by ygh desc";
			// 获取执行sql执行对象
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				ygddxxb = new Ygddxxb(rs.getInt(1), rs.getString(2),
						rs.getInt(3), rs.getString(4), rs.getFloat(5),
						rs.getInt(6), rs.getString(7), rs.getFloat(8),
						rs.getString(9));
//				user = new User();
//				user.setygh(rs.getInt(1));
//				user.setxm(rs.getString(2));
//				user.setmm(rs.getString(3));
//				user.setQx(rs.getString(4));
				ylist.add(ygddxxb);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeDB(conn, pstmt, null);
		}
		return ylist;

	}

}
