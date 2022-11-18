package co.edu.unbosque.model.persistance;

import java.io.*;
import java.util.ArrayList;

import co.edu.unbosque.model.EstudianteDAO;
import co.edu.unbosque.model.EstudianteDTO;

public class EstudiantesFile {

	private String ruta = "./data/estudiantes.out";
	private ObjectInputStream in;
	private ObjectOutputStream out;
	private ArrayList<EstudianteDTO> estudiantes;
	
	public String escribirEstudiantes(ArrayList<EstudianteDTO> estudiantes2) {
		String mensaje = "Resgistro de estudiantes ingresado";
		try {
			out = new ObjectOutputStream(new FileOutputStream(ruta));
			out.writeObject(estudiantes2);
			out.close();
		}
		catch (IOException e) {
			e.printStackTrace();
			mensaje = "Error de IO";
		}
		return mensaje;
	}
	
	public ArrayList<EstudianteDTO> leerEstudiantes(){
		ArrayList<EstudianteDTO> estudiantes = new ArrayList<EstudianteDTO>();
		if(ruta.length() != 0) {
			try {
				in = new ObjectInputStream(new FileInputStream(ruta));
				estudiantes = (ArrayList<EstudianteDTO>)in.readObject();
				in.close();
			}
			catch (IOException | ClassNotFoundException e){
				e.printStackTrace();
			}
		}
		return estudiantes;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}


	public ArrayList<EstudianteDTO> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<EstudianteDTO> estudiantes) {
		this.estudiantes = estudiantes;
	}

	public ObjectInputStream getIn() {
		return in;
	}

	public void setIn(ObjectInputStream in) {
		this.in = in;
	}

	public ObjectOutputStream getOut() {
		return out;
	}

	public void setOut(ObjectOutputStream out) {
		this.out = out;
	}

	
	
	
}
