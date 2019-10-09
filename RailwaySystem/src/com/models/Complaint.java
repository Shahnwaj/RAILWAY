package com.models;

public class Complaint {
	private String name;
	private String email;
	private String address;
	private String complaint;
	
	public Complaint() {}

	public Complaint(String name, String email, String address, String complaint) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
		this.complaint = complaint;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getComplaint() {
		return complaint;
	}

	public void setComplaint(String complaint) {
		this.complaint = complaint;
	}

	@Override
	public String toString() {
		return "Complaint [name=" + name + ", email=" + email + ", address=" + address + ", complaint=" + complaint
				+ "]";
	}
	
	

}
