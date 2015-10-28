package com.hr.bean;

public class Sjgzb {
	private int ygh;
	private String xm ;
	private float sjgz;
	private String ffrq;
	
	
	public Sjgzb(String xm, float sjgz, String ffrq) {
		super();
		this.xm = xm;
		this.sjgz = sjgz;
		this.ffrq = ffrq;
	}
	public Sjgzb(int ygh, String xm, float sjgz, String ffrq) {
		super();
		this.ygh = ygh;
		this.xm = xm;
		this.sjgz = sjgz;
		this.ffrq = ffrq;
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
	public float getSjgz() {
		return sjgz;
	}
	public void setSjgz(float sjgz) {
		this.sjgz = sjgz;
	}
	public String getFfrq() {
		return ffrq;
	}
	public void setFfrq(String ffrq) {
		this.ffrq = ffrq;
	}
	
	
}
