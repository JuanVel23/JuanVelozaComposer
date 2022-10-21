package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.ClaseX;
import co.edu.unbosque.model.Fachada;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener{

	private Fachada fa;
	private View gui;
	
	public Controller() {
		fa = new Fachada();
		gui = new View(this);

		gui.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		// TODO Auto-generated method stub
		
		if (evento.getActionCommand().equals(gui.getPanelEntrada().CONVERTIR)) {
			//String resultado = m.procesarDato(gui.getPanelEntrada().getTxtNumero().getText());
			String resultado1 = fa.procesarDatoClaseY(gui.getPanelEntrada().getTxtNumero().getText());
			gui.getPanelResultados().getTxtMonto().setText(resultado1);
		}else if(evento.getActionCommand().equals(gui.getPanelEntrada().PROCESAR)) {
			String resultado2 = fa.procesar(gui.getPanelEntrada().getTxtNumero().getText());
			gui.getPanelResultados().getTxtMonto().setText(resultado2);
		}
		
	}
}
