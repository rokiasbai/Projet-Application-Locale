package conn;

import java.sql.*;
public class test {

	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetrs", "root", "22032001");
			Statement statement = (Statement) conn.createStatement(); 
			
			String requete="select idenseigants, passwordenseignants from enseignants";
		    
		    ResultSet resultset = statement.executeQuery(requete);
		    while(resultset.next())
		    {
		    	System.out.println("Nom : "+ resultset.getString("idenseigants") + " ==> "+ " Age : "+ resultset.getInt("passwordenseignants"));
		    }
		    
		    resultset.close();
		    statement.close();
		      
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}

	}

}

	

