//LAS COORDENADAS DEL MAPA
var z = 13.7178;
var x = 89.2046;
var y = 16;

var latitudBD = document.getElementById('latitud').textContent;
var longitudBD = document.getElementById('longitud').textContent;
var nombreBD = document.getElementById('facultad').textContent;
var id = [1,2,3,4,5,6];

var lat = latitudBD.match(/\d+(?:\.\d+)?/g).map(Number);
var lon = longitudBD.match(/\d+(?:\.\d+)?/g).map(Number);

var asd = JSON.parse(nombreBD);

console.log("NOMBRE ==== " + asd);
console.log("LATITUD ==== " + lat);
console.log("LONGITUD ==== " + lon)

// COORDENADAS DE LOS MARCADORES A MOSTRAR

// PARA INSERTAR LAS COORDENADAS DEL MAPA EN EL MAPA
var map = L.map('mapa').setView([ z, -x ], y);

// PARA AGREGAR LOS DERECHOS DE AUTOR AL MAPA
L
		.tileLayer(
				'https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png',
				{
					attribution : '© <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors'
				}).addTo(map);

var x = [];




map.on(	'click',function(e) {
	console.log("------------------------------");
	console.log(e);
	console.log("------------------------------");
	
	console.log(e.target);
	
	console.log("------------------------------");
	idm = e.target._leaflet_id;
	})

// PARA AGREGAR EL MARCADOR
for (var i = 0; i < lat.length; i++) {
	 var idd = id[i];
var marker ={};
	marker = new L.marker([ lat[i], -lon[i] ]).bindPopup(asd[i]).addTo(map);

	// PARA AGREGARLO AL ARRAY
	x.push(marker);

	console.log("********************");
	console.log("NOMBRE ==== " + asd[i]);
	console.log("LATITUD ==== " + lat[i]);
	console.log("LONGITUD ==== " + lon[i])
	console.log("********************");

	console.log(x[i]);
	map.on('popupopen',function(e) {
		console.log("hola " + e.popup._content);
		$('#2qp').val(e.popup._content);
		$('#myModal').modal("show");
	})
	
}


var confirmacion;
var mensaje = ["El mapa se modificara, ¿continuar?",
	"estas seguro de agregar un marcador aca, ¿continuar?",
	"Los datos se guardaran, ¿continuar?" ];

// PARA MODIFICAR EL MAPA

$(document).ready(function() {
	$.getScript("res/design/js/mapa.js");

	var afirmar;
	var lat;
	var lon;
	$('#finalizar').hide();
	console.log(confirmacion);


	$('#editar').click(function(){
	
		$('#editar').hide();
		$('#finalizar').show();
		confirmacion = confirm(mensaje[0]);

		console.log(confirmacion+ "dio click en editar");
						
		

		
		if (confirmacion == true) {
			console.log("afirmo la edicion")
			
			map.on(	'click',function(e) {
			idm = e.target._leaflet_id;
			lat = e.latlng.lat;
			lon = e.latlng.lng;
	
			 afirmar = confirm(mensaje[1]);


			if (afirmar == true) {
				console.log(afirmar + " se afirmo que ahi quiere el marcador")
				confirmacion = false;
				$('#myModal').modal("show");
				$('#formCampus').hide();
				$('#formFacultad').hide();	

				$('#campus').click(function(){
					$('#formCampus').show();
					$('#formFacultad').hide();
					$('#latitudCampus').val(lat);
					$('#longitudCampus').val(lon);
					
					$('#guardarC').click(function(){
						market = L.marker([	lat,	lon ]).addTo(map);

					});
				});

				$('#facultade').click(function(){
					$('#formFacultad').show();
					$('#formCampus').hide();	
					$('#latitudFacultad').val(lat);
					$('#longitudFacultad').val(lon);	
			
					$('#guardarF').click(function(){
						market = L.marker([	lat,	lon ]).addTo(map);	
						});
				});
			} else {
				console.log("denegado");
				}
			});
			

		$('#finalizar').click(function() {
		var confirmar1 = confirm(mensaje[2]);
			if (confirmar1 == true) {
																			
				$(this).hide();
				$('#editar').show();										
				console.log();							
				} else {
					
					console.log("cambios no guardados");

				}
			
		});

	} else if(confirmacion == false){
		$('#editar').show();
		$('#finalizar').hide();
		console.log("no acepto la edicion");
		
	}

	});
	
	});
			
			
// AL HACER CLICK ESTE RECONOCE DE DONDE ES

	map.on('popupopen',function(e) {
		console.log("hola " + e.popup._content);
		$('#2qp').val(e.popup._content);
		$('#myModal').modal("show");
		$('#facultadfacultad').val(e.popup._content);
	})

