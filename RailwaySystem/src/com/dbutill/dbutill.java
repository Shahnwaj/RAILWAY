package com.dbutill;
import java.sql.Connection;
import java.sql.DriverManager;
public class dbutill {

	public static Connection getConn(){
	    Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/railway","root","Bigdream@0211");
			return con;
		}catch(Exception e) {
			return con;
		}
		
		
	}
}