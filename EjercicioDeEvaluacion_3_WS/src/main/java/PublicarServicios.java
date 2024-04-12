import jakarta.xml.ws.Endpoint;

import es.ccn.cursodejavaavanzado.proyectowebservice.service.ClienteServiceImpl;
import es.ccn.cursodejavaavanzado.proyectowebservice.service.PedidoServiceImpl;

public class PublicarServicios {

	public static void main(String[] args) {
		/*
		* Se publican los servicios a trav�s de un servidor virtual.
		El puerto puede ser cualquiera.
		Un vez ejecutada la aplicaci�n, se publica el contrato WSDL
		*/
		Endpoint.publish("http://localhost:1234/WS/ClienteService", new ClienteServiceImpl());
		Endpoint.publish("http://localhost:1234/WS/PedidoService", new PedidoServiceImpl());

		//Cuando ejecutamos la clase como una aplicaci�n, mediante la opci�n Run As > Java Aplications.
		//La aplicaci�n publica el servicio en la url indicada http://localhost:1234/WS/ClienteService
		//Para la publicaci�n, har� uso del servidor web propio de Eclipse (Jetty)
	}

}







