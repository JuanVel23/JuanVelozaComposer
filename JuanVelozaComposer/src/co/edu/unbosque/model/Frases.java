package co.edu.unbosque.model;

import java.util.concurrent.ThreadLocalRandom;

public class Frases {

	private String frases1[] = {"Mami " , "Bebe " , "Plincess ", "Mami "};
	private String frases2[] = {"Yo quielo " , "Yo puedo " , "Yo vengo a ", "Voy a "};
	private String frases3[] = {"Encendelte " , "Amalte " , "Ligal ", "Jugal "};
	private String frases4[] = {"Suave " , "Lento " , "Rapido ", "Fuelte "};
	private String frases5[] = {"Hasta que salga el sol " , "Toda la noche " , "Hasta el amanecel ", "Todo el dia "};
	private String frases6[] = {"Sin anestesia " , "Sin complomiso " , "Feis to Feis ", "Sin miedo "};
	private String frase;
	public String estrofa;
	public String cancion;
	
	public Frases() {
		this.cancion = "";
		this.frase = "";
		this.estrofa = "";
	}
	
	public String generarFrase() {
		frase = "";
		int numero1 = numeroAleatorio(0, frases1.length - 1);
		int numero2 = numeroAleatorio(0, frases2.length - 1);
		int numero3 = numeroAleatorio(0, frases3.length - 1);
		int numero4 = numeroAleatorio(0, frases4.length - 1);
		int numero5 = numeroAleatorio(0, frases5.length - 1);
		int numero6 = numeroAleatorio(0, frases6.length - 1);

		String palabraAleatoria = frases1[numero1];
		String palabraAleatoria2 = frases2[numero2];
		String palabraAleatoria3 = frases3[numero3];
		String palabraAleatoria4 = frases4[numero4];
		String palabraAleatoria5 = frases5[numero5];
		String palabraAleatoria6 = frases6[numero6];
		
		frase = palabraAleatoria + palabraAleatoria2 + palabraAleatoria3 + palabraAleatoria4 + palabraAleatoria5 + palabraAleatoria6;

		return frase;
		}

	private int numeroAleatorio(int mínimo, int máximo) {
		// TODO Auto-generated method stub
		return ThreadLocalRandom.current().nextInt(mínimo, máximo + 1);
	}
	
	
	public String generarEstrofa() {
		estrofa = "";
		for(int i = 0 ; i < 4 ; i++) {
			estrofa = estrofa + "\n" + generarFrase();
		}
		return estrofa;
	}
	
	public String generarCancion() {
		
		for( int j = 0 ; j < 3; j++) {
			cancion = cancion + "\n" + generarEstrofa();
		}
		return cancion;
	}

	public String[] getFrases1() {
		return frases1;
	}

	public void setFrases1(String[] frases1) {
		this.frases1 = frases1;
	}

	public String[] getFrases2() {
		return frases2;
	}

	public void setFrases2(String[] frases2) {
		this.frases2 = frases2;
	}

	public String[] getFrases3() {
		return frases3;
	}

	public void setFrases3(String[] frases3) {
		this.frases3 = frases3;
	}

	public String[] getFrases4() {
		return frases4;
	}

	public void setFrases4(String[] frases4) {
		this.frases4 = frases4;
	}

	public String[] getFrases5() {
		return frases5;
	}

	public void setFrases5(String[] frases5) {
		this.frases5 = frases5;
	}

	public String[] getFrases6() {
		return frases6;
	}

	public void setFrases6(String[] frases6) {
		this.frases6 = frases6;
	}

	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}

	public String getEstrofa() {
		return estrofa;
	}

	public void setEstrofa(String estrofa) {
		this.estrofa = estrofa;
	}

	public String getCancion() {
		return cancion;
	}

	public void setCancion(String cancion) {
		this.cancion = cancion;
	}
	
	
}



