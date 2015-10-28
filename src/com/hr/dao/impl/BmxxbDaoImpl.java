package com.hr.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hr.bean.Bmxxb;
import com.hr.dao.BmxxbDao;
import com.hr.util.DBUtil;

public class BmxxbDaoImpl implements BmxxbDao {

	public Bmxxb selectBmxxbId(int ygh) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Bmxxb Bmxxb = null;
		// 获取数据库连接
		conn = DBUtil.getConn();
		System.out.println(ygh);

		try {
			String sql = "select * from t_Bmxxb where bmh=?";
			// 获取执行sql执行对象
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, ygh);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Bmxxb = new Bmxxb(rs.getInt(1), rs.getString(2),
						rs.getString(3));
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
		return Bmxxb;
	}

	public boolean insertBmxxb(Bmxxb b) {
		boolean flag = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		// 获取数据库连接
		conn = DBUtil.getConn();
		try {
			String sql = "insert into t_Bmxxb(mc,bz) values(?,?)";
			// 获取执行sql执行对象
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, b.getMc());
			pstmt.setString(2, b.getBz());
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

	public boolean updateBmxxb(Bmxxb y) {
		boolean flag = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		// 获取数据库连接
		conn = DBUtil.getConn();
		System.out.println("useru");
		try {
			String sql = "update t_Bmxxb set bmh=?,mc=?,bz=? where bmh=?";
			// 获取执行sql执行对象
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, y.getBmh());
			pstmt.setString(2, y.getMc());
			pstmt.setString(3, y.getBz());
			pstmt.setInt(4, y.getBmh());
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

	public boolean deleteBmxxb(int ygh) {
		boolean flag = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		// 获取数据库连接
		conn = DBUtil.getConn();
		try {
			String sql = "delete from t_Bmxxb where bmh=?";
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

	public List<Bmxxb> selectBmxxbList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Bmxxb Bmxxb = null;
		List<Bmxxb> ylist = new ArrayList<Bmxxb>();
		// 获取数据库连接
		conn = DBUtil.getConn();
		try {
			String sql = "select * from t_Bmxxb order by bmh desc";
			// 获取执行sql执行对象
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Bmxxb = new Bmxxb(rs.getInt(1), rs.getString(2),
						rs.getString(3));
				// user = new User();
				// user.setygh(rs.getInt(1));
				// user.setxm(rs.getString(2));
				// user.setmm(rs.getString(3));
				// user.setQx(rs.getString(4));
				ylist.add(Bmxxb);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeDB(conn, pstmt, null);
		}
		return ylist;

	}

}
