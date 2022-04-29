<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hola Mundo JSP</title>
</head>
<body>
	<h1>Hola Mundo JSP</h1>
	<ul>
		<li>
			<%
				out.println("Hola mundo con Scriptlets");
			%>
		</li>
		<li>$("Hola mundo con Expression Language (EL)")</li>
		<li><%="Hola mundo con Expresiones"%></li>
		<li><c:out value="HolaMundo con JSTL" /></li>
	</ul>
</html>