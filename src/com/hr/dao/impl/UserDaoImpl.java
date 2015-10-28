package com.hr.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hr.bean.User;
import com.hr.dao.UserDao;
import com.hr.util.DBUtil;





public class UserDaoImpl implements UserDao{
	
	public User checkLogin(String xm, String mm) {
		User user = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		conn = DBUtil.getConn();
		try {
			String sql = "select * from T_USER where xm='"+xm+"' and mm='"+mm+"'";
//			String sql = "select * from T_USER where xm=? and mm=?";
			//获取执行sql语句对象
			ps = conn.prepareStatement(sql);
//			ps.setString(1, xm);
//			ps.setString(2, mm);
			rs = ps.executeQuery();
			System.out.println("rs1 "+rs);
			while (rs.next()) {
				user = new User();
				user.setygh(rs.getInt(1));
				user.setxm(rs.getString(2));
				user.setmm(rs.getString(3));
				user.setQx(rs.getString(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.closeDB(conn, ps, rs);
		}
		System.out.println("rs"+user.getygh());
		return user;
	}
	
	/*public User checkLogin(String xm, String mm) {
		User user = null;
		Connection conn = null;
		PreparedStatement pstmt= null;
		ResultSet rs = null;
		conn = DBUtil.getConn();
		try {
			String sql = "select * from AA where XM=? and MM=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, xm);
			pstmt.setString(2, mm);
			rs = pstmt.executeQuery();
			System.out.println("rs1 "+xm);
			while(rs.next()){
				System.out.println("rs "+xm);
				user = new User();
				user.setygh(rs.getInt(1));
				user.setxm(rs.getString(2));//rs.getString(2)
				user.setmm(rs.getString(3));
				user.setQx(rs.getString(4));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.closeDB(conn, pstmt, rs);
		}
		
		System.out.println(user.getxm());
		return user;
	}*/
    public User selectUserId(int ygh) {
		Connection conn = null;
		PreparedStatement pstmt =null;
		ResultSet rs = null;
		User user = null;
		//获取数据库连接
		conn = DBUtil.getConn();
		System.out.println(ygh);
		
		try {
			String sql = "select * from t_user where ygh=?";
			//获取执行sql执行对象
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,ygh);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				user = new User();
				user.setygh(rs.getInt(1));
				user.setxm(rs.getString(2));
				user.setmm(rs.getString(3));
				user.setQx(rs.getString(4));			
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.closeDB(conn, pstmt, null);
		}
		return user;
	}

	public void insertUser(User u) {		
		
		Connection conn = null;
		PreparedStatement pstmt =null;
		//获取数据库连接
		conn = DBUtil.getConn();
		try {
			String sql = "insert into T_USER(xm,mm,qx) values(?,?,?)";
			//获取执行sql执行对象
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, u.getxm());
			pstmt.setString(2, u.getmm());
			pstmt.setString(3, u.getQx());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.closeDB(conn, pstmt, null);
		}
		
		
	}


	public void updateUser(User u) {
		Connection conn = null;
		PreparedStatement pstmt =null;
		//获取数据库连接
		conn = DBUtil.getConn();
		System.out.println("useru");
		try {
			String sql = "update t_user set ygh=?,xm=?,mm=?,qx=? where ygh=?";
			//获取执行sql执行对象
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, u.getygh());
			pstmt.setString(2, u.getxm());
			pstmt.setString(3, u.getmm());
			pstmt.setString(4, u.getQx());
			pstmt.setInt(5, u.getygh());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.closeDB(conn, pstmt, null);
		}
	}

	public void deleteUser(int ygh) {
		Connection conn = null;
		PreparedStatement pstmt =null;
		//获取数据库连接
		conn = DBUtil.getConn();
		try {
			String sql = "delete from T_USER where ygh=?";
			//获取执行sql执行对象
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, ygh);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.closeDB(conn, pstmt, null);
		}
	} 

	public List<User> selectUserList() {
		Connection conn = null;
		PreparedStatement pstmt =null;
		ResultSet rs = null;
		User user=null;
		List<User> ulist = new ArrayList<User>();
		//获取数据库连接
		conn = DBUtil.getConn();
		try {
			String sql = "select * from t_user order by ygh desc";
			//获取执行sql执行对象
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				//User u = new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
				user = new User();
				user.setygh(rs.getInt(1));
				user.setxm(rs.getString(2));
				user.setmm(rs.getString(3));
				user.setQx(rs.getString(4));
				ulist.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.closeDB(conn, pstmt, null);
		}
		return ulist;
	
		
	}


	
}
