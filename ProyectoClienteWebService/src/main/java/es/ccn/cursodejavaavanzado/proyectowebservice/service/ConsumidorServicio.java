package es.ccn.cursodejavaavanzado.proyectowebservice.service;

import java.util.List;

import es.ccn.cursodejavaavanzado.proyectowebservice.service.Cliente;
import es.ccn.cursodejavaavanzado.proyectowebservice.service.ClienteService;
import es.ccn.cursodejavaavanzado.proyectowebservice.service.ClienteServiceImplService;


public class ConsumidorServicio {
	
	public static void mostrarClientes(List<Cliente> lista) {
		for (Cliente elemento:lista) {
		System.out.println("Cliente ("+elemento.getId()+"): "+elemento.getNombre()+" "+elemento.getApellidos()+" "+
		elemento.getStrFechaNacimiento()+" "+elemento.getNumPedidos());
			}
		}
	
	public static void main(String[] args) {
		
		//Obtenemos el servicio web
		ClienteServiceImplService locator = new ClienteServiceImplService();
		ClienteService consumidorServicio = locator.getClienteServiceImplPort();
		
		//Se muestra la lista de clientes
		System.out.println("Lista de clientes: ");
		List<Cliente> lista = consumidorServicio.obtenerClientes();
		ConsumidorServicio.mostrarClientes(lista);
		
		//Añadimos un nuevo usuario
		System.out.println("Insertar nuevo cliente: ");
		Cliente cliente = new Cliente();
		cliente.setNombre("Leopold");
		cliente.setApellidos("Poldis Poldis");
		cliente.setStrFechaNacimiento("11/11/1111");
		cliente.setNumPedidos(3);
		
		//Llamamos al servicio para efectivamente insertar el cliente
		consumidorServicio.insertarCliente(cliente);
		
		//Volvemos a mostrar la lista de clientes (con un cliente)
		System.out.println("Lista de clientes: ");
		//ya definimos más arriba el tipo del objeto lista
		lista = consumidorServicio.obtenerClientes();
		ConsumidorServicio.mostrarClientes(lista);

		//Si ejecutamos dicho código como una aplicación Java, 
		//podremos observar cómo nuestro consumidor del servicio se comunica 
		//con el servicio web desplegado en local.
	}

}

















