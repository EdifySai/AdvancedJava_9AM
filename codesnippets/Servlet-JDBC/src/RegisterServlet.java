import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	Connection connection = null;
	 @Override
	public void init() throws ServletException {
		 System.out.println("init method called");
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			  connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon","root","ipl2021@dubai");
		 }
		 catch(Exception e) {
			 System.out.println(e);
		 }
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		  PrintWriter out =  resp.getWriter();
		  out.print("<html>\n" + 
		  		"<head>\n" + 
		  		"</head>\n" + 
		  		"<body>\n" + 
		  		"<form method=\"post\" action=\"./register\">\n" + 
		  		"  <input type=\"text\" name=\"username\" placeholder=\"username here\">\n" + 
		  		"  <input type=\"password\" name=\"password\" placeholder=\"password here\">\n" + 
		  		"  <input type=\"text\" name=\"email\" placeholder=\"email here\">\n" + 
		  		"  <button>Register </button>\n" + 
		  		"</form>\n" + 
		  		"</body>\n" + 
		  		"</html>");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("do post called");
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String email = req.getParameter("email");
		
		PrintWriter out = resp.getWriter();
		
		System.out.println("username :" + username);
		System.out.println("password :" + password);
		System.out.println("email :" + email);
		
		 if(connection != null) {
			 try {
				 PreparedStatement pstmt=  connection.prepareStatement("insert into users values(?,?,?)"); 
				 pstmt.setString(1, username);
				 pstmt.setString(2, password);
				 pstmt.setString(3, email);
				 pstmt.execute();
				 out.print("User registered successfully!");
				 
			 }
			 catch(Exception e) {
				 System.out.println(e);
				 out.print("Something went wrong! please try again after sometime");
				 
			 }
			
			 
		 }
	}
	
	@Override
	public void destroy() {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
