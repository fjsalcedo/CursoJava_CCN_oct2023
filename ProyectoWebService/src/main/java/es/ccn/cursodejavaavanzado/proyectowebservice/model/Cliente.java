package es.ccn.cursodejavaavanzado.proyectowebservice.model;

import java.io.Serializable;

public class Cliente implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String nombre;
	private String apellidos;
	private String strFechaNacimiento;
	private int numPedidos;
	
	//El constructor por defecto
	public Cliente() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getStrFechaNacimiento() {
		return strFechaNacimiento;
	}

	public void setStrFechaNacimiento(String strFechaNacimiento) {
		this.strFechaNacimiento = strFechaNacimiento;
	}

	public int getNumPedidos() {
		return numPedidos;
	}

	public void setNumPedidos(int numPedidos) {
		this.numPedidos = numPedidos;
	}

}
