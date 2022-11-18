package co.edu.unbosque.model;

import java.io.Serializable;
import java.util.*;

import co.edu.unbosque.model.persistance.EstudiantesFile;



public class EstudianteDAO  {

	private EstudiantesFile ef;
	
	public EstudianteDAO(EstudiantesFile ef) {
		this.ef = ef;
	}
	
	public EstudianteDTO buscarEstudiantes(String nombre, ArrayList<EstudianteDTO> estudiantes) {
		EstudianteDTO encontrado = null;
		if (!estudiantes.isEmpty()) {
			for (int i = 0; i < estudiantes.size(); i++) {
				if (estudiantes.get(i).getNombre().equals(nombre)) {
					encontrado = estudiantes.get(i);
				}
			}
		}
		return encontrado;
		}
	
	public boolean agregarEstudiantes(int id, String nombre, String carrera, ArrayList<EstudianteDTO> estudiantes) {
		EstudianteDTO nuevo = new EstudianteDTO(id, nombre, carrera);
		
		if(buscarEstudiantes(nombre, estudiantes) == null){
			estudiantes.add(nuevo);
			ef.escribirEstudiantes(estudiantes);
			return true;	
		}else {
			return false;
		}
	}
	
	public String obtenerEstudiantes(ArrayList<EstudianteDTO> estudiantes){
		String texto = "";
		for (int i = 0; i < estudiantes.size(); i++) {
			texto = texto.concat(estudiantes.get(i).toString() + "\n");
		}
		return texto;
	}
	
}
