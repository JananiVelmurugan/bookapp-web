package com.janani.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {
	public static Connection getConnection() throws Exception {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookapp_db", "root", "password");
			System.out.println(connection);

		} catch (Exception e) {
			throw new Exception(e);

		}
		return connection;
	}
}
