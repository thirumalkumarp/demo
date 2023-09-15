package Com.Demo2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//public class DemoServlet {
	public class DemoServlet extends HttpServlet{  
		public void doGet(HttpServletRequest req,HttpServletResponse res)  
		throws ServletException,IOException  
		{  
		res.setContentType("text/html");  
		PrintWriter pw=res.getWriter();  
		  
		res.sendRedirect("http://www.google.com");  
		  
		pw.close();  
		}  

}
