<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>.: Gulliver Traveller :.</title>
</head>
<body>
	<h1>Realize seu login na plataforma Gulliver:</h1>
	<hr />
	<form action="loginServlet" method="post">
		Seu Login: <input type="text" name="txtLogin"> <br> 
		Sua Senha: <input type="password" name="txtSenha"> <br> 
		<input type="submit" value="Enviar Dados">
	</form>
	<span style="font-weight:600;color:red;font-size:12px;">Utilize o usuario admin senha admin.</span>
</body>
</html>