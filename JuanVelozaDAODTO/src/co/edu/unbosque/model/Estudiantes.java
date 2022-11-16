package co.edu.unbosque.model;

import co.edu.unbosque.model.persistance.EstudiantesFile;

public class Estudiantes {

	private EstudianteDTO estdto;
	private EstudiantesDAO estdao;
	private EstudiantesFile ef;
	
	public Estudiantes() {
		this.estdto = estdto;
		this.ef = ef;
		this.estdao= estdao;
	}

	public EstudianteDTO getEstdto() {
		return estdto;
	}

	public void setEstdto(EstudianteDTO estdto) {
		this.estdto = estdto;
	}

	public EstudiantesDAO getEstdao() {
		return estdao;
	}

	public void setEstdao(EstudiantesDAO estdao) {
		this.estdao = estdao;
	}

	public EstudiantesFile getEf() {
		return ef;
	}

	public void setEf(EstudiantesFile ef) {
		this.ef = ef;
	}
	
	
}
