package es.ccn.cursodejavaavanzado.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import es.ccn.cursodejavaavanzado.model.Cliente;
import es.ccn.cursodejavaavanzado.model.Pedido;

//Para trabajar con los dos controladores de este ejercicio, adptaremos la clase ClienteDao
//Utilizaremos el patr�n Singleton para que ambos controladores empleen la misma instancia de clase
//De manera que no haya dos listas de clientes.
//El patr�n Singleton, como su nombre sugiere, garantiza que haya una �nica instancia de un objeto
//para todas las clases que operan con �l.
public class ClienteDao {
	//El objetivo de esta clase es "simular la BBDD"; los campos, pues guardar�n la info.
	//Definimos los campos con sus tipos
	private int id=0;
	private HashMap<Integer, Cliente> bdClientes;
	
	//Objeto est�tico y privado con el objeto ClienteDao inicializado
	static private ClienteDao dao = new ClienteDao();
	
	//El constructor se hace privado para que s�lo se pueda invocar por la misma clase e inicializar el objeto antedicho.
	private ClienteDao() {
		//El constructor crea el objeto HashMap en el que ir guardando la info.
		bdClientes = new HashMap<Integer, Cliente>();
	}
	
	//A�adimos un m�todo para obtener una instancia del objeto ClienteDao
	public static ClienteDao getInstance() {
		return ClienteDao.dao;
	}
	
	//Los m�todos que dan la funcionalidad de BBDD
	
	//Insertar cliente
	public void insertarCliente (Cliente cliente) {
		cliente.setId(id);
		bdClientes.put(id, cliente);
		//siguiente id
		id++;
	}
	
	//Eliminar cliente (de la BBDD, claro est�)
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
	
	//Insertar pedido
	public void insertarPedido(int idCliente, Pedido pedido) {
		Cliente cliente = bdClientes.get(idCliente);
		cliente.addPedido(pedido);
	}
}



