package co.edu.unbosque.model.persistance;

import java.io.*;

import java.io.IOException;
import java.util.ArrayList;

import co.edu.unbosque.model.EstudianteDTO;
import co.edu.unbosque.model.EstudiantesDAO;

public class EstudiantesFile {

	private String ruta = "./data/estudiantes.out";
	private ArrayList<EstudianteDTO> estudiantes;
	
	public String escribirEstudiantes(ArrayList<EstudianteDTO> estudiantes) {
		String mensaje = "Resgistro de estudiantes ingresado";
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ruta));
			out.writeObject(estudiantes);
			out.close();
		}
		catch (IOException e) {
			e.printStackTrace();
			mensaje = "Error de IO";
		}
		return mensaje;
	}
	
	public ArrayList<EstudianteDTO> leerEstudiantes(ArrayList<EstudianteDTO> estudiantes) {
        ObjectInputStream in;
		try {
			in = new ObjectInputStream(new FileInputStream(ruta));
	        estudiantes = (ArrayList<EstudianteDTO>)in.readObject();
	        in.close();
	       

		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return estudiantes;
	}
	
	
}
