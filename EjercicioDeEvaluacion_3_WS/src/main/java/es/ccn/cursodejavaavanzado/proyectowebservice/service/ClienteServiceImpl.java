package es.ccn.cursodejavaavanzado.proyectowebservice.service;

import jakarta.jws.WebService;

import java.util.List;

import es.ccn.cursodejavaavanzado.proyectowebservice.dao.ClienteDao;
import es.ccn.cursodejavaavanzado.proyectowebservice.model.Cliente;

//Etiquetamos la clase como servicio web; en este caso, como es la implementación
//indicamos cuál es su endpoint (la URI en la que se encuentra disponible la interfaz)
//endpointInterface, permitirá indicar que clase implementa el interfaz al servicio web publicado en el endpoint

@WebService(endpointInterface = "es.ccn.cursodejavaavanzado.proyectowebservice.service.ClienteService")
public class ClienteServiceImpl {
	
	//El objeto dao para la funcionalidad de BBDD
	private ClienteDao dao;
	
	//El constructor
	public ClienteServiceImpl() {
		//Al tratarse ClienteDao de un singleton, no se puede crear nada más que un objeto desde la propia clase;
		//Por tanto no podemos hacer un new
		//dao = new ClienteDao();
		//Llamamos a la instancia desde el objeto dao
		dao = ClienteDao.getInstance();
	}
	
	//Los métodos publicados ya como servicio
	public void insertarCliente (Cliente cliente) {
		dao.insertarCliente(cliente);
	}
	
	public void borrarCliente (int clienteId) {
		dao.borrarCliente(clienteId);
	}
	
	public void actualizarCliente (Cliente cliente) {
		dao.actualizarCliente(cliente);
	}
	
	public List<Cliente> obtenerClientes (){
		return dao.obtenerClientes();
	}
	
	public Cliente obtenerClienteById (int clienteId) {
		return dao.obtenerClienteByID(clienteId);
	}

}













