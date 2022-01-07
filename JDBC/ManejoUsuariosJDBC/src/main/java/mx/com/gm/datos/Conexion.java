package mx.com.gm.datos;

import java.sql.*;

public class Conexion {
	private static final String JBDC_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
	private static final String JDBC_USER = "root";
	private static final String JBDC_PASSWORD = "luchoentelgy2021";

	public static Connection getConection() throws SQLException {
		Connection conn = DriverManager.getConnection(JBDC_URL, JDBC_USER, JBDC_PASSWORD);
		return conn;
	}

	public static void close(Connection conn) throws SQLException {
		conn.close();
	}

	public static void close(ResultSet rs) throws SQLException {
		rs.close();
	}
	
	public static void close(PreparedStatement ps) throws SQLException {
		ps.close();
	}
}
