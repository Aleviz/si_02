<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ajax in Spring MVC</title>


<script type="text/javascript" src='<c:url value="/res/js/jQuery.js" />'></script>





<script type="text/javascript">
	$(document).ready(function() {


		$('#buttonDemo2').click(function() {
			console.log("distes click en el button");
			var fullName = $('#fullName').val();
			console.log("fullName = "+fullName);
			$.ajax({

				type : 'GET',
				timeout: 3000,
				url : 'api/ajaxrest/demo2/' + fullName,
				
				success : function(data, textStatus) {
					console.log("result = "+data);
					console.log("error = "+data);
					$('#result2').text(data);
				},
			
			error:function (xhr, ajaxOptions, thrownError){

		        alert(xhr.status);
		        alert(xhr.statusText);
		        alert(xhr.responseText);
		        alert(thrownError);	        
// 				console.log("result = "+(xhr.status);
				console.log("xhr.statusText = "+xhr.statusText);
				console.log("xhr.responseText = "+xhr.responseText);
		    }
			});
		});


	});
</script>
</head>
<body>


	<fieldset>
		<legend>Demo 2</legend>
		Full Name <input type="text" id="fullName" /> <br /> <input
			type="button" value="Demo 2" id="buttonDemo2" /> <br /> <span
			id="result2"></span>
	</fieldset>



</body>
</html>