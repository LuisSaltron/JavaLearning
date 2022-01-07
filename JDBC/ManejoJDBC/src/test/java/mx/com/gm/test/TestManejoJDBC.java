package mx.com.gm.test;

import java.util.List;

import mx.com.gm.datos.PersonaDAO;
import mx.com.gm.domain.Persona;

public class TestManejoJDBC {

	public static void main(String[] args) {
		PersonaDAO personaDao = new PersonaDAO();

//		Persona personaNueva = new Persona("Carlos", "Esparza", "cesparza@gmail.com", "3123826098");
//		System.out.println("Registro insertado: " + personaDao.insertar(personaNueva));

//		Persona personaModificada=new Persona(2,"CarlosModificado","EsparzaM","cesparza@gmail.com","3123826098");
//		System.out.println("Registro actualizado: " +personaDao.actualizar(personaModificada));
//		
		Persona personaEliminar = new Persona(2);
		System.out.println("Registro eliminado: " +personaDao.eliminar(personaEliminar));
		List<Persona> personas = personaDao.seleccionar();
		personas.forEach(persona -> {
			System.out.println(persona);
		});
	}
}
