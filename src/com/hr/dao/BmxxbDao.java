package com.hr.dao;

import java.util.List;

import com.hr.bean.Bmxxb;


public interface BmxxbDao {
	/*
	 * 增加用户
	 */
	public boolean insertBmxxb(Bmxxb y);
	/*
	 * 用Bmxxbid查找用户
	 */
	public Bmxxb selectBmxxbId(int ygh);
	/*
	 * 修改用户
	 */
	public boolean updateBmxxb(Bmxxb y);
	/*
	 * 删除用户
	 */
	public boolean deleteBmxxb(int ygh);
	/*
	 * 显示所有用户
	 */
	public List<Bmxxb> selectBmxxbList();


}
