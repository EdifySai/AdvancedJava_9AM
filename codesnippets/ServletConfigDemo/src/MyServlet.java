

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Do get is called");
		
		// DB - Driver, url, username, password
		
		     ServletConfig servletConfig = getServletConfig();
		     
		      String driver =  servletConfig.getInitParameter("driver");
		      String username =  servletConfig.getInitParameter("username");
		      String password = servletConfig.getInitParameter("password");
		      
		      System.out.println("driver:" + driver);
		      System.out.println("username:" + username);
		      System.out.println("password:" + password);
		      
		
	}

}
