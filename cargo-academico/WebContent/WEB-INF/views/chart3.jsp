<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript">
window.onload = function() {
	
var dps = [[]];
var chart = new CanvasJS.Chart("chartContainer", {
	theme: "light2",
	title: {
		text: "Developer Work Week"    
	},
	subtitles: [{
		text: "Median hours/week"
	}],
	legend: {
		cursor: "pointer",
		itemclick: explodeSlice
	},
	data: [{
		type: "doughnut",
		showInLegend: true,
		indexLabelPlacement: "inside",
		indexLabelFontColor: "#111",
		indexLabel: "{y}\%",
		yValueFormatString: "#,##0.0#\"%\"",
		dataPoints: dps[0]
	}]
});
 
var yValue;
var name;
 
<c:forEach items="${dataPointsList}" var="dataPoints" varStatus="loop">
	<c:forEach items="${dataPoints}" var="dataPoint">
		yValue = parseFloat("${dataPoint.y}");
		name = "${dataPoint.name}";
		dps[parseInt("${loop.index}")].push({
			name : name,
			y : yValue
		});
	</c:forEach>
</c:forEach>
 
chart.render();
 
function explodeSlice(e) {
	if (typeof (e.dataSeries.dataPoints[e.dataPointIndex].exploded) === "undefined" || !e.dataSeries.dataPoints[e.dataPointIndex].exploded) {
		e.dataSeries.dataPoints[e.dataPointIndex].exploded = true;
	} else {
		e.dataSeries.dataPoints[e.dataPointIndex].exploded = false;
	}
	e.chart.render();
}
 
}
</script>
</head>
<body>
<div id="chartContainer" style="height: 370px; width: 100%;"></div>
<script src="https://canvasjs.com/assets/script/canvasjs.min.js"></script>
</body>
</html> 