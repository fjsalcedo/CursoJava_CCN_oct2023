<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cliente</title>
</head>
<body>
	<h4>Cliente</h4>
	<form method="POST" action='ClienteController' name="formulario">
		<input type="hidden" name="clienteId" value="<c:out value="${cliente.id}"/>"/> 
		Nombre: <input type="text" name="nombre" 
			value="<c:out value="${cliente.nombre}"/>"/>
		<br /> 
		Apellidos: <input type="text" name="apellidos" 
			value="<c:out value="${cliente.apellidos}"/>"/> 
		<br /> 
		Fecha Nacimiento (dd/mm/yyyy): <input type="text" name="fechaNacimiento"
			value="<fmt:formatDate pattern="dd/MM/yyyy"
			value="${cliente.fechaNacimiento}"/>"/>
		<br /> 
		Pedidos : <input type="text" name="numPedidos"
			value="<c:out value="${cliente.numPedidos}"/>"/>
		<br/>
		<input type="submit" value="Enviar"/>
	</form>
</body>
</html>