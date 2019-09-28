package com.cargoacademico.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cargoacademico.model.Campus;
import com.cargoacademico.model.Departamento;
import com.cargoacademico.model.Edificio;
import com.cargoacademico.model.Escuela;
import com.cargoacademico.model.EscuelaEspejo;
import com.cargoacademico.model.Facultad;
import com.cargoacademico.model.Unidad;
import com.cargoacademico.model.UnidadesCopia;
import com.cargoacademico.service.EscuelaService;
import com.cargoacademico.service.GeografiaService;
import com.cargoacademico.service.UnidadService;

@RestController
@RequestMapping("api/ajaxrest")
public class AjaxRestController {

	@Autowired
	private GeografiaService geografiaService;

	private List<Unidad> listUnidades;
	private List<UnidadesCopia> listUniCopia;
	@Autowired
	private UnidadService unidadService;

	@Autowired
	private EscuelaService esService;

	List<Escuela> escuelas;

	@RequestMapping(value = "obtenerCampus/{nameCampus}", method = RequestMethod.GET, produces = {
			MimeTypeUtils.APPLICATION_JSON_VALUE })
	public ResponseEntity<List<EscuelaEspejo>> obtenerCampus(@PathVariable("nameCampus") String nameCampus) {

		System.out.println(nameCampus);
		// -*---------------------------------------------------------------------------------------------------------

		List<EscuelaEspejo> escEList = new ArrayList<EscuelaEspejo>();
		EscuelaEspejo escEsp = new EscuelaEspejo();
		List<Facultad> facultadxCampus = new ArrayList<Facultad>();
		
		Campus campus = geografiaService.findByIdCp(nameCampus);
		System.out.println("idCampus =x= "+campus);
		int idCampus = campus.getIdCampus();
		
		facultadxCampus = geografiaService.findByCampus(idCampus);
		
		
		System.out.println(facultadxCampus.size());
		for(int i=0 ; i< facultadxCampus.size(); i++) {
			

		List<Escuela> escuelaList = new ArrayList<Escuela>();
		escuelaList = esService.findByNameE(nameCampus);
		System.out.println(escuelaList.size());
		for (int i = 0; i < escuelaList.size(); i++) {

			escEsp = new EscuelaEspejo();
			escEsp.setFacultadxCampus(facultadxCampus.get(i).getFacultad());
		escEsp.setCampus(nameCampus);
		escEsp.setTelefonoxFacultad(facultadxCampus.get(i).getTelefono());
		escEsp.setUbicacionxFacultad(facultadxCampus.get(i).getUbicacion());
		escEList.add(escEsp);
			escEsp.setNombreEscuela(escuelaList.get(i).getNombreEscuela());
			escEsp.setDescripcion(escuelaList.get(i).getDescripcion());
			escEsp.setCampoDeAccion(escuelaList.get(i).getCampoDeAccion());
			escEsp.setMision(escuelaList.get(i).getMision());
			escEsp.setVision(escuelaList.get(i).getVision());
			escEsp.setObjetivo(escuelaList.get(i).getObjetivo());
			escEList.add(escEsp);
		}

		try {
			ResponseEntity<List<EscuelaEspejo>> responseEntity = new ResponseEntity<List<EscuelaEspejo>>(escEList,
					HttpStatus.OK);
			return responseEntity;
		} catch (Exception e) {
			System.out.println("ERORRRRR");
			return new ResponseEntity<List<EscuelaEspejo>>(HttpStatus.BAD_REQUEST);
		}

	}

	@RequestMapping(value = "obtenerFacultad/{nameFacultad}", method = RequestMethod.GET, produces = {
			MimeTypeUtils.APPLICATION_JSON_VALUE })
	public ResponseEntity<List<EscuelaEspejo>> obtenerFacultad(@PathVariable("nameFacultad") String nameFacultad) {

		// -*---------------------------------------------------------------------------------------------------------
		List<Facultad> facultadList = geografiaService.allFacultad();
		Escuela escuela;
		String n = "";
		Integer idFF = 0;
		List<Facultad> facultades;
		for (int i = 0; i < facultadList.size(); i++) {

			System.out.println("        ---------------------------------         ");
			System.out.println(facultadList.get(i).getFacultad());
			System.out.println("nombreCarrera =*=*=*=*" + nameFacultad);
			System.out.println("        ---------------------------------         ");

			n = facultadList.get(i).getFacultad();

			if (n.equalsIgnoreCase(nameFacultad)) {
				System.out.println("SI ENTRO AL IF");

				facultades = geografiaService.findByNameF(nameFacultad);
				System.out.println("        ---------------------------------         ");
				System.out.println("nombre de la carrera == " + nameFacultad);
				System.out.println("nombre de la facultad" + facultades.get(0).getFacultad());
				System.out.println("id de la facultad" + facultades.get(0).getIdFacultad());

				idFF = facultades.get(0).getIdFacultad();

				System.out.println("        ---------------------------------         ");
			} else {
				System.out.println("NO ENTRO AL IF(ELSE)");

			}

		}
		System.out.println("a ver el id " + idFF);

		// -*---------------------------------------------------------------------------------------------------------

		EscuelaEspejo escEsp = new EscuelaEspejo();

		List<String> nombreDeCarrera = new ArrayList<String>();
		;
		List<EscuelaEspejo> esList = new ArrayList<EscuelaEspejo>();
		;
		escuelas = esService.consultarFacultad(idFF);
		for (int i = 0; i < escuelas.size(); i++) {

			escEsp = new EscuelaEspejo();

			escEsp.setNombreEscuela(escuelas.get(i).getNombreEscuela());
			escEsp.setDireccion(escuelas.get(i).getDireccion());
//			escEsp.setFacultad(escuelas.get(i).getFacultad().getFacultad());
			escEsp.setTelefono(escuelas.get(i).getTelefono());
			escEsp.setIdEscuela(String.valueOf((escuelas.get(i).getIdEscuela())));

			esList.add(escEsp);

			System.out.println(esList.get(i).getNombreEscuela());
		}

		try {
			ResponseEntity<List<EscuelaEspejo>> responseEntity = new ResponseEntity<List<EscuelaEspejo>>(esList,
					HttpStatus.OK);
			return responseEntity;
		} catch (Exception e) {
			System.out.println("ERORRRRR");
			return new ResponseEntity<List<EscuelaEspejo>>(HttpStatus.BAD_REQUEST);
		}

	}

	// --------------------------------------------------------

	@RequestMapping(value = "obtenerCarrera/{nameCarrera}", method = RequestMethod.GET, produces = {
			MimeTypeUtils.APPLICATION_JSON_VALUE })
	public ResponseEntity<List<EscuelaEspejo>> obtenerCarrera(@PathVariable("nameCarrera") String nameCarrera) {

		// -*---------------------------------------------------------------------------------------------------------

		List<EscuelaEspejo> escEList = new ArrayList<EscuelaEspejo>();
		EscuelaEspejo escEsp = new EscuelaEspejo();

		List<Escuela> escuelaList = new ArrayList<Escuela>();
		escuelaList = esService.findByNameE(nameCarrera);

		System.out.println(escuelaList.size());
		for (int i = 0; i < escuelaList.size(); i++) {

			escEsp = new EscuelaEspejo();
			escEsp.setNombreEscuela(escuelaList.get(i).getNombreEscuela());
			escEsp.setDescripcion(escuelaList.get(i).getDescripcion());
			escEsp.setCampoDeAccion(escuelaList.get(i).getCampoDeAccion());
			escEsp.setMision(escuelaList.get(i).getMision());
			escEsp.setVision(escuelaList.get(i).getVision());
			escEsp.setObjetivo(escuelaList.get(i).getObjetivo());
			escEList.add(escEsp);
		}

		try {
			ResponseEntity<List<EscuelaEspejo>> responseEntity = new ResponseEntity<List<EscuelaEspejo>>(escEList,
					HttpStatus.OK);
			return responseEntity;
		} catch (Exception e) {
			System.out.println("ERORRRRR");
			return new ResponseEntity<List<EscuelaEspejo>>(HttpStatus.BAD_REQUEST);
		}

	}

	@RequestMapping(value = "unidades", method = RequestMethod.GET, produces = { MimeTypeUtils.APPLICATION_JSON_VALUE })
	@ResponseBody
	public ResponseEntity<List<UnidadesCopia>> consultUnidades(Model model) {
		try {
			System.out.println("Entre al metodo");
			listUnidades = unidadService.findAllUnidad();
			UnidadesCopia uniCopia;
			for (Unidad u : listUnidades) {
				uniCopia = new UnidadesCopia();
				System.out.println(u);
				uniCopia.setIdUnidad(u.getIdUnidad());
				uniCopia.setNombreUnidad(u.getNombreUnidad());
				uniCopia.setObjetivo(u.getObjetivo());
				listUniCopia.add(uniCopia);
			}
			model.addAttribute("listUnidades", listUnidades);
			ResponseEntity<List<UnidadesCopia>> responseEntity = new ResponseEntity<List<UnidadesCopia>>(listUniCopia,
					HttpStatus.OK);
			return responseEntity;
		} catch (Exception e) {
			return new ResponseEntity<List<UnidadesCopia>>(HttpStatus.BAD_REQUEST);
		}
	}

}