
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class MYSQLDBConnectionWithProps {
	public static void main(String[] args)  {
		try {
			
			FileReader fr= new FileReader("/Users/saikumar/Desktop/ADVJAVA-9AM/AdvancedJava_9AM/codesnippets/JDBC/config.properties");
			 
			 Properties properties = new Properties();
			 
			  properties.load(fr);
			  
			  String driverClass =  properties.getProperty("driverClass");
			  String url =  properties.getProperty("url");
			  String username =  properties.getProperty("username");
			  String password =  properties.getProperty("password");
			  
			  System.out.println("driverClass :"+ driverClass);
			  System.out.println("username :"+ username);
			  System.out.println("password :"+ password);
			
			//step1: Load and Register the Driver 
			Class.forName(driverClass);
			// Get the connection by using username, password and url
		Connection connection = DriverManager.getConnection(url, username, password);
		
		 System.out.println("connection"+ connection);
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


