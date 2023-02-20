package com.jdbcCo.JDBCsystematic;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectToDB {
	static final String DB_URL = "jdbc:mysql://localhost/batch65/Persons";
	static final String USER = "root";
	static final String PASS = "12345";
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";

	
	static final String QUERY = "SELECT * FROM Persons";

	public static void main(String[] args) throws ClassNotFoundException {
		// Open a connection
		try {
			
			//Connection - interface
			//DriverManager - Class
			//Statement - interface   Vs PreparedStatement
			//ResultSet - interface
			
			
		//	Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			Class.forName(JDBC_DRIVER);

			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(QUERY);
			
			while (rs.next()) {
				// Display values
				System.out.print("ID: " + rs.getInt("personId"));
				System.out.println(", Name: " + rs.getString("personName"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
