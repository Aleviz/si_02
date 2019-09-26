<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spr" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<<<<<<< HEAD:cargo-academico/WebContent/NewFile.jsp
<meta charset="ISO-8859-1">
<title>UNIT - Universidad Innovacion Tecnologica</title>
<link rel="stylesheet" href="/res/design/style.css" type="text/css" />
=======
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
<title>Universidad Innovacion Tecnologica</title>

<!-- Favicon -->
<link rel="icon"
	href="<%=request.getContextPath()%>/res/design/img/core-img/favicon.ico">

<!-- Core Stylesheet -->
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/res/design/style.css">

>>>>>>> Geografico:cargo-academico/WebContent/WEB-INF/views/Home.jsp
</head>

<body>
	<!-- ##### Preloader ##### -->
	<div id="preloader">
		<i class="circle-preloader"></i>
	</div>

	<!-- ##### Header Area Start ##### -->
<<<<<<< HEAD:cargo-academico/WebContent/NewFile.jsp
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
									src="WebContent/resources/design/img/core-img/image.png"
									width="150px"></a>
							</div>
							<div class="login-content">
								<a href="#">Register / Login</a>
							</div>
=======
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
>>>>>>> Geografico:cargo-academico/WebContent/WEB-INF/views/Home.jsp
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
									<li><a href="Home.jsp">Home</a></li>
									<li><a href="about-us.html">About Us</a></li>
									<li><a href="course.html">Course</a></li>
									<li><a href="blog.html">Blog</a></li>
									<li><a href="<c:url value="/contacto"/>">Contact</a></li>
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
							<li><a href="<c:url value="/contacto"/>">Contact</a></li>
						</ul>
					</div>
					<!-- Nav End -->
				</div>

				<!-- Calling Info -->
				<div class="calling-info">
					<div class="call-center">
						<a href="tel:+654563325568889"><i class="icon-telephone-2"></i>
							<span>(503)${campusdir.telefono}</span></a>
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

	<!-- ##### Top Feature Area Start ##### -->
	<div class="top-features-area wow fadeInUp" data-wow-delay="300ms">
		<div class="container">
			<div class="row">
				<div class="col-12">
					<div class="features-content">
						<div class="row no-gutters">
							<!-- Single Top Features -->
							<div class="col-12 col-md-4">
								<div
									class="single-top-features d-flex align-items-center justify-content-center">
									<i class="icon-agenda-1"></i>
									<h5>Online Courses</h5>
								</div>
							</div>
							<!-- Single Top Features -->
							<div class="col-12 col-md-4">
								<div
									class="single-top-features d-flex align-items-center justify-content-center">
									<i class="icon-assistance"></i>
									<h5>Amazing Teachers</h5>
								</div>
							</div>
							<!-- Single Top Features -->
							<div class="col-12 col-md-4">
								<div
									class="single-top-features d-flex align-items-center justify-content-center">
									<i class="icon-telephone-3"></i>
									<h5>Great Support</h5>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- ##### Top Feature Area End ##### -->

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
						<h3>Nuestras Facultades</h3>
					</div>
				</div>
			</div>
			<div class="row">

				<c:forEach var="f" items="${facultadList}">
					<div class="col-12 col-lg-6">
						<div
							class="single-top-popular-course d-flex align-items-center flex-wrap mb-30 wow fadeInUp"
							data-wow-delay="400ms">
							<div class="popular-course-content">
								<h5>${f.facultad }</h5>
								<span> ${f.ubicacion} |<br> ${f.telefono}
								</span>
								<div class="course-ratings">
									<i class="fa fa-star" aria-hidden="true"></i> <i
										class="fa fa-star" aria-hidden="true"></i> <i
										class="fa fa-star" aria-hidden="true"></i> <i
										class="fa fa-star" aria-hidden="true"></i> <i
										class="fa fa-star-o" aria-hidden="true"></i>
								</div>
								<p>Cras vitae turpis lacinia, lacinia lacus non, fermentum
									nisi. Donec et sollicitudin est, in euismod.</p>
								<a href="#" class="btn academy-btn btn-sm">Leer+</a>
							</div>
							<div class="popular-course-thumb bg-img"
								style="background-image: url(<%=request.getContextPath()%>/res/design/img/bg-img/pc-1.jpg);"></div>
						</div>
					</div>
				</c:forEach>

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
								Main: ${campusdir.telefono} <br>Office: 203-808-8648
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

	<!-- Google Maps -->
	<script
		src="<c:url value='/res/design/https://maps.googleapis.com/maps/api/js?key=AIzaSyAwuyLRa1uKNtbgx6xAJVmWy-zADgegA2s'></c:url>"></script>
	<script
		src="<c:url value='/res/design/js/google-map/map-active.js'></c:url>"></script>
</body>
</html>