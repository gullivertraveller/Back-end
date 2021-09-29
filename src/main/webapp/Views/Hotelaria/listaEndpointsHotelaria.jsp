<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:useBean id="User" type="model.Usuario" scope="session" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Endpoints Hotelaria</title>
</head>
<body>
	<h1> Olá! <c:out value="${User.nome}" /></h1>
	<hr />
	<p>Esses são os endpoints disponíveis para o módulo de Hotelaria:</p>

	<ul>
		<li><a href="./hotelariaServlet">GET Lista Hoteis</a></li>
		<hr />
		<li><a href="./Views/Hotelaria/hotelariaPost.jsp">POST Criar Hotel</a></li>
		<hr />
		<li><a href="./Views/Hotelaria/filtrarHoteis.jsp">GET Filtrar Hoteis</a></li>
	</ul>
	<hr />
	<a href="./listaModulosServlet">Voltar a lista de módulos</a>
</body>
</html>