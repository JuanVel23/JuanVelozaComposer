package co.edu.unbosque.model;

import java.io.Serializable;

public class EstudianteDTO implements Serializable{

	public static final long serialVersionUID = 1L;
	private int id;
	private String nombre;
	private String carrera;
	
	public EstudianteDTO(int id, String nombre, String carrera) {
		this.id = id;
		this.nombre = nombre;
		this.carrera = carrera;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	public String toString() {
		return "ID = " + id + ", Nombre = " + nombre + ", Carrera = " + carrera + "\n";
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the carrera
	 */
	public String getCarrera() {
		return carrera;
	}

	/**
	 * @param carrera the carrera to set
	 */
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	
}
