package es.ccn.cursodejavaavanzado.proyectowebservice.service;

import jakarta.jws.WebService;

import java.util.List;

import es.ccn.cursodejavaavanzado.proyectowebservice.dao.ClienteDao;
import es.ccn.cursodejavaavanzado.proyectowebservice.model.Cliente;
import es.ccn.cursodejavaavanzado.proyectowebservice.model.Pedido;

@WebService(endpointInterface = "es.ccn.cursodejavaavanzado.proyectowebservice.service.PedidoService")
public class PedidoServiceImpl implements PedidoService {

	private ClienteDao dao;
	
	public PedidoServiceImpl() {
		dao = ClienteDao.getInstance();
	}
	
	//Implementamos los métodos abstractos de la interfaz
	public void insertarPedido (int idCliente, Pedido pedido) {
		//acciones del dao
		//Podemos utilizar el cliente porque primero se ha creado uno (con su id) en el WS cliente
		Cliente cliente = dao.obtenerClienteByID(idCliente);
		cliente.addPedido(pedido);
		List<Pedido> listaPedidos = cliente.getPedidos();
		cliente.setPedidos(listaPedidos);
		dao.actualizarCliente(cliente);
	};
	
	public List<Pedido> obtenerListaPedidos (int clienteId){
		//acción del dao para listar los pedidos del cliente
		Cliente cliente = dao.obtenerClienteByID(clienteId);
		List<Pedido> lista = cliente.getPedidos();
		
		return lista;
	};
	
}
