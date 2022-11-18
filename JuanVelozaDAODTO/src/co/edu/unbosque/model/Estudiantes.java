package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistance.EstudiantesFile;

public class Estudiantes {

	private ArrayList<EstudianteDTO> estdto;
	private EstudianteDAO estdao;
	private EstudiantesFile ef;
	
	public Estudiantes() {
		ef = new EstudiantesFile();
		estdto = new ArrayList<EstudianteDTO>();
		estdto = ef.leerEstudiantes();
		estdao = new EstudianteDAO(ef);
	}

	public ArrayList<EstudianteDTO> getEstdto() {
		return estdto;
	}

	public void setEstdto(ArrayList<EstudianteDTO> estdto) {
		this.estdto = estdto;
	}

	public EstudianteDAO getEstdao() {
		return estdao;
	}

	public void setEstdao(EstudianteDAO estdao) {
		this.estdao = estdao;
	}

	public EstudiantesFile getEf() {
		return ef;
	}

	public void setEf(EstudiantesFile ef) {
		this.ef = ef;
	}

	
}
