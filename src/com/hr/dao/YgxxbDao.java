package com.hr.dao;

import java.util.List;

import com.hr.bean.Ygxxb;


public interface YgxxbDao {
	/*
	 * 增加用户
	 */
	public boolean insertYgxxb(Ygxxb y);
	/*
	 * 用Ygxxbid查找用户
	 */
	public Ygxxb selectYgxxbId(int ygh);
	/*
	 * 修改用户
	 */
	public boolean updateYgxxb(Ygxxb y);
	/*
	 * 删除用户
	 */
	public boolean deleteYgxxb(int ygh);
	/*
	 * 显示所有用户
	 */
	public List<Ygxxb> selectYgxxbList();


}
