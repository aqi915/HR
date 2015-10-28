package com.hr.dao;

import java.util.List;

import com.hr.bean.Ygddxxb;


public interface YgddxxbDao {
	/*
	 * 增加用户
	 */
	public boolean insertYgddxxb(Ygddxxb y);
	/*
	 * 用Ygddxxbid查找用户
	 */
	public Ygddxxb selectYgddxxbId(int ygh);
	/*
	 * 修改用户
	 */
	public boolean updateYgddxxb(Ygddxxb y);
	/*
	 * 删除用户
	 */
	public boolean deleteYgddxxb(int ygh);
	/*
	 * 显示所有用户
	 */
	public List<Ygddxxb> selectYgddxxbList();


}
