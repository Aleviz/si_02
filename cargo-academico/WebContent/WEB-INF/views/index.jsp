<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<spring:url value="/report" var="reportLink" />

<title>Index</title>
</head>
<body>
	<h2>Hola mundo</h2>
	<br>
	<c:out value="${mensaje}" />
	<br>
	<br>
	<br />

	<a href='<c:url value="/showMaterias"/>'>Materias</a>
	<a href='<c:url value="/NewFile"/>'>x</a>
	<a href='<c:url value="/contacto"/>'>GEOGRAFICO</a>
	<a href='<c:url value="/Home"/>'>HOME</a>
	<a href='<c:url value="/documentos"/>'> Documentos </a>
</body>
</html>