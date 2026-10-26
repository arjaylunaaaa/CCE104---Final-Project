package Finals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

	private final static String URL = "jdbc:mysql://localhost:3306/test";
	private final static String USERNAME = "root";
	private final static String password = "";

	public static Connection connection() {
		
		try {
			return DriverManager.getConnection(URL, USERNAME, password);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
