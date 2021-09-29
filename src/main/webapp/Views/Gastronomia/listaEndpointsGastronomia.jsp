<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:useBean id="User" type="model.Usuario" scope="session" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Endpoints Gastronomia</title>
</head>
<body>
	<h1> Olá! <c:out value="${User.nome}" /></h1>
	<hr />
	<p>Esses são os endpoints disponíveis para o módulo de Gastronomia:</p>

	<ul>
		<li><a href="./gastronomiaServlet">GET Lista Restaurantes</a></li>
		<hr />
		<li><a href="./Views/Gastronomia/gastronomiaPost.jsp">POST Criar Restaurante</a></li>
		<hr />
		<li><a href="./Views/Gastronomia/filtrarRestaurantes.jsp">GET Filtrar Restaurantes</a></li>
	</ul>
	<hr />
	<a href="./listaModulosServlet">Voltar a lista de módulos</a>
</body>
</html>