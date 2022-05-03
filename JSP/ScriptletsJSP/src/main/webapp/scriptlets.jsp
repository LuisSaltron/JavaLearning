<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP con Scriptlets</title>
</head>
<body>
	<h1>JSP con Scriptlets</h1>
	<br>
	<%-- Scriptlet para enviar información al navegador --%>
	<%
		out.println("Saludos desde un Scriplet");
	%>
	<%-- Scriptlet para manipular los objetos implicitos --%>
	<%
		String nombreAplicacion = request.getContextPath();
		out.println("Nombre de la aplicación: " + nombreAplicacion);
	%>
	<%-- Scriptlet con código condicionado --%>
	<%
		if (session != null && session.isNew()) {
	%>
	<h3>la sesion es nueva</h3>
	<%
		} else if (session != null) {
	%>
	<h3>la sesión no es nueva</h3>
	<%
		}
	%>
	<br>
	<a href="index.jsp">Regresar al inicio</a>
</body>
</html>