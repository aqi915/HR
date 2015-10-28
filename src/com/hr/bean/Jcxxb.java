package com.hr.bean;

public class Jcxxb {
	private int ygh;
	private String xm ;
	private String jclb ;
	private float fjgz; 
	private String jcrq ;
	
	public Jcxxb(String xm, String jclb, float fjgz, String jcrq) {
		super();
		this.xm = xm;
		this.jclb = jclb;
		this.fjgz = fjgz;
		this.jcrq = jcrq;
	}
	public Jcxxb(int ygh, String xm, String jclb, float fjgz, String jcrq) {
		super();
		this.ygh = ygh;
		this.xm = xm;
		this.jclb = jclb;
		this.fjgz = fjgz;
		this.jcrq = jcrq;
	}
	public int getYgh() {
		return ygh;
	}
	public void setYgh(int ygh) {
		this.ygh = ygh;
	}
	public String getXm() {
		return xm;
	}
	public void setXm(String xm) {
		this.xm = xm;
	}
	public String getJclb() {
		return jclb;
	}
	public void setJclb(String jclb) {
		this.jclb = jclb;
	}
	public float getFjgz() {
		return fjgz;
	}
	public void setFjgz(float fjgz) {
		this.fjgz = fjgz;
	}
	public String getJcrq() {
		return jcrq;
	}
	public void setJcrq(String jcrq) {
		this.jcrq = jcrq;
	}
}
