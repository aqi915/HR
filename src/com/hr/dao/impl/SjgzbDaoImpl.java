package com.hr.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hr.bean.Sjgzb;
import com.hr.dao.SjgzbDao;
import com.hr.util.DBUtil;

public class SjgzbDaoImpl implements SjgzbDao {

	public Sjgzb selectSjgzbId(int ygh) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Sjgzb Sjgzb = null;
		// 获取数据库连接
		conn = DBUtil.getConn();
		System.out.println(ygh);

		try {
			String sql = "select * from t_Sjgzb where ygh=?";
			// 获取执行sql执行对象
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, ygh);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Sjgzb = new Sjgzb(rs.getInt(1), rs.getString(2),
						rs.getFloat(3), rs.getString(4));
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
		return Sjgzb;
	}

	public boolean insertSjgzb(Sjgzb y) {
		boolean flag = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		// 获取数据库连接
		conn = DBUtil.getConn();
		try {
			String sql = "insert into t_Sjgzb(xm, sjgz, ffrq) values(?,?,?)";
			// 获取执行sql执行对象
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, y.getXm());
			pstmt.setFloat(2, y.getSjgz());
			pstmt.setString(3, y.getFfrq());
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

	public boolean updateSjgzb(Sjgzb y) {
		boolean flag = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		// 获取数据库连接
		conn = DBUtil.getConn();
		try {
			String sql = "update t_Sjgzb set ygh=?,xm=?,sjgz=?,ffrq=? where ygh=?";
			// 获取执行sql执行对象
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, y.getYgh());
			pstmt.setString(2, y.getXm());
			pstmt.setFloat(3, y.getSjgz());
			pstmt.setString(4, y.getFfrq());
			pstmt.setInt(5, y.getYgh());
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

	public boolean deleteSjgzb(int ygh) {
		boolean flag = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		// 获取数据库连接
		conn = DBUtil.getConn();
		try {
			String sql = "delete from t_Sjgzb where ygh=?";
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

	public List<Sjgzb> selectSjgzbList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Sjgzb Sjgzb = null;
		List<Sjgzb> ylist = new ArrayList<Sjgzb>();
		// 获取数据库连接
		conn = DBUtil.getConn();
		try {
			String sql = "select * from t_Sjgzb order by ygh desc";
			// 获取执行sql执行对象
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Sjgzb = new Sjgzb(rs.getInt(1), rs.getString(2),
						rs.getFloat(3), rs.getString(4));
				// user = new User();
				// user.setygh(rs.getInt(1));
				// user.setxm(rs.getString(2));
				// user.setmm(rs.getString(3));
				// user.setQx(rs.getString(4));
				ylist.add(Sjgzb);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeDB(conn, pstmt, null);
		}
		return ylist;

	}

}
