package ejercicio4;

/////////////////////////////////////////////////////
//
//ESTA CLASE NO DEBE SER MODIFICADA POR EL ALUMNO
//
/////////////////////////////////////////////////////

public class SalidaRegistro {
	
	private String codRegistro;
	
	private String titulo;
	
	private boolean leida;

	/**
	 * Constructor
	 * 
	 * @param codRegistro el c�digo de registro electr�nico
	 * @param titulo el titulo
	 * @param leida true si la salida est� le�da
	 */
	public SalidaRegistro(String codRegistro, String titulo, boolean leida) {
		this.codRegistro = codRegistro;
		this.titulo = titulo;
		this.leida = leida;
	}

	
	/**
	 * Obtiene el c�digo de registro electr�nico
	 * 
	 * @return el c�digo de registro electr�nico
	 */
	public String getCodRegistro() {
		return codRegistro;
	}

	/**
	 * Obtiene el titulo
	 * 
	 * @return el titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	
	/**
	 * Devuelve true si la salida est� le�da
	 * 
	 * @return true si la salida est� le�da
	 */
	public boolean isLeida() {
		return this.leida;
	}


	@Override
	public String toString() {
		return "SalidaRegistro [codRegistro=" + codRegistro + ", titulo=" + titulo + ", leida=" + leida + "]";
	}
	
	
	

}
