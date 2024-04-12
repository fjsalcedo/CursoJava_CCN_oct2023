package es.ccn.cursodejavaavanzado.model;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Cliente {
	
	private int id;
	private String nombre;
	private String apellidos;
	private Date fechaNacimiento;
	private List<Pedido> pedidos = new ArrayList<>();
	
	
	public Cliente() {
	}
	
	
	//Este método devolverá el tamaño de la lista de pedidos para la vista listadoClientes.jsp
	public int getNumPedidos() {
		int numPedidos = pedidos.size();
		return numPedidos;
	}
	
	//Este método devuelve la lista de pedidos y la muestra en listadoPedidos.jsp
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

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	

}
