package es.ccn.cursodejavaavanzado.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import es.ccn.cursodejavaavanzado.dao.ClienteDao;
import es.ccn.cursodejavaavanzado.model.Pedido;
import es.ccn.cursodejavaavanzado.model.Cliente;


/**
 * Servlet implementation class PedidoController
 */
public class PedidoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	//Vamos con nuestras variables; como vemos estï¿½n relacionadas con las pï¿½ginas jsp.
		private static String INSERTAR = "/pedido.jsp";
		private static String LISTAR = "/listadoPedidos.jsp";
		private static String LISTA_CLIENTES = "/listadoClientes.jsp";
		
		//Variable de tipo ClienteDao para las funcionalidades CRUD, propias de estas aplicaciones.
		private ClienteDao dao;
		
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PedidoController() {
        super();
        dao = ClienteDao.getInstance();
    }
    

    //Hay que tener en cuenta, para las redirecciones sobre todo, que siempre empezamos con la vista del listado
    //de clientes, y que no podemos acceder al controlador de pedidos hasta que no haya al menos uno
    //El index.jsp nos remite a la action listado de ClienteController y, cuando hacemos clic en Insertar cliente
    //vamos al action insertar de dicho controlador que genera el id de cliente, mediante el dao, 
    //y lo pone en el jsp en un campo hidden; de este modo basta con recogerlo en las jsp de pedidos; 
    //que era el error que me ha estado dando este tiempo.
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Variable que indica dónde se va a "pintar"
		String urlVista="";
		//Variable para guardar la acción que vendra del DOM del jsp (si no me equivoco mucho...)
		//por la peticiï¿½n HTTP (HttpServletRequest)
		String action = request.getParameter("action");
		
		//Obtenemos el cliente por su id del dao (para todo el bloque switch)
		int clienteId = Integer.parseInt(request.getParameter("clienteId"));
		Cliente cliente = dao.obtenerClienteById(clienteId);
		
		switch (action) {
		//para el jsp de pedido; DEBE ESTAR EN EL PedidoController, puesto que se debe guardar en
		//el objeto pedido de tipo Pedido (con el artículo y su precio).
		case "pedido":
			urlVista = INSERTAR;
			break;

		//Debemos poder ver los pedidos de un cliente a partir de su id
		//para el jsp de listado de pedidos
		case "listadoPedidos":
			//Comprobamos si hay clientes (siempre hay, porque no se muestran las opciones de pedidos si no los hay, but still...)
			if (cliente != null) {
				request.setAttribute("cliente", cliente);
				request.setAttribute("pedidos", cliente.getPedidos());
			} else {
				urlVista = LISTA_CLIENTES;
			}
			urlVista = LISTAR;
			break;
		
		default:
			break;
		}
	
		RequestDispatcher vista = request.getRequestDispatcher(INSERTAR);
		request.setAttribute("cliente", dao.obtenerClienteById(clienteId));
		vista.forward(request, response);
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("ISO-8859-1");
		//Debemos poder agregar un pedido a un cliente por su id
		int clienteId = Integer.parseInt(request.getParameter("clienteId"));
		String strArticulo = request.getParameter("articulo");
		String strPrecio = request.getParameter("precio");
		
		//Creamos un objeto de tipo Cliente y le asignamos los valores
		try {
			//Creamos el objeto pedido
			Pedido pedido =  new Pedido();
			
			//Y ponemos los artï¿½culos y sus precios
			pedido.setArticulo(strArticulo);
			pedido.setPrecio(Double.parseDouble(strPrecio));
			
			//Creamos un objeto cliente con el dao para aï¿½adir el pedido a su lista
			Cliente cliente = dao.obtenerClienteById(clienteId);
			
			if (cliente != null) {
				//cliente.addPedido(pedido);
				//dao.actualizarCliente(cliente);
				dao.insertarPedido(clienteId, pedido);
			}
					
		} catch (Exception e) {
			e.printStackTrace();
		}

		RequestDispatcher vista = request.getRequestDispatcher(LISTAR);
		request.setAttribute("cliente", dao.obtenerClienteById(clienteId));
		vista.forward(request, response);
	}

}














