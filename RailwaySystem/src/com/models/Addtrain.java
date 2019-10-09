package com.models;

public class Addtrain {
	private String trainno;
	 private String trainname;
	 private String splace;
	 private String dplace;
	 private String fare;
	 private String seat;
	 private String datee;
	 
    public Addtrain() {}

	public Addtrain(String trainno, String trainname, String splace, String dplace, String fare, String seat, String datee) {
		super();
		this.trainno = trainno;
		this.trainname = trainname;
		this.splace = splace;
		this.dplace = dplace;
		this.fare = fare;
		this.seat = seat;
		this.datee = datee;
	}

	public String getTrainno() {
		return trainno;
	}

	public void setTrainno(String trainno) {
		this.trainno = trainno;
	}

	public String getTrainname() {
		return trainname;
	}

	public void setTrainname(String trainname) {
		this.trainname = trainname;
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

	public String getFare() {
		return fare;
	}

	public void setFare(String fare) {
		this.fare = fare;
	}

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}

	public String getDatee() {
		return datee;
	}

	public void setDatee(String datee) {
		this.datee = datee;
	}

	@Override
	public String toString() {
		return "Addtrain [trainno=" + trainno + ", trainname=" + trainname + ", splace=" + splace + ", dplace=" + dplace
				+ ", fare=" + fare + ", seat=" + seat + ", datee=" + datee + "]";
	}
}