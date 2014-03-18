package tn.edu.esprit.cinfo2.eskiMooc.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MyConnection {

	private static Connection connection;
	private static Statement statement;

	public static Connection hetConnection() {
		String url = "jdbc:mysql://localhost:3306/eskimoocDB";
		String user = "root";
		String password = "";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("connection established");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return connection;
	}

	public static Statement hetStatement() {
		try {
			statement = hetConnection().createStatement();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return statement;
	}

}
