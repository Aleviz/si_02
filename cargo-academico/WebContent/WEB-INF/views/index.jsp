<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/res/bootstrap/js/Style.css">
<link rel='stylesheet'
	href='https://fonts.googleapis.com/css?family=Open+Sans'>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
	<div class="cont">
		<div class="demo">
			<div class="login">
				<div class="login__check"></div>
				<div class="login__form">
					<p>
						<c:out value="${mensaje}" />
					</p>
					<sf:form action="${pageContext.request.contextPath}/index/login"
						method="post" commandName="usuario">
						<div class="login__row">
							<svg class="login__icon name svg-icon" viewBox="0 0 20 20">
							<path
								d="M0,20 a10,8 0 0,1 20,0z M10,0 a4,4 0 0,1 0,8 a4,4 0 0,1 0,-8" />
							</svg>
							<sf:input type="text" path="username" class="login__input name"
								placeholder="Username" />
						</div>
						<div class="login__row">
							<svg class="login__icon pass svg-icon" viewBox="0 0 20 20">
							<path
								d="M0,20 20,20 20,8 0,8z M10,13 10,16z M4,8 a6,8 0 0,1 12,0" />
							</svg>
							<sf:input type="password" path="pass" class="login__input pass"
								placeholder="Password" />
						</div>
						<input type="submit" class="login__submit" value="Loguear" />
					</sf:form>
				</div>
			</div>
			<div class="app">
				<div class="app__top">
					<div class="app__menu-btn">
						<span></span>
					</div>
					<!--Boton de deslogueo-->
					<div class="app__logout">
						<svg class="app__logout-icon svg-icon" viewBox="0 0 20 20">
						<path d="M6,3 a8,8 0 1,0 8,0 M10,0 10,12" /> </svg>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script
		src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'>
		
	</script>
	<script src="<c:url value='/res/bootstrap/js/jLogin.js'></c:url>"></script>
</body>
</html>