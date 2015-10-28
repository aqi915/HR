package com.hr.dao;

import java.util.List;

import com.hr.bean.Jcxxb;


public interface JcxxbDao {
	/*
	 * 增加用户
	 */
	public boolean insertJcxxb(Jcxxb y);
	/*
	 * 用Jcxxbid查找用户
	 */
	public Jcxxb selectJcxxbId(int ygh);
	/*
	 * 修改用户
	 */
	public boolean updateJcxxb(Jcxxb y);
	/*
	 * 删除用户
	 */
	public boolean deleteJcxxb(int ygh);
	/*
	 * 显示所有用户
	 */
	public List<Jcxxb> selectJcxxbList();


}
