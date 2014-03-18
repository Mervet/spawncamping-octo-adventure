package tn.edu.esprit.cinfo2.eskiMooc.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {

	private static  Connection connection;

	public static Connection hetConnection() {
		String url = "jdbc:mysql://localhost:3306/eskimoocDB";
		String user = "root";
		String password = "";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("connection established");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

}
