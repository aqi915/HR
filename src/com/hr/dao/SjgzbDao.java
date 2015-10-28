package com.hr.dao;

import java.util.List;

import com.hr.bean.Sjgzb;


public interface SjgzbDao {
	/*
	 * 增加用户
	 */
	public boolean insertSjgzb(Sjgzb y);
	/*
	 * 用Sjgzbid查找用户
	 */
	public Sjgzb selectSjgzbId(int ygh);
	/*
	 * 修改用户
	 */
	public boolean updateSjgzb(Sjgzb y);
	/*
	 * 删除用户
	 */
	public boolean deleteSjgzb(int ygh);
	/*
	 * 显示所有用户
	 */
	public List<Sjgzb> selectSjgzbList();


}
