<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spr" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta charset="UTF-8">
<meta name="description" content="">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">


<%-- <link rel="stylesheet" href="<%=request.getContextPath()%>/res/design/leaflet.css" /> --%>
<%-- <script src="<c:url value='res/design/leaflet.js'></c:url>"></script> --%>
<link rel="stylesheet" href="https://unpkg.com/leaflet@1.5.1/dist/leaflet.css">
<script	src="<c:url value='https://unpkg.com/leaflet@1.5.1/dist/leaflet.js'></c:url>"></script>


<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/leaflet-easybutton@2/src/easy-button.css">
<script
	src="https://cdn.jsdelivr.net/npm/leaflet-easybutton@2/src/easy-button.js"></script>

<%-- <script type="text/javascript" src='<c:url value="/res/js/jQuery.js" />'></script> --%>

<link href="http://netdna.bootstrapcdn.com/font-awesome/4.0.0/css/font-awesome.css" rel="stylesheet">
<link href="http://netdna.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet"> 




<!-- ********************* -->

	<script
		src="<c:url value='/res/design/js/jquery/jquery-2.2.4.min.js'></c:url>"></script>


	<script
		src="<c:url value='/res/design/js/bootstrap/popper.min.js'></c:url>"></script>


	<script
		src="<c:url value='/res/design/js/bootstrap/bootstrap.min.js'></c:url>">
	</script>


<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">

<!-- /**** -->

<!-- //-------------------------------------------------------------------------- -->

  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>



  <style>
  .modal-header, h4, .close {
    background-color: #5cb85c;
    color:white !important;
    text-align: center;
    font-size: 30px;
  }
  .modal-footer {
    background-color: #f9f9f9;
  }
  </style>
  
  
  

<!-- //------------------------------------------------------ -->

<!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->

<!-- Title -->
<title>Academy - Education Course Template</title>

<!-- Favicon -->
<link rel="icon"
	href="<%=request.getContextPath()%>/res/design/img/core-img/favicon.ico">

<!-- Core Stylesheet -->
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/res/design/style.css">
	
	<link rel="stylesheet"
	href="<%=request.getContextPath()%>/res/design/css/font-awesome.min.css">

<style>
@import
	url('https://fonts.googleapis.com/css?family=Righteous&display=swap');

.button {
	background-color: #33CEFF; /* Green */
	border: none;
	color: white;
	padding: 4px 10px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 10px;
	font-family: "Righteous", cursive;
	margin: 4px 2px;
	cursor: pointer;
	-webkit-transition-duration: 0.4s; /* Safari */
	transition-duration: 0.4s;
}

.button1 {
	box-shadow: 0 8px 16px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0
		rgba(0, 0, 0, 0.19);
	background-color: #33CEFF;
	background: -webkit-linear-gradient(90deg, STEELBLUE 15%, DEEPSKYBLUE 85%);
	background: -moz-linear-gradient(90deg, STEELBLUE 15%, DEEPSKYBLUE 85%);
	background: -ms-linear-gradient(90deg, STEELBLUE 15%, DEEPSKYBLUE 85%);
	background: -o-linear-gradient(90deg, STEELBLUE 15%, DEEPSKYBLUE 85%);
	background: linear-gradient(90deg, STEELBLUE 15%, DEEPSKYBLUE 85%);
	color: black;
}

.button1:hover {
	background-color: #DC143C;
	background: -webkit-linear-gradient(90deg, STEELBLUE 15%, MEDIUMSLATEBLUE 85%);
	background: -moz-linear-gradient(90deg, DARKSLATEBLUE 15%, MEDIUMSLATEBLUE 85%);
	background: -ms-linear-gradient(90deg, DARKSLATEBLUE 15%, MEDIUMSLATEBLUE 85%);
	background: -o-linear-gradient(90deg, DARKSLATEBLUE 15%, MEDIUMSLATEBLUE 85%);
	background: linear-gradient(90deg, DARKSLATEBLUE 15%, MEDIUMSLATEBLUE 85%);
	border: 2px solid #7B68EE;
	color: white;
}
</style>


</head>

<body>

	<!-- ##### Preloader ##### -->
	<div id="preloader">
		<i class="circle-preloader"></i>
	</div>





	<header class="header-area"> <!-- Top Header Area -->
	<div class="top-header">
		<div class="container h-100">
			<div class="row h-100">
				<div class="col-12 h-100">
					<div
						class="header-content h-100 d-flex align-items-center justify-content-between">
						<div class="academy-logo">
							<a href="<c:url value="/Home"/>"><img
								src="<c:url value='/res/design/img/core-img/image.png'></c:url>"
								width="150px"></a>
						</div>
						<div class="login-content">
							<a href="#">Register / Login</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Navbar Area -->
	<div class="academy-main-menu">
		<div class="classy-nav-container breakpoint-off">
			<div class="container">
				<!-- Menu -->
				<nav class="classy-navbar justify-content-between" id="academyNav">

				<!-- Navbar Toggler -->
				<div class="classy-navbar-toggler">
					<span class="navbarToggler"><span></span><span></span><span></span></span>
				</div>

				<!-- Menu -->
				<div class="classy-menu">

					<!-- close btn -->
					<div class="classycloseIcon">
						<div class="cross-wrap">
							<span class="top"></span><span class="bottom"></span>
						</div>
					</div>

					<!-- Nav Start -->
					<div class="classynav">
						<ul>
							<li><a href="<c:url value="/Home"/>">Home</a></li>
							<li><a href="#">Pages</a>
								<ul class="dropdown">
									<li><a href="index.html">Home</a></li>
									<li><a href="about-us.html">About Us</a></li>
									<li><a href="course.html">Course</a></li>
									<li><a href="blog.html">Blog</a></li>
									<li><a href="contact.html">Contact</a></li>
									<li><a href="elements.html">Elements</a></li>
								</ul></li>
							<li><a href="#">Mega Menu</a>
								<div class="megamenu">
									<ul class="single-mega cn-col-4">
										<li><a href="#">Home</a></li>
										<li><a href="#">Services &amp; Features</a></li>
										<li><a href="#">Accordions and tabs</a></li>
										<li><a href="#">Menu ideas</a></li>
										<li><a href="#">Students Gallery</a></li>
									</ul>
									<ul class="single-mega cn-col-4">
										<li><a href="#">Home</a></li>
										<li><a href="#">Services &amp; Features</a></li>
										<li><a href="#">Accordions and tabs</a></li>
										<li><a href="#">Menu ideas</a></li>
										<li><a href="#">Students Gallery</a></li>
									</ul>
									<ul class="single-mega cn-col-4">
										<li><a href="#">Home</a></li>
										<li><a href="#">Services &amp; Features</a></li>
										<li><a href="#">Accordions and tabs</a></li>
										<li><a href="#">Menu ideas</a></li>
										<li><a href="#">Students Gallery</a></li>
									</ul>
									<div class="single-mega cn-col-4">
										<img
											src="<%=request.getContextPath()%>/res/design/img/bg-img/bg-1.jpg"
											alt="">
									</div>
								</div></li>
							<li><a href="about-us.html">About Us</a></li>
							<li><a href="course.html">Course</a></li>
							<li><a href="contact.html">Contact</a></li>
						</ul>
					</div>
					<!-- Nav End -->
				</div>

				<!-- Calling Info -->
				<div class="calling-info">
					<div class="call-center">
						<a href="tel:+654563325568889"><i class="icon-telephone-2"></i>
							<span>(+503) ${campusdir.telefono}</span></a>
					</div>
				</div>
				</nav>
			</div>
		</div>
	</div>
	</header>


	<div class="map-area wow fadeInUp" data-wow-delay="300ms">
	
	
	
		<div id="mapa">

		<p></p>
		</div>
		
		
		
		
		
		
		
		<div id="mapa2" >

		<div id="mapa2"></div>


		<div style="display: none">

			<p id="latitud">${jsonLatitud}</p>
			<p id="longitud">${jsonLongitud}</p>
			<p id="facultad">${jsonNombre}</p>

		</div>

	

		<div id="formulario" class="scroll2">

			<!-- 	//////////////////////////////////////////CAMPUS////////////////////////////////////////////////// -->
						<div class="contact-information wow fadeInUp" data-wow-delay="400ms" id="showCampus">
							<div class="section-heading text-left" style="background-color: floralwhite;" >
								<span>UNIT</span>
								<h3>Universidad Nacional de Innovacion Tecnologica</h3>
								<div class="izq">  	
						<c:forEach var="c" items="${campusList}">							
								<a class="obtenerCx" >
								<label class="obtenerC nombreCampuss">${c.campus}</label>
								</a>
						<p class="tel">${c.telefono}</p>
						<p class="ubic">${c.ubicacion}</p>	
							<hr/>								
								</c:forEach>
								</div>		
							</div>
						</div>

		
<!-- 			//////////////////////////////////////FACULTAD////////////////////////////////////////////////////// --> 	
						<div class="contact-information wow fadeInUp" data-wow-delay="400ms"
							id="showFacultad">
							<div class="section-heading text-left" style="background-color: floralwhite;" id="infCarr">
								<span>Unit</span>								
								<h3 id="nombreCampus" ></h3> 							
							<div class="izq" id="idFacu">				
							</div>
							</div>
							<div class="botonMapa">
									<button class="atrass">VOLVER A CAMPUS</button>
							</div>
						</div>
		
<!-- 						///////////////////////////////////CARRERAS/////////////////////////////////////////////////// -->
						<div class="contact-information wow fadeInUp" data-wow-delay="400ms"
							id="showCarreras">
							<div class="section-heading text-left" style="background-color: floralwhite;" id="infCarr">
								<span>Unit</span>								
								<h3 id="nombreFacultad" ></h3> 							
							<div class="izq" id="id">				
							</div>
							</div>
							<div class="botonMapa">
							<button id="editarr">asd</button>
									<button class="atras">VOLVER A FACULTAD</button>
							</div>
						</div>
						<br>
						<p>carrera: ${e.nombreEscuela}</p>
					</div>
				</c:forEach>
				<div class="botonMapa">
					<!-- 								<button id="editar" class="button button1" onclick="editar">EDITAR</button> -->
					<button class="atras">ATRAS</button>
				</div>

	</div>
	

</div>

	<!-- ESTO ES PARA QUE APAREZCA EL MODAL -->

	<div class="modal fade" id="myModal"  role="dialog">
		<div class="modal-dialog" style="padding-right: 10px; margin-top: 25%; margin-left: 37%;" >

			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header" style="padding: 15px 20px;">
					<center>
						<h4>
							<span class="glyphicon glyphicon-lock"></span> REGISTRO
						</h4>
					</center>
				</div>
				<div class="modal-body" style="padding: 40px 50px;">

					<center>
						<!-- Material unchecked -->
						<div class="btn-group">
<!-- 							<button type="button" class="btn btn-primary" id="campus">Campus</button> -->
							<br></br>
							<button type="button" class="btn btn-primary"
								style="margin-left: 3px" class="x" id="facultade">Facultad</button>
						</div>
					</center>
					<div>
						<br></br>

					</div>

<!-- 					<div id="formCampus"> -->
<%-- 						<sf:form --%>
<%-- 							action="${pageContext.request.contextPath}/contacto/campus/save" --%>
<%-- 							method="post" commandName="campus" role="form"> --%>

<!-- 							<div class="form-group"> -->
<!-- 								<label for="idCampus"> <span -->
<!-- 									class="glyphicon glyphicon-user"></span> ID -->
<!-- 								</label> -->
<%-- 								<sf:input type="text" class="form-control" id="idCampus" --%>
<%-- 									placeholder="ID " path="idCampus" /> --%>
<!-- 							</div> -->

<!-- 							<div class="form-group"> -->
<!-- 								<label for="campuscampus"><span -->
<!-- 									class="glyphicon glyphicon-eye-open"></span> Nombre del Campus</label> -->
<%-- 								<sf:input type="text" class="form-control" id="campuscampus" --%>
<%-- 									path="campus" placeholder="Nombre" /> --%>
<!-- 							</div> -->

<!-- 							<div class="form-group"> -->
<!-- 								<label for="telefono"><span -->
<!-- 									class="glyphicon glyphicon-eye-open"></span> Numero Telefónico</label> -->
<%-- 								<sf:input type="text" class="form-control" id="telefono" --%>
<%-- 									path="telefono" placeholder="Telefono" /> --%>
<!-- 							</div> -->

<!-- 							<div class="form-group"> -->
<!-- 								<label for="ubicacion"><span -->
<!-- 									class="glyphicon glyphicon-eye-open"></span> Ubicacion</label> -->
<%-- 								<sf:input type="text" class="form-control" id="ubicacion" --%>
<%-- 									path="ubicacion" placeholder="Ubicacion" /> --%>
<!-- 							</div> -->

<!-- 							<div class="form-group"> -->
<!-- 								<label for="latitudCampus"><span -->
<!-- 									class="glyphicon glyphicon-eye-open"></span> Latitud</label> -->
<%-- 								<sf:input type="text" class="form-control" id="latitudCampus" --%>
<%-- 									path="coordenadas.latitud" placeholder="Latitud" /> --%>
<!-- 							</div> -->

<!-- 							<div class="form-group"> -->
<!-- 								<label for="longitudCampus"><span -->
<!-- 									class="glyphicon glyphicon-eye-open"></span> Longitud</label> -->
<%-- 								<sf:input type="text" class="form-control" id="longitudCampus" --%>
<%-- 									path="coordenadas.longitud" placeholder="Longitud" /> --%>
<!-- 							</div> -->



<!-- 							<button type="submit" class="btn btn-success btn-block"> -->
<!-- 								<span class="glyphicon glyphicon-off" id="guardarC"></span> -->
<!-- 								Guardar Cambios -->
<!-- 							</button> -->
<%-- 						</sf:form> --%>
<!-- 					</div> -->


					<div id="formFacultad">
						<sf:form
							action="${pageContext.request.contextPath}/contacto/facultad/save"
							method="post" commandName="facultad" role="form">

							<div class="form-group">
								<label for="decanofacultad"><span
									class="fas fa-map-marked-alt"></span> Decano</label>
									<sf:select path="empleado.idEmpleado" id="decanofacultad" class="form-control">

										<sf:options var="ed" items="${empleadoxDecano}" itemValue="idEmpleado" itemLabel="primerNombre"/>
									</sf:select>
									
							</div>

							<div class="form-group">
								<label for="facultadfacultad"><span
									class="fas fa-university"></span> Nombre de la
									Facultad</label>
								<sf:input type="text" class="form-control" id="facultadfacultad"
									path="facultad" placeholder="Nombre" />
							</div>

							<div class="form-group">
								<label for="telefono"><span
									class="icon-telephone-3"></span> Numero Telefónico</label>
								<sf:input type="text" class="form-control" id="telefono"
									path="telefono" placeholder="Telefono" />
							</div>


							<div class="form-group">
								<label for="ubicacion"><span
									class="fas fa-map-marker-alt"></span> Ubicacion</label>
								<sf:input type="text" class="form-control" id="ubicacion"
									path="ubicacion" placeholder="Ubicacion" />
							</div>


							<div class="form-group">
								<label for="campusfacultad"><span
									class="fas fa-map-marked-alt"></span> Campus</label>
<%-- 								<sf:input type="text" class="form-control" id="campusfacultad" --%>
<%-- 							path="campus.idCampus" placeholder="campus" /> --%>

									<sf:select path="campus.idCampus" id="campusfacultad" class="form-control">

										<sf:options var="cc" items="${campusList}" itemValue="idCampus" itemLabel="campus"/>
									</sf:select>
									
							</div>
							
							<div class="form-group">
								<label for="latitudFacultad"><span
									class="icon-map"></span> Latitud</label>
								<sf:input type="text" class="form-control" id="latitudFacultad"
									path="coordenadas.latitud" placeholder="Latitud" />
							</div>

							<div class="form-group">
								<label for="longitudFacultad"><span
									class="icon-map"></span> Longitud</label>
								<sf:input type="text" class="form-control" id="longitudFacultad"
									path="coordenadas.longitud" placeholder="Longitud" />
							</div>


							<button type="submit" class="btn btn-success btn-block">
								<span class="glyphicon glyphicon-off" id="guardarF"></span>
								Guardar Cambios
							</button>
						</sf:form>
					</div>

					<!-- 					aqui -->
				</div>



				<div class="modal-footer">
					<button type="submit" class="btn btn-danger btn-default pull-left"
						data-dismiss="modal" id="cancell">
						<span class="glyphicon glyphicon-remove"></span> Cancel
					</button>

				</div>
			</div>

		</div>
	</div>
	





	<footer class="footer-area">
	<div class="main-footer-area section-padding-100-0">
		<div class="container">
			<div class="row">
				<!-- Footer Widget Area -->
				<div class="col-12 col-sm-6 col-lg-3">
					<div class="footer-widget mb-100">
						<div class="widget-title">
							<a href="#"><img
								src="<%=request.getContextPath()%>/res/design/img/core-img/logo_1.png"
								width="170"></a>
						</div>
						<p>La Universidad nacional de Innovacion Tecnologica es la
							institución de educación superior más grande y antigua de la
							República de El Salvador.</p>
						<div class="footer-social-info">
							<a href="#"><i class="fa fa-facebook"></i></a> <a href="#"><i
								class="fa fa-twitter"></i></a> <a href="#"><i
								class="fa fa-dribbble"></i></a> <a href="#"><i
								class="fa fa-behance"></i></a> <a href="#"><i
								class="fa fa-instagram"></i></a>
						</div>
					</div>
				</div>
				<!-- Footer Widget Area -->
				<div class="col-12 col-sm-6 col-lg-3">
					<div class="footer-widget mb-100">
						<div class="widget-title">
							<h6>Usefull Links</h6>
						</div>
						<nav>
						<ul class="useful-links">
							<li><a href="#">Home</a></li>
							<li><a href="#">Services &amp; Features</a></li>
							<li><a href="#">Accordions and tabs</a></li>
							<li><a href="#">Menu ideas</a></li>
						</ul>
						</nav>
					</div>
				</div>
				<!-- Footer Widget Area -->
				<div class="col-12 col-sm-6 col-lg-3">
					<div class="footer-widget mb-100">
						<div class="widget-title">
							<h6>Gallery</h6>
						</div>
						<div class="gallery-list d-flex justify-content-between flex-wrap">
							<a
								href="<%=request.getContextPath()%>/res/design/img/gallery1.jpg"
								class="gallery-img" title="Gallery Image 1"><img
								src="<c:url value='/res/design/img/bg-img/gallery1.jpg'></c:url>"
								alt=""></a> <a
								href="<%=request.getContextPath()%>/res/design/img/gallery2.jpg"
								class="gallery-img" title="Gallery Image 2"><img
								src="<c:url value='/res/design/img/bg-img/gallery2.jpg'></c:url>"
								alt=""></a> <a
								href="<%=request.getContextPath()%>/res/design/img/gallery3.jpg"
								class="gallery-img" title="Gallery Image 3"><img
								src="<c:url value='/res/design/img/bg-img/gallery3.jpg'></c:url>"
								alt=""></a> <a
								href="<%=request.getContextPath()%>/res/design/img/gallery4.jpg"
								class="gallery-img" title="Gallery Image 4"><img
								src="<c:url value='/res/design/img/bg-img/gallery4.jpg'></c:url>"
								alt=""></a> <a
								href="<%=request.getContextPath()%>/res/design/img/gallery5.jpg"
								class="gallery-img" title="Gallery Image 5"><img
								src="<c:url value='/res/design/img/bg-img/gallery5.jpg'></c:url>"
								alt=""></a> <a
								href="<%=request.getContextPath()%>/res/design/img/gallery6.jpg"
								class="gallery-img" title="Gallery Image 6"><img
								src="<c:url value='/res/design/img/bg-img/gallery6.jpg'></c:url>"
								alt="Dem"></a>
						</div>
					</div>
				</div>
				<!-- Footer Widget Area -->
				<div class="col-12 col-sm-6 col-lg-3">
					<div class="footer-widget mb-100">
						<div class="widget-title">
							<h6>Contact</h6>
						</div>
						<div class="single-contact d-flex mb-30">
							<i class="icon-placeholder"></i>
							<p>${campusdir.ubicacion}</p>
						</div>
						<div class="single-contact d-flex mb-30">
							<i class="icon-telephone-1"></i>
							<p>
								Teléfono: ${campusdir.telefono} <br> Oficina: 203-808-8648
							</p>
						</div>
						<div class="single-contact d-flex">
							<i class="icon-contract"></i>
							<p>universidadTecnologica@unit.sv</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	
	
	<div class="bottom-footer-area">
		<div class="container">
			<div class="row">
				<div class="col-12">
					<p>
						<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
						Copyright &copy;
						<script>
							document.write(new Date().getFullYear());
						</script>
						Derechos reservados | Colaboración con <a
							href="https://www.usam.edu.sv" target="_blank">USAM</a>
						<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
					</p>
				</div>
			</div>
		</div>
	</div>
	</footer>



<%-- 	<script src="<c:url value='/res/design/js/plugins/plugins.js'></c:url>"></script> --%>


	<script src="<c:url value='/res/design/js/active.js'></c:url>"></script>
	<script type="text/javascript"
		src="<c:url value='/res/design/js/mapa.js'></c:url>"></script>

</body>
</html>
