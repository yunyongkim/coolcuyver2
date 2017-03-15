package com.coolcuy.domain;

public class CarDto {
	private String carNumber;
	private String spotName;
	private String chargeNumber;
	private String carName;
	private String type;
	private String brand;
	private int seat;
	private String options;
	private String oilType;
	private int yearModel;
	private int kilometer;
	private String babySeat;
	private String regDate;
	
	public CarDto() {}

	public CarDto(String carNumber, String spotName, String chargeNumber,
			String carName, String type, String brand, int seat,
			String options, String oilType, int yearModel, int kilometer,
			String babySeat, String regDate) {
		this.carNumber = carNumber;
		this.spotName = spotName;
		this.chargeNumber = chargeNumber;
		this.carName = carName;
		this.type = type;
		this.brand = brand;
		this.seat = seat;
		this.options = options;
		this.oilType = oilType;
		this.yearModel = yearModel;
		this.kilometer = kilometer;
		this.babySeat = babySeat;
		this.regDate = regDate;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getSpotName() {
		return spotName;
	}

	public void setSpotName(String spotName) {
		this.spotName = spotName;
	}

	public String getChargeNumber() {
		return chargeNumber;
	}

	public void setChargeNumber(String chargeNumber) {
		this.chargeNumber = chargeNumber;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

	public String getOptions() {
		return options;
	}

	public void setOptions(String options) {
		this.options = options;
	}

	public String getOilType() {
		return oilType;
	}

	public void setOilType(String oilType) {
		this.oilType = oilType;
	}

	public int getYearModel() {
		return yearModel;
	}

	public void setYearModel(int yearModel) {
		this.yearModel = yearModel;
	}

	public int getKilometer() {
		return kilometer;
	}

	public void setKilometer(int kilometer) {
		this.kilometer = kilometer;
	}

	public String getBabySeat() {
		return babySeat;
	}

	public void setBabySeat(String babySeat) {
		this.babySeat = babySeat;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "CarDto [carNumber=" + carNumber + ", spotName=" + spotName
				+ ", chargeNumber=" + chargeNumber + ", carName=" + carName
				+ ", type=" + type + ", brand=" + brand + ", seat=" + seat
				+ ", options=" + options + ", oilType=" + oilType
				+ ", yearModel=" + yearModel + ", kilometer=" + kilometer
				+ ", babySeat=" + babySeat + ", regDate=" + regDate + "]";
	}
}
