package com.coolcuy.domain;

public class RentDto {
	private int rentNumber;
	private String email;
	private String carNumber;
	private String startSpot;
	private String endSpot;
	private String startDate;
	private String endDate;
	private String realStartDate;
	private String realEndDate;
	private String insurance;
	private String reqBabySeat;
	private String regDate;
	
	public RentDto() {}
		
	public RentDto(int rentNumber, String email, String carNumber,
			String startSpot, String endSpot, String startDate, String endDate,
			String realStartDate, String realEndDate, String insurance,
			String reqBabySeat, String regDate) {
		super();
		this.rentNumber = rentNumber;
		this.email = email;
		this.carNumber = carNumber;
		this.startSpot = startSpot;
		this.endSpot = endSpot;
		this.startDate = startDate;
		this.endDate = endDate;
		this.realStartDate = realStartDate;
		this.realEndDate = realEndDate;
		this.insurance = insurance;
		this.reqBabySeat = reqBabySeat;
		this.regDate = regDate;
	}



	public int getRentNumber() {
		return rentNumber;
	}
	public void setRentNumber(int rentNumber) {
		this.rentNumber = rentNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	public String getStartSpot() {
		return startSpot;
	}
	public void setStartSpot(String startSpot) {
		this.startSpot = startSpot;
	}
	public String getEndSpot() {
		return endSpot;
	}
	public void setEndSpot(String endSpot) {
		this.endSpot = endSpot;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getRealStartDate() {
		return realStartDate;
	}
	public void setRealStartDate(String realStartDate) {
		this.realStartDate = realStartDate;
	}
	public String getRealEndDate() {
		return realEndDate;
	}
	public void setRealEndDate(String realEndDate) {
		this.realEndDate = realEndDate;
	}
	public String getInsurance() {
		return insurance;
	}
	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}
	public String getReqBabySeat() {
		return reqBabySeat;
	}
	public void setReqBabySeat(String reqBabySeat) {
		this.reqBabySeat = reqBabySeat;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "RentDto [rentNumber=" + rentNumber + ", email=" + email
				+ ", carNumber=" + carNumber + ", startSpot=" + startSpot
				+ ", endSpot=" + endSpot + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", realStartDate=" + realStartDate
				+ ", realEndDate=" + realEndDate + ", insurance=" + insurance
				+ ", reqBabySeat=" + reqBabySeat + ", regDate=" + regDate + "]";
	}
	
	
}
