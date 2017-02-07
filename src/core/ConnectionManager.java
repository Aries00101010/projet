package core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import core.entities.Configuration;

public class ConnectionManager {

	private static String URL = "jdbc:mysql://localhost:3306/projet";
	private static String USER = "root";
	private static String PASSWORD = "";
	private static Connection connection;
	
	
	public void initDb(Configuration configuration) {
		this.URL = configuration.getUrl();
		this.USER = configuration.getLogin();
		this.PASSWORD = configuration.getMdp();
	}
	
	public static Connection getConnection() {
		if (connection == null) {
			try {
				connection = DriverManager.getConnection(URL, USER, PASSWORD);
				connection.setAutoCommit(false);
			} catch (SQLException e) {
				throw new RuntimeException("Unable to create connection with database (url: " + URL + ", "
						+ " user: " + USER + ", password: " + PASSWORD + ")", e);
			}
		}
		return connection;
	}
	
	public static void close() {
		try {
			connection.close();
		} catch (SQLException e) {
			throw new RuntimeException("Unable to close connection", e);
		}
	}
	
}
