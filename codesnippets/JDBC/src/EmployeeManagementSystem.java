import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeManagementSystem {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemgt","root","ipl2021@dubai");
			Statement statement = connection.createStatement();
			
			Scanner sc = new Scanner(System.in);
			
			// create a table 
			
//			   statement.execute("create table employees(name varchar(100), project varchar(200), location varchar(200))");
//			   System.out.println("created");
			
			
			// insert data into a table
			
			
//			 System.out.println("Enter name");
//			 String name = sc.next();
//			 
//			 System.out.println("Enter project");
//			 String project = sc.next();
//			 
//			 System.out.println("Enter location");
//			 String location = sc.next();
//			 
//		    String query= "insert into employees values('"+name+"','"+project+"','"+location+"')";	
//			System.out.println("query "+ query);
//			
//			  statement.execute(query);
//			  
//			  System.out.println("executed");
			// list of employees 
//			 ResultSet resultSet =  statement.executeQuery("select * from employees");
//			 
//			 while(resultSet.next()) {
//				 
//System.out.println(resultSet.getString(1)+"\t"+ resultSet.getString(2)+"\t"+ resultSet.getString(3));
//				 
//			 }
			
			
			// Getting the resultset information - ResultSetMetaData
			
//			 ResultSet resultSet =  statement.executeQuery("select * from employees");
//			 
//			ResultSetMetaData metaData =  resultSet.getMetaData();
//			
//			System.out.println(metaData.getColumnCount());
//			
//			int length = metaData.getColumnCount();
//			
//			int i =1;
//			
//			while( i <=length) {
//				System.out.println(metaData.getColumnTypeName(i));
//				i++;
//			}
			
			
			// update query 
			
//			   statement.execute("update employees set project='lms' where name='rajesh'");
//			   System.out.println("updted");
//			
			
			// delete query 
			
		   statement.execute("delete from employees where name='Nitisha'");
			   System.out.println("deleted");
			
			  
			
			
		}
		catch(Exception e) {
			
			System.out.println(e);
		}	
	}
}


/*

Connection: Interface

   interface Connection {
   
   }

*/