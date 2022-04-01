package mx.com.gm.datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexion {
	private static final String JDBC_URL="jdbc:mysql://localhost:33061/leccion-jdbc?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
	private static final String JDBC_USER="root";
	private static final String JDBC_PASSWORD="luchodevelop";
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
	}
	
	public static void close(ResultSet rs) throws SQLException {
		rs.close();
	}
	
	public static void close(PreparedStatement pst) throws SQLException {
		pst.close();
	}
	
	public static void close(Connection conn) throws SQLException {
		conn.close();
	}
	
}
