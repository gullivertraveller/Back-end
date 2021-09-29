<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:useBean id="User" type="model.Usuario" scope="session" />
<jsp:useBean id="listaHoteis" type="java.util.ArrayList<model.Hotel>"
	scope="request" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>.: Lista Hotéis :.</title>
</head>
<body>
	<h1> Olá! <c:out value="${User.nome}" /></h1>
	<hr />
	<p>Esses são os hotéis disponíveis:</p>

	<ul>
		<c:forEach items="${listaHoteis}" var="hotel">
			<hr />
			<li>
				<span>Nome: </span> 
				<span><c:out value="${hotel.nome}" /></span>
				<br />
				
				<span>Endereço: </span> 
				<span><c:out value="${hotel.endereco}" /></span>
				<br />
				
				<span>Valor diária: </span> 
				<span><c:out value="${hotel.valorDiaria}" /></span>
				<br />
				
				<span>Classificação: </span> 
				<span><c:out value="${hotel.classificacao}" /></span>
				<br />
			</li>
		</c:forEach>
	</ul>
	<hr />
</body>
</html>