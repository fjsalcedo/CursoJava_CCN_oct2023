package es.ccn.cursodejavaavanzado.proyectowebservice.service;

import java.util.List;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import es.ccn.cursodejavaavanzado.proyectowebservice.model.Cliente;

//Las anotaciones @xxxxxxxxx son elementos clave en las interfaces de servicios web, como veremos.
//La anotaci�n @WebService, ofrece cierta personalizaci�n de los servicios web publicados
//Esta identifica la interfaz como la definici�n de un servicio web (vermos m�s tarde la implementaci�n)
//targetNamespace, especifica el espacio de nombres XML de los elementos WSDL y XML generados desde el servicio web.
//En nuestro caso lo dejaremos con el namespace localhost.

@WebService(targetNamespace = "localhost")
public interface ClienteService {
	
	//Como buena interfaz que se precie, indicamos los m�todos sin implementaci�n
	//(en este caso, se corresponden con los m�todos del dao
	@WebMethod
	public void insertarCliente(Cliente cliente);
	
	@WebMethod
	public void borrarCliente(int clienteId);
	
	@WebMethod
	public void actualizarCliente(Cliente cliente);
	
	@WebMethod
	public List<Cliente> obtenerClientes();
	
	@WebMethod
	public Cliente obtenerClienteById(int clienteId);

}





