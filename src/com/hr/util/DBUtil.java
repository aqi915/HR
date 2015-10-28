package com.hr.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 操作数据库的工具类，包含获取连接和关闭数据库资源的工具方法
 * @author Administrator
 *
 */
public class DBUtil {
	//查询用户名SELECT USER();
	private final static String USER="root"; 
	private final static String PASSWORD="root";
	private final static String URL = "jdbc:mysql://localhost:3306/D_HR" ;
	/**
	 * 获取数据库连接的方法
	 * @return
	 */
	public static Connection getConn(){
		Connection conn = null;
		try {
			//加载注册oracle驱动
			Class.forName("com.mysql.jdbc.Driver");
			
			System.out.println("connection start....");
			//通过驱动管理器获取数据库连接对象
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("connection success....");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	/**
	 * 关闭数据库资源
	 * @param conn
	 * @param stat
	 * @param rs
	 */
	public static void closeDB(Connection conn, Statement stat, ResultSet rs){
		try {
			if(null != rs)
				rs.close();
			if(null != stat)
				stat.close();
			if(null != conn)
				conn.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}