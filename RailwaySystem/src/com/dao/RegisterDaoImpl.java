package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.dbutill.dbutill;
import com.models.Addtrain;
import com.models.AdminReg;
import com.models.Booking;
import com.models.Complaint;
import com.models.Register;
import com.models.payment;

public class RegisterDaoImpl implements RegisterDao {
	Connection con=null;
	static int s=0;
	@Override
	public String addUser(Register user) throws SQLException {
		con=dbutill.getConn();
		PreparedStatement ps=null;
		ps=con.prepareStatement("INSERT INTO register VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		
		ps.setString(1, user.getUserid());
		ps.setString(2, user.getPassword());
		ps.setString(3, user.getFirstname());
		ps.setString(4, user.getMiddlename());
		ps.setString(5, user.getLastame());
		ps.setString(6, user.getGender());
		ps.setString(7, user.getStatus());
		ps.setString(8, user.getDob());
		ps.setString(9, user.getAdhaarcard());
		ps.setString(10, user.getPancard());
		ps.setString(11, user.getEmail());
		ps.setString(12, user.getMobileno());
		ps.setString(13, user.getNationality());
		ps.setString(14, user.getAddress());
		
		int r=ps.executeUpdate();
		if(r>0)
			return "SUCCESS";
		return "FAIL!!";
		
	}
	
	public boolean login(String user , String pwd) throws SQLException {
		con=dbutill.getConn();
		PreparedStatement ps=null;
        ps=con.prepareStatement("select * from register where userid=? AND password=?");
        ps.setString(1, user);
        ps.setString(2, pwd);
        ResultSet rs = ps.executeQuery();
        return rs.next();
        
	}

	public String addadmin(AdminReg admin) throws SQLException {
		con=dbutill.getConn();
		PreparedStatement ps=null;
		ps=con.prepareStatement("INSERT INTO adminregister VALUES(?,?,?,?,?,?)");
		
		ps.setString(1, admin.getUsername());
		ps.setString(2, admin.getPswd());
		ps.setString(3, admin.getFirstname());
		ps.setString(4, admin.getLastname());
		ps.setString(5, admin.getMobileno());
		ps.setString(6, admin.getEmail());
		
		
		int r=ps.executeUpdate();
		if(r>0)
			return "SUCCESS";
		return "FAIL!!";
	}

	@Override
	public boolean adminlogin(String admin, String pswd) throws SQLException {
		con=dbutill.getConn();
		PreparedStatement ps=null;
        ps=con.prepareStatement("select * from adminregister where username=? AND password=?");
        ps.setString(1, admin);
        ps.setString(2, pswd);
        ResultSet rs = ps.executeQuery();
        return rs.next();
        
	}

	@Override
	public String addtrain(Addtrain detail) throws SQLException {
		con=dbutill.getConn();
		PreparedStatement ps=null;
		ps=con.prepareStatement("INSERT INTO traindetail VALUES(?,?,?,?,?,?,?)");
		
		ps.setString(1, detail.getTrainno());
		ps.setString(2, detail.getTrainname());
		ps.setString(3, detail.getSplace());
		ps.setString(4, detail.getDplace());
		ps.setString(5, detail.getFare());
		ps.setString(6, detail.getSeat());
		ps.setString(7, detail.getDatee());
		
		
		int r=ps.executeUpdate();
		if(r>0)
			return "SUCCESS";
		return "FAIL!!";
	}

	//@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Addtrain> SearchTrain(String splace, String dplace, String datee) throws SQLException {
		con=dbutill.getConn();
		PreparedStatement ps = null;
		ArrayList<Addtrain> al=new ArrayList<Addtrain>();
		//Train train=null;
		String sql = "SELECT *  from  traindetail where boarding=? and destination=? and datee=?";
		ps = con.prepareStatement(sql);
		ps.setString(1, splace );
		ps.setString(2, dplace);
		ps.setString(3, datee);
		ResultSet rs = ps.executeQuery();
		Addtrain at=null;
		while(rs.next()) {
			String trainno = rs.getString(1);
			String trainname = rs.getString(2);
			String splace1 = rs.getString(3);
			String dplace1 = rs.getString(4);
			String fare = rs.getString(5);
			String seat = rs.getString(6);
			String datee1= rs.getString(7);
			al.add(new Addtrain(trainno, trainname, splace1, dplace1, fare, seat,datee1));			
		}
		return al;
	}

	@Override
	public String addcomplaint(Complaint user) throws SQLException {
		con=dbutill.getConn();
		PreparedStatement ps = null;
		ps =con.prepareStatement ("INSERT INTO complaint VALUES(?,?,?,?)");
		ps.setString(1, user.getName());
		ps.setString(2, user.getEmail());
		ps.setString(3, user.getAddress());
		ps.setString(4, user.getComplaint());
		int r = ps.executeUpdate();
		if(r>0) {
			return "SUCCESS";
		}
		return "FAIL";
	}
	//@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Complaint> getAllComplaint() throws SQLException {
		con = dbutill.getConn();
		ArrayList<Complaint> ac = new ArrayList<Complaint>();
		PreparedStatement ps= null;
		ps = con.prepareStatement("select * from complaint");
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			String name=rs.getString(1);
			String email=rs.getString(2);
			String address=rs.getString(3);
			String complaint=rs.getString(4);
			Complaint at=new Complaint(name, email, address, complaint);
			ac.add(at);
		}
		return ac;
	}

	@Override
	public String booking(Booking user ,int noofseat) throws SQLException {
		String result="Fail";
		con=dbutill.getConn();
		PreparedStatement ps=null;
		ps=con.prepareStatement("INSERT INTO booking VALUES(?,?,?,?,?,?,?,?,?)");
		ps.setString(1, user.getTrainno());
		ps.setString(2, user.getSplace());
		ps.setString(3, user.getDplace());
		ps.setString(4, user.getName());
		ps.setString(5, user.getAddress());
		ps.setString(6, user.getMobileno());
		ps.setString(7, user.getAdhaar());
		ps.setString(8, user.getTodate());
		ps.setString(9, user.getNoofseat());
		
		int r = ps.executeUpdate();
		if(r>0) {
			result="SUCCESS";
		}
		PreparedStatement ps1=null;
		ps1=con.prepareStatement("select seat from traindetail where datee=?" );
		ps1.setString(1, user.getTodate());
		ResultSet rs=ps1.executeQuery();
		while(rs.next()) {
			s=rs.getInt("SEAT");
		}
		s=s-noofseat;
		PreparedStatement ps2=null;
		ps2=con.prepareStatement("update traindetail set seat=? where datee=?" );
		ps2.setInt(1, s);
		ps2.setString(2, user.getTodate());
		int r2=ps2.executeUpdate();
		if(r2>0) {
			result="SUCCESS";
		}
		return result;
	}

	@Override
	public ArrayList<Booking> getAllBooking() throws SQLException {
		con = dbutill.getConn();
		ArrayList<Booking> ac = new ArrayList<Booking>();
		PreparedStatement ps= null;
		ps = con.prepareStatement("select * from booking");
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			String trainno=rs.getString(1);
			String splace=rs.getString(2);
			String dplace=rs.getString(3);
			String name=rs.getString(4);
			String address=rs.getString(5);
			String mobileno=rs.getString(6);
			String adhaar=rs.getString(7);
			String todate=rs.getString(8);
			String noofseat=rs.getString(9);
			Booking bn = new Booking(trainno, splace, dplace, name, address, mobileno, adhaar, todate, noofseat);
			
			ac.add(bn);
		}
		return ac;
	}
	

	@Override
	public String updatetrain(Addtrain detail) throws SQLException {
		con=dbutill.getConn();
		PreparedStatement ps=null;
		ps=con.prepareStatement("update traindetail set trainname=?,boarding=?,destination=?,fare=?, seat=?,datee=? where trainno=?");
		
		ps.setString(1,detail.getTrainname());
		ps.setString(2,detail.getSplace());
		ps.setString(3, detail.getDplace());
		ps.setString(4,detail.getFare());
		ps.setString(5,detail.getSeat());
		ps.setString(6, detail.getDatee());
		ps.setString(7, detail.getTrainno());
		
		
		int r = ps.executeUpdate();
		if(r>0) {
			return "true";
		
		}
		return "false";
	}

	@Override
	public String addpayment(payment user) throws SQLException {
		String result="Fail";
		con=dbutill.getConn();
		PreparedStatement ps=null;
		ps=con.prepareStatement("INSERT INTO payment VALUES(?,?,?,?,?,?)");
		ps.setString(1, user.getCardname());
		ps.setString(2, user.getCardnumber());
		ps.setString(3, user.getExpmonth());
		ps.setString(4, user.getExpyear());
		ps.setString(5, user.getCvv());
		ps.setString(6, user.getAmount());
		
		int r = ps.executeUpdate();
		if(r>0) {
			result="SUCCESS";
		}
		return result;
	}

	@Override
	public ArrayList<Addtrain> getAllTrain() throws SQLException {
		con = dbutill.getConn();
		ArrayList<Addtrain> ac = new ArrayList<Addtrain>();
		PreparedStatement ps= null;
		ps = con.prepareStatement("select * from traindetail");
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			String trainno=rs.getString(1);
			String trainname=rs.getString(2);
			String splace=rs.getString(3);
			String dplace=rs.getString(4);
			String fare=rs.getString(5);
			String seat=rs.getString(6);
			String datee=rs.getString(7);
			Addtrain at = new Addtrain(trainno, trainname, splace, dplace, fare, seat, datee);
			ac.add(at);
		}
		return ac;
	}

	
	@Override
	public Register userprofile(String uname) throws SQLException {
		con = dbutill.getConn();
		PreparedStatement ps= null;
		ps = con.prepareStatement("select * from register where userid=?");
		ps.setString(1, uname);
		ResultSet rs = ps.executeQuery();
		Register at = null;
		while(rs.next()) {
			String password = rs.getString(2);
			String firstname=rs.getString(3);
			String middlename=rs.getString(4);
			String lastname=rs.getString(5);
			String gender=rs.getString(6);
			String status=rs.getString(7);
			String dob=rs.getString(8);
			String adhaarcard = rs.getString(9);
			String pancard = rs.getString(10);
			String email=rs.getString(11);
			String mobileno=rs.getString(12);
			String nationality=rs.getString(13);
			String address = rs.getString(14);
						
			at = new Register(uname , password, firstname, middlename, lastname, gender, status, dob, adhaarcard, pancard, email, mobileno, nationality, address);
			/*System.out.println(at);*/
		}
		return at;
}

	@Override
	public ArrayList<payment> getAllPayment() throws SQLException {
		con = dbutill.getConn();
		ArrayList<payment> ac = new ArrayList<payment>();
		PreparedStatement ps= null;
		ps = con.prepareStatement("select * from payment");
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			String cardname=rs.getString(1);
			String cardnumber=rs.getString(2);
			String expmonth=rs.getString(3);
			String expyear=rs.getString(4);
			String cvv = rs.getString(5);
			String amount = rs.getString(6);
			payment at = new payment(cardname, cardnumber, expmonth, expyear, cvv,amount);
			ac.add(at);
		}
		return ac;
	}
	}