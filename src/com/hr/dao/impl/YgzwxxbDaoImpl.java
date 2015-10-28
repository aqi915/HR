package com.hr.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hr.bean.Ygzwxxb;
import com.hr.dao.YgzwxxbDao;
import com.hr.util.DBUtil;

public class YgzwxxbDaoImpl implements YgzwxxbDao {

	public Ygzwxxb selectYgzwxxbId(int ygh) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Ygzwxxb Ygzwxxb = null;
		// 获取数据库连接
		conn = DBUtil.getConn();
		System.out.println(ygh);

		try {
			String sql = "select * from t_Ygzwxxb where ygh=?";
			// 获取执行sql执行对象
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, ygh);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Ygzwxxb = new Ygzwxxb(rs.getInt(1), rs.getString(2));
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
		return Ygzwxxb;
	}

	public boolean insertYgzwxxb(Ygzwxxb b) {
		boolean flag = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		// 获取数据库连接
		conn = DBUtil.getConn();
		try {
			String sql = "insert into t_Ygzwxxb(zwmc) values(?)";
			// 获取执行sql执行对象
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, b.getZwmc());
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

	public boolean updateYgzwxxb(Ygzwxxb y) {
		boolean flag = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		// 获取数据库连接
		conn = DBUtil.getConn();
		try {
			String sql = "update t_Ygzwxxb set ygh=?,zwmc=? where ygh=?";
			// 获取执行sql执行对象
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, y.getYgh());
			pstmt.setString(2, y.getZwmc());
			pstmt.setInt(3, y.getYgh());
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

	public boolean deleteYgzwxxb(int ygh) {
		boolean flag = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		// 获取数据库连接
		conn = DBUtil.getConn();
		try {
			String sql = "delete from t_Ygzwxxb where ygh=?";
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

	public List<Ygzwxxb> selectYgzwxxbList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Ygzwxxb Ygzwxxb = null;
		List<Ygzwxxb> ylist = new ArrayList<Ygzwxxb>();
		// 获取数据库连接
		conn = DBUtil.getConn();
		try {
			String sql = "select * from t_Ygzwxxb order by ygh desc";
			// 获取执行sql执行对象
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Ygzwxxb = new Ygzwxxb(rs.getInt(1), rs.getString(2));
				// user.setygh(rs.getInt(1));
				// user.setxm(rs.getString(2));
				// user.setmm(rs.getString(3));
				// user.setQx(rs.getString(4));
				ylist.add(Ygzwxxb);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeDB(conn, pstmt, null);
		}
		return ylist;

	}

}
