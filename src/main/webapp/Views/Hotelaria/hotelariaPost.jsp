<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>POST Hotelaria</title>
</head>
<body>
	<h1> Olá! <c:out value="${User.nome}" /></h1>
	<hr />
	<p>Utilize esse formulário para testar o request POST de criar Hotéis:</p>
	
	<form action="../../hotelariaServlet" method="post" title="Cadastrar Hotel">
	
		<span>Nome:</span>
		<input type="text" name="txtNome" /> 
		<br />	
	
		<span>Endereço:</span>
		<input type="text" name="txtEndereco" /> 
		<br />	
	
		<span>Valor Diaria:</span>
		<input type="number" name="valorDiaria" /> 
		<br />
	
		<span>Classificação:</span>
		<select name="classificacao">
			<option value="1" selected>1</option>
			<option value="2">2</option>
			<option value="3">3</option>
			<option value="4">4</option>
			<option value="5">5</option>
		</select>
		<br />	
	
		<input type="submit" value="Criar Hotel">
	</form>
</body>
</html>