package mx.com.gm.datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
	private static final String JDBC_URL = "jdbc:mysql://localhost:33061/leccion-jdbc?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
	private static final String JDBC_USER = "root";
	private static final String JDBC_PASSWORD = "luchodevelop";

	public static Connection getConnection() throws SQLException {
		Connection conexion = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
		return conexion;
	}

	public static void close(ResultSet rs) throws SQLException {
		rs.close();
	}

	public static void close(Statement st) throws SQLException {
		st.close();
	}

	public static void close(PreparedStatement ps) throws SQLException {
		ps.close();
	}

	public static void close(Connection conn) throws SQLException {
		conn.close();
	}
}
