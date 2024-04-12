package es.ccn.cursodejavaavanzado.proyectowebservice.service;

import java.util.List;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import es.ccn.cursodejavaavanzado.proyectowebservice.model.Pedido;

@WebService(targetNamespace = "localhost")
public interface PedidoService {

	@WebMethod
	public void insertarPedido (int idCliente, Pedido pedido);
	
	@WebMethod
	public List<Pedido> obtenerListaPedidos (int clienteId);
	
}
