package com.services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.RegisterDaoImpl;
import com.models.Addtrain;
import com.models.AdminReg;
import com.models.Booking;
import com.models.Complaint;
import com.models.Register;
import com.models.payment;

public class RegisterServicesImpl implements RegisterServices{
     RegisterDaoImpl dao = new RegisterDaoImpl();

	@Override
	public String addUser(Register user) {
		String result = null;
		try {
			result = dao.addUser(user);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean login(String user,String pwd) {
		boolean user1=false;
	        try{
	              user1 = dao.login(user,pwd);
	              return user1;
	        }catch(SQLException e){
	             System.out.println(e);
	             return user1;
	        } 

	}

	@Override
	public String addadmin(AdminReg admin) {
		String result = null;
		try {
			result = dao.addadmin(admin);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean adminlogin(String admin, String pswd) {
		boolean user2=false;
        try{
              user2 = dao.adminlogin(admin,pswd);
              return user2;
        }catch(SQLException e){
             System.out.println(e);
             return user2;
        } 
  
	}

	@Override
	public String addtrain(Addtrain detail) {
		String result = null;
		try {
			result = dao.addtrain(detail);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public ArrayList<Addtrain> SearchTrain(String splace, String dplace, String datee) {
		Addtrain at = null;
		ArrayList<Addtrain> al=new ArrayList<Addtrain>();

		try {
			al=dao.SearchTrain(splace, dplace, datee);
			return al;
		} catch (SQLException e) {
			System.out.println(e);
			return null;
		}
	
	}

	@Override
	public String addcomplaint(Complaint user) {
		String result = null;
		try {
			result = dao.addcomplaint(user);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public ArrayList<Complaint> getAllComplaint() {
		ArrayList<Complaint> result = null;
		try {
			result = dao.getAllComplaint();
			return result;
		}catch(SQLException e) {
			e.printStackTrace();
			return result;
		}
		//return result;
	}

	@Override
	public String booking(Booking user,int noofseat) {

		String result = null;
		try {
			result = dao.booking(user,noofseat);
			return result;
		}catch (SQLException e) {
			e.printStackTrace();
			return result;
		}
	}

	@Override
	public ArrayList<Booking> getAllBooking() {
		ArrayList<Booking> result = null;
		try {
			result = dao.getAllBooking();
			return result;
		}catch(SQLException e) {
			e.printStackTrace();
			return result;
	}
	}

	@Override
	public String updatetrain(Addtrain detail) {
		String result = null;
		try {
			result = dao.updatetrain(detail);
			return result;
		}catch(SQLException e) {
			e.printStackTrace();
			return result;
		}
	}

	@Override
	public String addpayment(payment user) {
		String result = null;
		try {
			result = dao.addpayment(user);
			return result;
		}catch(SQLException e) {
			e.printStackTrace();
			return result;
		}
	}

	@Override
	public ArrayList<Addtrain> getAllTrain() {
		ArrayList<Addtrain> result = null;
		try {
			result = dao.getAllTrain();
			return result;
		}catch(SQLException e) {
			e.printStackTrace();
			return result;
		}
	}

	@Override
	public Register userprofile(String uname) {
		Register result = null;
		try {
			result= dao.userprofile(uname);
			return result;
		}catch(SQLException e) {
			e.printStackTrace();
			return result;
		}
	}

	@Override
	public ArrayList<payment> getAllPayment() {
		ArrayList<payment> result = null;
		try {
			result = dao.getAllPayment();
			return result;
		}catch(SQLException e) {
			e.printStackTrace();
			return result;
		}
	}
	}
