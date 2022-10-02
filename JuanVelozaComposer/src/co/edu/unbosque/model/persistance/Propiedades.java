package co.edu.unbosque.model.persistance;

import java.io.*;
import java.util.Properties;

public class Propiedades {
	
	private Properties prop = new Properties();
	private String archivoprop = "c:\\data\\archivo.properties";
	
	public int escribirPropiedades() {
		try {
			prop.setProperty("NumeroEstrofasCancion", "3");
			prop.setProperty("NumeroFrasesEstrofa", "4");
			prop.store(new FileOutputStream(archivoprop), null);
		}
		catch (IOException ex) {
			return -1;
		}
		return 0;
	}
	
	public String leerPropiedades() {
		String linea = "";
		try {
			prop.load(new FileInputStream(archivoprop));
			
			linea += "Numero de Estrofas por Cancion: " + prop.getProperty("NumeroEstrofasCancion") + "\n";
			linea += "Numero de Frases por Estrofa: " + prop.getProperty("NumeroFrasesEstrofa") + "\n";
		}
		catch (IOException ex) {
			return null;
		}
		return linea;
	}

}
