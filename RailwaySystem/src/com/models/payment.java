package com.models;

public class payment {
	private String cardname;
	private String cardnumber;
	private String expmonth;
	private String expyear;
	private String cvv;
	private String amount;
	public payment() {}
	public payment(String cardname, String cardnumber, String expmonth, String expyear, String cvv,String amount) {
		super();
		this.cardname = cardname;
		this.cardnumber = cardnumber;
		this.expmonth = expmonth;
		this.expyear = expyear;
		this.cvv = cvv;
		this.amount=amount;
	}
	public String getCardname() {
		return cardname;
	}
	public void setCardname(String cardname) {
		this.cardname = cardname;
	}
	public String getCardnumber() {
		return cardnumber;
	}
	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}
	public String getExpmonth() {
		return expmonth;
	}
	public void setExpmonth(String expmonth) {
		this.expmonth = expmonth;
	}
	public String getExpyear() {
		return expyear;
	}
	public void setExpyear(String expyear) {
		this.expyear = expyear;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "payment [cardname=" + cardname + ", cardnumber=" + cardnumber + ", expmonth=" + expmonth + ", expyear="
				+ expyear + ", cvv=" + cvv + ", amount=" + amount + "]";
	}
}
