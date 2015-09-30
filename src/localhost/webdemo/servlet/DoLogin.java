package localhost.webdemo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class DoLogin extends HttpServlet {
	
       
  
   @override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	   
	   PrintWriter out=response.getWriter();
	   
		
		String Username=request.getParameter("username");
		String Password=request.getParameter("password");
		
		
		if (Username.equals("Feiran")&&(Password.equals("327")))
			{out.print("<html><head><title>Dologin</title></head>");
			out.print("<body>Welcome Back,how are you doing?</<body></html>");}
					 
		else 
			{out.print("<html><head><title>Faillogin</title></head><body>Please make a registration and get your pokemon name.");
			out.print("<input id='Submit' type='submit' value='submit'/></body></html>");
			
			RequestDispatcher ps=request.getRequestDispatcher("Registration");
			ps.forward(request,response);
			
			}
    	}
    	
    	

	}


