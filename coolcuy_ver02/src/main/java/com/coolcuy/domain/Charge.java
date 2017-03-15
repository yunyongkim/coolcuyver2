package com.coolcuy.domain;

public class Charge {
	private String chargeNumber;
	private int standardCharge;
	private int weekdayCharge;
	private int weekendCharge;
	private int peakseasonCharge;
	private String regDate;
	
	public Charge() {}
	
	public Charge(String chargeNumber, int standardCharge, int weekdayCharge,
			int weekendCharge, int peakseasonCharge, String regDate) {
		this.chargeNumber = chargeNumber;
		this.standardCharge = standardCharge;
		this.weekdayCharge = weekdayCharge;
		this.weekendCharge = weekendCharge;
		this.peakseasonCharge = peakseasonCharge;
		this.regDate = regDate;
	}

	public String getChargeNumber() {
		return chargeNumber;
	}

	public void setChargeNumber(String chargeNumber) {
		this.chargeNumber = chargeNumber;
	}

	public int getStandardCharge() {
		return standardCharge;
	}

	public void setStandardCharge(int standardCharge) {
		this.standardCharge = standardCharge;
	}

	public int getWeekdayCharge() {
		return weekdayCharge;
	}

	public void setWeekdayCharge(int weekdayCharge) {
		this.weekdayCharge = weekdayCharge;
	}

	public int getWeekendCharge() {
		return weekendCharge;
	}

	public void setWeekendCharge(int weekendCharge) {
		this.weekendCharge = weekendCharge;
	}

	public int getPeakseasonCharge() {
		return peakseasonCharge;
	}

	public void setPeakseasonCharge(int peakseasonCharge) {
		this.peakseasonCharge = peakseasonCharge;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "Charge [chargeNumber=" + chargeNumber + ", standardCharge="
				+ standardCharge + ", weekdayCharge=" + weekdayCharge
				+ ", weekendCharge=" + weekendCharge + ", peakseasonCharge="
				+ peakseasonCharge + ", regDate=" + regDate + "]";
	}
}
