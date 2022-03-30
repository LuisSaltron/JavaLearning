package mx.com.gm.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestMySqlJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:33061/leccion-jdbc?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
//			Class.forName("com.mysql.cj.jdbc.Driver");
		try {
			Connection conexion = DriverManager.getConnection(url, "root", "luchodevelop");
			Statement instruccion = conexion.createStatement();
			String sql = "SELECT id_persona,nombre,apellido,email,telefono FROM persona";
			ResultSet resultado=instruccion.executeQuery(sql);
			while(resultado.next()) {
				System.out.print("Id persona: "+resultado.getInt("id_persona")+" ");
				System.out.print("Nombre: "+resultado.getString("nombre")+" ");
				System.out.print("Apellido: "+resultado.getString("apellido")+" ");
			}
			resultado.close();
			instruccion.close();
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
