

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		   HttpSession session =  request.getSession();
		   String token ="hello";
		   session.setAttribute("token", "hello");
		   PrintWriter out = response.getWriter();
		   out.print("<html><head></head> <body><a href='./SecondServlet'>Next Page</a></body></html>");
		   
		
	}

}
