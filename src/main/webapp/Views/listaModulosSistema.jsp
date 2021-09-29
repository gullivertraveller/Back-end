<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:useBean id="User" type="model.Usuario" scope="session" />
<jsp:useBean id="Modulos" type="java.util.ArrayList<model.Modulo>"
	scope="request" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>.: Lista Módulos :.</title>
</head>
<body>
	<h1> Olá! <c:out value="${User.nome}" /></h1>
	<hr />
	<p>Esses são os módulos disponíveis (até então) em nosso backend:</p>

	<ul>
		<c:forEach items="${Modulos}" var="modulo">
			<hr />
			<li>
				<a href="<c:out value="${modulo.url}"/>">
					<c:out value="${modulo.titulo}" />
				</a>
			</li>
		</c:forEach>
	</ul>
	<hr />
</body>
</html>