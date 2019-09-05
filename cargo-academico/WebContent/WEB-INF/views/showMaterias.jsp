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
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/res/design/leaflet.css" />
<script src="<c:url value='res/design/leaflet.js'></c:url>"></script>
<link rel="stylesheet"
	href="https://unpkg.com/leaflet@1.5.1/dist/leaflet.css">
<script
	src="<c:url value='https://unpkg.com/leaflet@1.5.1/dist/leaflet.js'></c:url>"></script>

<script type="text/javascript" src='<c:url value="/res/js/jQuery.js" />'></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->

<!-- Title -->
<title>Academy - Education Course Template</title>

<!-- Favicon -->
<link rel="icon"
	href="<%=request.getContextPath()%>/res/design/img/core-img/favicon.ico">

<!-- Core Stylesheet -->
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/res/design/style.css">

</head>

<body>
	<!-- ##### Preloader ##### -->
	<div id="preloader">
		<i class="circle-preloader"></i>
	</div>

	<!-- ##### Header Area Start ##### -->
	<header class="header-area"> <!-- Top Header Area -->
	<div class="top-header">
		<div class="container h-100">
			<div class="row h-100">
				<div class="col-12 h-100">
					<div
						class="header-content h-100 d-flex align-items-center justify-content-between">
						<div class="academy-logo">
							<a href="index.html"><img
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
							<li><a href="index.html">Home</a></li>
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
							<span>(+65) 456 332 5568 889</span></a>
					</div>
				</div>
				</nav>
			</div>
		</div>
	</div>
	</header>
	<!-- ##### Header Area End ##### -->

	<!-- ##### Breadcumb Area Start ##### 
        <div class="breadcumb-area bg-img" style="background-image: url(img/bg-img/breadcumb.jpg);">
            <div class="bradcumbContent">
                <h2>Contact</h2>
            </div>
        </div>
        <!-- ##### Breadcumb Area End ##### -->

	<!-- ##### Google Maps ##### -->
	<div class="map-area wow fadeInUp" data-wow-delay="300ms">
		<div id="mapa">
			<script src="<c:url value='/res/design/js/mapa.js'></c:url>"></script>
		</div>
		<div id="formulario">
			<div class="contact-information wow fadeInUp" data-wow-delay="400ms">
				<div class="section-heading text-left">
					<span>Unit</span>
					<h3>Universidad Nacional De Innovacion Tecnológica</h3>
					<p class="izq">
						<img src="<%=request.getContextPath()%>/res/design/img/bg-img/pc-1.jpg" class="flip"> 
							<img src="<%=request.getContextPath()%>/res/design/img/bg-img/negro2.jpg" class="flip2">
					</p>
					<p class="der">
						<img
							src="<%=request.getContextPath()%>/res/design/img/bg-img/pc-2.jpg" class="flip">
							<img src="<%=request.getContextPath()%>/res/design/img/bg-img/negro2.jpg" class="flip2">
					</p>
					<p class="izq">
						<img
							src="<%=request.getContextPath()%>/res/design/img/bg-img/pc-3.jpg" class="flip">
							<img src="<%=request.getContextPath()%>/res/design/img/bg-img/negro2.jpg" class="flip2">
					</p>
					<p class="der">
						<img
							src="<%=request.getContextPath()%>/res/design/img/bg-img/pc-4.jpg" class="flip">
							<img src="<%=request.getContextPath()%>/res/design/img/bg-img/negro2.jpg" class="flip2">
					</p>
					<p class="izq">
						<img
							src="<%=request.getContextPath()%>/res/design/img/bg-img/pc-5.jpg" class="flip">
							<img src="<%=request.getContextPath()%>/res/design/img/bg-img/negro2.jpg" class="flip2">
					</p>
					<p class="der"></p>
				</div>

				<!-- Single Contact Info -->
				<div class="single-contact-info d-flex">
					<div class="contact-icon mr-15">
						<i class="icon-placeholder"></i>
					</div>
					<p>Ubicacion: Final 25 Avenida Norte, San Salvador</p>


				</div>
				<!-- Single Contact Info -->
				<div class="single-contact-info d-flex">
					<div class="contact-icon mr-15">
						<i class="icon-telephone-1"></i>
					</div>
					<p>
						Telefono: 2511 2000 <br> Fax: 203-808-8648
					</p>
				</div>
				<!-- Single Contact Info -->
				<div class="single-contact-info d-flex">
					<div class="contact-icon mr-15">
						<i class="icon-contract"></i>
					</div>
					<p>Correo: universidadTeconolica@unit.sv</p>
				</div>

					<div class="botonMapa">
					<button id="editar" class="editar" onclick="editar">EDITAR</button>
		<button id="finalizar">Finalizar</button>
					</div>
			
			</div>
			


		<!-- 			ESTO ES PARA ACCIONAR EL MODAL -->
		<!-- 		  <button type="button" class="btn btn-default btn-lg" id="myBtn">Login</button> -->



		<script>
			$(document).ready(function() {
			$.getScript("res/design/js/mapa.js");
			$('#finalizar').hide();
			$('#editar').click(function() {
			var nombre = ["El mapa se modificara, ¿continuar?",
						"estas seguro de agregar un marcador aca, ¿continuar?",
						"Los datos se guardaran, ¿continuar?" ]
			console.log('Expresion: ');
			var opcion = confirm(nombre[0]);
			$(this).hide();
			$('#finalizar').show();

			console.log(opcion+ "holaaaaaa");
								
			if (opcion == true) {

				alert("aceptado");
				map.on(	'click',function(e) {
				var lat = e.latlng.lat;
				var lon = e.latlng.lng;

				var afirmar = confirm(nombre[1]);

			if (afirmar == true) {
				$('#myModal').modal("show");
				$('#formCampus').hide();
				$('#formFacultad').hide();							

				
				$('#campus').click(function(){
					$('#formCampus').show();
					$('#formFacultad').hide();
					
					$('#guardarC').click(function(){
						market = L.marker([	lat,	lon ]).addTo(map);
						
					})
				})
				$('#facultad').click(function(){
					$('#formFacultad').show();
					$('#formCampus').hide();	
					
					$('#guardarF').click(function(){
						market = L.marker([	lat,	lon ]).addTo(map);
					})
				})

				$('#finalizar').click(function() {
				var confirmar1 = confirm(nombre[2]);
					if (confirmar1 == true) {
																				
						latitud.push(e.latlng.lat);
						longitud.push(e.latlng.lng);
																					
						$(this).hide();
						$('#editar').show();
																							
						console.log();							
						} else {
																				
							console.log("cambios no guardados");

						}
					
				})
				
			} else {
																		
				console.log("denegado");
			
			}
			
				})

			} else {
			
				alert("cancelado");
				
			}


			})
			
			})
		</script>
		</div>
	</div>

	<!-- ##### Contact Area End ##### -->


	<!-- ESTO ES PARA QUE APAREZCA EL MODAL -->
	<div class="modal fade" id="myModal" role="dialog">
		<div class="modal-dialog">

			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header" style="padding: 35px 50px;">

					<h4>
						<span class="glyphicon glyphicon-lock"></span> Login
					</h4>
				</div>
				<div class="modal-body" style="padding: 40px 50px;">

					<!-- Material unchecked -->
					<div class="btn-group">
						<button type="button" class="btn btn-primary" id="campus">Campus</button>
						<br></br>
						<button type="button" class="btn btn-primary"
							style="margin-left: 3px" id="facultad">Facultad</button>
					</div>

					<div>
						<br></br>
						<sf:form
							action="${pageContext.request.contextPath}/showMaterias/save"
							method="post" commandName="mate" role="form">
							<div class="form-group">
								<label for="unidadValorativa"><span
									class="glyphicon glyphicon-eye-open"></span> Latitud</label> <input
									type="text" class="form-control" id="unidadValorativa"
									path="unidadValorativa" placeholder="Latitud" />
							</div>

							<div class="form-group">
								<label for="ciclo"><span
									class="glyphicon glyphicon-eye-open"></span> Longitud</label> <input
									type="text" class="form-control" id="ciclo"
									placeholder="Longitud" />
							</div>
						</sf:form>
					</div>

					<div id="formCampus">
						<sf:form
							action="${pageContext.request.contextPath}/showMaterias/save"
							method="post" commandName="mate" role="form">

							<div class="form-group">
								<label for="idMateria"><span
									class="glyphicon glyphicon-user"></span> ID</label>
								<sf:input type="text" class="form-control" id="idMateria"
									placeholder="ID " path="idMateria" />
							</div>

							<div class="form-group">
								<label for="materia"><span
									class="glyphicon glyphicon-eye-open"></span> Nombre del Campus</label>
								<input type="text" class="form-control" id="materia"
									path="materia" placeholder="Nombre" />
							</div>

							<div class="form-group">
								<label for="codigo"><span
									class="glyphicon glyphicon-eye-open"></span> Numero Telefónico</label>
								<input type="text" class="form-control" id="codigo"
									path="codigo" placeholder="Telefono" />
							</div>


							<div class="form-group">
								<label for="departamento.idDepartamento"><span
									class="glyphicon glyphicon-eye-open"></span> Ubicacion</label> <input
									type="text" class="form-control"
									id="departamento.idDepartamento"
									path="departamento.idDepartamento" placeholder="Ubicacion" />
							</div>


							<div class="form-group">
								<label for="ciclo"><span
									class="glyphicon glyphicon-eye-open"></span> Coordenadas</label> <input
									type="text" class="form-control" id="ciclo" placeholder="ciclo" />
							</div>


							<button type="submit" class="btn btn-success btn-block">
								<span class="glyphicon glyphicon-off" id="guardarC"></span>
								Guardar Cambios
							</button>
						</sf:form>


					</div>



					<div id="formFacultad">
						<sf:form
							action="${pageContext.request.contextPath}/showMaterias/save"
							method="post" commandName="mate" role="form">

							<div class="form-group">
								<label for="idMateria"><span
									class="glyphicon glyphicon-user"></span> ID</label>
								<sf:input type="text" class="form-control" id="idMateria"
									placeholder="ID " path="idMateria" />
							</div>

							<div class="form-group">
								<label for="materia"><span
									class="glyphicon glyphicon-eye-open"></span> Nombre de la
									Facultad</label> <input type="text" class="form-control" id="materia"
									path="materia" placeholder="Nombre" />
							</div>

							<div class="form-group">
								<label for="codigo"><span
									class="glyphicon glyphicon-eye-open"></span> Numero Telefónico</label>
								<input type="text" class="form-control" id="codigo"
									path="codigo" placeholder="Telefono" />
							</div>


							<div class="form-group">
								<label for="departamento.idDepartamento"><span
									class="glyphicon glyphicon-eye-open"></span> Ubicacion</label> <input
									type="text" class="form-control"
									id="departamento.idDepartamento"
									path="departamento.idDepartamento" placeholder="Ubicacion" />
							</div>


							<div class="form-group">
								<label for="ciclo"><span
									class="glyphicon glyphicon-eye-open"></span> Coordenadas</label> <input
									type="text" class="form-control" id="ciclo" placeholder="ciclo" />
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


	<!-- ##### Footer Area Start ##### -->
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
						<p>Cras vitae turpis lacinia, lacinia lacus non, fermentum
							nisi. Donec et sollicitudin est, in euismod erat. Ut at erat et
							arcu pulvinar cursus a eget.</p>
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
					<p><%=request.getContextPath()%>/img/gallery6.jpg
					</p>
				</div>
				<!-- Footer Widget Area -->
				<div class="col-12 col-sm-6 col-lg-3">
					<div class="footer-widget mb-100">
						<div class="widget-title">
							<h6>Contact</h6>
						</div>
						<div class="single-contact d-flex mb-30">
							<i class="icon-placeholder"></i>
							<p>4127/ 5B-C Mislane Road, Gibraltar, UK</p>
						</div>
						<div class="single-contact d-flex mb-30">
							<i class="icon-telephone-1"></i>
							<p>
								Main: 203-808-8613 <br>Office: 203-808-8648
							</p>
						</div>
						<div class="single-contact d-flex">
							<i class="icon-contract"></i>
							<p>office@yourbusiness.com</p>
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
						All rights reserved | This template is made with <i
							class="fa fa-heart-o" aria-hidden="true"></i> by <a
							href="https://colorlib.com" target="_blank">Colorlib</a>
						<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
					</p>
				</div>
			</div>
		</div>
	</div>
	</footer>
	<!-- ##### Footer Area Start ##### -->

	<!-- ##### All Javascript Script ##### -->
	<!-- jQuery-2.2.4 js -->
	<script
		src="<c:url value='/res/design/js/jquery/jquery-2.2.4.min.js'></c:url>"></script>

	<!-- Popper js -->
	<script
		src="<c:url value='/res/design/js/bootstrap/popper.min.js'></c:url>"></script>

	<!-- Bootstrap js -->
	<script
		src="<c:url value='/res/design/js/bootstrap/bootstrap.min.js'></c:url>">
		
	</script>

	<!-- All Plugins js -->
	<script src="<c:url value='/res/design/js/plugins/plugins.js'></c:url>"></script>

	<!-- Active js -->
	<script src="<c:url value='/res/design/js/active.js'></c:url>"></script>

	<!-- Google Maps -->
	<script
		src="<c:url value='/res/design/https://maps.googleapis.com/maps/api/js?key=AIzaSyAwuyLRa1uKNtbgx6xAJVmWy-zADgegA2s'></c:url>"></script>
	<script
		src="<c:url value='/res/design/js/google-map/map-active.js'></c:url>"></script>
</body>
</html>