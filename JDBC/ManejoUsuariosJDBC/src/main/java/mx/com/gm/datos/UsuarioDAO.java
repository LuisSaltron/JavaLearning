package mx.com.gm.datos;

import java.sql.*;
import java.util.*;
import mx.com.gm.domain.Usuario;

public class UsuarioDAO {
	private static final String SQL_SELECT = "SELECT id_usuario, usuario, password FROM usuario";
	private static final String SQL_INSERT = "INSERT INTO usuario(usuario,password) VALUES(?,?)";
	private static final String SQL_UPDATE = "UPDATE usuario SET usuario=?,password=? WHERE id_usuario=?";
	private static final String SQL_DELETE="DELETE FROM usuario WHERE id_usuario=?";
	public List<Usuario> seleccionar() {
		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		List<Usuario> usuarios = new ArrayList<>();
		try {
			conn = Conexion.getConection();
			ps = conn.prepareStatement(SQL_SELECT);
			rs = ps.executeQuery();
			while (rs.next()) {
				int idUsuario = rs.getInt("id_usuario");
				String nombreUsuario = rs.getString("usuario");
				String password = rs.getString("password");
				Usuario usuario = new Usuario(idUsuario, nombreUsuario, password);
				usuarios.add(usuario);
			}
		} catch (SQLException e) {
			e.printStackTrace(System.out);
		} finally {
			try {
				Conexion.close(rs);
				Conexion.close(ps);
				Conexion.close(conn);
			} catch (SQLException e) {
				e.printStackTrace(System.out);
			}
		}
		return usuarios;
	}

	public int insertar(Usuario usuario) {
		Connection conn = null;
		PreparedStatement ps = null;
		int cantRegistros = 0;
		try {
			conn = Conexion.getConection();
			ps = conn.prepareStatement(SQL_INSERT);
			ps.setString(1, usuario.getUsuario());
			ps.setString(2, usuario.getPassword());
			cantRegistros = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace(System.out);
		} finally {
			try {
				Conexion.close(ps);
				Conexion.close(conn);
			} catch (SQLException e) {
				e.printStackTrace(System.out);
			}
		}
		return cantRegistros;
	}

	public int actualizar(Usuario usuario) {
		Connection conn = null;
		PreparedStatement ps = null;
		int cantRegistros = 0;
		try {
			conn = Conexion.getConection();
			ps = conn.prepareStatement(SQL_UPDATE);
			ps.setString(1, usuario.getUsuario());
			ps.setString(2, usuario.getPassword());
			ps.setInt(3, usuario.getIdUsuario());
			cantRegistros = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace(System.out);
		} finally {
			try {
				Conexion.close(ps);
				Conexion.close(conn);
			} catch (SQLException e) {
				e.printStackTrace(System.out);
			}
		}
		return cantRegistros;
	}

	public int eliminar(Usuario usuario) {
		Connection conn = null;
		PreparedStatement ps = null;
		int cantRegistros = 0;
		try {
			conn = Conexion.getConection();
			ps = conn.prepareStatement(SQL_DELETE);
			ps.setInt(1, usuario.getIdUsuario());
			cantRegistros = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace(System.out);
		} finally {
			try {
				Conexion.close(ps);
				Conexion.close(conn);
			} catch (SQLException e) {
				e.printStackTrace(System.out);
			}
		}
		return cantRegistros;
	}

}
