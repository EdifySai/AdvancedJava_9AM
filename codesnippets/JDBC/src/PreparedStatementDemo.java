import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementDemo {
	public static void main(String[] args) {
		try {		
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon", "root", "ipl2021@dubai");
			 
			String query="insert into users values(?,?,?)";
			int i =1;
			while(i <=10) {
				PreparedStatement preparedStatement = connection.prepareStatement(query);
				preparedStatement.setString(1, "kiran"+i);
				preparedStatement.setString(2, "kiran123"+i);
				preparedStatement.setString(3, "kiran@gmail.com"+i);
			    preparedStatement.execute();
			    System.out.println("completed");
			    i++;
			}	
		}
		catch(Exception e) {
			 System.out.println(e);
		}
	}
}
