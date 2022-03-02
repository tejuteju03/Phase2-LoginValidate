package com.Mphasis.login;


import java.sql.*;  
	  
public class LoginDao {  
	public static boolean validate(String name,String pass){  
	boolean status=false;  
	try{ 
		String driver="com.mqsql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/servlet1";
		String username="root";
		String password="tejaswiniR@1997";
	Class.forName("com.mqsql.jdbc.Driver");  
	Connection con=DriverManager.getConnection(url,username,password);  
	      
	PreparedStatement ps=con.prepareStatement(  
	"select * from userreg where name=? and pass=?");  
	ps.setString(1,name);  
	ps.setString(2,pass);  
	      
	ResultSet rs=ps.executeQuery();  
	status=rs.next();  
	          
	}catch(Exception e){System.out.println(e);}  
	return status;  
	}  
	}  


