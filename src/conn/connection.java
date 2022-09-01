package conn;

import java.sql.Connection;
import java.sql.DriverManager;
 

public class connection {

	public Connection connection;
		public Connection getCconnection() {
			
			 String dbname="projetrs";
			 String username="root";
			 String password="22032001";
			 
			 
			 try {
				String connectionURL = "jdbc:mysql://localhost:3306/projetrs";
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				
			     connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetrs?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC", "root", "22032001");
			
			    		
			 } catch (Exception e) {
				// TODO Auto-generated catch block
				 System.out.println("I m here error");
				e.printStackTrace();
			}
			 
			return connection;
		}
}
