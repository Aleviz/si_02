<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spr" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<spr:url value="/report" var="reportLink" />
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
<!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->

<!-- Title -->
<title>Academy - Education Course Template</title>

<!-- Favicon -->
<link rel="icon"
	href="<%=request.getContextPath()%>/res/design/img/core-img/favicon.ico">

<!-- Core Stylesheet -->
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/res/design/style.css">

<style>
* {
	box-sizing: border-box
}

body {
	font-family: "Lato", Bahnschrift Light;
}

/* Style the tab */
.tab {
	float: left;
	border: 1px solid #ccc;
	background-color: #f1f1f1;
	width: 30%;
	height: 400px;
}

/* Style the buttons inside the tab */
.tab button {
	display: block;
	background-color: #A5231F;
	color: white;
	padding: 22px 16px;
	width: 100%;
	border: none;
	outline: none;
	text-align: left;
	cursor: pointer;
	font-size: 17px;
}

/* Change background color of buttons on hover */
.tab button:hover {
	background-color: #D52727;
}

/* Create an active/current "tab button" class */
.tab button.active {
	background-color: #000000;
}

/* Style the tab content */
.tabcontent {
	float: left;
	padding: 0px 12px;
	border: 1px solid #ccc;
	width: 50%;
	border-left: none;
	height: 200px;
	display: none;
	color: Blue;
}

/* Clear floats after the tab */
.clearfix::after {
	content: "";
	clear: both;
	display: table;
}
</style>
<!-- Fin de mi estilo -->

</head>
<body>
	<!-- ##### Preloader ##### -->
	<div id="preloader">
		<i class="circle-preloader"></i>
	</div>

	<!-- ##### Header Area Start ##### -->
	<header class="header-area">

		<!-- Top Header Area -->
		<div class="top-header">
			<div class="container h-100">
				<div class="row h-100">
					<div class="col-12 h-100">
						<div
							class="header-content h-100 d-flex align-items-center justify-content-between">
							<div class="academy-logo">
								<a href="index.html"><img
									src="res/design/img/core-img/image.png" width="150px"></a>
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
												<img src="res/design/img/bg-img/bg-1.jpg" alt="">
											</div>
										</div></li>
									<li><a href="about-us.html">About Us</a></li>
									<li><a href="Documentacion.jsp">Documentos</a></li>
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

	<!-- ##### Breadcumb Area Start ##### -->
	<div class="breadcumb-area bg-img"
		style="background-image: url(res/design/img/bg-img/breadcumb.jpg);">
		<div class="bradcumbContent">
			<h2>Documentacion</h2>
		</div>
	</div>
	<!-- ##### Breadcumb Area End ##### -->

	<!-- ##### Documentacion Area Start ##### -->
	<div class="blog-area mt-50 section-padding-100">
		<div class="container">
			<div class="row">
				<div class="col-12 col-md-8">
					<div class="academy-blog-posts">
						<div class="row">

							<!-- Single Blog Start -->
							<div class="col-12">
								<div class="single-blog-post mb-50 wow fadeInUp"
									data-wow-delay="300ms">
									<!-- Post Thumb -->
									<div class="blog-post-thumb mb-50">
										<img src="res/design/img/blog-img/salones.jpg" alt="">
									</div>
									<!-- Post Title -->
									<a class="post-title"> Horario de clases</a>
									<!-- Post Meta -->
									<div class="post-meta">
										<p>
											By <a href="#">Simon Smith</a> | <a href="#">March 18,
												2018</a> | <a href="#">3 comments</a>
										</p>
									</div>
									<!-- Post Excerpt -->
									<form>
										<input type="text" placeholder="nombre profesor">
									</form>
									<!-- Read More btn -->
									<a href="${reportLink}" class="btn academy-btn btn-sm mt-15">Consultar</a>
								</div>
							</div>

							<!-- Single Blog Start -->
							<div class="col-12">
								<div class="single-blog-post mb-50 wow fadeInUp"
									data-wow-delay="400ms">
									<!-- Post Thumb -->
									<div class="blog-post-thumb mb-50">
										<img src="res/design/img/blog-img/3.jpg" alt="">
									</div>
									<!-- Post Title -->
									<a href="#" class="post-title">PENSUM de la facultad</a>
									<!-- Post Meta -->
									<div class="post-meta">
										<p>
											By <a href="#">Simon Smith</a> | <a href="#">March 18,
												2018</a> | <a href="#">3 comments</a>
										</p>
									</div>
									<!-- Post Excerpt -->
									<form action="">
										<select name="Facultad">
											<option value="1">Ingenieria y arquitectura</option>
											<option value="2">Medicina</option>
											<option value="3">Quimica y Farmacia</option>
											<option value="4">Ciencias Naturales y Matematicas</option>
											<option value="5">Ciencias Economicas</option>
										</select>
									</form>
									<!-- Read More btn -->
									<a href="#" class="btn academy-btn btn-sm mt-15">Consultar</a>
								</div>
							</div>

							<!-- Single Blog Start -->
							<div class="col-12">
								<div class="single-blog-post mb-50 wow fadeInUp"
									data-wow-delay="500ms">
									<!-- Post Title -->
									<a href="#" class="post-title">Maya Curricular por Facultad</a>
									<!-- Post Thumb -->
									<div class="blog-post-thumb mb-50">
										<img src="res/design/img/blog-img/2.jpg" alt="">
									</div>

									<!-- Post Meta
									<div class="post-meta">
										<p>
											By <a href="#">Miguel Guadron</a> | <a href="#">March 18,
												2018</a>
										</p>
									</div>-->
									<!-- Post Excerpt -->
									<div class="tab">
										<button class="tablinks"
											onmouseover="openCity(event, 'Ingenieria Industrial')">Ingenieria
											Industrial</button>
										<button class="tablinks"
											onmouseover="openCity(event, 'Ingenieria Electrica')">Ingenieria
											Electrica</button>
										<button class="tablinks"
											onmouseover="openCity(event, 'Ingeniera en Sistemas Informaticos')">Ingeniera
											en Sistemas Informaticos</button>
										<button class="tablinks"
											onmouseover="openCity(event, 'Ingenieria Mecanica')">Ingenieria
											Mecanica</button>
										<button class="tablinks"
											onmouseover="openCity(event, 'Arquitectura')">Arquitectura</button>
									</div>

									<div id="Ingenieria Industrial" class="tabcontent">
										<h3>Descargar</h3>
										<h2>
											<u> <a href="res/pdf/maya_curricular1.pdf"
												download="Maya de IngIn">
													<p>Maya Curricular de Ingenieria industrial</p>
											</a>
											</u>
										</h2>
										<h3>Editar Reporte</h3>

									</div>

									<div id="Ingenieria Electrica" class="tabcontent">
										<h3>Descargar</h3>
										<h2>
											<u> <a href="res/pdf/maya_curricular2.pdf"
												download="Maya de IngIn">
													<p>Maya Curricular de Ingenieria Electrica</p>
											</a>
											</u>
										</h2>
										<h3>Editar Reporte</h3>
									</div>

									<div id="Ingeniera en Sistemas Informaticos" class="tabcontent">
										<h3>Descargar</h3>
										<h2>
											<u> <a href="res/pdf/maya_curricular3.pdf"
												download="Maya de IngIn">
													<p>Maya Curricular de Ingenieria Sistemas Informaticos</p>
											</a>
											</u>
										</h2>
										<h3>Editar Reporte</h3>
									</div>

									<div id="Ingenieria Mecanica" class="tabcontent">
										<h3>Descargar</h3>
										<h2>
											<u> <a href="res/pdf/maya_curricular4.pdf"
												download="Maya de IngIn">
													<p>Maya Curricular de Ingenieria Mecanica</p>
											</a>
											</u>
										</h2>
										<h3>Editar Reporte</h3>
									</div>

									<div id="Arquitectura" class="tabcontent">
										<h3>Descargar</h3>
										<h2>
											<u> <a href="res/pdf/maya_curricular5.pdf"
												download="Maya de IngIn">
													<p>Maya Curricular de Arquitectura</p>
											</a>
											</u>
										</h2>
										<h3>Editar Reporte</h3>
									</div>

									<div class="clearfix"></div>

									<!-- fin -->
								</div>
							</div>

						</div>
					</div>

				</div>

				<div class="col-12 col-md-4">
					<div class="academy-blog-sidebar">
						<!-- Blog Post Widget -->
						<div class="blog-post-search-widget mb-30">
							<form action="#" method="post">
								<input type="search" name="search" id="Search"
									placeholder="Search">
								<button type="submit">
									<i class="fa fa-search" aria-hidden="true"></i>
								</button>
							</form>
						</div>



						<!-- Latest Blog Posts Area -->
						<div class="latest-blog-posts mb-30">
							<h5>Documentos Extras</h5>
							<!-- Single Latest Blog Post -->
							<div class="single-latest-blog-post d-flex mb-30">
								<div class="latest-blog-post-thumb">
									<img src="res/design/img/imgreport/icon-pdf.png" alt="">
								</div>
								<div class="latest-blog-post-content">
									<a href="res/pdf/allempleados_report.pdf"
										download="Todos los Empleados" class="post-title">
										<h6>Empleados</h6>
									</a> <a href="#" class="post-date">March 18, 2018</a>
								</div>
							</div>
							<!-- Single Latest Blog Post -->
							<div class="single-latest-blog-post d-flex mb-30">
								<div class="latest-blog-post-thumb">
									<img src="res/design/img/imgreport/icon-pdf.png" alt="">
								</div>
								<div class="latest-blog-post-content">
									<a href="#" class="post-title">
										<h6>Horarios</h6>
									</a> <a href="#" class="post-date">March 18, 2018</a>
								</div>
							</div>
							<!-- Single Latest Blog Post -->
							<div class="single-latest-blog-post d-flex mb-30">
								<div class="latest-blog-post-thumb">
									<img src="res/design/img/imgreport/icon-pdf.png" alt="">
								</div>
								<div class="latest-blog-post-content">
									<a href="${reportLink}" class="post-title">
										<h6>Carta Didactica</h6>
									</a> <a href="#" class="post-date">March 18, 2018</a>
								</div>
							</div>
							<!-- Single Latest Blog Post -->
							<div class="single-latest-blog-post d-flex">
								<div class="latest-blog-post-thumb">
									<img src="res/design/img/imgreport/icon-pdf.png" alt="">
								</div>
								<div class="latest-blog-post-content">
									<a href="report1.html" target="_blank" class="post-title">
										<h6>Informacion</h6>
									</a> <a href="#" class="post-date">March 18, 2018</a>
								</div>
							</div>
						</div>

						<!-- Add Widget -->


						<!-- Latest Blog Posts Area -->
						<div class="latest-blog-posts mb-30">
							<h5>Estadisticas</h5>
							<!-- Single Latest Blog Post -->
							<div class="single-latest-blog-post d-flex mb-30">
								<div class="latest-blog-post-thumb">
									<img src="res/design/img/imgreport/icon-pdf.png" alt="">
								</div>
								<div class="latest-blog-post-content">
									<a href="#" class="post-title">
										<h6>Grafico de barras</h6>
									</a> <a href="#" class="post-date">March 18, 2018</a>
								</div>
							</div>
							<!-- Single Latest Blog Post -->
							<div class="single-latest-blog-post d-flex mb-30">
								<div class="latest-blog-post-thumb">
									<img src="res/design/img/imgreport/icon-pdf.png" alt="">
								</div>
								<div class="latest-blog-post-content">
									<a href="#" class="post-title">
										<h6>Grafico Circular</h6>
									</a> <a href="#" class="post-date">March 18, 2018</a>
								</div>
							</div>

						</div>


					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- ##### Blog Area End ##### -->

	<!-- ##### Footer Area Start ##### -->
	<footer class="footer-area">
		<div class="main-footer-area section-padding-100-0">
			<div class="container">
				<div class="row">
					<!-- Footer Widget Area -->
					<div class="col-12 col-sm-6 col-lg-3">
						<div class="footer-widget mb-100">
							<div class="widget-title">
								<a href="#"><img src="res/design/img/core-img/logo_1.png"
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
							<div
								class="gallery-list d-flex justify-content-between flex-wrap">
								<a href="img/bg-img/gallery1.jpg" class="gallery-img"
									title="Gallery Image 1"><img
									src="res/design/img/bg-img/gallery1.jpg" alt=""></a> <a
									href="img/bg-img/gallery2.jpg" class="gallery-img"
									title="Gallery Image 2"><img
									src="res/design/img/bg-img/gallery2.jpg" alt=""></a> <a
									href="img/bg-img/gallery3.jpg" class="gallery-img"
									title="Gallery Image 3"><img
									src="res/design/img/bg-img/gallery3.jpg" alt=""></a> <a
									href="img/bg-img/gallery4.jpg" class="gallery-img"
									title="Gallery Image 4"><img
									src="res/design/img/bg-img/gallery4.jpg" alt=""></a> <a
									href="img/bg-img/gallery5.jpg" class="gallery-img"
									title="Gallery Image 5"><img
									src="res/design/img/bg-img/gallery5.jpg" alt=""></a> <a
									href="img/bg-img/gallery6.jpg" class="gallery-img"
									title="Gallery Image 6"><img
									src="res/design/img/bg-img/gallery6.jpg" alt=""></a>
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
	<!-- Moto -->
	<script>
		function openCity(evt, cityName) {
			var i, tabcontent, tablinks;
			tabcontent = document.getElementsByClassName("tabcontent");
			for (i = 0; i < tabcontent.length; i++) {
				tabcontent[i].style.display = "none";
			}
			tablinks = document.getElementsByClassName("tablinks");
			for (i = 0; i < tablinks.length; i++) {
				tablinks[i].className = tablinks[i].className.replace(
						" active", "");
			}
			document.getElementById(cityName).style.display = "block";
			evt.currentTarget.className += " active";
		}
	</script>
	<!-- moto -->

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