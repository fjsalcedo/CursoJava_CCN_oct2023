package es.ccn.cursodejavaavanzado.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.RequestDispatcher;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.IOException;
import java.text.ParseException;

import es.ccn.cursodejavaavanzado.dao.*;
import es.ccn.cursodejavaavanzado.model.*;


/**
 * Servlet implementation class ClienteController
 */
public class ClienteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//Vamos con nuestras variables; como vemos est�n relacionadas con las p�ginas jsp.
	private static String INSERTAR_O_EDITAR = "/cliente.jsp";
	private static String LISTADO = "/listadoClientes.jsp";
	
	//Variable de tipo ClienteDao para las funcionalidades CRUD, propias de estas aplicaciones.
	private ClienteDao dao;
	   

	//El constructor del servlet (modificado respecto al stub) para crear el objeto.
    public ClienteController() {
        super();
        dao = new ClienteDao();
    }

    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Variable que indica d�nde se va a "pintar"
		String urlVista="";
		//Variable para guardar la acci�n que vendra del DOM del jsp (si no me equivoco mucho...)
		//por la petici�n HTTP (HttpServletRequest)
		String action = request.getParameter("action");
		
		//Bloque switch/case para las diferentes acciones que se podr�n realizar
		switch (action) {
		case "borrar":
			//En caso de que queramos borrar un cliente
			//Lo primero es identificar al cliente, info que se obtiene desde la request HTTP
			int clienteID = Integer.parseInt(request.getParameter("clienteID"));
			//llamamos al m�todo pertinente del objeto DAO
			dao.borrarCliente(clienteID);
			//Tras borrar el cliente, se obtiene la lista actualizada mediante dao.obtenerClientes()
			//y, luego, se guarda en el "request" con el nombre "cliente". De este modo, cuando se redirija a la vista
			//en nuestro caso, una p�gina jsp, se podr� mostar el listado actualizado.
			request.setAttribute("clientes", dao.obtenerClientes());
			//Defiminos la vista a la que se redirige tras borrar el cliente y actualizar la request con la nueva lista.
			urlVista = LISTADO;
			break;
			
		case "editar":
			int clienteId = Integer.parseInt(request.getParameter("clienteID"));
			//Como de lo que se trata es de modificar un cliente, creamos un objeto de tipo Cliente
			//en el que guardar la informaci�n del cliente, que traeremos por id.
			Cliente cliente = dao.obtenerClienteById(clienteId);
			request.setAttribute("cliente", cliente);
			urlVista = INSERTAR_O_EDITAR;
			break;
			
		case "listado":
			request.setAttribute("clientes", dao.obtenerClientes());
			urlVista = LISTADO;
			break;

		default:
			urlVista = INSERTAR_O_EDITAR;
		}
		
		RequestDispatcher vista = request.getRequestDispatcher(urlVista);
		vista.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("ISO-8859-1");
		
		//Recuperamos los par�metros de la request:
		String strClienteId = request.getParameter("clienteId");
		String strNombre = request.getParameter("nombre");
		String strApellidos = request.getParameter("apellidos");
		String strFechaNacimiento = request.getParameter("fechaNacimiento");
		String strNumPedido = request.getParameter("numPedidos");
		
		//Creamos un objeto de tipo Cliente y le asignamos los valores
		try {
			//Al crear el objeto cliente de tipo Cliente, en teor�a tendr� un id=0, porque as� se indica
			//en la clase Cliente, pero est� dando error de null en id
			Cliente cliente = new Cliente();
			
			//Aqu� llamaremos a los setters y getters de la clase Cliente del modelo
			cliente.setNombre(strNombre);
			cliente.setApellidos(strApellidos);
			//La fecha de naciemiento es un Date!!!! tenemos que parsear la fecha que viene como String
			//y no olvidarnos de a�adirlo despu�s
			Date fecha = new SimpleDateFormat("dd/MM/yyyy").parse(strFechaNacimiento);
			cliente.setFechaNacimiento(fecha);
			//Tambi�n tenemos que parsear el n�mero de pedido de String a Integer, desde int
			cliente.setNumPedido(Integer.parseInt(strNumPedido));
			
			//Podr�a ser que no tuviera idCliente o que ya tuviera uno.
			//Veamos qu� hacer
			if (strClienteId == null || strClienteId.isEmpty()) {
				//Si NO tiene id cliente, creamos uno
				dao.insertarCliente(cliente);
			} else {
				//Si ya tiene id cliente, es una actualizaci�n
				//Primero el id cliente, convenientemente parseado porque viene como String del jsp.
				cliente.setId(Integer.parseInt(strClienteId));
				dao.actualizarCliente(cliente);
			}
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher vista = request.getRequestDispatcher(LISTADO);
		request.setAttribute("clientes", dao.obtenerClientes());
		vista.forward(request, response);
	}

}





















