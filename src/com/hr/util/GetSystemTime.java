package com.hr.util;
import java.text.SimpleDateFormat;
import java.util.Date;



public class GetSystemTime {
	public static void main(String[] args) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
		System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
	}
}