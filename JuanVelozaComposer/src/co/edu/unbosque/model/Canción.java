package co.edu.unbosque.model;

import co.edu.unbosque.model.persistance.FileCancion;
import co.edu.unbosque.model.persistance.Propiedades;

public class Canción {

	private Frases fr;
	private String nombre;

	
	public Canción() {
		fr = new Frases();
		this.nombre = "";  
	}
	
	public void nombrarCancion() {
		fr.setCancion(nombre + "\n" + fr.getCancion());
	}
	
	public void gestionarArchivo() {
		FileCancion archivo = new FileCancion();
		archivo.esribirArchivo(fr.getCancion());
	}
	
	public String gestionarPropiedades() {
		Propiedades prop = new Propiedades();
		prop.escribirPropiedades();
		
		return "Se leyeron estas propiedades: " + "\n" + prop.leerPropiedades();
	}

	public Frases getFr() {
		return fr;
	}

	public void setFr(Frases fr) {
		this.fr = fr;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	
	
}
