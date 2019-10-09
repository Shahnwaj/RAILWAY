package com.services;

import java.util.ArrayList;
import java.util.List;

import com.models.Addtrain;
import com.models.AdminReg;
import com.models.Booking;
import com.models.Complaint;
import com.models.Register;
import com.models.payment;

public interface RegisterServices {
	public String addUser(Register user) ;
	public boolean login(String user , String pwd) ;
	public String addadmin(AdminReg admin);
	public boolean adminlogin(String admin , String pswd) ;
	public String addtrain(Addtrain detail);
	public ArrayList<Addtrain> getAllTrain();
	public ArrayList<Addtrain> SearchTrain(String splace,String dplace, String datee);
	public String addcomplaint(Complaint user);
	public ArrayList<Complaint> getAllComplaint();
	public String booking(Booking user,int noofseat);
	public ArrayList<Booking> getAllBooking();
	public String updatetrain(Addtrain detail);
	public String addpayment(payment user);
	public ArrayList<payment> getAllPayment();
	public Register userprofile(String uname);
	
}