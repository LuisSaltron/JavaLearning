<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Procesa el Formulario</title>
</head>
<body>
	<h1>Resultado de Procesar el Formulario</h1>
	<span>Usuario: <%=request.getParameter("usuario")%></span>
	<br>
	<span>Password: <%=request.getParameter("password")%></span>
</body>
</html>