package localhost.webdemo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Loginform extends HttpServlet {
	
       
   
    @override
	public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
    
    	//call database to validate username and password
    	
    	PrintWriter out=resp.getWriter();
    	
    	 out.println("<html><head><title>Loginform</title></head>");
    	   out.println("<body><form action=\"DoLogin\" method=\"Post\">");
    	   out.println("<p>Username:</p>") ;
    	   out.println("<p><input id='username1' type='text' name='username'/></p>");
    	   out.println("<p>Password:</p>");
    	   out.println("<p> <input id='Password1' type='password'name='password' /></p>");
    	   out.println("<p> <input id='Submit1' type='submit' value='submit' /></p>");
    	   out.println("</form></body></html>");
            
    	        
    	            
    	
	
	
    }
}

