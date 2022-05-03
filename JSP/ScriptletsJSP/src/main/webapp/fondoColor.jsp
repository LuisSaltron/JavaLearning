<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Cambio de Color</title>
</head>
<%
	String color = request.getParameter("colorFondo");
	if (color == null || color.trim().equals("")) {
		color = "white";
	}
%>
<body bgcolor="<%=color%>">
	<br>
	<span>Color de fondo aplicado: <%=color%></span>
	<br>
	<a href="index.jsp">Regresar al inicio</a>
</body>
</html>