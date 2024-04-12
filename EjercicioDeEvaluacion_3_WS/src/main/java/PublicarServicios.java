import jakarta.xml.ws.Endpoint;

import es.ccn.cursodejavaavanzado.proyectowebservice.service.ClienteServiceImpl;
import es.ccn.cursodejavaavanzado.proyectowebservice.service.PedidoServiceImpl;

public class PublicarServicios {

	public static void main(String[] args) {
		/*
		* Se publican los servicios a través de un servidor virtual.
		El puerto puede ser cualquiera.
		Un vez ejecutada la aplicación, se publica el contrato WSDL
		*/
		Endpoint.publish("http://localhost:1234/WS/ClienteService", new ClienteServiceImpl());
		Endpoint.publish("http://localhost:1234/WS/PedidoService", new PedidoServiceImpl());

		//Cuando ejecutamos la clase como una aplicación, mediante la opción Run As > Java Aplications.
		//La aplicación publica el servicio en la url indicada http://localhost:1234/WS/ClienteService
		//Para la publicación, hará uso del servidor web propio de Eclipse (Jetty)
	}

}







