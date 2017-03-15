package com.coolcuy.domain;

public class Payment {
	private String payNumber;
	private String email;
	private String couponNumber;
	private int payment;
	private int amount;
	
	public Payment() {}

	public Payment(String payNumber, String email, String couponNumber,
			int payment, int amount) {
		this.payNumber = payNumber;
		this.email = email;
		this.couponNumber = couponNumber;
		this.payment = payment;
		this.amount = amount;
	}

	public String getPayNumber() {
		return payNumber;
	}

	public void setPayNumber(String payNumber) {
		this.payNumber = payNumber;
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

	public int getPayment() {
		return payment;
	}

	public void setPayment(int payment) {
		this.payment = payment;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Payment [payNumber=" + payNumber + ", email=" + email
				+ ", couponNumber=" + couponNumber + ", payment=" + payment
				+ ", amount=" + amount + "]";
	}
}
