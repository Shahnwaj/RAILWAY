package com.models;

public class AdminReg {
	private String username;
	private String pswd;
	private String firstname;
	private String lastname;
	private String mobileno;
	private String email;
	
	public AdminReg() {}

	public AdminReg(String username, String pswd, String firstname, String lastname, String mobileno, String email) {
		super();
		this.username = username;
		this.pswd = pswd;
		this.firstname = firstname;
		this.lastname = lastname;
		this.mobileno = mobileno;
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPswd() {
		return pswd;
	}

	public void setPswd(String pswd) {
		this.pswd = pswd;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "AdminReg [username=" + username + ", pswd=" + pswd + ", firstname=" + firstname + ", lastname="
				+ lastname + ", mobileno=" + mobileno + ", email=" + email + "]";
	}
	
	
	
	

}
