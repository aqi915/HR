package com.hr.dao;

import java.util.List;

import com.hr.bean.Ygkqxxb;


public interface YgkqxxbDao {
	/*
	 * 增加用户
	 */
	public boolean insertYgkqxxb(Ygkqxxb y);
	/*
	 * 用Ygkqxxbid查找用户
	 */
	public Ygkqxxb selectYgkqxxbId(int ygh);
	/*
	 * 修改用户
	 */
	public boolean updateYgkqxxb(Ygkqxxb y);
	/*
	 * 删除用户
	 */
	public boolean deleteYgkqxxb(int ygh);
	/*
	 * 显示所有用户
	 */
	public List<Ygkqxxb> selectYgkqxxbList();


}
