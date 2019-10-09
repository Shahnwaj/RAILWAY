package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;
import javax.websocket.SendResult;

import org.apache.catalina.Session;
import org.apache.jasper.compiler.ErrorDispatcher;

import com.models.Addtrain;
import com.models.AdminReg;
import com.models.Booking;
import com.models.Complaint;
import com.models.Register;
import com.models.payment;
import com.services.RegisterServices;
import com.services.RegisterServicesImpl;
import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;;

/**
 * Servlet implementation class RegisterController
 */
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
	    RegisterServicesImpl ser = new RegisterServicesImpl();
		String action = request.getParameter("action");
		   if (action.equals("insert")) 
		   {
			String userid = request.getParameter("userid");
			String password = request.getParameter("password");
			String firstname = request.getParameter("firstname");
			String middlename = request.getParameter("middlename");
			String lastname = request.getParameter("lastname");
			String gender = request.getParameter("gender");
			String status = request.getParameter("status");
			String dob = request.getParameter("dob");
			String adhaarcard = request.getParameter("adhaarcard");
			String pancard = request.getParameter("pancard");
			String email = request.getParameter("email");
			String mobileno = request.getParameter("mobileno");
			String nationality = request.getParameter("nationality");
			String address = request.getParameter("address");
			Register r = new Register(userid, password, firstname, middlename, lastname, gender, status, dob,
					adhaarcard, pancard, email, mobileno, nationality, address);

			ser.addUser(r);

		}

		   else if (action.equals("login")) {
			   
	
				String userid = request.getParameter("userid");
				String password = request.getParameter("password");
				HttpSession sn = request.getSession();
				boolean flag=ser.login(userid, password);
				if(flag) {
					/*HttpSession sn = request.getSession(false);*/
					sn.setAttribute("userid", userid);
					RequestDispatcher rd = request.getRequestDispatcher("userhome.jsp");
					rd.forward(request, response);
					
				}else { 
					pw.println("<script type=\"text/javascript\">");  
					pw.println("alert('User Id Or Password Is Incorrect');");  
					pw.println("</script>");
					/*sn.invalidate();
                    request.setAttribute("Error", "Invalid user or password");
                    RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
                    rd.forward(request, response);*/          
					 
			            
				}
		   }
				else if (action.equals("admininsert")) 
				   {
					System.out.println("Hello admin");
					String username = request.getParameter("username");
					String pswd = request.getParameter("pswd");
					String firstname = request.getParameter("firstname");
					String lastname = request.getParameter("lastname");
					String mobileno = request.getParameter("mobileno");
					String email = request.getParameter("email");
					
					
					AdminReg r = new AdminReg(username, pswd, firstname, lastname,mobileno,email);
					ser.addadmin(r);

				}

			
	else if (action.equals("adminlogin")) {
		  
			String username = request.getParameter("username");
			String pswd = request.getParameter("pswd");
			boolean flag=ser.adminlogin(username, pswd);
			if(flag) {
				HttpSession sn = request.getSession();
				sn.setAttribute("username", username);
				response.sendRedirect("adminhome.jsp");
			}else {
				pw.write("User id or Password is incorrect!!");
			}
	}
	else if(action.equals("adddetail")) {
		String trainno=request.getParameter("trainno");
		String trainname=request.getParameter("trainname");
		String splace=request.getParameter("splace");
		String dplace=request.getParameter("dplace");
		String fare=request.getParameter("fare");
		String seat=request.getParameter("seat");
		String datee=request.getParameter("datee");
				Addtrain t=new Addtrain(trainno,trainname,splace,dplace,fare,seat,datee);
				
				ser.addtrain(t);
	}
	else if(action.equals("searchtrain")) {
		try {
		String boarding = request.getParameter("Boarding");
		String destination = request.getParameter("Destination");
		String datee=request.getParameter("datee");
		ArrayList<Addtrain> al=ser.SearchTrain(boarding, destination,datee);
		HttpSession sn=request.getSession();
		sn.setAttribute("train", al);
		RequestDispatcher rd=request.getRequestDispatcher("searchtrain.jsp");
		rd.forward(request, response);
		}catch(Exception e) {
			
			RequestDispatcher rd=request.getRequestDispatcher("notfound.jsp");
			rd.forward(request, response);
	}
	}
	else if(action.equals("complnt")) {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String complaint = request.getParameter("complaint");
		Complaint c = new Complaint(name, email, address, complaint);
		ser.addcomplaint(c);
	}
	else if (action.equals("refresh")) {
		ArrayList<Complaint> ac = ser.getAllComplaint();
		request.setAttribute("ac", ac);
		RequestDispatcher rd=request.getRequestDispatcher("admincomplaint.jsp");
		rd.forward(request, response);
	}
	else if (action.equals("booking")) {
		String trainno=request.getParameter("trainno");
		String splace=request.getParameter("splace");
		String dplace=request.getParameter("dplace");
		String name = request.getParameter("name");
		String address= request.getParameter("address");
		String mobileno = request.getParameter("mobileno");
		String adhaar = request.getParameter("adhaar");
		String todate = request.getParameter("todate");
		String noofseat = request.getParameter("noofseat");
		Booking bt =new Booking(trainno, splace, dplace, name, address, mobileno, adhaar, todate, noofseat);
		ser.booking(bt,Integer.parseInt(noofseat));
		RequestDispatcher rd=request.getRequestDispatcher("payment.jsp");
		rd.forward(request, response);
	}
	else if (action.equals("showticket")) {
		ArrayList<Booking> ac = ser.getAllBooking();
		request.setAttribute("ac", ac);
		RequestDispatcher rd=request.getRequestDispatcher("adminbookticket.jsp");
		rd.forward(request, response);
	}
	else if (action.equals("update")) {
		System.out.println("updated");
		String trainno = request.getParameter("trainno");
		String trainname = request.getParameter("trainname");
		String splace = request.getParameter("splace");
		String dplace = request.getParameter("dplace");
		String fare = request.getParameter("fare");
		String seat = request.getParameter("seat");
		String datee=request.getParameter("datee");
		Addtrain at = new Addtrain(trainno, trainname, splace, dplace, fare, seat,datee);
		ser.updatetrain(at);
		
	}
	else if (action.equals("logout")) { 
		HttpSession sn = request.getSession(false);
		sn.invalidate();//Destroy the session
		response.sendRedirect("home.html");

	}
	else if (action.equals("payment")){
		   String cardname= request.getParameter("cardname");
		   String cardnumber = request.getParameter("cardnumber");
		   String expmonth = request.getParameter("expmonth");
		   String expyear = request.getParameter("expyear");
		   String cvv = request.getParameter("cvv");
		   String amount = request.getParameter("amount");
		   payment p = new payment(cardname, cardnumber, expmonth, expyear, cvv,amount);
		   ser.addpayment(p);
		   RequestDispatcher rd=request.getRequestDispatcher("thankyou.jsp");
			rd.forward(request, response);	   
	}
	else if(action.equals("trainlist")) {
		ArrayList<Addtrain> ac = ser.getAllTrain();
		request.setAttribute("ac", ac);
		RequestDispatcher rd=request.getRequestDispatcher("admintrainlist.jsp");
		rd.forward(request, response);
	}
	else if (action.equals("profile")) {
		System.out.println("hhhghh");
		HttpSession sn = request.getSession(false);
		String uname= (String) sn.getAttribute("userid");
		Register rp = ser.userprofile(uname);
		
		request.setAttribute("rp" , rp);
		RequestDispatcher rd = request.getRequestDispatcher("profile.jsp");
		 rd.forward(request, response);
		 }
	else if (action.equals("showpayment")) {
			ArrayList<payment> ac = ser.getAllPayment();
			request.setAttribute("ac", ac);
			RequestDispatcher rd=request.getRequestDispatcher("showpayment.jsp");
			rd.forward(request, response);
	}
	else if (action.equals("history")) {
		ArrayList<Booking> ac = ser.getAllBooking();
		request.setAttribute("ac", ac);
		RequestDispatcher rd=request.getRequestDispatcher("userhistory.jsp");
		rd.forward(request, response);
	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

