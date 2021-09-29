<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!--declarando o uso das TagLIBS -->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:useBean id="Restaurante" type="model.Restaurante" scope="request" />

<!DOCTYPE html>
<html>
<head>
<title>.: SUCESSO :.</title>
</head>
<body>
	<h1>Restaurante Criado com sucesso !</h1>
	<hr>
	<h3>Dados do Restaurante criado:</h3>
	<br />
	
	<span>Nome: </span>
	<span><c:out value="${Restaurante.nome}" /></span>
	<br />
	
	<span>Endereço: </span>
	<span><c:out value="${Restaurante.endereco}" /></span>
	<br />
	
	<span>Tipo de Comida: </span>
	<span><c:out value="${Restaurante.tipoComida}" /></span>
	<br />
	
	<span>Faixa de Preço: </span>
	<span><c:out value="${Restaurante.faixaPreco}" /></span>
	<br />
	
	<span>Classificação: </span>
	<span><c:out value="${Restaurante.classificacao}" /></span>
	<br />
	
	<a href="listaEndPointsGastronomiaServlet">Voltar aos endpoints (gastronomia)</a>
</body>
</html>