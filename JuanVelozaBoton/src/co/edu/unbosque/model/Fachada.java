package co.edu.unbosque.model;

public class Fachada {

	private ClaseX clx;
	private ClaseY cly;
	
	public Fachada () {
		clx = new ClaseX();
		cly = new ClaseY();
	}

	public String procesar(String dato) {
		return  dato + " Procesado por la clase nueva";
	}
	
	public String procesarDatoClaseY(String dato) {
		return dato+" Procesado por Clase Y";
	}
	/**
	 * @return the clx
	 */
	public ClaseX getClx() {
		return clx;
	}

	/**
	 * @param clx the clx to set
	 */
	public void setClx(ClaseX clx) {
		this.clx = clx;
	}

	/**
	 * @return the cly
	 */
	public ClaseY getCly() {
		return cly;
	}

	/**
	 * @param cly the cly to set
	 */
	public void setCly(ClaseY cly) {
		this.cly = cly;
	}
	
	
}
