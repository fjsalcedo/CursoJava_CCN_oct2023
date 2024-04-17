<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%--Vamos a mostrar la hora del servidor con código java--%>
<%--Realizamos los imports de las clases java directamente en el código del jsp--%>
<%@ page import="java.util.*" %>
<%@ page import="java.text.SimpleDateFormat" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mi primer JSP</title>
</head>
<body>
<%--El código java con la funcionalidad, en este caso de devolver la hora del servidor,--%>
<%--lo insertamos en el body del jsp, entre sus tags correspondientes --%>
<%
	Date dNow = new Date();
	SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yyyy");
	String currentDate = ft.format(dNow);
%>

<%--Fuera del bloque de código, introducimos el valor devuelto una etiqueta html estándar. --%>
<%--En este caso, de párrafo, con la llamada al resultado entre sus tags correspondientes --%>+

<p>La fecha actual del servidor es <%=currentDate.toString() %></p>
</body>
</html>

<%--FIJÉMONOS en las etiquetas que hemos puesto hasta ahora relacionadas el código ejecutable:
		<%@ ... %> para configuración (java, etc.) y para los import
		<% ... %> para introducir el código fuente
		<%= ... %> para incluir valores devueltos por el código dentro de texto, dentro de etiquetas html.
  --%>