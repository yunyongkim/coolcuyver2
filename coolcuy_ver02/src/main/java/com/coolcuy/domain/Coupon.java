package com.coolcuy.domain;

import java.sql.Date;

public class Coupon {
	private String couponNumber;
	private int pointCost;
	private int disCountRate;
	private String imgName;
	private String note;
	private Date regDate;
	
	public Coupon() {}
	
	public Coupon(String couponNumber, int pointCost, int disCountRate,
			String imgName, String note, Date regDate) {
		this.couponNumber = couponNumber;
		this.pointCost = pointCost;
		this.disCountRate = disCountRate;
		this.imgName = imgName;
		this.note = note;
		this.regDate = regDate;
	}
	public String getCouponNumber() {
		return couponNumber;
	}
	public void setCouponNumber(String couponNumber) {
		this.couponNumber = couponNumber;
	}
	public int getPointCost() {
		return pointCost;
	}
	public void setPointCost(int pointCost) {
		this.pointCost = pointCost;
	}
	public int getDisCountRate() {
		return disCountRate;
	}
	public void setDisCountRate(int disCountRate) {
		this.disCountRate = disCountRate;
	}
	public String getImgName() {
		return imgName;
	}
	public void setImgName(String imgName) {
		this.imgName = imgName;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "Coupon [couponNumber=" + couponNumber + ", pointCost="
				+ pointCost + ", disCountRate=" + disCountRate + ", imgName="
				+ imgName + ", note=" + note + ", regDate=" + regDate + "]";
	}
	
	
	
	
}
