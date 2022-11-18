package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.EstudianteDAO;
import co.edu.unbosque.model.Estudiantes;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener{

	private View gui;
	private Estudiantes est;
	
	public Controller() {
		gui = new View(this);
		est = new Estudiantes();
		gui.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		// TODO Auto-generated method stub
		if(evento.getActionCommand().equals(gui.INSERTAR)) {
			if(gui.getTxt1().getText().isEmpty() || gui.getTxt2().getText().isEmpty() || gui.getTxt3().getText().isEmpty()) {
				gui.devolverInformacion("Por favor complete los espacios en blanco para agregar un estudiante{");
			}else {
				if(est.getEstdao().agregarEstudiantes(Integer.parseInt(gui.getTxt1().getText()), gui.getTxt2().getText(), gui.getTxt3().getText(),est.getEstdto())) {
					gui.devolverInformacion("Se ha agregado correctamente al estudiante: " + gui.getTxt2().getText());
				}else {
					gui.devolverInformacion("El estudiante " + gui.getTxt2().getText() + " ya se encuentra agregado");
				}
			}
			gui.getTxt1().setText("");
			gui.getTxt2().setText("");
			gui.getTxt3().setText("");
		}
		
		if(evento.getActionCommand().equals(gui.LISTAR)) {
			gui.getTxtinformacion().setText("");
			if(est.getEstdto().size() > 0) {
				gui.getTxtinformacion().append(est.getEstdao().obtenerEstudiantes(est.getEstdto()));
			}else {
				gui.devolverInformacion("No se encuentran estudiantes registrados en el sistema SALA en este momento");
			}
		}
	}
}
