<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<input type="hidden" name="clienteId" value="<c:out value="${cliente.id}"/>"/>
	<h4>Datos del cliente</h4>
	<br />
	<h5>Nombre: <c:out value="${cliente.nombre}" /></h5>
	<br />
	<h5>Apellidos: <c:out value="${cliente.apellidos}" /></h5>
	<br />
	<table>
		<thead>
			<tr>
				<th>Artículo</th>
				<th>Precio</th>
			</tr>
		</thead>
		<tbody>
			<!-- TENEMOS QUE RECORRER EL ArrayList con un bucle foreach que muestre los pares artículo-precio-->
   			<c:forEach items="${cliente.pedidos}" var="pedido">
       			<tr>
           			<td><c:out value="${pedido.articulo}" /></td>
           			<td><c:out value="${pedido.precio}" /></td>
       			</tr>
   			</c:forEach>	
		</tbody>	
	</table>

	<p><a href="PedidoController?action=insertar&clienteId=<c:out value="${cliente.id}"/>">Insertar pedido</a></p>
	<p><a href="ClienteController?action=listado">Lista clientes</a></p>
</body>
</html>