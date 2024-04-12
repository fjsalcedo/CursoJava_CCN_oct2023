package es.ccn.cursodejavaavanzado.proyectowebservice.model;

import java.io.Serializable;

import java.util.List;
import java.util.ArrayList;


public class Cliente implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String nombre;
	private String apellidos;
	private String strFechaNacimiento;
	//private int numPedidos;
	private List<Pedido> pedidos = new ArrayList<>();
	
	//El constructor por defecto
	public Cliente() {
		
	}
	
	//Este método devolverá el tamaño de la lista de pedidos
	public int getNumPedidos() {
		int numPedidos = pedidos.size();
		return numPedidos;
	}
	
	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
		
	//Este método devuelve la lista de pedidos del cliente
	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void addPedido(Pedido pedido) {
		this.pedidos.add(pedido);
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

	//public int getNumPedidos() {
	//	return numPedidos;
	//}

	//public void setNumPedidos(int numPedidos) {
	//	this.numPedidos = numPedidos;
	//}

}
