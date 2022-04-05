<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Códigos de Estado</title>
</head>
<body>
	<h1>Códigos de Estado HTTP</h1>

	<fieldset>
		<legend> Formulario de Autorizaciòn </legend>
		<form action="/ManejoCodigosEstado/Servlet" name="form1" method="post">
			Usuario: <input type="text" name="usuario"> <br>
			Password: <input type="password" name="password"> <input
				type="submit" value="Enviar">
		</form>
	</fieldset>
</body>
</html>