<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP con Expresiones</title>
</head>
<body>
	<h1>JSP con Expresiones</h1>
	<span>Concatenacion:</span>
	<%="Saludos" + " " + " JSP"%>
	<br> Operación matemática:
	<%=2 * 3 / 2%>
	<br>
	<span>Session id: <%=session.getId()%></span>
	<br>
	<a href="index.jsp">Regresar al inicio</a>
</body>
</html>