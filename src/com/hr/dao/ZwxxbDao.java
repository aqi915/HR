package com.hr.dao;

import java.util.List;

import com.hr.bean.Zwxxb;


public interface ZwxxbDao {
	/*
	 * 增加用户
	 */
	public boolean insertZwxxb(Zwxxb y);
	/*
	 * 用Zwxxbid查找用户
	 */
	public Zwxxb selectZwxxbId(int ygh);
	/*
	 * 修改用户
	 */
	public boolean updateZwxxb(Zwxxb y);
	/*
	 * 删除用户
	 */
	public boolean deleteZwxxb(int ygh);
	/*
	 * 显示所有用户
	 */
	public List<Zwxxb> selectZwxxbList();


}
