<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>ICowork</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">

<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Anton&display=swap"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.8.1/css/all.css">
<link rel="stylesheet" href="<c:url value="/res/css/estilo.css" />">
</head>
<body>
	<header>
		<h1>ICowork Chile</h1>
	</header>
	<section>
		<%@ include file='menu.jsp'%>
	</section>

	<main> 
		<h2>Oficinas compartidas</h2>
		<div class="principal">
			<img src="/spring/res/img/logoprincipal.jpg"
				alt="Logo Principal" />
			<p>En ICowork Chile, los profesionales Independientes,
				Emprendedores y Pymes podrán encontrar su espacio de trabajo
				compartido para llevar a cabo sus proyectos de manera independiente
				o fomentar proyectos conjuntos.</p>
		</div>
	</main>

	</br>

	<footer>
		<div class="rrss">
			<ul>
				<li><a href="#" class="facebook"> <i
						class="fab fa-facebook-f"></i></a></li>
				<li><a href="#" class="instagram"> <i
						class="fab fa-instagram"></i></a></li>
				<li><a href="#" class="youtube"> <i class="fab fa-youtube"></i></a></li>
				<li><a href="#" class="twitter"> <i class="fab fa-twitter"></i></a></li>
			</ul>
		</div>
	</footer>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>
</body>
</html>