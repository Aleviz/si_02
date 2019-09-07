
//LAS COORDENADAS DEL MAPA
var z = 13.7178;
var x = 89.2046;
var y = 16;




 var latitudBD = document.getElementById('latitud').textContent;
 var longitudBD = document.getElementById('longitud').textContent;
 var nombreBD = document.getElementById('facultad').textContent;
 
 
 var lat =  latitudBD.match(/\d+(?:\.\d+)?/g).map(Number);
 var lon = longitudBD.match(/\d+(?:\.\d+)?/g).map(Number);

 var asd = JSON.parse(nombreBD);
 
 console.log("NOMBRE ==== "+asd);
 console.log("LATITUD ==== "+lat);
 console.log("LONGITUD ==== "+lon)


// COORDENADAS DE LOS MARCADORES A MOSTRAR




//PARA INSERTAR LAS COORDENADAS DEL MAPA EN EL MAPA
var map = L.map('mapa').setView([ z, -x ], y);


//PARA AGREGAR LOS DERECHOS DE AUTOR AL MAPA
L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png',{
			attribution : '© <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors'
				}).addTo(map);

var x = [];

// PARA AGREGAR EL MARCADOR
for (var i = 0; i < lat.length; i++) {
	
	marker = new L.marker([ lat[i], -lon[i] ]).bindPopup(asd[i])
			.addTo(map);
	
	
	//PARA AGREGARLO AL ARRAY
	x.push(marker);

	
	console.log("********************");
	 console.log("NOMBRE ==== "+asd[i]);
	 console.log("LATITUD ==== "+lat[i]);
	 console.log("LONGITUD ==== "+lon[i])
	 console.log("********************");
	 console.log(x);    
	 

}

// PARA MODIFICAR EL MAPA

$(document).ready(function() { //----------------------x1
	$.getScript("res/design/js/mapa.js");
	$('#finalizar').hide();
	
	var mensaje = ["El mapa se modificara, ¿continuar?",
		"estas seguro de agregar un marcador aca, ¿continuar?",
		"Los datos se guardaran, ¿continuar?" ]
	
	var confirmacion;
	var lat;
	var lon;
	//ACTIVACION DEL BOTON EDITAR
	$('#editar').click(function(){ // ----------------------x2
		
		confirmacion = confirm(mensaje[0]);
		$(this).hide();
		$('#finalizar').show();
		 
		//UN ALERT PARA VER SI EN REALIDAD QUIERE EDITAR O NO QUIERE  ------  x3
		alert(confirmacion);
		if(confirmacion == true){ // ----------------------------x4
			map.on('click',function(e){ //-------------------------x5
			lat = e.latlng.lat;
			lon = e.latlng.lng;
			
			confirmacion = confirm(mensaje[1]);
			
			if(confirmacion == true){ // ---------------------------x6
				$('#myModal').modal("show");
				$('#formCampus').hide();
				$('#formFacultad').hide();
				
				$('#campus').click(function(){ //--------------------------x7
					$('#formCampus').show();
					$('#formFacultad').hide();
					$('#latitudCampus').val(lat);
					$('#longitudCampus').val(lon);
					
					confirmacion = confirm(mensaje[2]);
					
					if(confirmacion)
				}) //---------------------------x7
				
			} // ----------------------------x6
				
				}) // ------------------------------------------------x5
			} //---------------------------------------------------x4
			
		})// -------------------- x3
		
		
	}) // ----------------------x2
	
	
	



// AL HACER CLICK ESTE RECONOCE DE DONDE ES
for(var i = 0 ; i < x.length; i++){
$(x[i]).click(function(e){
 	console.log("hola "+e);
 	$('#2qp').val(e);
	$('#myModal').modal("show");
 })
}

