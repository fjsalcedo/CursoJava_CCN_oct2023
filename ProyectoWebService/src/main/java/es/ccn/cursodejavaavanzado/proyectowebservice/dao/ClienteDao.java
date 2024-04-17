package es.ccn.cursodejavaavanzado.proyectowebservice.dao;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import es.ccn.cursodejavaavanzado.proyectowebservice.model.Cliente;

public class ClienteDao {
	
	//El id de cliente como Integer
	private Integer id = 0;
	//El hasmap hace las veces de BBDD
	private HashMap<Integer, Cliente> bdClientes;
	
	//Constructor
	public ClienteDao() {
		//Crea el objeto bdClientes (nuestra BBDD)
		bdClientes = new HashMap<Integer, Cliente>();
	}
	
	//Métdos para la funcionalidad CRUD de la nuestra BBDD
	public void insertarCliente (Cliente cliente) {
		//indicamos el id del cliente
		cliente.setId(id);
		//usamos el método put para introdudir el cliente con su id en el hashmap
		bdClientes.put(id, cliente);
		//siguiente id para cliente
		id++;
	}
	
	public void borrarCliente (int clienteId) {
		//Usamos el método remove para eliminar el cliente de bdCliente
		bdClientes.remove(clienteId); 
	}
	
	public void actualizarCliente (Cliente cliente) {
		//Como este método recibe un objeto cliente, obtenemos su id con el getter cliente.getId()
		bdClientes.put(cliente.getId(), cliente);
	}
	
	public List<Cliente> obtenerClientes(){
		//Devuelve una lista de clientes; es decir los valores guardados en el objeto BBDD, bdClientes
		return new ArrayList<Cliente>(bdClientes.values());
	}
	
	public Cliente obtenerClienteByID (int clienteId) {
		//En este caso, se devuelve un solo cliente desde bdClientes por su id
		return bdClientes.get(clienteId);
	}

}





















