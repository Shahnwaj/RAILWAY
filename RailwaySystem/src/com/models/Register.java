package com.models;
import java.util.*;
	public class Register {
		private String userid;
		private String 	password;
		private String 	firstname;
		private String 	middlename;
		private String 	lastname;
		private String gender;
		private String status;
		private String dob;
		private String adhaarcard;
		private String pancard;
		private String email;
		private String mobileno;
		private String nationality;
		private String address;
		
		public Register() {}
		

		public Register(String userid, String password, String firstname, String middlename, String lastname, String gender,
				String status, String dob, String adhaarcard, String pancard, String email, String mobileno, String nationality,
				String address) {
			this.userid = userid;
			this.password = password;
			this.firstname = firstname;
			this.middlename = middlename;
			this.lastname = lastname;
			this.gender = gender;
			this.status = status;
			this.dob = dob;
			this.adhaarcard = adhaarcard;
			this.pancard = pancard;
			this.email = email;
			this.mobileno = mobileno;
			this.nationality = nationality;
			this.address = address;
		}


		public String getUserid() {
			return userid;
		}


		public void setUserid(String userid) {
			this.userid = userid;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}


		public String getFirstname() {
			return firstname;
		}


		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}


		public String getMiddlename() {
			return middlename;
		}


		public void setMiddlename(String middlename) {
			this.middlename = middlename;
		}


		public String getLastame() {
			return lastname;
		}


		public void setLastame(String lastname) {
			this.lastname = lastname;
		}


		public String getGender() {
			return gender;
		}


		public void setGender(String gender) {
			this.gender = gender;
		}


		public String getStatus() {
			return status;
		}


		public void setStatus(String status) {
			this.status = status;
		}


		public String getDob() {
			return dob;
		}


		public void setDob(String dob) {
			this.dob = dob;
		}


		public String getAdhaarcard() {
			return adhaarcard;
		}


		public void setAdhaarcard(String adhaarcard) {
			this.adhaarcard = adhaarcard;
		}


		public String getPancard() {
			return pancard;
		}


		public void setPancard(String pancard) {
			this.pancard = pancard;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getMobileno() {
			return mobileno;
		}


		public void setMobileno(String mobileno) {
			this.mobileno = mobileno;
		}


		public String getNationality() {
			return nationality;
		}


		public void setNationality(String nationality) {
			this.nationality = nationality;
		}


		public String getAddress() {
			return address;
		}


		public void setAddress(String address) {
			this.address = address;
		}


		@Override
		public String toString() {
			return "Register [userid=" + userid + ", password=" + password + ", firstname=" + firstname
					+ ", middlename=" + middlename + ", lastname=" + lastname + ", gender=" + gender + ", status="
					+ status + ", dob=" + dob + ", adhaarcard=" + adhaarcard + ", pancard=" + pancard + ", email="
					+ email + ", mobileno=" + mobileno + ", nationality=" + nationality + ", address=" + address + "]";
		}
	}