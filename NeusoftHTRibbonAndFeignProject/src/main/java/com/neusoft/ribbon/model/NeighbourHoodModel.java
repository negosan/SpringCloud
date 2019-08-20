package com.neusoft.ribbon.model;

import java.io.Serializable;

/**
 * 
 *   供热收费管理模块的小区类
 * @author 黄宇德
 *
 */


public class NeighbourHoodModel implements Serializable {
	
	private int hoodno = 0;
	private String hoodname = null;
	private String address = null;
	public int getHoodno() {
		return hoodno;
	}
	public void setHoodno(int hoodno) {
		this.hoodno = hoodno;
	}
	public String getHoodname() {
		return hoodname;
	}
	public void setHoodname(String hoodname) {
		this.hoodname = hoodname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
