package com.hr.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hr.bean.Ygxxb;
import com.hr.dao.YgxxbDao;
import com.hr.util.DBUtil;

public class YgxxbDaoImpl implements YgxxbDao {

	public Ygxxb selectYgxxbId(int ygh) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Ygxxb ygxxb = null;
		// 获取数据库连接
		conn = DBUtil.getConn();
		System.out.println(ygh);

		try {
			String sql = "select * from t_ygxxb where ygh=?";
			// 获取执行sql执行对象
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, ygh);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				ygxxb = new Ygxxb(rs.getInt(1), rs.getString(2),
						rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getString(7), rs.getString(8),
						rs.getString(9), rs.getString(10), rs.getString(11),
						rs.getString(12), rs.getString(13), rs.getString(14),
						rs.getString(15), rs.getInt(16), rs.getString(17),
						rs.getString(18));
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
		return ygxxb;
	}

	public boolean insertYgxxb(Ygxxb y) {
		boolean flag = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		// 获取数据库连接
		conn = DBUtil.getConn();
		try {
			String sql = "insert into t_ygxxb(sfzh,xm,xb,csrq,jg,zz,yx,xl,zy,bysj,byyx,jzsj,lxfs,zp,bmh,zt,bz) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			// 获取执行sql执行对象
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, y.getSfzh());
			pstmt.setString(2, y.getXm());
			pstmt.setString(3, y.getXb());
			pstmt.setString(4, y.getCsrq());
			pstmt.setString(5, y.getJg());
			pstmt.setString(6, y.getZz());
			pstmt.setString(7, y.getYx());
			pstmt.setString(8, y.getXl());
			pstmt.setString(9, y.getZy());
			pstmt.setString(10, y.getBysj());
			pstmt.setString(11, y.getByyx());
			pstmt.setString(12, y.getJzsj());
			pstmt.setString(13, y.getLxfs());
			pstmt.setString(14, y.getZp());
			pstmt.setInt(15, y.getBmh());
			pstmt.setString(16, y.getZt());
			pstmt.setString(17, y.getBz());
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

	public boolean updateYgxxb(Ygxxb y) {
		boolean flag = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		// 获取数据库连接
		conn = DBUtil.getConn();
		System.out.println("useru");
		try {
			String sql = "update t_ygxxb set ygh=?,sfzh=?,xm=?,xb=?,csrq=?,jg=?,zz=?,yx=?,xl=?,zy=?,bysj=?,byyx=?,jzsj=?,lxfs=?,zp=?,bmh=?,zt=?,bz=? where ygh=?";
			// 获取执行sql执行对象
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, y.getYgh());
			pstmt.setString(2, y.getSfzh());
			pstmt.setString(3, y.getXm());
			pstmt.setString(4, y.getXb());
			pstmt.setString(5, y.getCsrq());
			pstmt.setString(6, y.getJg());
			pstmt.setString(7, y.getZz());
			pstmt.setString(8, y.getYx());
			pstmt.setString(9, y.getXl());
			pstmt.setString(10, y.getZy());
			pstmt.setString(11, y.getBysj());
			pstmt.setString(12, y.getByyx());
			pstmt.setString(13, y.getJzsj());
			pstmt.setString(14, y.getLxfs());
			pstmt.setString(15, y.getZp());
			pstmt.setInt(16, y.getBmh());
			pstmt.setString(17, y.getZt());
			pstmt.setString(18, y.getBz());
			pstmt.setInt(19, y.getYgh());
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

	public boolean deleteYgxxb(int ygh) {
		boolean flag = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		// 获取数据库连接
		conn = DBUtil.getConn();
		try {
			String sql = "delete from t_ygxxb where ygh=?";
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

	public List<Ygxxb> selectYgxxbList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Ygxxb ygxxb = null;
		List<Ygxxb> ylist = new ArrayList<Ygxxb>();
		// 获取数据库连接
		conn = DBUtil.getConn();
		try {
			String sql = "select * from t_ygxxb order by ygh desc";
			// 获取执行sql执行对象
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				ygxxb = new Ygxxb(rs.getInt(1), rs.getString(2),
						rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getString(7), rs.getString(8),
						rs.getString(9), rs.getString(10), rs.getString(11),
						rs.getString(12), rs.getString(13), rs.getString(14),
						rs.getString(15), rs.getInt(16), rs.getString(17),
						rs.getString(18));
//				user = new User();
//				user.setygh(rs.getInt(1));
//				user.setxm(rs.getString(2));
//				user.setmm(rs.getString(3));
//				user.setQx(rs.getString(4));
				ylist.add(ygxxb);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeDB(conn, pstmt, null);
		}
		return ylist;

	}

}
