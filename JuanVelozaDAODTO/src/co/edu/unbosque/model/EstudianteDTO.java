package co.edu.unbosque.model;

import java.io.Serializable;
import java.util.*;


public class EstudianteDTO implements Serializable {

	private List<EstudiantesDAO> estudiantes;
	
	public EstudianteDTO() {
		estudiantes = new ArrayList<>();
	
	}
	
	public void agregarEstudiantes() {
		EstudiantesDAO estudiante1 = new EstudiantesDAO(15411515, "Camilo", "Derecho");
		EstudiantesDAO estudiante2 = new EstudiantesDAO(584915445, "Jorge", "Contaduria");
		EstudiantesDAO estudiante3 = new EstudiantesDAO(15411515, "Chayanne", "Musica");
		estudiantes.add(estudiante1);
		estudiantes.add(estudiante2);
		estudiantes.add(estudiante3);
	}
	
	public List<EstudiantesDAO> obtenerEstudiantes(){
		return estudiantes;
	}
	
	
}
