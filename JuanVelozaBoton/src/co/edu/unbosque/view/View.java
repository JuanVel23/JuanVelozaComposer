package co.edu.unbosque.view;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import co.edu.unbosque.controller.Controller;

public class View extends JFrame{

	//Constante generada por Eclipse  
	private static final long serialVersionUID = 1L;

	private PanelEntrada panelEntrada; //Se declara un objeto de tipo PanelEntrada
	private PanelResultados panelResultados; //Se declara un objeto de tipo PanelResultados

	public View(Controller control) {
		// Definici�n de los par�metros b�sicos de la ventana principal
		
		setSize(500,400); //tama�o en ancho y alto en pixeles
		setResizable(false); //Se puede cambiar el tama�o de la ventana?
		setTitle("T�tulo de la Ventana Principal MVC"); //t�tulo de la ventana
		setDefaultCloseOperation(EXIT_ON_CLOSE);//qu� debe hacer si cierra la ventana
		setLocationRelativeTo(null); //coloca la ventana al centro de la pantalla
		//Establece el layout (lienzo) que vamos a utilizar dentro de la ventana principal.
		setLayout( new BorderLayout() );
		//Se agrega al layout en la parte NORTH, el panel de entrada definido
		panelEntrada = new PanelEntrada();
		add(panelEntrada,BorderLayout.NORTH);
		//Se agrega al layout en la parte CENTER, el panel de entrada definido
		panelResultados = new PanelResultados();
		add(panelResultados,BorderLayout.CENTER);
		
		//se agrega al boton ActionListener del objeto de Controlador
		panelEntrada.getButConvertir().addActionListener(control);
		panelEntrada.getBotProcesar().addActionListener(control);
	}

	public PanelEntrada getPanelEntrada() {
		return panelEntrada;
	}

	public void setPanelEntrada(PanelEntrada panelEntrada) {
		this.panelEntrada = panelEntrada;
	}

	public PanelResultados getPanelResultados() {
		return panelResultados;
	}

	public void setPanelResultados(PanelResultados panelResultados) {
		this.panelResultados = panelResultados;
	}
	
}
