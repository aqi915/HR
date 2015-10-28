package com.hr.dao;

import java.util.List;

import com.hr.bean.Ygzwxxb;


public interface YgzwxxbDao {
	/*
	 * 增加用户
	 */
	public boolean insertYgzwxxb(Ygzwxxb y);
	/*
	 * 用Ygzwxxbid查找用户
	 */
	public Ygzwxxb selectYgzwxxbId(int ygh);
	/*
	 * 修改用户
	 */
	public boolean updateYgzwxxb(Ygzwxxb y);
	/*
	 * 删除用户
	 */
	public boolean deleteYgzwxxb(int ygh);
	/*
	 * 显示所有用户
	 */
	public List<Ygzwxxb> selectYgzwxxbList();


}
