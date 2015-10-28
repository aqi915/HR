package com.hr.bean;

public class Ygddxxb {
	private int ygh;
	private String xm;
	private int ysbm;
	private String yzwmc;
	private float ygz;
	private int xbmh;
	private String xzwmc;
	private float xgz;
	private String ddsj;
	
	
	public Ygddxxb(int ygh, String xm, int ysbm, String yzwmc, float ygz,
			int xbmh, String xzwmc, float xgz, String ddsj) {
		super();
		this.ygh = ygh;
		this.xm = xm;
		this.ysbm = ysbm;
		this.yzwmc = yzwmc;
		this.ygz = ygz;
		this.xbmh = xbmh;
		this.xzwmc = xzwmc;
		this.xgz = xgz;
		this.ddsj = ddsj;
	}
	public Ygddxxb(String xm, int ysbm, String yzwmc, float ygz, int xbmh,
			String xzwmc, float xgz, String ddsj) {
		super();
		this.xm = xm;
		this.ysbm = ysbm;
		this.yzwmc = yzwmc;
		this.ygz = ygz;
		this.xbmh = xbmh;
		this.xzwmc = xzwmc;
		this.xgz = xgz;
		this.ddsj = ddsj;
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
	public int getYsbm() {
		return ysbm;
	}
	public void setYsbm(int ysbm) {
		this.ysbm = ysbm;
	}
	public String getYzwmc() {
		return yzwmc;
	}
	public void setYzwmc(String yzwmc) {
		this.yzwmc = yzwmc;
	}
	public float getYgz() {
		return ygz;
	}
	public void setYgz(float ygz) {
		this.ygz = ygz;
	}
	public int getXbmh() {
		return xbmh;
	}
	public void setXbmh(int xbmh) {
		this.xbmh = xbmh;
	}
	public String getXzwmc() {
		return xzwmc;
	}
	public void setXzwmc(String xzwmc) {
		this.xzwmc = xzwmc;
	}
	public float getXgz() {
		return xgz;
	}
	public void setXgz(float xgz) {
		this.xgz = xgz;
	}
	public String getDdsj() {
		return ddsj;
	}
	public void setDdsj(String ddsj) {
		this.ddsj = ddsj;
	}
	

}
