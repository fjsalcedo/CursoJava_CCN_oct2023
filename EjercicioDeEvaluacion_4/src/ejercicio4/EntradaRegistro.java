package ejercicio4;

/////////////////////////////////////////////////////
//
//ESTA CLASE NO DEBE SER MODIFICADA POR EL ALUMNO
//
/////////////////////////////////////////////////////

public class EntradaRegistro {
	
	private String codRegistro;
	
	private String titulo;

	/**
	 * Constructor
	 * 
	 * @param codRegistro el c�digo de registro electr�nico
	 * @param titulo el titulo
	 */
	public EntradaRegistro(String codRegistro, String titulo) {
		this.codRegistro = codRegistro;
		this.titulo = titulo;
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
	
	
	
	
}
