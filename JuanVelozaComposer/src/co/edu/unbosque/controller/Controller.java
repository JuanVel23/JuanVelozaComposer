package co.edu.unbosque.controller;

import co.edu.unbosque.model.Canción;
import co.edu.unbosque.view.View;

public class Controller {

	private Canción ca;
	private View vista;
	
	public Controller() {
		ca = new Canción();
		vista = new View();
		funcionar();
	}
	
	public void funcionar() {
		
		String aux = vista.leerString("Dale un nombre a tu cancion: ");
		ca.setNombre(aux);
		ca.nombrarCancion();
		vista.devolverInformacion(ca.getFr().generarCancion());
		ca.gestionarArchivo();
		vista.devolverInformacion(ca.gestionarPropiedades());
	}
}
