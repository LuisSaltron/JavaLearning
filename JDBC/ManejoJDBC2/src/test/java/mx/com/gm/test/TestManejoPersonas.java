package mx.com.gm.test;

import java.util.List;

import mx.com.gm.datos.PersonaDAO;
import mx.com.gm.domain.Persona;

public class TestManejoPersonas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonaDAO personaDao = new PersonaDAO();

//		Persona personaActualizar = new Persona(1, "Maria", "Estrada", "maria@correo.com", "32085738");
//		personaDao.actualizar(personaActualizar);

//		Persona personaNueva= new Persona("Carlos", "Esparza", "carlos@correo.com", "320210241");
//		personaDao.insertar(personaNueva);
		
		personaDao.eliminar(2);
		List<Persona> personas = personaDao.seleccionar();
		for (Persona persona : personas) {
			System.out.println(persona);
		}
	}
}