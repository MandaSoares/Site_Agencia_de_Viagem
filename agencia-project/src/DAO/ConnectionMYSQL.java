package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionMYSQL {
	private static String URL = "jdbc:mysql://localhost:3306/agencia";
	private static String USUARIO = "root";
	private static String SENHA = "";
	
	public static Connection createConnectionMySQL() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(URL, USUARIO, SENHA);
		
		return connection;
	}
}
