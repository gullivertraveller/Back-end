<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Filtrar Hotéis</title>
</head>
<body>
	<h1> Olá! <c:out value="${User.nome}" /></h1>
	<hr />
	<p>Utilize esse formulário para testar o request de filtro de hotéis (GET):</p>
	<p>Preencha um ou mais filtros:</p>
	<form action="../../hotelariaServlet" method="get" title="Filtrar Hotéis">
	
		<span>Filtrar Nome:</span>
		<input type="text" name="txtNome" /> 
		<br />	
	
		<span>Filtrar Endereço:</span>
		<input type="text" name="txtEndereco" /> 
		<br />	
	
		<span>Filtrar Valor:</span>
		<input type="number" name="valorDiaria" /> 
		<br />
	
		<span>Filtrar Classificação:</span>
		<select name="classificacao">
			<option value="5" selected>5</option>
			<option value="4">4</option>
			<option value="3">3</option>
			<option value="2">2</option>
			<option value="1">1</option>	
		</select>
		<br />	
	
		<input type="submit" value="Buscar Hotéis">
	</form>
</body>
</html>