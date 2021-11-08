package 28_oct;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DBConnectionFactory {

	public static Connection getConnectionInstance() 
	{
		ResourceBundle bundle = ResourceBundle.getBundle("db");
		String jdbcDriver = bundle.getString("driver");
		String url = bundle.getString("url");
		String user = bundle.getString("username");
		String password = bundle.getString("password");
		Connection con=null;
		try {
			Class.forName(jdbcDriver);
			con = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
}