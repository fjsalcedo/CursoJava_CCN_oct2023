package es.ccn.cursodejavaavanzado.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import es.ccn.cursodejavaavanzado.model.Cliente;

public class ClienteDao {
	//El objetivo de esta clase es "simular la BBDD"; los campos, pues guardarán la info.
	//Definimos los campos con sus tipos
	private int id=0;
	private HashMap<Integer, Cliente> bdClientes;
	
	//El constructor
	public ClienteDao() {
		//El constructor crea el objeto HashMap en el que ir guardando la info.
		bdClientes = new HashMap<Integer, Cliente>();
	}
	
	//Los métodos que dan la funcionalidad de BBDD
	
	//Insertar cliente
	public void insertarCliente (Cliente cliente) {
		cliente.setId(id);
		bdClientes.put(id, cliente);
		//siguiente id
		id++;
	}
	
	//Eliminar cliente (de la BBDD, claro está)
	public void borrarCliente(int clienteId) {
		bdClientes.remove(clienteId);
	}
	
	//Actualizar cliente
	public void actualizarCliente (Cliente cliente) {
		bdClientes.put(cliente.getId(), cliente);
	}
	
	//Obtener clientes (observemos que no es void; tiene que devolver una lista de clientes).
	public List<Cliente> obtenerClientes(){
		return new ArrayList<Cliente>(bdClientes.values());
	}
	
	//Obtener un cliente por su id
	public Cliente obtenerClienteById(int clienteId) {
		return bdClientes.get(clienteId);
	}
}



