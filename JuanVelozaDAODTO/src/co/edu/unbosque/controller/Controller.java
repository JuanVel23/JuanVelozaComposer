package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Estudiantes;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener{

	private View gui;
	private Estudiantes est;
	
	public Controller() {
		gui = new View(this);
		
		gui.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		// TODO Auto-generated method stub
		if(evento.getActionCommand().equals(gui.LISTAR)) {
			gui.getTxtinformacion().setText(est.getEf().leerEstudiantes(null));
		}
	}
}
