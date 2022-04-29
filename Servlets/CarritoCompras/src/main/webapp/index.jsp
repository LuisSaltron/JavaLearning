<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Carrito de Compras</title>
</head>
<body>
	<h1>Carrito de compras</h1>
	<form action="/CarritoCompras/CarritoServlet" method="post"
		name="form1">
		Articulo a agregar: <input type="text" name="articulo"> <br>
		<input type="submit" value="Enviar">
	</form>
</body>
</html>