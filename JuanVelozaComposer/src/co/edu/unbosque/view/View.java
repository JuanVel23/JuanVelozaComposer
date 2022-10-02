package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class View {

	public View() {
		
	}
	
	public String leerString(String mensaje) {
		String dato= JOptionPane.showInputDialog(mensaje);
		return dato;
	}
	public void devolverInformacion(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
}
