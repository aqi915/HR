package com.hr.dao;

import java.util.List;

import com.hr.bean.User;


public interface UserDao {
	/*
	 * 判断用户登入
	 */
	public User checkLogin(String xm, String mm);
	/*
	 * 增加用户
	 */
	public void insertUser(User u);
	/*
	 * 用userid查找用户
	 */
	public User selectUserId(int userid);
	/*
	 * 修改用户
	 */
	public void updateUser(User u);
	/*
	 * 删除用户
	 */
	public void deleteUser(int userid);
	/*
	 * 显示所有用户
	 */
	public List<User> selectUserList();


}
