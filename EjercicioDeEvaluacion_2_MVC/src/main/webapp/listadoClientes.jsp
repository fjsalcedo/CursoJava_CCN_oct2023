<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Todos los clientes</title>
</head>
<body>
	<input type="hidden" name="clienteId" value="<c:out value="${cliente.id}"/>"/>
	<h4>Todos los clientes</h4>
	<table border=1>
		<thead>
			<tr>
				<!-- <th>Id</th> -->
				<th>Nombre</th>
				<th>Apellidos</th>
				<th>Fecha Nacimiento</th>
				<th>Pedidos</th>
				<th colspan=3>Acción</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${clientes}" var="cliente">
				<tr>
					<!-- <td><c:out value="${cliente.id}" /></td> -->
					<td><c:out value="${cliente.nombre}" /></td>
					<td><c:out value="${cliente.apellidos}" /></td>
					<td><fmt:formatDate pattern="dd-MM-yyyy" value="${cliente.fechaNacimiento}" /></td>
					<td><c:out value="${cliente.numPedidos}" /></td>
					<td><a href="ClienteController?action=editar&clienteId=<c:out value="${cliente.id}"/>">Actualizar</a></td>
					<td><a href="ClienteController?action=borrar&clienteID=<c:out value="${cliente.id}"/>">Borrar</a></td>
					<!-- OJO REVISAR LA LÍNEA SIGUIENTE, que es la acción que lista los pedidos por cliente -->
					<td><a href="PedidoController?action=listadoPedidos&clienteId=<c:out value="${cliente.id}"/>">Pedidos</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<p><a href="ClienteController?action=insertar">Insertar cliente</a></p>
</body>
</html>