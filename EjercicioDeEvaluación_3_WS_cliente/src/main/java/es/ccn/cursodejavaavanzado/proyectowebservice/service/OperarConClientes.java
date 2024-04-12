package es.ccn.cursodejavaavanzado.proyectowebservice.service;

import java.util.ArrayList;
import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class OperarConClientes {
		
	//Obtener servicios
	private static ClienteServiceImplService locateClienteWS = new ClienteServiceImplService();
	private static ClienteService consumeClienteWS = locateClienteWS.getClienteServiceImplPort();
			
	private static PedidoServiceImplService locatePedidoWS = new PedidoServiceImplService();
	private static PedidoService consumePedidoWS = locatePedidoWS.getPedidoServiceImplPort();
	
	//Cliente y pedido
	private static Cliente cliente = new Cliente();
	private static Pedido pedido = new Pedido();
	private static List<Cliente> lista = new ArrayList<>();
	
	//Métodos para operar con clientes por consola
	private static void introducirCliente(int ID, String nombre, String apellidos, String nacimiento) {
		//Construimos el cliente
		cliente = new Cliente();
		cliente.setId(ID);
		cliente.setNombre(nombre);
		cliente.setApellidos(apellidos);
		cliente.setStrFechaNacimiento(nacimiento);
		//Enviamos el cliente al WS
		consumeClienteWS.insertarCliente(cliente);
	}
	
	private static void introducirPedido(int idCliente, String articulo, BigDecimal precio) {
		//Construimos el pedido
		pedido = new Pedido();
		pedido.setArticulo(articulo);
		pedido.setPrecio(precio);
		//reiniciamos el objeto cliente para llegar al cliente concreto (dado que es static)
		cliente = new Cliente();
		cliente.setId(idCliente);
		//Enviamos el pedido al WS
		consumePedidoWS.insertarPedido(cliente.getId(), pedido);
	}
	
	//private static void verClientePorId() {
		
	//}
	
	private static List<Cliente> listarClientes() {
		lista = new ArrayList<>();
		lista = consumeClienteWS.obtenerClientes();
		return lista;
	}
	
	//private static void listarPedidos() {
		
	//}
	
	//private static void actualizarCliente() {
		
	//}
	
	
	//Main
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int opcion;
		
		do {
			//Presentamos el menú de opciones
			System.out.println("------------Menú-----------");
			System.out.println("1. Introducir Cliente");
            System.out.println("2. Introducir Pedido");
            System.out.println("3. Ver cliente por ID");
            System.out.println("4. Listar clientes");
            System.out.println("5. Listar pedidos");
            System.out.println("6. Actualizar cliente");
            System.out.println("7. Salir");
            System.out.println("");
            System.out.println("---------------------------");
            System.out.println("Seleccione una opción: ");
            System.out.println("---------------------------");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir el salto de línea
            
            //Opciones del usuario para la funcionalidad pedida
            switch (opcion) {
			case 1:
				//Introducir cliente
				System.out.println("ID: ");
				int id = scanner.nextInt();
				scanner.nextLine(); // Consumir el salto de línea
				System.out.println("Nombre: ");
				String nombre = scanner.nextLine();
				System.out.println("Apellidos: ");
				String apellidos = scanner.nextLine();
				System.out.println("Fecha de nacimiento (dd/MM/aaaa): ");
				String nacimiento = scanner.nextLine();
				try {
					introducirCliente(id, nombre, apellidos, nacimiento);
					System.out.println("¡Cliente introducido con éxito!");
				} catch (Exception e) {
					System.out.println("Error al introducir cliente. "
							+ "El WS podría estar caído. Error: " + e.getMessage());
					}
				break;
			
			case 2:
				//Introducir pedido
				System.out.println("ID del cliente: ");
				int idCliente = scanner.nextInt();
				scanner.nextLine(); //consumir el salto de línea
				scanner.nextLine(); //consumir el salto de línea
				System.out.println("Artículo: ");
				String articulo = scanner.nextLine();
				System.out.println("Precio: ");
				Double precioD = scanner.nextDouble();
				scanner.nextLine(); //consumir el salto de línea
				BigDecimal precio = new BigDecimal(precioD.toString());
				try {
					introducirPedido(idCliente, articulo, precio);
					System.out.println("¡Artículo introducido con éxito!");
				} catch (Exception e) {
					System.out.println("Error al introducir artículo. "
							+ "El WS podría estar caído o no existir el id de cliente. Error: " + e.getMessage());
					}				
				break;
				
			case 3:
				//Ver cliente por ID
				
				break;
				
			case 4:
				//Listar clientes´
				System.out.println("Lista de clientes: ");
				listarClientes();
				for (Cliente elemento:lista) {
					System.out.println("Cliente ("+elemento.getId()+"): "+elemento.getNombre()+" "
						+elemento.getApellidos()+" "+elemento.getStrFechaNacimiento()+" "+elemento.getPedidos());
					//no muestra bien los pedidos, ¿recorrer el arraylist?
				}
				break;
				
			case 5:
				//Listar pedidos
				
				break;
	
			case 6:
				//Actualizar cliente
				
				break;

			case 7:
				System.out.println("Programa cerrado.");
				scanner.close();
				break;
				
			default:
				break;
			}
			
		} while (opcion !=7);
		scanner.close();
		
		
		
		
		
		//Insertar tres pedidos en el cliente
		//1
//		Pedido pedido = new Pedido();
//		pedido.setArticulo("Bolillas");
//		Double D = 9.95;
//		BigDecimal precioD = new BigDecimal(D.toString());
//		pedido.setPrecio(precioD);
//		consumePedidoWS.insertarPedido(cliente.getId(), pedido);
//		
//		//2
//		pedido.setArticulo("Catzilla");
//		Double DD = 39.95;
//		BigDecimal precioDD= new BigDecimal(DD.toString());
//		pedido.setPrecio(precioDD);
//		consumePedidoWS.insertarPedido(cliente.getId(), pedido);
//		
//		//3
//		pedido.setArticulo("Jugete");
//		Double DDD = 59.95;
//		BigDecimal precioDDD = new BigDecimal(DDD.toString());
//		pedido.setPrecio(precioDDD);
//		consumePedidoWS.insertarPedido(cliente.getId(), pedido);
//no me convence esto; vamos a hacerlo con un menú.
		
	}

}










