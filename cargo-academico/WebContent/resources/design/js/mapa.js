//LAS COORDENADAS DEL MAPA
var z = 13.7178;
var x = 89.2046;
var y = 16;

var latitudBD = document.getElementById('latitud').textContent;
var longitudBD = document.getElementById('longitud').textContent;
var nombreBD = document.getElementById('facultad').textContent;
var id = [ 1, 2, 3, 4, 5, 6 ];

var lat = latitudBD.match(/\d+(?:\.\d+)?/g).map(Number);
var lon = longitudBD.match(/\d+(?:\.\d+)?/g).map(Number);

var asd = JSON.parse(nombreBD);

console.log("NOMBRE ==== " + asd);
console.log("LATITUD ==== " + lat);
console.log("LONGITUD ==== " + lon);

var nota = "click aqui";



var obtenerFF = [];
// COORDENADAS DE LOS MARCADORES A MOSTRAR

// PARA INSERTAR LAS COORDENADAS DEL MAPA EN EL MAPA
var map = L.map('mapa').setView([ z, -x ], y);

// PARA AGREGAR LOS DERECHOS DE AUTOR AL MAPA
L.tileLayer(
				'https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png',
				{
					attribution : '© <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors'
				}).addTo(map);

var x = [];
var jaja = [];
var ht = "<a class='h'></a>";

// PARA AGREGAR EL MARCADOR
for (var i = 0; i < lat.length; i++) {
	var idd = id[i];
	var marker = {};
	marker = new L.marker([ lat[i], -lon[i] ]).bindPopup(asd[i]+"/ "+ht)
			.addTo(map);

	
	
	// PARA AGREGARLO AL ARRAY
	x.push(marker);
	obtenerFF = document.getElementsByClassName('obtenerF').item(i).innerHTML;

	jaja.push(obtenerFF);

	console.log("********************");
	console.log("JAJA==== " + jaja[i]);
	console.log("NOMBRE ==== " + asd[i]);
	console.log("LATITUD ==== " + lat[i]);
	console.log("LONGITUD ==== " + lon[i])
	console.log("Facultadesssss === " + obtenerFF);
	console.log("********************");

	console.log(x[i]);

}



//*****************************************************************************

// PARA MODIFICAR EL MAPA

$(document).ready(function() {
	$.getScript("res/design/js/mapa.js");

	

	var confirmacion;
	var mensaje = [ "El mapa se modificara, ¿continuar?",
			"estas seguro de agregar un marcador aca, ¿continuar?",
			"Los datos se guardaran, ¿continuar?" ];
	var afirmar;
	var lat;
	var lon;
	
	
	
	//----------------------------------------------------
	$('#buttonDemo2').click(function() {
		var fullName = $('#fullName').val();
		$.ajax({
			type : 'GET',
			url : '/api/ajaxrest/demo2/' + fullName,
			success : function(result) {
				$('#result2').text(result);
			}
		});
	});
	
	//----------------------------------------------------	
	
	$('#finalizar').hide();
	$('#showFacultad').show(function(){
		$('#showIngenieria').hide();
		$('#showQuimica').hide();
		$('#showJurisprudencia').hide();
	});
	

	$('#fingenieria').click(function(){
		$('#showIngenieria').show();
		
		$('#showQuimica').hide();
		$('#showJurisprudencia').hide();
		$('#showFacultad').hide();
	});


	$('#fquimica').click(function(){
		$('#showQuimica').show();
		
		$('#showIngenieria').hide();
		$('#showJurisprudencia').hide();
		$('#showFacultad').hide();
	});
	
	$('.atras').click(function(){
		$('#showFacultad').show();
		$('#showIngenieria').hide();
		$('#showQuimica').hide();
		$('#showJurisprudencia').hide();
	});
	

	$('#fjurisprudencia').click(function(){
		$('#showJurisprudencia').show();		
		
		$('#showQuimica').hide();
		$('#showJurisprudencia').hide();
		$('#showFacultad').hide();

	});

	console.log(confirmacion);


	$('.obtenerF').hide();
	$('#showCarreras').hide();
	$('.atras').hide();


	
	//--------------------------------------------------------------------------
	// ESTO ES PARA QUE LOS MARCADORES puedan redirigir tambien a las facultades
	map.on('popupopen', function(e) {
		console.log("hola " + e.popup._content);
		console.log("hola e" + e);
		var facultadName = e.popup._content;
		$('.h').text(nota);
		$('.h').attr('href', "buscarF/" + facultadName + "/encontrar")
				
		$('.h').click(function(e){
			$('#showCarreras').show();
			$('#showFacultad').hide();
			$('.atras').show();	
//			break;
			window.onbeforeunload = function(){
				return false;
			};
		});

	});

	// ------------------------------------------------------

	// ----------------------------------------------------

	// PARA LA PARTE DEL PANEL DE DIV
	$('#showFacultad').show(function() {
		$('#showCarreras').hide();
		$('.atras').hide();
	});

	$('#clash').click(function(e) {
		
		$('#showCarreras').show();
		$('#showFacultad').hide();
		$('.atras').show();
	});

	$('.atras').click(function() {
		$('#showFacultad').show();
		$('#showCarreras').hide();
		$('.atras').hide();
	});

	// ----------------------------------------------------


	// PARA LA EDICION DEL MAPA

	$('#editar').click(function() {
		confirmacion = confirm(mensaje[0]);

		if (confirmacion == true) {
			$('#editar').hide();
			$('#finalizar').show();

			map.on('click', function(e) {
				afirmar = confirm(mensaje[1]);
				if (afirmar == true) {
					idm = e.target._leaflet_id;
					lat = e.latlng.lat;
					lon = e.latlng.lng;

					confirmacion = false;
					$('#myModal').modal("show");
					$('#formCampus').hide();
					$('#formFacultad').hide();

					$('#campus').click(function() {
						$('#formCampus').show();
						$('#formFacultad').hide();
						$('#latitudCampus').val(lat);
						$('#longitudCampus').val(lon);

						$('#guardarC').click(function() {
							market = L.marker([ lat, lon ]).addTo(map);
						});
					});

					$('#facultade').click(function() {

						$('#formFacultad').show();
						$('#formCampus').hide();
						$('#latitudFacultad').val(lat);
						$('#longitudFacultad').val(lon);

						$('#guardarF').click(function() {
							market = L.marker([ lat, lon ]).addTo(map);
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

				} else {
					console.log("cambios no guardados");
				}

			});

		} else if (confirmacion == false) {
			$('#editar').show();
			$('#finalizar').hide();
			console.log("no acepto la edicion");
		}

	});
	


});


//*****************************************************************************

