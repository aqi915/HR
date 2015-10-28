package com.hr.bean;

public class Bmxxb {
	private int bmh;
	private String mc;
	private String bz;
	
	
	
	public Bmxxb(String mc, String bz) {
		super();
		this.mc = mc;
		this.bz = bz;
	}
	public Bmxxb(int bmh, String mc, String bz) {
		super();
		this.bmh = bmh;
		this.mc = mc;
		this.bz = bz;
	}
	public int getBmh() {
		return bmh;
	}
	public void setBmh(int bmh) {
		this.bmh = bmh;
	}
	public String getMc() {
		return mc;
	}
	public void setMc(String mc) {
		this.mc = mc;
	}
	public String getBz() {
		return bz;
	}
	public void setBz(String bz) {
		this.bz = bz;
	}

}
