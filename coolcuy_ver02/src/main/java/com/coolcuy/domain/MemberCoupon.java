package com.coolcuy.domain;

public class MemberCoupon {
	private String email;
	private String couponNumber;
	private int couponCount;
	
	public MemberCoupon() {}
	
	public MemberCoupon(String email, String couponNumber, int couponCount) {
		this.email = email;
		this.couponNumber = couponNumber;
		this.couponCount = couponCount;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCouponNumber() {
		return couponNumber;
	}
	public void setCouponNumber(String couponNumber) {
		this.couponNumber = couponNumber;
	}
	public int getCouponCount() {
		return couponCount;
	}
	public void setCouponCount(int couponCount) {
		this.couponCount = couponCount;
	}

	@Override
	public String toString() {
		return "MemberCoupon [email=" + email + ", couponNumber="
				+ couponNumber + ", couponCount=" + couponCount + "]";
	}
}
