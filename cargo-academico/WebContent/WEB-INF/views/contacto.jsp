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


<!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->

<!-- Title -->
<title>Academy - Education Course Template</title>

<!-- Favicon -->
<link rel="icon"
	href="<%=request.getContextPath()%>/res/design/img/core-img/favicon.ico">

<!-- Core Stylesheet -->
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/res/design/style.css">


<script type="text/javascript">
$(document).ready(function(){
	console.log("vista");
$('#buttonDemo2').click(function() {
	console.log("dio click");
	var fullName = $('#fullName').val();
	console.log("fullName = "+fullName);
	$.ajax({
		type : 'GET',
		url : '/api/ajaxrest/demo2/' + fullName,
		success : function(result) {
			$('#result2').text(result);
			console.log("chido");
		}
	});
});
});

</script>


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
		<div id="mapa"></div>
		<div style="display: none">

			<p id="latitud">${jsonLatitud}</p>
			<p id="longitud">${jsonLongitud}</p>
			<p id="facultad">${jsonNombre}</p>

		</div>

		<!-- 			ESTO ES PARA ACCIONAR EL MODAL -->
		<!-- 		  <button type="button" class="btn btn-default btn-lg" id="myBtn">Login</button> -->







		<div id="formulario">

						<div class="contact-information wow fadeInUp" data-wow-delay="400ms"
							id="showCarreras">
							<div class="section-heading text-left" id="infCarr">
								<span>Unit</span>								
								<h3 id="nombreFacultad" ></h3> 							
							<div class="izq" id="id">				
							</div>
<button class="atras">ATRAS</button>
							</div>

							<div class="single-contact-info d-flex">
								<div class="contact-icon mr-15">
									<i class="icon-placeholder"></i>
								</div>
								<p>Ubicacion: ${campusdir.ubicacion}</p>


							</div>
							<div class="single-contact-info d-flex">
								<div class="contact-icon mr-15">
									<i class="icon-telephone-1"></i>
								</div>
								<p>
									Telefono: ${campusdir.telefono} <br> Fax: 203-808-8648

								</p>
							</div>
							<div class="single-contact-info d-flex">
								<div class="contact-icon mr-15">
									<i class="icon-contract"></i>
								</div>
								<p>Correo: universidadTeconolica@unit.sv</p>

							</div>
							<c:forEach var="e" items="${es}">
								<div class="single-contact-info d-flex">

									<div class="contact-icon mr-15">
										<i class="icon-contract"></i>
									</div>

									<br>
									<p>carrera: ${e.nombreEscuela}</p>

								</div>
							</c:forEach>


						</div>


			<!-- 	//////////////////////////////////////////////////////////////////////////////////////////// -->
						<div class="contact-information wow fadeInUp" data-wow-delay="400ms" id="showFacultad">
							<div class="section-heading text-left">
								<span>Unit</span>
								<h3>Universidad Nacional de Innovacion Tecnologica</h3>

								<c:forEach var="e" items="${facultadList}">
								
								<div class="izq">  								
								<a class="obtenerFx" >
								<label class="obtenerF nombreFacultadd">${e.facultad}</label>
								</a>
						<p class="tel">${e.telefono}</p>
						<p class="ubic">${e.ubicacion}</p>	
								</div>
								<hr/>								
								</c:forEach>
							</div>
							<div class="single-contact-info d-flex">
								<div class="contact-icon mr-15">
									<i class="icon-placeholder"></i>
								</div>
								<p>Ubicacion: ${campusdir.ubicacion}</p>
							</div>
							<div class="single-contact-info d-flex">
								<div class="contact-icon mr-15">
									<i class="icon-telephone-1"></i>
								</div>
								<p>
									Telefono: ${campusdir.telefono} <br> Fax: 203-808-8648
								</p>
							</div>
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
		</div>
		<!-- ##### Fin formulario ##### -->
	</div>




	<!-- ##### Contact Area End ##### -->


	<!-- ESTO ES PARA QUE APAREZCA EL MODAL -->
	<div class="modal fade" id="myModal" role="dialog">
		<div class="modal-dialog">

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
							<button type="button" class="btn btn-primary" id="campus">Campus</button>
							<br></br>
							<button type="button" class="btn btn-primary"
								style="margin-left: 3px" class="x" id="facultade">Facultad</button>
						</div>
					</center>
					<div>
						<br></br>

					</div>

					<div id="formCampus">
						<sf:form
							action="${pageContext.request.contextPath}/contacto/campus/save"
							method="post" commandName="campus" role="form">

							<div class="form-group">
								<label for="idCampus"> <span
									class="glyphicon glyphicon-user"></span> ID
								</label>
								<sf:input type="text" class="form-control" id="idCampus"
									placeholder="ID " path="idCampus" />
							</div>

							<div class="form-group">
								<label for="campuscampus"><span
									class="glyphicon glyphicon-eye-open"></span> Nombre del Campus</label>
								<sf:input type="text" class="form-control" id="campuscampus"
									path="campus" placeholder="Nombre" />
							</div>

							<div class="form-group">
								<label for="telefono"><span
									class="glyphicon glyphicon-eye-open"></span> Numero Telefónico</label>
								<sf:input type="text" class="form-control" id="telefono"
									path="telefono" placeholder="Telefono" />
							</div>

							<div class="form-group">
								<label for="ubicacion"><span
									class="glyphicon glyphicon-eye-open"></span> Ubicacion</label>
								<sf:input type="text" class="form-control" id="ubicacion"
									path="ubicacion" placeholder="Ubicacion" />
							</div>

							<div class="form-group">
								<label for="latitudCampus"><span
									class="glyphicon glyphicon-eye-open"></span> Latitud</label>
								<sf:input type="text" class="form-control" id="latitudCampus"
									path="coordenadas.latitud" placeholder="Latitud" />
							</div>

							<div class="form-group">
								<label for="longitudCampus"><span
									class="glyphicon glyphicon-eye-open"></span> Longitud</label>
								<sf:input type="text" class="form-control" id="longitudCampus"
									path="coordenadas.longitud" placeholder="Longitud" />
							</div>



							<button type="submit" class="btn btn-success btn-block">
								<span class="glyphicon glyphicon-off" id="guardarC"></span>
								Guardar Cambios
							</button>
						</sf:form>
					</div>


					<div id="formFacultad">
						<sf:form
							action="${pageContext.request.contextPath}/contacto/facultad/save"
							method="post" commandName="facultad" role="form">

							<div class="form-group">
								<label for="idFacultad"><span
									class="glyphicon glyphicon-user"></span> ID</label>
								<sf:input type="text" class="form-control" id="idFacultad"
									placeholder="ID " path="idFacultad" />
							</div>

							<div class="form-group">
								<label for="facultadfacultad"><span
									class="glyphicon glyphicon-eye-open"></span> Nombre de la
									Facultad</label>
								<sf:input type="text" class="form-control" id="facultadfacultad"
									path="facultad" placeholder="Nombre" />
							</div>

							<div class="form-group">
								<label for="telefono"><span
									class="glyphicon glyphicon-eye-open"></span> Numero Telefónico</label>
								<sf:input type="text" class="form-control" id="telefono"
									path="telefono" placeholder="Telefono" />
							</div>


							<div class="form-group">
								<label for="ubicacion"><span
									class="glyphicon glyphicon-eye-open"></span> Ubicacion</label>
								<sf:input type="text" class="form-control" id="ubicacion"
									path="ubicacion" placeholder="Ubicacion" />
							</div>


							<div class="form-group">
								<label for="campusfacultad"><span
									class="glyphicon glyphicon-eye-open"></span> Campus</label>
								<sf:input type="text" class="form-control" id="campusfacultad"
									path="campus.idCampus" placeholder="campus" />
							</div>
							<div class="form-group">
								<label for="latitudFacultad"><span
									class="glyphicon glyphicon-eye-open"></span> Latitud</label>
								<sf:input type="text" class="form-control" id="latitudFacultad"
									path="coordenadas.latitud" placeholder="Latitud" />
							</div>

							<div class="form-group">
								<label for="longitudFacultad"><span
									class="glyphicon glyphicon-eye-open"></span> Longitud</label>
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
	<script type="text/javascript"
		src="<c:url value='/res/design/js/mapa.js'></c:url>"></script>

</body>
</html>
