package com.models;

public class Booking {
	private String trainno;
	private String splace;
	private String dplace;
	private String name;
	private String address;
	private String mobileno;
	private String adhaar;
	private String todate;
	private String noofseat;
	 public Booking() {}
	public Booking(String trainno, String splace, String dplace, String name, String address, String mobileno,
			String adhaar, String todate, String noofseat) {
		super();
		this.trainno = trainno;
		this.splace = splace;
		this.dplace = dplace;
		this.name = name;
		this.address = address;
		this.mobileno = mobileno;
		this.adhaar = adhaar;
		this.todate = todate;
		this.noofseat = noofseat;
	}
	public String getTrainno() {
		return trainno;
	}
	public void setTrainno(String trainno) {
		this.trainno = trainno;
	}
	public String getSplace() {
		return splace;
	}
	public void setSplace(String splace) {
		this.splace = splace;
	}
	public String getDplace() {
		return dplace;
	}
	public void setDplace(String dplace) {
		this.dplace = dplace;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getAdhaar() {
		return adhaar;
	}
	public void setAdhaar(String adhaar) {
		this.adhaar = adhaar;
	}
	public String getTodate() {
		return todate;
	}
	public void setTodate(String todate) {
		this.todate = todate;
	}
	public String getNoofseat() {
		return noofseat;
	}
	public void setNoofseat(String noofseat) {
		this.noofseat = noofseat;
	}
	@Override
	public String toString() {
		return "Booking [trainno=" + trainno + ", splace=" + splace + ", dplace=" + dplace + ", name=" + name
				+ ", address=" + address + ", mobileno=" + mobileno + ", adhaar=" + adhaar + ", todate=" + todate
				+ ", noofseat=" + noofseat + "]";
	}
	 
}