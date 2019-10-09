package com.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.models.Addtrain;
import com.models.AdminReg;
import com.models.Booking;
import com.models.Complaint;
import com.models.Register;
import com.models.payment;

public interface RegisterDao {
	public String addUser(Register user) throws SQLException ;
	public boolean login(String user , String pwd) throws SQLException;
	public String addadmin(AdminReg admin) throws SQLException;
	public boolean adminlogin(String admin , String pswd) throws SQLException;
	public String addtrain(Addtrain detail) throws SQLException;
	public ArrayList<Addtrain> getAllTrain() throws SQLException;
	public ArrayList<Addtrain> SearchTrain(String splace,String dplace, String datee)throws SQLException;
	public String addcomplaint(Complaint user) throws SQLException;
	public ArrayList<Complaint> getAllComplaint() throws SQLException;
	public String booking(Booking user,int noofseat) throws SQLException;
	public ArrayList<Booking> getAllBooking() throws SQLException;
	public String updatetrain(Addtrain detail) throws SQLException;
	public String addpayment (payment user) throws SQLException;
	public ArrayList<payment> getAllPayment() throws SQLException;
	public Register userprofile(String uname) throws SQLException;

}
