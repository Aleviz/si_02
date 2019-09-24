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
var nota = "Mostrar Carreras";

var obtenerFF = [];

// PARA INSERTAR LAS COORDENADAS DEL MAPA EN EL MAPA
var map = L.map('mapa').setView([ z, -x ], y);

// PARA AGREGAR LOS DERECHOS DE AUTOR AL MAPA
L.tileLayer(
				'https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png ',
		{
					attribution : '© <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors ' +'|| made by Aleviz'
				}).addTo(map);


//*************************************************************
var btn = '<button id="editar" >que p2</button>';

var iconoss = L.icon({
	iconUrl: 'res/design/svg/facultad.svg',
	iconSize: [30,75],
});


var confirmacion;
var mensaje = [ "El mapa se modificara, ¿continuar?",
		"estas seguro de agregar un marcador aca, ¿continuar?",
		"Los datos se guardaran, ¿continuar?" ];
var afirmar = true;
var lat;
var lon;
var nameFacultad;
var nameCarrera;
var nameCampus;
var funci = $("#funciones");

var stateChangingButton = new L.easyButton({
    states: [{
            stateName: 'editar',        // name the state
            id: 'nkop',
            icon:      'fa-tree',               // and define its properties
            title:     'editar',      // like its title
            onClick: function(btn, map) {   // and its callback
          
            	
            	if(afirmar){
            	map.on('click', function(e) {

    				console.log(afirmar);
    				if (afirmar == true) {
    					console.log()
    					idm = e.target._leaflet_id;
    					lat = e.latlng.lat;
    					lon = e.latlng.lng;
    					console.log("lat ======== "+lat);
    					console.log("lon ======== "+lon);
    					
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
}
            	
                console.log("distes click en editar y cambia el boton a finalizar");
                btn.state('finalizar');    // change state on click!
                afirmar = true;
                console.log(afirmar);            
            }
    
    
        }, {
            stateName: 'finalizar',
            icon:      'fa-university',
            title:     'finalizar',
            onClick: function(btn) {
            	afirmar = false;
			     
                console.log("distes click en finalizar y cambia el boton a editar");               
                btn.state('editar');    // change state on click!


            }
    }]
});

stateChangingButton.addTo(map);

//****************************************************************************


var x = [];
var jaja = [];
var iconos = L.icon({
	iconUrl: 'res/design/svg/facultad.svg',
	iconSize: [30,75],
});
//------------------------------------------------------------




var geojsonFeaturePolygon = [
	  {
	    "type": "Feature",
	    "properties": {
	        "tipo": "Polígono"
	    },
	    "geometry": {
	      "type": "Polygon",
	      "coordinates": [
	        [
	          [
	        	  -89.2060830207032,
	        	  13.715267703483761
	          ],
	          [
	        	  -89.20567448390554,
	        	  13.719707822751698
	          ],
	          [
	        	  -89.20567503479154,
	        	 13.719756462024524
	          ],
	          [
	        	 -89.20560198312789,
	        	13.720003132866195
	          ],
	          [
	        	 -89.20560562915132,
	        	 13.720001395775455
	          ],
	          
	          
	          
	          [
	        	  -89.20539626268094,
	        	  13.720253277616465
	          ],
	          [
	        	  -89.20515468607883,
	        	 13.720378349891604
	          ],
	          [
	        	  -89.20492384621461,
	        	 13.720466942712843

	          ],
	          
	          [
	        	 - 89.2040434337092,
	        	  13.720866478536665

	          ],
	          
	          
	          //-----------------------------------------------------------
	          
	          	  [
	          		-89.20402220355383,		        	 
	          		13.720882832326467		          
	          	  ],	          
		          
		          [
		        	  -89.20400071276828,
		        	  13.72089846632256

		          ],
		          
		          [
		        	  -89.20398459467911,
		        	  13.720914100317607
		          ],
		          
		          [
		        	  -89.20395773119719,
		        	  13.720934945642725

		          ],
		          
		          [
		        	 -89.20393477785116,
		        	 13.720953085592697

		          ],          

	          	  [
		        	 -89.20390791436981,
		        	13.72098956490439

		          ],
		          
		          [
		        	  -89.20389716897724,
		     		   13.721026044210408
		          ],
		          
		          [
		        	  -89.20388105088841,
		        	 13.721062523510739

		          ],
		          [
		        	  -89.20387030549587,
		        	  13.721119848114112

		          ],
		          [
		        	  -89.20368348140838,
		        	  13.72199299223959

		          ],
		          
		          [
		        	  -89.20368368061018,
		        	  13.72201123183937

		          ],[
		        	  -89.20367830791412,
		        	  13.722037288373654

		          ],[
		        	  -89.20367293521807,
		        	  13.722058133599003

		          ],[
		        	  -89.20366218982599,
		        	  13.72208419012807

		          ],[
		        	  -89.20365681712995,
		        	  13.722105035349246

		          ],
//////////////////////////////
		          [
		        	  -89.20364465861925,
		        	  13.722137345477982

		          ],
		          [
		        	  -89.20362858303619,
		        	  13.722168613301953

		          ],
		          [
		        	  -89.20362322450848,
		        	  13.722199881121778

		          ],
		          [
		        	  -89.20360179039774,
		        	  13.722231148937428

		          ],
		          [
		        	  -89.20358571481468,
		        	  13.722262416748919

		          ],
		          [
		        	  -89.20358035628699,
		        	  13.722298895857055

		          ],
		          [
		        	  -89.20356428070393,
		        	  13.722340586259408

		          ],
		          [
		        	  -89.20354820512088,
		        	  13.722382276654356

		          ],
		          [
		        	  -89.20353748806548,
		        	  13.722418755743854

		          ],
		          [
		        	  -89.2035214124824,
		        	  13.722476080015891

		          ],
		          [
		        	  -89.20350533689935,
		        	  13.722522981682602

		          ],
		          [
		        	  -89.20346782720551,
		        	  13.722648052747997

		          ],
		          [
		        	  -89.20321466858144,
		        	  13.72331628840114

		          ],
	          //////////////////
	          [
	        	  -89.20308795444873,
	        	  13.723372421277634

	          ],
	          [
	        	  -89.2030129350611,
	        	  13.723393266384361

	          ],
	          [
	        	  -89.2029700668396,
	        	  13.723393266384361

	          ],
	          [
	        	  -89.20291648156271,
	        	  13.723403688937017

	          ],
	          [
	        	  -89.20286289628582,
	        	  13.723382843831233

	          ],
	          [
	        	  -89.20282002806431,
	        	  13.723361998723565

	          ],
	          [
	        	  -89.20275572573205,
	        	  13.723341153614065

	          ],
	          [
	        	  -89.20188650206266,
	        	  13.722968025967873

	          ],
	          //////
	          [
	        	  -89.20186386843444,
	        	  13.72297879587365

	          ],
	          [
	        	  -89.20184241278186,
	        	  13.72297879587365

	          ],
	          [
	        	  -89.20182095712929,
	        	  13.72297879587365

	          ],
	          [
	        	  -89.20179413756357,
	        	  13.72297879587365

	          ],
	          [
	        	  -89.20176731799785,
	        	  13.722968373302102

	          ],
	          [
	        	  -89.20172440669272,
	        	  13.722957950730095

	          ],
	          [
	        	  -89.20167613147441,
	        	  13.722942316871224

	          ],
	          [
	        	  -89.20165467582184,
	        	  13.722942316871224

	          ],
	          [
	        	  -89.20162249234299,
	        	  13.722937105584705

	          ],
	          [
	        	  -89.20158494495097,
	        	  13.722931894298059

	          ],
	          [
	        	  -89.20154739755898,
	        	  13.722931894298059

	          ],
	          [
	        	  -89.20149375842753,
	        	  13.722926683011298

	          ],
	          [
	        	  -89.20134893277266,
	        	  13.722916260437446

	          ],
	          [
	        	  -89.20124701842295,
	        	  13.72291104915034

	          ],
	          [
	        	  -89.2000256545123,
	        	  13.722818983032594

	          ],
	          [
	        	  -89.1999343589334,
	        	  13.722808560453958

	          ],
	          [
	        	  -89.19981635284424,
	        	  13.722787715295274

	          ],
	          [
	        	  -89.19971980240769,
	        	  13.722756447553794

	          ],
	          //
	          [
	        	  -89.1996447656856,
	        	  13.72272517980814

	          ],
	          [
	        	  -89.19958039872786,
	        	  13.72267827818185

	          ],
	          [
	        	  -89.1995213956833,
	        	  13.722605320077875

	          ],
	          [
	        	  -89.19946239263872,
	        	  13.722532361951217

	          ],
	          [
	        	  -89.19942484524672,
	        	  13.722459403801864

	          ],
	          [
	        	  -89.19939266176786,
	        	  13.722376023031966

	          ],
	          //
	          [
	        	  -89.19940336081564,
	        	  13.722349966535313

	          ],
	          [
	        	  -89.19939799690248,
	        	  13.722271797027942

	          ],
	          [
	        	  -89.19940336081564,
	        	  13.722183204888106

	          ],
	          [
	        	  -89.1994248164682,
	        	  13.722110246630193

	          ],
	          
	          [
	        	  -89.2000898740432,
	        	  13.719718245468076

	          ],
	          //
	          [
	        	  -89.20010619298151,
	        	  13.719561904673965

	          ],
	          [
	        	  -89.20013837646039,
	        	  13.719447254692103

	          ],
	          [
	        	  -89.20017592385238,
	        	  13.719322181920733

	          ],
	          [
	        	  -89.20020810733124,
	        	  13.719191897713015

	          ],
	          [
	        	  -89.20021883515751,
	        	  13.719103304410458

	          ],
	          [
	        	  -89.2002510186364,
	        	  13.719004288326841

	          ],
	          [
	        	  -89.20026174646266,
	        	  13.718910483577515

	          ],
	          [
	        	  -89.20028320211524,
	        	  13.718821890168739

	          ],
	          [
	        	  -89.2003046577678,
	        	  13.7187228739664

	          ],
	          [
	        	  -89.20031002168096,
	        	  13.718629069104596

	          ],
	          [
	        	  -89.20031538559411,
	        	  13.718545686973753

	          ],
	          ////
	          [
	        	  -89.20033621114845,
	        	  13.718352865682709

	          ],
	          [
	        	  -89.20034693897475,
	        	  13.718217369545567

	          ],
	          [
	        	  -89.20032548332216,
	        	  13.718081873330235

	          ],
	          [
	        	  -89.2003040276696,
	        	  13.717956799831256

	          ],
	          [
	        	  -89.20026111636444,
	        	  13.717790035062283

	          ],
	          [
	        	  -89.20021820505929,
	        	  13.717602424555547

	          ],
	          [
	        	  -89.20019674940671,
	        	  13.717466927985228

	          ],
	          [
	        	  -89.20016456592784,
	        	  13.717289740044459

	          ],
	          //
	          [
	        	  -89.20015435510524,
	        	  13.717164666123383

	          ],
	          [
	        	  -89.20018653858409,
	        	  13.716977055116816

	          ],
	          [
	        	  -89.20024017771554,
	        	  13.71683113534138

	          ],
	          [
	        	  -89.20030454467326,
	        	  13.716716484025632

	          ],
	          [
	        	  -89.20033672815212,
	        	  13.716643524068258

	          ],
	          [
	        	  -89.20037963945727,
	        	  13.71658098694389

	          ],
	          [
	        	  -89.20522847052182,
	        	  13.71519474307611

	          ],
	          //
	          [
	        	  -89.20533642836179,
	        	  13.715153051404423

	          ],
	          [
	        	  -89.20582454445783,
	        	  13.71508009096114

	          ],
	          [
	        	  -89.20596400619957,
	        	  13.715132205565801

	          ],
	          [
	        	  -89.20602837315731,
	        	  13.715163474323035

	          ],
	          [
	        	  -89.20606592054929,
	        	  13.715199954534558

	          ]
	        ]
	      ]
	    }
	  }
	];
var color = {
		radius:8,
		fillColor: "#850000",
		color: "#D75151"
}
var polygon = new L.geoJson(geojsonFeaturePolygon, color).addTo(map);

//-----------------------------------------------------------------------------------------------

// PARA AGREGAR EL MARCADOR
for (var i = 0; i < lat.length; i++) {
	var idd = id[i];
	var marker = {};
	marker = new L.marker([ lat[i], -lon[i] ], {icon: iconos}).bindPopup(asd[i]+" "+"<button class='h button button1' value='"+asd[i]+"'></button>")
	.addTo(map);
	
	
	// PARA AGREGARLO AL ARRAY
	x.push(marker);
	obtenerFF = document.getElementsByClassName('obtenerF').item(i).innerHTML;

	jaja.push(obtenerFF);

}



//*****************************************************************************
//*****************************************************************************
// PARA MODIFICAR EL MAPA

$(document).ready(function() {
	$.getScript("res/design/js/mapa.js");

	$('#showCarreras').hide();
	$('.atras').hide();
	$('#mapa2').hide();
	$('#showCampus').hide();

	
	//--------------------------------------------------------------------------
	// ESTO ES PARA QUE LOS MARCADORES puedan redirigir tambien a las facultades
	map.on('popupopen', function(e) {
		console.log("hola " + e.popup._content);
		console.log("hola e" + e);
		var facultadName = e.popup._content;
		$('.h').text(nota);
				
		$('.h').click(function(e){
	
			nameFacultad = $('.h').val();
			console.log("nameFacultad == "+nameFacultad);
			
			
			$.ajax({
				type : 'GET',
				timeout: 5000,
				url : 'api/ajaxrest/obtenerFacultad/' + nameFacultad,
//				dataType : 'json',
				contentType : 'application/json',
				success : function(result) {
					resultado = result;
					
					console.log("resulttt = "+ resultado);
					console.log("result = "+ resultado[0].nombreEscuela);
					
					var h ='';
					var h2='';
					var h3 ='';
					var hh ='';
					for (var i = 0; i < result.length; i++) {									
						hh += "<a class='obtenerCs'> <label class='es nombreFacultadd' style='font-weight: bold;'>"+resultado[i].nombreEscuela+"</label></a>";
						hh+= "<p class='tel'>"+resultado[i].telefono+"</p>";
						hh+= "<p class='ubic'>"+resultado[i].direccion+"</p>";
						hh += '<hr/>';
					}
					console.log(hh);
					
					$('#nombreFacultad').text(nameFacultad);
					$('#id').html(hh);

					
					$('#mapa2').hide();
					$('#showCampus').hide();
					$('#showFacultad').hide();
					$('#showCarreras').show();
					$('.atras').show();
					
				},
			
			error:function (xhr, ajaxOptions, thrownError){
				console.log("************************************");
		        alert(xhr.status);
		        alert(xhr.statusText);
		        alert(xhr.responseText);
		        alert(thrownError);	        
//					console.log("result = "+(xhr.status);
				console.log("xhr.statusText = "+xhr.statusText);
				console.log("xhr.responseText = "+xhr.responseText);
				console.log("************************************");
			}
			});


			


		});

	});
	// ------------------------------------------------------

	// ----------------------------------------------------

	$('#showFacultad').show(function() {
		$('#showCarreras').hide();
		$('.atras').hide();
	});
	
	
	
	// PARA LA PARTE DEL PANEL DE DIV
	$('#showFacultad').show(function() {
		$('#showCarreras').hide();
		$('.atras').hide();
	});

	$('.obtenerFx').click(function(e) {

		var ax = e.delegateTarget;
		nameFacultad = ax.text;
		var resultado;
		console.log("************************************");
		console.log(nameFacultad);
		console.log("************************************");

		$.ajax({
			type : 'GET',
			timeout: 5000,
			url : 'api/ajaxrest/obtenerFacultad/' + nameFacultad,
//			dataType : 'json',
			contentType : 'application/json',
			success : function(result) {
				resultado = result;
				
				console.log("resulttt = "+ resultado);
				console.log("result = "+ resultado[0].nombreEscuela);
				
				var h ='';
				var h2='';
				var h3 ='';
				var hh ='';
				
				for (var i = 0; i < result.length; i++) {									
					hh += "<a class='obtenerCs'> <label class='es nombreFacultadd' style='font-weight: bold;'>"+resultado[i].nombreEscuela+"</label></a>";
					hh+= "<p class='tel'>"+resultado[i].telefono+"</p>";
					hh+= "<p class='ubic'>"+resultado[i].direccion+"</p>";
					hh += '<hr/>';
				}
				console.log(hh);
				
				$('#nombreFacultad').text(nameFacultad);
				$('#id').html(hh);
	
				$('#mapa2').hide();
				$('#showCampus').hide();
				$('#showFacultad').hide();
				$('#showCarreras').show();
				$('.atras').show();
				
				//--------------------------------------------------para mostrar carrera-------------------
				
				$('.obtenerCs').click(function(e){
					var obtenerCrs = e.delegateTarget;
					nameCarrera = obtenerCrs.text; 
					console.log(nameCarrera);
					
					
					
					$.ajax({
						type : 'GET',
						timeout: 5000,
						url : 'api/ajaxrest/obtenerCarrera/' + nameCarrera,
//						dataType : 'json',
						contentType : 'application/json',
						success : function(result) {
							resultado = result;
							console.log("resultttCarrera = "+ resultado[0].nombreEscuela);
							
							
							$('#mapa2').show();
							$('#mapa').hide();
							$('#showCampus').hide();
							$('#showFacultad').hide();
							$('#showCarreras').show();
							$('.atras').show();
							
							$('.atras').click(function() {
								$('#mapa').show();
								$('#mapa2').hide();
								$('#showCampus').hide();
								$('#showFacultad').show();
								$('#showCarreras').hide();
								$('.atras').hide();
							});
							
						},
					
					error:function (xhr, ajaxOptions, thrownError){
						console.log("************************************");
				        alert(xhr.status);
				        alert(xhr.statusText);
				        alert(xhr.responseText);
				        alert(thrownError);	        
//							console.log("result = "+(xhr.status);
						console.log("xhr.statusText = "+xhr.statusText);
						console.log("xhr.responseText = "+xhr.responseText);
						console.log("************************************");
					}
					});
					
				});
				
				
				//------------------------------------------------------------
				
			},
		
		error:function (xhr, ajaxOptions, thrownError){
			console.log("************************************");
	        alert(xhr.status);
	        alert(xhr.statusText);
	        alert(xhr.responseText);
	        alert(thrownError);	        
//				console.log("result = "+(xhr.status);
			console.log("xhr.statusText = "+xhr.statusText);
			console.log("xhr.responseText = "+xhr.responseText);
			console.log("************************************");
		}
		});

		
	
	});


	
	
	

	// ----------------------------------------------------


	// PARA LA EDICION DEL MAPA

	$('#editarr').click(function() {
		confirmacion = confirm(mensaje[0]);

		if (confirmacion == true) {
			$('#editar').hide();
			$('#finalizar').show();

			map.on('click', function(e) {
				afirmar = confirm(mensaje[1]);
				if (afirmar == true) {
					console.log()
					idm = e.target._leaflet_id;
					lat = e.latlng.lat;
					lon = e.latlng.lng;
					console.log("lat ======== "+lat);
					console.log("lon ======== "+lon);
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
