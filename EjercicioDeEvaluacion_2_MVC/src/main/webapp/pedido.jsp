<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pedido</title>
</head>
<body>
	<h4>Pedido</h4>
	<!-- Este formulario recoge los datos del pedido y de un cliente (dato que viene del listado de pedidos
	del cliente cuando se pulsa el enlace "Insertar pedido" para llegar aquí); lo ponemos en un hidden.
	El submit debe agregar el pedido al cliente a través de PedidoController -->
	<form method="post" action="PedidoController" name="formularioPedido">
		<input type="hidden" name="clienteId" value="<c:out value="${cliente.id}"/>"/>
		Artículo: <input type="text" name="articulo"
			value="<c:out value="${pedido.articulo}"/>"/>
		<br />
		Precio: <input type="text" name="precio"
			value="<c:out value="${pedido.precio}"/>"/>
		<br />
		<input type="submit" value="Enviar"/>
	</form>
</body>
</html>




















