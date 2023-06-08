
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class MYSQLDBConnection {
	public static void main(String[] args)  {
		try {
			//step1: Load and Register the Driver 
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Get the connection by using username, password and url
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon", "root", "ipl2021@dubai");
		 if(connection != null) {
			 System.out.println("Connected to the database");
			 
			 String sqlQuery = "insert into users values('java','java','java@gmail.com')";
			// Create a bridge to send the SQL Queries to the database 
			 Statement statement=connection.createStatement();
			 statement.execute(sqlQuery);
			 System.out.println("completed");
			 
		 }	
		}
		catch(Exception e) {
			System.out.println("We are in catch block");
			 System.out.println(e);
		}
		
		
	}

}


