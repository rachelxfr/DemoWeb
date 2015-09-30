package localhost.webdemo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SnorlaxServlet
 */

public class SnorlaxServlet extends HttpServlet {

       
   
    @override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// TODO Auto-generated method stub
		PrintWriter ps=response.getWriter();
		
		ps.println("<html><head><title>SnorlaxHome</title>");
		ps.println("<body background='http://image.game.uc.cn/2015/7/29/10793057.jpg'>");
				ps.println("<p><label>Age:27</label></p>");
		        ps.println("<p><label>Firstname:Melvina  Lastname:Zhao  Category:Snorlax</p>");
				ps.println("<p><label>Height:5'7</label></p>");
				ps.println("<p><label>Weight:460.0KG</label></p>");
				ps.println("</body></head></html>");
		        
	}

}
