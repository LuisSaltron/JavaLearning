<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulario Servlet</title>
</head>
<body>
	<h1>Formulario Servlet</h1>
	<form name="form1" action="/ManejoParametros/Servlet" method="post">
		Usuario: <input type="text" name="usuario"> <br>
		Password: <input type="password" name="password"><br> <input
			type="submit" value="Enviar">
	</form>
</body>
</html>