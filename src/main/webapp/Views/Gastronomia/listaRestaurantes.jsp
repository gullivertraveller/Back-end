<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:useBean id="User" type="model.Usuario" scope="session" />
<jsp:useBean id="listaRestaurantes" type="java.util.ArrayList<model.Restaurante>"
	scope="request" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>.: Lista Restaurantes :.</title>
</head>
<body>
	<h1> Olá! <c:out value="${User.nome}" /></h1>
	<hr />
	<h3>Esses são os restaurantes disponíveis:</h3>

	<ul>
		<c:forEach items="${listaRestaurantes}" var="restaurante">
			<hr />
			<li>
				<span>Nome: </span> 
				<span><c:out value="${restaurante.nome}" /></span>
				<br />
				
				<span>Endereço: </span> 
				<span><c:out value="${restaurante.endereco}" /></span>
				<br />
				
				<span>Tipo comida: </span> 
				<span><c:out value="${restaurante.tipoComida}" /></span>
				<br />
				
				<span>Faixa de Preço: </span> 
				<span><c:out value="${restaurante.faixaPreco}" /></span>
				<br />
				
				<span>Classificação: </span> 
				<span><c:out value="${restaurante.classificacao}" /></span>
				<br />
			</li>
		</c:forEach>
	</ul>
	<hr />
</body>
</html>