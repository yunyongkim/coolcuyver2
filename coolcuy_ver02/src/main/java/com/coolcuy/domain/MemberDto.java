package com.coolcuy.domain;

public class MemberDto {
	private String email;
	private String phoneNumber;
	private String name;
	private String password;
	private String rating;
	private String zipCode;
	private String roadAddr;
	private String detailAddr;
	private String primaryArea;
	private	String regDate;
	private int point;
	private int rentCnt;
	private String licenseNumber;
	private String licenseType;
	private String issuDate;
	private String expiryDate;
	private String gender;
	
	public MemberDto() {}

	public MemberDto(String email, String phoneNumber, String name, String password, String rating, String zipCode,
			String roadAddr, String detailAddr, String primaryArea, String regDate, int point, int rentCnt,
			String licenseNumber, String licenseType, String issuDate, String expiryDate, String gender) {
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.password = password;
		this.rating = rating;
		this.zipCode = zipCode;
		this.roadAddr = roadAddr;
		this.detailAddr = detailAddr;
		this.primaryArea = primaryArea;
		this.regDate = regDate;
		this.point = point;
		this.rentCnt = rentCnt;
		this.licenseNumber = licenseNumber;
		this.licenseType = licenseType;
		this.issuDate = issuDate;
		this.expiryDate = expiryDate;
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getRoadAddr() {
		return roadAddr;
	}

	public void setRoadAddr(String roadAddr) {
		this.roadAddr = roadAddr;
	}

	public String getDetailAddr() {
		return detailAddr;
	}

	public void setDetailAddr(String detailAddr) {
		this.detailAddr = detailAddr;
	}

	public String getPrimaryArea() {
		return primaryArea;
	}

	public void setPrimaryArea(String primaryArea) {
		this.primaryArea = primaryArea;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getRentCnt() {
		return rentCnt;
	}

	public void setRentCnt(int rentCnt) {
		this.rentCnt = rentCnt;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public String getLicenseType() {
		return licenseType;
	}

	public void setLicenseType(String licenseType) {
		this.licenseType = licenseType;
	}

	public String getIssuDate() {
		return issuDate;
	}

	public void setIssuDate(String issuDate) {
		this.issuDate = issuDate;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "MemberDto [email=" + email + ", phoneNumber=" + phoneNumber + ", name=" + name + ", password="
				+ password + ", rating=" + rating + ", zipCode=" + zipCode + ", roadAddr=" + roadAddr + ", detailAddr="
				+ detailAddr + ", primaryArea=" + primaryArea + ", regDate=" + regDate + ", point=" + point
				+ ", rentCnt=" + rentCnt + ", licenseNumber=" + licenseNumber + ", licenseType=" + licenseType
				+ ", issuDate=" + issuDate + ", expiryDate=" + expiryDate + ", gender=" + gender + "]";
	}
	
	
}
