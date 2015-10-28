package com.hr.bean;

public class User {
	private int ygh;
	private String xm;
	private String mm;
	private String qx;
	
	/*public User(int ygh, String xm, String mm, String qx) {
		super();
		this.ygh = ygh;
		this.xm = xm;
		this.mm = mm;
		this.qx = qx;
	}*/
	public String getQx() {
		return qx;
	}
	public void setQx(String qx) {
		this.qx = qx;
	}
	public int getygh() {
		return ygh;
	}
	public void setygh(int ygh) {
		this.ygh = ygh;
	}
	public String getxm() {
		return xm;
	}
	public void setxm(String xm) {
		this.xm = xm;
	}
	public String getmm() {
		return mm;
	}
	public void setmm(String mm) {
		this.mm = mm;
	}
}
