package common;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Dbutils {
	private static Connection connection;
	private static Statement statement;

	static {
	try {
	connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root");

	statement = connection.createStatement();
	} catch (SQLException e){ 
		e.printStackTrace();
	}
	}

	public static ResultSet executeSelectQuery(String query) throws SQLException{

	ResultSet result = statement.executeQuery(query);
	return result;

	}

	public static void executeQuery1(String query) throws SQLException { 
	statement.execute(query);

	}

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void executeQuery(String query) {
		// TODO Auto-generated method stub
		
	}

}
