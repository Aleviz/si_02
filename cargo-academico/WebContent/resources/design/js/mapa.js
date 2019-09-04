
//LAS COORDENADAS DEL MAPA
var z = 13.7178;
var x = 89.2046;
var y = 16;





// COORDENADAS DE LOS MARCADORES A MOSTRAR
var latitud = [ 13.720833473444646, 13.71773270964559, 13.719244011404781,
		13.71693536376167, 13.717248048744832 ];

var longitud = [ -89.20078738470642, -89.20112006142561, -89.20469240889831,
		-89.20529318585116, -89.2046548615063 ];

var facultad = [ "Facultad de Ingenieria y Arquitectura",
		"Facultad de Quimica y Farmacia", "Facultad de Ciencias Naturales",
		"Facultad de Economia", "Facultad de Jurisprudencia" ]


//PARA INSERTAR LAS COORDENADAS DEL MAPA EN EL MAPA
var map = L.map('mapa').setView([ z, -x ], y);


//PARA AGREGAR LOS DERECHOS DE AUTOR AL MAPA
L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png',{
			attribution : '© <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors'
				}).addTo(map);


// PARA AGREGAR EL MARCADOR
for (var i = 0; i < 5; i++) {
	marker = new L.marker([ latitud[i], longitud[i] ]).bindPopup(facultad[i])
			.addTo(map);
}



	
	$('#editar').click(function(){
		
		map.on('click',function(e){
			return confirm("Se añadara un nuevo marcador, ¿Continuar?");
			
			market = L.marker([ e.latlng.lat, e.latlng.lng]).addTo(map);

		
		})
		latitud.push(e.latlng.lat);
		longitud.push(e.latlng.lng);
		
	})






