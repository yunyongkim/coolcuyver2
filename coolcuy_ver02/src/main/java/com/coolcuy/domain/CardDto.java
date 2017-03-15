 package com.coolcuy.domain;

public class CardDto {
	private String cardNumber;
	private String cardType;
	private String cardExpiryDate;
	private String cardPassword;
	private String regDate;
	private String email;

	public CardDto() {}

	public CardDto(String cardNumber, String cardType, String cardExpiryDate, String cardPassword,
			String regDate, String email) {
		super();
		this.cardNumber = cardNumber;
		this.cardType = cardType;
		this.cardExpiryDate = cardExpiryDate;
		this.cardPassword = cardPassword;
		this.regDate = regDate;
		this.email = email;
	}
	
	public CardDto(String cardNumber, String cardType, String cardExpiryDate, String cardPassword,
			String email) {
		super();
		this.cardNumber = cardNumber;
		this.cardType = cardType;
		this.cardExpiryDate = cardExpiryDate;
		this.cardPassword = cardPassword;
		this.email = email;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	
	public String getCardExpiryDate() {
		return cardExpiryDate;
	}

	public void setCardExpiryDate(String cardExpiryDate) {
		this.cardExpiryDate = cardExpiryDate;
	}

	public String getCardPassword() {
		return cardPassword;
	}

	public void setCardPassword(String cardPassword) {
		this.cardPassword = cardPassword;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "CardDto [cardNumber=" + cardNumber + ", cardType=" + cardType
				+ ", cardExpiryDate=" + cardExpiryDate + ", cardPassword="
				+ cardPassword + ", regDate=" + regDate + ", email=" + email
				+ "]";
	}
	
	
	
}
