

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTwo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext servletContext =  getServletContext();
		
		 String driver =  servletContext.getInitParameter("driver");
	      String username =  servletContext.getInitParameter("username");
	      String password = servletContext.getInitParameter("password");
	      
	      System.out.println("Inside servlet two");
	      System.out.println("driver:" + driver);
	      System.out.println("username:" + username);
	      System.out.println("password:" + password);
	      
	      System.out.println("-----------------------------");
	}

	

}
