package localhost.webdemo.servlet;
import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;


import java.sql.*
;


public  class Myfirstservlet extends HttpServlet {

	/**
	 * 
	 */
	
	@override
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException,IOException{
		
		 PrintWriter out=response.getWriter();
		
		 out.println("<html><head><title>Dancing Dog</title></head><body>");
		 out.println("<h1> this is the home of Dancing Dog</h1>");
  
	  
	   try { 
		   Connection con=null;
		Class.forName("com.mysql.jdbc.Driver");
		  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb" ,"root","Pikachu327!");
	 Statement st=con.createStatement();
	//out.println("get connection");//test
	ResultSet rs=st.executeQuery("select type, name, experience from Dance");
	
	
	while(rs.next())
		{out.println(rs.getString(1));
	    out.println(rs.getString(2));
	    out.println(rs.getString(3));
	   
		}// Resultset.getString(columnindex) return column value
	
	out.println("</body></html>"); 
	   } catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	
	   
	   
		 
		 
		 
		 
         
	    
		 
		// RequestDispatcher ps=request.getRequestDispatcher("Loginform");
		//	ps.forward(request,response);
}
	


}
       