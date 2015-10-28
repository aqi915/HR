package com.hr.bean;

public class Ygzwxxb {
	private int ygh;
	private String zwmc;
	
	
	public Ygzwxxb(String zwmc) {
		super();
		this.zwmc = zwmc;
	}
	public Ygzwxxb(int ygh, String zwmc) {
		super();
		this.ygh = ygh;
		this.zwmc = zwmc;
	}
	public int getYgh() {
		return ygh;
	}
	public void setYgh(int ygh) {
		this.ygh = ygh;
	}
	public String getZwmc() {
		return zwmc;
	}
	public void setZwmc(String zwmc) {
		this.zwmc = zwmc;
	}
		
}
