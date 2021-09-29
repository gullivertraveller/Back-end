<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!--declarando o uso das TagLIBS -->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:useBean id="Hotel" type="model.Hotel" scope="request" />

<!DOCTYPE html>
<html>
<head>
<title>.: SUCESSO :.</title>
</head>
<body>
	<h1>Hotel Criado com sucesso !</h1>
	<hr>
	<h3>Dados do hotel criado:</h3>
	<br />
	
	<span>Nome: </span>
	<span><c:out value="${Hotel.nome}" /></span>
	<br />
	
	<span>Endereço: </span>
	<span><c:out value="${Hotel.endereco}" /></span>
	<br />
	
	<span>Valor Diária: </span>
	<span><c:out value="${Hotel.valorDiaria}" /></span>
	<br />
	
	<span>Classificação: </span>
	<span><c:out value="${Hotel.classificacao}" /></span>
	<br />
	
	<a href="listaEndPointsHotelariaServlet">Voltar aos endpoints (hotelaria)</a>
</body>
</html>