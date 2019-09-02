<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<head>
<script type="text/javascript" src="WebContent/resources/js/jQuery.js"></script>
<title>Lista de Admins</title>
<script type="text/javascript" src='<c:url value="/res/js/jQuery.js" />'></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$(".confirm").on("click", function() {
			return confirm("El administrador se eliminara, ¿Continuar?");
		});
	});
</script>
</head>
<body>

	<h1>Registro</h1>

	<sf:form action="${pageContext.request.contextPath}/showMaterias/save"
		method="post" commandName="mate">
		<table>
			<tr>
				<td>ID</td>
				<td><sf:input path="idMateria" type="text" /></td>
			</tr>

			<tr>
				<td>Nombre de la Materia</td>
				<td><sf:input path="materia" type="text" /></td>
			</tr>
			<tr>
				<td>Codigo de la materia</td>
				<td><sf:input path="codigo" type="text" /></td>
			</tr>
			<tr>
				<td>Departamento</td>
				<td><sf:input path="departamento.idDepartamento" type="text" /></td>
			</tr>
			<tr>
				<td>Ciclo</td>
				<td><sf:input path="ciclo" type="text" /></td>
			</tr>
			<tr>
				<td>Unidad Valorativa</td>
				<td><sf:input path="unidadValorativa" type="text" /></td>
			</tr>
			<tr>
				<td>Prerequisito</td>
				<td><sf:input path="materias" type="text" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Guardar Cambios" /></td>
			</tr>
		</table>
	</sf:form>
	<c:out value="${mensaje}"></c:out>



	<h2>Listado de Materias</h2>



	<table>
		<tr>
			<th>Id</th>
			<th>depa</th>
			<th>Code</th>
			<th>ciclo</th>
			<th>unidad</th>
			<th>materias</th>

		</tr>
		<c:forEach var="mate" items="${lista}">
			<tr>
				<td>${mate.idMateria}</td>
				<td>${mate.departamento.idDepartamento}</td>
				<td>${mate.codigo}</td>
				<td>${mate.ciclo}</td>
				<td>${mate.unidadValorativa}</td>
				<td>${mate.materias.idMateria}</td>
			</tr>
			<a href='<c:url value="/showMaterias/${mate.idMateria}/update" />'>Actualizar</a>
			<a class="confirm"
				href='<c:url value="/showMaterias/${mate.idMateria}/delete" />'>Eliminar</a>

		</c:forEach>
	</table>
</body>
</html>