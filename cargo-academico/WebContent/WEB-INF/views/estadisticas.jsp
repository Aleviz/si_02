<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spr" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<script>
	window.onload = function() {

		var chart = new CanvasJS.Chart("chartContainer", {
			animationEnabled : true,
			theme : "light2", // "light1", "light2", "dark1", "dark2"
			title : {
				text : "GDP Growth Rate - 2016"
			},
			axisY : {
				title : "Growth Rate (in %)",
				suffix : "%",
				includeZero : false
			},
			axisX : {
				title : "Materias"
			},
			data : [ {
				type : "column",
				yValueFormatString : "#,##0.0#\"%\"",
				dataPoints : [ {
					label : "India",
					y : 7.1
				}, {
					label : "China",
					y : 6.70
				}, {
					label : "Indonesia",
					y : 5.00
				}, {
					label : "Australia",
					y : 2.50
				}, {
					label : "Mexico",
					y : 2.30
				}, {
					label : "UK",
					y : 1.80
				}, {
					label : "United States",
					y : 1.60
				}, {
					label : "Japan",
					y : 1.60
				}, {
					label : "El Salvador",
					y : 1.60
				}, {
					label : "El Salvador",
					y : 1.60
				}, {
					label : "El Salvador",
					y : 1.60
				}, {
					label : "El Salvador",
					y : 1.60
				}, {
					label : "El Salvador",
					y : 1.60
				}, {
					label : "El Salvador",
					y : 1.60
				}, {
					label : "El Salvador",
					y : 1.60
				}, {
					label : "El Salvador",
					y : 1.60
				}, {
					label : "El Salvador",
					y : 1.60
				}, {
					label : "El Salvador",
					y : 1.60
				}, {
					label : "El Salvador",
					y : 1.60
				}, {
					label : "El Salvador",
					y : 1.60
				}, {
					label : "El Salvador",
					y : 1.60
				} ]
			} ]
		});
		var chart2 = new CanvasJS.Chart("chartContainer2", {
			theme : "light1", // "light2", "dark1", "dark2"
			animationEnabled : true, // change to true		
			title : {
				text : "Valoración Nota por Materia"
			},
			data : [ {
				// Change type to "bar", "area", "spline", "pie",etc.
				type : "column",
				dataPoints : [
					<c:forEach var="tema" items="${listMaterias}">
					 {
						 label : "${tema.materia}",
							y : ${tema.unidadValorativa}
						},
					</c:forEach>
					  ]
			} ]
		});
		chart.render();
		chart2.render();
		$('#buttonUnidades').click(function() {
			$.ajax({
				type : 'GET',
				url : './unidades',
				dataType : 'json',
				contentType : 'application/json',
				success : function(result) {
					var s = '';
					for (var i = 0; i < result.length; i++) {
						s += '<br/>Id: ' + result[i].idUnidad;
						s += '<br/>Name: ' + result[i].nombreUnidad;
						s += '<br/>objetive: ' + result[i].objetivo;
						s += '<br/>======================';
					}
					$('#result4').html(s);
				}
			});
		});
	}
</script>
<meta name="description" content="">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="res/design/leaflet/leaflet.css" />
<link rel="stylesheet" href="res/bootstrap/css/bootstrap.css"
	type="text/css" />

<!-- Esto es para los ICONOS -->
<script src="res/design/leaflet/leaflet.js"></script>
<script src="https://canvasjs.com/assets/script/canvasjs.min.js"></script>
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
								src="<%=request.getContextPath()%>/res/design/img/core-img/logo.png"
								alt=""></a>
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
											src="${pageContext.request.contextPath}/res/design/img/bg-img/bg-1.jpg"
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

	<!-- ##### Hero Area Start ##### -->
	<section class="hero-area">
	<div class="hero-slides owl-carousel">

		<!-- Single Hero Slide -->
		<div class="single-hero-slide bg-img"
			style="background-image: url(<%=request.getContextPath()%>/res/design/img/bg-img/bg-1.jpg);">
			<div class="container h-100">
				<div class="row h-100 align-items-center">
					<div class="col-12">
						<div class="hero-slides-content">
							<h4 data-animation="fadeInUp" data-delay="100ms">All the
								courses you need</h4>
							<h2 data-animation="fadeInUp" data-delay="400ms">
								Wellcome to our <br>Online University
							</h2>
							<a href="#" class="btn academy-btn" data-animation="fadeInUp"
								data-delay="700ms">Read More</a>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- Single Hero Slide -->
		<div class="single-hero-slide bg-img"
			style="background-image: url(<%=request.getContextPath()%>/res/design/img/bg-img/bg-2.jpg);">
			<div class="container h-100">
				<div class="row h-100 align-items-center">
					<div class="col-12">
						<div class="hero-slides-content">
							<h4 data-animation="fadeInUp" data-delay="100ms">All the
								courses you need</h4>
							<h2 data-animation="fadeInUp" data-delay="400ms">
								Wellcome to our <br>Online University
							</h2>
							<a href="#" class="btn academy-btn" data-animation="fadeInUp"
								data-delay="700ms">Read More</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	</section>
	<!-- ##### Hero Area End ##### -->
	<a href="<%=request.getContextPath()%>/xd">Paginacion</a>

	<div class="row">
		<div class="col-2">
			<div class="nav flex-column nav-pills red-active" id="v-pills-tab"
				role="tablist" aria-orientation="vertical">
				<a class="nav-link active" style="background-color: transparent;"
					id="v-pills-home-tab" data-toggle="pill" href="#v-pills-home"
					role="tab" aria-controls="v-pills-home" aria-selected="true">Materias</a>
				<a class="nav-link" id="v-pills-profile-tab" data-toggle="pill"
					href="#v-pills-profile" role="tab" aria-controls="v-pills-profile"
					aria-selected="false" style="background-color: transparent;">Prueba
					de cards</a> <a class="nav-link" id="v-pills-messages-tab"
					data-toggle="pill" href="#v-pills-messages" role="tab"
					aria-controls="v-pills-messages" aria-selected="false"
					style="background-color: transparent;">Grafica 1</a> <a
					class="nav-link" id="v-pills-settings-tab" data-toggle="pill"
					href="#v-pills-settings" role="tab"
					aria-controls="v-pills-settings" aria-selected="false"
					style="background-color: transparent;">Grafica 2</a>
			</div>
		</div>
		<div class="col-10">
			<div class="tab-content" id="v-pills-tabContent"
				style="margin-top: 20px;">
				<div class="tab-pane fade show active" id="v-pills-home"
					role="tabpanel" aria-labelledby="v-pills-home-tab">
					<div class="container">
						<div class="row">
							<table id="data" class="table table-striped table-bordered"
								style="width: 100%">
								<thead></thead>
								<tbody>
									<tr>
										<c:forEach var="tema" items="${listMaterias}">
											<div class="card" style="width: 21rem;">
												<div class="card-body">
													<h5 style="text-align: center;" class="card-title">${tema.materia}</h5>
													<h6 style="text-align: center;"
														class="card-subtitle mb-2 text-muted">Codigo:
														${tema.codigo}</h6>
													<h6 style="text-align: center;"
														class="card-subtitle mb-2 text-muted">Valoración:
														${tema.unidadValorativa}</h6>
													<did class="row">
													<div class="col-6">
														<a href="#">
															<h6 style="text-align: center;" class="card-subtitle">
																<c:choose>
																	<c:when test="${tema.prerequisito==null}">
																		<a>Pre-requisito: Bachillerato </a>
																	</c:when>
																	<c:otherwise>
																		<a>Pre-requisito: ${tema.prerequisito.materia}</a>
																	</c:otherwise>
																</c:choose>
															</h6>
														</a>
													</div>
													<div class="col-6">
														<a href="#">
															<h6 style="text-align: center;" class="card-subtitle">
																<c:choose>
																	<c:when test="${tema.corequisito==null}">Co-requisito: No posee</c:when>
																	<c:otherwise>Co-requisito: ${tema.corequisito.materia}</c:otherwise>
																</c:choose>
															</h6>
														</a>
													</div>
													</did>
													<p class="card-text">Some quick example text to build
														on the card title and make up the bulk of the card's
														content.</p>
													<a href="#" data-toggle="modal"
														data-target="#exampleModalCenter" class="card-link">Temario</a>
													<a id="buttonUnidades" href="#" data-toggle="modal"
														data-target="#exampleModalCenter1" class="card-link">Unidades</a>
												</div>
											</div>
											<tr>
										</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
				</div>
				<div class="tab-pane fade" id="v-pills-profile" role="tabpanel"
					aria-labelledby="v-pills-profile-tab">
					<div class="container">
						<div class="row">
							<div style="background-color: red;" id="result4">xd</div>
							<div class="card text-white bg-primary mb-3"
								style="max-width: 18rem;">
								<div class="card-header">Header</div>
								<div class="card-body">
									<h5 class="card-title">Primary card title</h5>
									<p class="card-text">Some quick example text to build on
										the card title and make up the bulk of the card's content.</p>
								</div>
							</div>
							<div class="card text-white bg-secondary mb-3"
								style="max-width: 18rem;">
								<div class="card-header">Header</div>
								<div class="card-body">
									<h5 class="card-title">Secondary card title</h5>
									<p class="card-text">Some quick example text to build on
										the card title and make up the bulk of the card's content.</p>
								</div>
							</div>
							<div class="card text-white bg-success mb-3"
								style="max-width: 18rem;">
								<div class="card-header">Header</div>
								<div class="card-body">
									<h5 class="card-title">Success card title</h5>
									<p class="card-text">Some quick example text to build on
										the card title and make up the bulk of the card's content.</p>
								</div>
							</div>
							<div class="card text-white bg-danger mb-3"
								style="max-width: 18rem;">
								<div class="card-header">Header</div>
								<div class="card-body">
									<h5 class="card-title">Danger card title</h5>
									<p class="card-text">Some quick example text to build on
										the card title and make up the bulk of the card's content.</p>
								</div>
							</div>
							<div class="card text-white bg-warning mb-3"
								style="max-width: 18rem;">
								<div class="card-header">Header</div>
								<div class="card-body">
									<h5 class="card-title">Warning card title</h5>
									<p class="card-text">Some quick example text to build on
										the card title and make up the bulk of the card's content.</p>
								</div>
							</div>
							<div class="card text-white bg-info mb-3"
								style="max-width: 18rem;">
								<div class="card-header">Header</div>
								<div class="card-body">
									<h5 class="card-title">Info card title</h5>
									<p class="card-text">Some quick example text to build on
										the card title and make up the bulk of the card's content.</p>
								</div>
							</div>
							<div class="card bg-light mb-3" style="max-width: 18rem;">
								<div class="card-header">Header</div>
								<div class="card-body">
									<h5 class="card-title">Light card title</h5>
									<p class="card-text">Some quick example text to build on
										the card title and make up the bulk of the card's content.</p>
								</div>
							</div>
							<div class="card text-white bg-dark mb-3"
								style="max-width: 18rem;">
								<div class="card-header">Header</div>
								<div class="card-body">
									<h5 class="card-title">Dark card title</h5>
									<p class="card-text">Some quick example text to build on
										the card title and make up the bulk of the card's content.</p>
								</div>
							</div>
						</div>
					</div>
				</div>

				<div class="tab-pane fade" id="v-pills-messages" role="tabpanel"
					aria-labelledby="v-pills-messages-tab">
					<p>Prueba3 xd</p>
					</br>
					<div id="chartContainer2" style="height: 1000px; width: 1100px;"></div>
				</div>
				<div class="tab-pane fade" id="v-pills-settings" role="tabpanel"
					aria-labelledby="v-pills-settings-tab">
					Prueba 4
					<div id="chartContainer" style="height: 370px; width: 100%;"></div>
				</div>
			</div>
		</div>
		<div id="modalPrueba" class="modal fade" id="exampleModalCenter"
			tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle"
			aria-hidden="true">
			<div class="modal-dialog modal-dialog-centered" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<h5 class="modal-title" id="exampleModalLongTitle"
							style="text-align: center;">Temario general</h5>
						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
					</div>
					<div class="modal-body" style="text-align: center;">
						<c:forEach items="${listTemario}" var="te">
							<c:out value="${te.idTemario}" />
							<br />
							<c:out value="${te.nombreTemario}" />
						</c:forEach>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-secondary"
							data-dismiss="modal"
							style="margin-right: 10px; border-radius: 0px;">Close</button>
						<button class="btn academy-btn btn-sm">Save changes</button>
					</div>
				</div>
			</div>
		</div>
		<div class="modal fade" id="exampleModalCenter1" tabindex="-1"
			role="dialog" aria-labelledby="exampleModalCenterTitle"
			aria-hidden="true">
			<div class="modal-dialog modal-dialog-centered" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<h5 class="modal-title" id="exampleModalLongTitle"
							style="text-align: center;">Temario general</h5>
						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
					</div>
					<div class="modal-body" style="text-align: center;">
						<c:forEach items="${listUnidades}" var="uni">
							<c:out value="${uni.nombreUnidad}" />
							<br />
							<c:out value="${uni.objetivo}" />
						</c:forEach>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-secondary"
							data-dismiss="modal"
							style="margin-right: 10px; border-radius: 0px;">Close</button>
						<button class="btn academy-btn btn-sm">Save changes</button>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- ##### Top Feature Area Start ##### -->

	<!-- ##### Course Area Start ##### -->
	<div class="academy-courses-area section-padding-100-0">
		<div class="container">
			<div class="row">
				<!-- Single Course Area -->
				<div class="col-12 col-sm-6 col-lg-4">
					<div
						class="single-course-area d-flex align-items-center mb-100 wow fadeInUp"
						data-wow-delay="300ms">
						<div class="course-icon">
							<i class="icon-id-card"></i>
						</div>
						<div class="course-content">
							<h4>Business School</h4>
							<p>Cras vitae turpis lacinia, lacinia la cus non, fermentum
								nisi.</p>
						</div>
					</div>
				</div>
				<!-- Single Course Area -->
				<div class="col-12 col-sm-6 col-lg-4">
					<div
						class="single-course-area d-flex align-items-center mb-100 wow fadeInUp"
						data-wow-delay="400ms">
						<div class="course-icon">
							<i class="icon-worldwide"></i>
						</div>
						<div class="course-content">
							<h4>Marketing</h4>
							<p>Lacinia, lacinia la cus non, fermen tum nisi.</p>
						</div>
					</div>
				</div>
				<!-- Single Course Area -->
				<div class="col-12 col-sm-6 col-lg-4">
					<div
						class="single-course-area d-flex align-items-center mb-100 wow fadeInUp"
						data-wow-delay="500ms">
						<div class="course-icon">
							<i class="icon-map"></i>
						</div>
						<div class="course-content">
							<h4>Photography</h4>
							<p>Cras vitae turpis lacinia, lacinia la cus non, fermentum
								nisi.</p>
						</div>
					</div>
				</div>
				<!-- Single Course Area -->
				<div class="col-12 col-sm-6 col-lg-4">
					<div
						class="single-course-area d-flex align-items-center mb-100 wow fadeInUp"
						data-wow-delay="600ms">
						<div class="course-icon">
							<i class="icon-like"></i>
						</div>
						<div class="course-content">
							<h4>Social Media</h4>
							<p>Cras vitae turpis lacinia, lacinia la cus non, fermentum
								nisi.</p>
						</div>
					</div>
				</div>
				<!-- Single Course Area -->
				<div class="col-12 col-sm-6 col-lg-4">
					<div
						class="single-course-area d-flex align-items-center mb-100 wow fadeInUp"
						data-wow-delay="700ms">
						<div class="course-icon">
							<i class="icon-responsive"></i>
						</div>
						<div class="course-content">
							<h4>Development</h4>
							<p>Lacinia, lacinia la cus non, fermen tum nisi.</p>
						</div>
					</div>
				</div>
				<!-- Single Course Area -->
				<div class="col-12 col-sm-6 col-lg-4">
					<div
						class="single-course-area d-flex align-items-center mb-100 wow fadeInUp"
						data-wow-delay="800ms">
						<div class="course-icon">
							<i class="icon-message"></i>
						</div>
						<div class="course-content">
							<h4>Design</h4>
							<p>Cras vitae turpis lacinia, lacinia la cus non, fermentum
								nisi.</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- ##### Course Area End ##### -->

	<!-- ##### Testimonials Area Start ##### -->
	<div class="testimonials-area section-padding-100 bg-img bg-overlay"
		style="background-image: url(<%=request.getContextPath()%>/res/design/img/bg-img/bg-2.jpg);">
		<div class="container">
			<div class="row">
				<div class="col-12">
					<div class="section-heading text-center mx-auto white wow fadeInUp"
						data-wow-delay="300ms">
						<span>our testimonials</span>
						<h3>See what our satisfied customers are saying about us</h3>
					</div>
				</div>
			</div>
			<div class="row">
				<!-- Single Testimonials Area -->
				<div class="col-12 col-md-6">
					<div class="single-testimonial-area mb-100 d-flex wow fadeInUp"
						data-wow-delay="400ms">
						<div class="testimonial-thumb">
							<img
								src="<%=request.getContextPath()%>/res/design/img/bg-img/t1.jpg"
								alt="">
						</div>
						<div class="testimonial-content">
							<h5>Great teachers</h5>
							<p>Etiam nec odio vestibulum est mattis effic iturut magna.
								Pellentesque sit amet tellus blandit. Etiam nec odio vestibulum
								est mattis effic iturut magna. Pellentesque sit am et tellus
								blandit. Etiam nec odio vestibul. Etiam nec odio vestibulum est
								mat tis effic iturut magna.</p>
							<h6>
								<span>Maria Smith,</span> Student
							</h6>
						</div>
					</div>
				</div>
				<!-- Single Testimonials Area -->
				<div class="col-12 col-md-6">
					<div class="single-testimonial-area mb-100 d-flex wow fadeInUp"
						data-wow-delay="500ms">
						<div class="testimonial-thumb">
							<img
								src="<%=request.getContextPath()%>/res/design/img/bg-img/t2.jpg"
								alt="">
						</div>
						<div class="testimonial-content">
							<h5>Easy and user friendly courses</h5>
							<p>Retiam nec odio vestibulum est mattis effic iturut magna.
								Pellentesque sit amet tellus blandit. Etiam nec odio vestibulum
								est mattis effic iturut magna. Pellentesque sit am et tellus
								blandit. Etiam nec odio vestibul.</p>
							<h6>
								<span>Shawn Gaines,</span> Student
							</h6>
						</div>
					</div>
				</div>
				<!-- Single Testimonials Area -->
				<div class="col-12 col-md-6">
					<div class="single-testimonial-area mb-100 d-flex wow fadeInUp"
						data-wow-delay="600ms">
						<div class="testimonial-thumb">
							<img
								src="<%=request.getContextPath()%>/res/design/img/bg-img/t3.jpg"
								alt="">
						</div>
						<div class="testimonial-content">
							<h5>I just love the courses here</h5>
							<p>Nec odio vestibulum est mattis effic iturut magna.
								Pellentesque sit am et tellus blandit. Etiam nec odio vestibul.
								Etiam nec odio vestibulum est mat tis effic iturut magna.
								Pellentesque sit amet tellus blandit. Etiam nec odio ves tibul.</p>
							<h6>
								<span>Ross Cooper,</span> Student
							</h6>
						</div>
					</div>
				</div>
				<!-- Single Testimonials Area -->
				<div class="col-12 col-md-6">
					<div class="single-testimonial-area mb-100 d-flex wow fadeInUp"
						data-wow-delay="700ms">
						<div class="testimonial-thumb">
							<img
								src="<%=request.getContextPath()%>/res/design/img/bg-img/t4.jpg"
								alt="">
						</div>
						<div class="testimonial-content">
							<h5>One good academy</h5>
							<p>Vestibulum est mattis effic iturut magna. Pellentesque sit
								am et tellus blandit. Etiam nec odio vestibul. Etiam nec odio
								vestibu lum est mat tis effic iturut magna. Pellentesque sit
								amet tellus blandit. Etiam nec odio ves tibul. Etiam nec odio
								vestibulum est mat tis effic iturut magnaNec odio vestibulum est
								mattis effic iturut magna.</p>
							<h6>
								<span>James Williams,</span> Student
							</h6>
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-12">
					<div class="load-more-btn text-center wow fadeInUp"
						data-wow-delay="800ms">
						<a href="#" class="btn academy-btn">See More</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- ##### Testimonials Area End ##### -->

	<!-- ##### Top Popular Courses Area Start ##### -->
	<div class="top-popular-courses-area section-padding-100-70">
		<div class="container">
			<div class="row">
				<div class="col-12">
					<div class="section-heading text-center mx-auto wow fadeInUp"
						data-wow-delay="300ms">
						<span>The Best</span>
						<h3>Top Popular Courses</h3>
					</div>
				</div>
			</div>
			<div class="row">

				<!-- Single Top Popular Course -->
				<div class="col-12 col-lg-6">
					<div
						class="single-top-popular-course d-flex align-items-center flex-wrap mb-30 wow fadeInUp"
						data-wow-delay="400ms">
						<div class="popular-course-content">
							<h5>Business for begginers</h5>
							<span>By Simon Smith | March 18, 2018</span>
							<div class="course-ratings">
								<i class="fa fa-star" aria-hidden="true"></i> <i
									class="fa fa-star" aria-hidden="true"></i> <i
									class="fa fa-star" aria-hidden="true"></i> <i
									class="fa fa-star" aria-hidden="true"></i> <i
									class="fa fa-star-o" aria-hidden="true"></i>
							</div>
							<p>Cras vitae turpis lacinia, lacinia lacus non, fermentum
								nisi. Donec et sollicitudin est, in euismod.</p>
							<a href="#" class="btn academy-btn btn-sm">See More</a>
						</div>
						<div class="popular-course-thumb bg-img"
							style="background-image: url(<%=request.getContextPath()%>/res/design/img/bg-img/pc-1.jpg);"></div>
					</div>
				</div>

				<!-- Single Top Popular Course -->
				<div class="col-12 col-lg-6">
					<div
						class="single-top-popular-course d-flex align-items-center flex-wrap mb-30 wow fadeInUp"
						data-wow-delay="500ms">
						<div class="popular-course-content">
							<h5>Advanced HTML5</h5>
							<span>By Simon Smith | March 18, 2018</span>
							<div class="course-ratings">
								<i class="fa fa-star" aria-hidden="true"></i> <i
									class="fa fa-star" aria-hidden="true"></i> <i
									class="fa fa-star" aria-hidden="true"></i> <i
									class="fa fa-star" aria-hidden="true"></i> <i
									class="fa fa-star-o" aria-hidden="true"></i>
							</div>
							<p>Cras vitae turpis lacinia, lacinia lacus non, fermentum
								nisi. Donec et sollicitudin est, in euismod.</p>
							<a href="#" class="btn academy-btn btn-sm">See More</a>
						</div>
						<div class="popular-course-thumb bg-img"
							style="background-image: url(res/design/img/bg-img/pc-2.jpg);"></div>
					</div>
				</div>

				<!-- Single Top Popular Course -->
				<div class="col-12 col-lg-6">
					<div
						class="single-top-popular-course d-flex align-items-center flex-wrap mb-30 wow fadeInUp"
						data-wow-delay="600ms">
						<div class="popular-course-content">
							<h5>Marketing 101</h5>
							<span>By Simon Smith | March 18, 2018</span>
							<div class="course-ratings">
								<i class="fa fa-star" aria-hidden="true"></i> <i
									class="fa fa-star" aria-hidden="true"></i> <i
									class="fa fa-star" aria-hidden="true"></i> <i
									class="fa fa-star" aria-hidden="true"></i> <i
									class="fa fa-star-o" aria-hidden="true"></i>
							</div>
							<p>Cras vitae turpis lacinia, lacinia lacus non, fermentum
								nisi. Donec et sollicitudin est, in euismod.</p>
							<a href="#" class="btn academy-btn btn-sm">See More</a>
						</div>
						<div class="popular-course-thumb bg-img"
							style="background-image: url(<%=request.getContextPath()%>/res/design/img/bg-img/pc-3.jpg);"></div>
					</div>
				</div>

				<!-- Single Top Popular Course -->
				<div class="col-12 col-lg-6">
					<div
						class="single-top-popular-course d-flex align-items-center flex-wrap mb-30 wow fadeInUp"
						data-wow-delay="700ms">
						<div class="popular-course-content">
							<h5>Business for begginers</h5>
							<span>By Simon Smith | March 18, 2018</span>
							<div class="course-ratings">
								<i class="fa fa-star" aria-hidden="true"></i> <i
									class="fa fa-star" aria-hidden="true"></i> <i
									class="fa fa-star" aria-hidden="true"></i> <i
									class="fa fa-star" aria-hidden="true"></i> <i
									class="fa fa-star-o" aria-hidden="true"></i>
							</div>
							<p>Cras vitae turpis lacinia, lacinia lacus non, fermentum
								nisi. Donec et sollicitudin est, in euismod.</p>
							<a href="#" class="btn academy-btn btn-sm">See More</a>
						</div>
						<div class="popular-course-thumb bg-img"
							style="background-image: url(<%=request.getContextPath()%>/res/design/img/bg-img/pc-4.jpg);"></div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- ##### Top Popular Courses Area End ##### -->

	<!-- ##### Partner Area Start ##### -->
	<div class="partner-area section-padding-0-100">
		<div class="container">
			<div class="row">
				<div class="col-12">
					<div
						class="partners-logo d-flex align-items-center justify-content-between flex-wrap">
						<a href="#"><img
							src="<%=request.getContextPath()%>/res/design/img/clients-img/partner-1.png"
							alt=""></a> <a href="#"><img
							src="<%=request.getContextPath()%>/res/design/img/clients-img/partner-2.png"
							alt=""></a> <a href="#"><img
							src="<%=request.getContextPath()%>/res/design/img/clients-img/partner-3.png"
							alt=""></a> <a href="#"><img
							src="<%=request.getContextPath()%>/res/design/img/clients-img/partner-4.png"
							alt=""></a> <a href="#"><img
							src="<%=request.getContextPath()%>/res/design/img/clients-img/partner-5.png"
							alt=""></a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- ##### Partner Area End ##### -->

	<!-- ##### CTA Area Start ##### -->
	<div class="call-to-action-area">
		<div class="container">
			<div class="row">
				<div class="col-12">
					<div
						class="cta-content d-flex align-items-center justify-content-between flex-wrap">
						<h3>Do you want to enrole at our Academy? Get in touch!</h3>
						<a href="#" class="btn academy-btn">See More</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- ##### CTA Area End ##### -->

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
								src="<%=request.getContextPath()%>/res/design/img/core-img/logo2.png"
								alt=""></a>
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
								href="<%=request.getContextPath()%>/res/design/img/bg-img/gallery1.jpg"
								class="gallery-img" title="Gallery Image 1"><img
								src="<%=request.getContextPath()%>/res/design/img/bg-img/gallery1.jpg"
								alt=""></a> <a
								href="<%=request.getContextPath()%>/res/design/bg-img/gallery2.jpg"
								class="gallery-img" title="Gallery Image 2"><img
								src="<%=request.getContextPath()%>/res/design/img/bg-img/gallery2.jpg"
								alt=""></a> <a
								href="<%=request.getContextPath()%>/res/design/img/bg-img/gallery3.jpg"
								class="gallery-img" title="Gallery Image 3"><img
								src="<%=request.getContextPath()%>/res/design/img/bg-img/gallery3.jpg"
								alt=""></a> <a
								href="<%=request.getContextPath()%>/res/design/img/bg-img/gallery4.jpg"
								class="gallery-img" title="Gallery Image 4"><img
								src="<%=request.getContextPath()%>/res/design/img/bg-img/gallery4.jpg"
								alt=""></a> <a href="/res/img/bg-img/gallery5.jpg"
								class="gallery-img" title="Gallery Image 5"><img
								src="<%=request.getContextPath()%>/res/design/img/bg-img/gallery5.jpg"
								alt=""></a> <a
								href="<%=request.getContextPath()%>/res/design/img/bg-img/gallery6.jpg"
								class="gallery-img" title="Gallery Image 6"><img
								src="<%=request.getContextPath()%>/res/design/img/bg-img/gallery6.jpg"
								alt=""></a>
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