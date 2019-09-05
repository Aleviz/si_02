		var longitudBD = [];
		var latitudBD=[];
		var html=

			<c:forEach var="coordenadas" items="${coordenadasList}" varStatus="myStatus">
				longitudBD[${myStatus.index}] = '${coordenadas.longitud}';
				latitudBD[${myStatus.index}] = '${coordenadas.latitud}';
				</c:forEach>


			console.log("hola desde contacto.jsp"+longitudBD);