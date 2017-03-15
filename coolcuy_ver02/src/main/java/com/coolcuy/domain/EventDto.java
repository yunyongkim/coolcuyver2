package com.coolcuy.domain;

import java.sql.Date;

public class EventDto {
	private String eventNumber;
	private String eventName;
	private Date eventNoticeDay;
	private Date eventStart;
	private Date eventEnd;
	private String appSpot;
	private int discountRate;
	private int constraintTime;
	private String note;
	private String imageName;
	private String appType;
	private String regDate;
	
	public EventDto() {}
	
	public EventDto(String eventNumber, String eventName, Date eventNoticeDay,
			Date eventStart, Date eventEnd, String appSpot, int discountRate,
			int constraintTime, String note, String imageName, String appType,
			String regDate) {
		this.eventNumber = eventNumber;
		this.eventName = eventName;
		this.eventNoticeDay = eventNoticeDay;
		this.eventStart = eventStart;
		this.eventEnd = eventEnd;
		this.appSpot = appSpot;
		this.discountRate = discountRate;
		this.constraintTime = constraintTime;
		this.note = note;
		this.imageName = imageName;
		this.appType = appType;
		this.regDate = regDate;
	}




	public String getEventNumber() {
		return eventNumber;
	}


	public void setEventNumber(String eventNumber) {
		this.eventNumber = eventNumber;
	}


	public String getEventName() {
		return eventName;
	}


	public void setEventName(String eventName) {
		this.eventName = eventName;
	}


	public Date getEventNoticeDay() {
		return eventNoticeDay;
	}


	public void setEventNoticeDay(Date eventNoticeDay) {
		this.eventNoticeDay = eventNoticeDay;
	}


	public Date getEventStart() {
		return eventStart;
	}


	public void setEventStart(Date eventStart) {
		this.eventStart = eventStart;
	}


	public Date getEventEnd() {
		return eventEnd;
	}


	public void setEventEnd(Date eventEnd) {
		this.eventEnd = eventEnd;
	}


	public String getAppSpot() {
		return appSpot;
	}


	public void setAppSpot(String appSpot) {
		this.appSpot = appSpot;
	}


	public int getDiscountRate() {
		return discountRate;
	}


	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}


	public int getConstraintTime() {
		return constraintTime;
	}


	public void setConstraintTime(int constraintTime) {
		this.constraintTime = constraintTime;
	}


	public String getNote() {
		return note;
	}


	public void setNote(String note) {
		this.note = note;
	}


	public String getImageName() {
		return imageName;
	}


	public void setImageName(String imageName) {
		this.imageName = imageName;
	}


	public String getAppType() {
		return appType;
	}


	public void setAppType(String appType) {
		this.appType = appType;
	}


	public String getRegDate() {
		return regDate;
	}


	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "EventDto [eventNumber=" + eventNumber + ", eventName="
				+ eventName + ", eventNoticeDay=" + eventNoticeDay
				+ ", eventStart=" + eventStart + ", eventEnd=" + eventEnd
				+ ", appSpot=" + appSpot + ", discountRate=" + discountRate
				+ ", constraintTime=" + constraintTime + ", note=" + note
				+ ", imageName=" + imageName + ", appType=" + appType
				+ ", regDate=" + regDate + "]";
	}
	
	
}
