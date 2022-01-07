package mx.com.gm.test;

import java.util.*;

import mx.com.gm.datos.UsuarioDAO;
import mx.com.gm.domain.Usuario;

public class TestManejoUsuariosJDBC {

	public static void main(String[] args) {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario nuevoUsuario = new Usuario("karlman2", "karlman22222");
		System.out.println("Nro. de registros agregados: " + usuarioDAO.insertar(nuevoUsuario));

		Usuario modificarUsuario = new Usuario(2, "karlman2Modificado", "karlmanmodificado");
		System.out.println("Nro. de registros modificados: " + usuarioDAO.actualizar(modificarUsuario));

		Usuario eliminarUsuario = new Usuario(2);
		System.out.println("Nro. de registros eliminados: " + usuarioDAO.eliminar(eliminarUsuario));

		List<Usuario> usuarios = usuarioDAO.seleccionar();
		usuarios.forEach(usuario -> {
			System.out.println(usuario);
		});
	}

}
