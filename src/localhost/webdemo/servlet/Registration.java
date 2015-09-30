package localhost.webdemo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Registration")
public class Registration extends HttpServlet {
	
       
   @override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		
		PrintWriter out=response.getWriter();
		
	   out.print("<html><head><tiltle>registration</title>"
	    		 +"<body><form action=\"PokemonTest\" method=\"Post\">"
	    		 +"<p><label>enter your name:</label></p>" 
	    		 +"<input id='text1'name='firstname'+'lastname' type='text'/>"
	    		 +"<p><label>enter your information</p>"
	    		 +"<p>Marjor:<input id='text2' name='major' type='text'/>"
	    		 
	    		 +"</form></body>"
	     		+ "<head></html>");
	   
	   
	}

}
