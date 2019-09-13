package com.cargoacademico.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.ui.Model;
import com.cargoacademico.model.Campus;
import com.cargoacademico.model.Coordenadas;
import com.cargoacademico.model.Empleado;
import com.cargoacademico.model.Escuela;
import com.cargoacademico.model.Facultad;
import com.cargoacademico.service.EscuelaService;
import com.cargoacademico.service.GeografiaService;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class GeografiaController {

	@Autowired
	private GeografiaService geografiaService;

	@Autowired
	private EscuelaService esService;

	@RequestMapping("/contacto")
	public String showContacto(Model model, @ModelAttribute("idFF") String nombreCarrera) {

		ObjectMapper mapper = new ObjectMapper();

		List<Facultad> facultadList = geografiaService.allFacultad();
		Facultad facultad = new Facultad();
		List<Campus> campusList = geografiaService.allCampus();
		Campus campus = new Campus();
		Campus cam = geografiaService.findByIdCp(2);
		List<Coordenadas> coordenadasList = new ArrayList<Coordenadas>();
		coordenadasList = geografiaService.allCoordenadas();

		List<String> listLatitud = new ArrayList<String>();
		List<String> listLongitud = new ArrayList<String>();
		List<String> nombreFacultad = new ArrayList<String>();

		
		
		
		
		
		
		
		
		String n = "";
		Integer idFF = 0;
		List<Facultad> facultades;
		for (int i = 0; i < facultadList.size(); i++) {

			System.out.println("        ---------------------------------         ");
			System.out.println(facultadList.get(i).getFacultad());
			System.out.println("nombreCarrera =*=*=*=*" + nombreCarrera);
			System.out.println("        ---------------------------------         ");

			n = facultadList.get(i).getFacultad();

			if (n.equalsIgnoreCase(nombreCarrera)) {
				System.out.println("SI ENTRO AL IF");

				facultades = geografiaService.findByNameF(nombreCarrera);
				System.out.println("        ---------------------------------         ");
				System.out.println("nombre de la carrera == " + nombreCarrera);
				System.out.println("nombre de la facultad" + facultades.get(0).getFacultad());
				System.out.println("id de la facultad" + facultades.get(0).getIdFacultad());

				idFF = facultades.get(0).getIdFacultad();

				System.out.println("        ---------------------------------         ");
			} else {
				System.out.println("NO ENTRO AL IF(ELSE)");

			}

		}
		System.out.println("xddddddddd " + idFF);
		List<Escuela> escuelas = esService.consultarFacultad(idFF);

		for (int i = 0; i < escuelas.size(); i++) {
			System.out.println("**************************************");
			System.out.println("NOMBRE DE LA CARRERA === " + escuelas.get(i).getNombreEscuela());
			System.out.println("**************************************");
		}

		
		
		
		
		
		
		
		
		
		
		
		String nombre = "";
		for (int i = 0; i < facultadList.size(); i++) {

			Coordenadas cor = facultadList.get(i).getCoordenadas();
			listLatitud.add(cor.getLatitud());

			Coordenadas cord = facultadList.get(i).getCoordenadas();
			listLongitud.add(cord.getLongitud());

			nombre = facultadList.get(i).getFacultad();
			nombreFacultad.add(nombre);

			System.out.println("-------------------------------------------");
			System.out.println("latitud = " + cor.getLatitud());
			System.out.println("longitud = " + cord.getLongitud());
			System.out.println("nombre =  " + nombre);
			System.out.println("-------------------------------------------");

		}

		String jsonLatitud = "";
		try {
			jsonLatitud = mapper.writeValueAsString(listLatitud);
		} catch (Exception e) {
			e.printStackTrace();
		}

		String jsonLongitud = "";
		try {
			jsonLongitud = mapper.writeValueAsString(listLongitud);
		} catch (Exception e) {
			e.printStackTrace();
		}
		String jsonNombre = "";
		try {
			jsonNombre = mapper.writeValueAsString(nombreFacultad);
		} catch (Exception e) {
			e.printStackTrace();
		}

		model.addAttribute("jsonLatitud", jsonLatitud);
		model.addAttribute("jsonLongitud", jsonLongitud);
		model.addAttribute("jsonNombre", jsonNombre);

		System.out.println("LATITUD = " + jsonLatitud);
		System.out.println("LONGITUD =" + jsonLongitud);
		System.out.println("NOMBRE = " + jsonNombre);

		model.addAttribute("coordenadasList", coordenadasList);
		model.addAttribute("facultadList", facultadList);
		model.addAttribute("facultad", facultad);
		model.addAttribute("campusList", campusList);
		model.addAttribute("campus", campus);
		model.addAttribute("campusdir", cam);
		model.addAttribute("es", escuelas);
//		System.out.println("------------------asdasd-----------------------"+escuelaList.size());
		System.out.println("-----------------------------------------" + cam.getTelefono());
		return "contacto";
	}

	// ********************************************************************************************

	@RequestMapping("/Home")
	public String showhome(Model model, @ModelAttribute("mensaje") String mensaje) {

		ObjectMapper mapper = new ObjectMapper();

		List<Facultad> facultadList = geografiaService.allFacultad();
		Facultad facultad = new Facultad();

		List<Campus> campusList = geografiaService.allCampus();
		Campus campus = new Campus();
		Campus cam = geografiaService.findByIdCp(2);
		List<Coordenadas> coordenadasList = new ArrayList<Coordenadas>();
		coordenadasList = geografiaService.allCoordenadas();

		List<String> listLatitud = new ArrayList<String>();
		List<String> listLongitud = new ArrayList<String>();
		List<String> nombreFacultad = new ArrayList<String>();

		String nombre = "";
		for (int i = 0; i < facultadList.size(); i++) {

			Coordenadas cor = facultadList.get(i).getCoordenadas();
			listLatitud.add(cor.getLatitud());

			Coordenadas cord = facultadList.get(i).getCoordenadas();
			listLongitud.add(cord.getLongitud());

			nombre = facultadList.get(i).getFacultad();
			nombreFacultad.add(nombre);

			System.out.println("-------------------------------------------");
			System.out.println("latitud = " + cor.getLatitud());
			System.out.println("longitud = " + cord.getLongitud());
			System.out.println("nombre =  " + nombre);
			System.out.println("-------------------------------------------");

		}

		String jsonLatitud = "";
		try {
			jsonLatitud = mapper.writeValueAsString(listLatitud);
		} catch (Exception e) {
			e.printStackTrace();
		}

		String jsonLongitud = "";
		try {
			jsonLongitud = mapper.writeValueAsString(listLongitud);
		} catch (Exception e) {
			e.printStackTrace();
		}
		String jsonNombre = "";
		try {
			jsonNombre = mapper.writeValueAsString(nombreFacultad);
		} catch (Exception e) {
			e.printStackTrace();
		}

		model.addAttribute("jsonLatitud", jsonLatitud);
		model.addAttribute("jsonLongitud", jsonLongitud);
		model.addAttribute("jsonNombre", jsonNombre);

		System.out.println("LATITUD = " + jsonLatitud);
		System.out.println("LONGITUD =" + jsonLongitud);
		System.out.println("NOMBRE = " + jsonNombre);

		model.addAttribute("coordenadasList", coordenadasList);
		model.addAttribute("facultadList", facultadList);
		model.addAttribute("facultad", facultad);
		model.addAttribute("campusList", campusList);
		model.addAttribute("campus", campus);
		model.addAttribute("campusdir", cam);
		System.out.println("-----------------------------------------" + cam.getTelefono());
		return "Home";
	}

	// ****************************************FACULTAD***********************************

	// GUARDAR FACULTAD

	@RequestMapping(value = "/contacto/facultad/save", method = RequestMethod.POST)
	public String guardarActualizarF(@ModelAttribute("facultad") Facultad facultad, Model model,
			RedirectAttributes ra) {

		Coordenadas coordenadas = new Coordenadas();

		facultad.getCoordenadas().setAltitud("16");

		Empleado empleado = new Empleado();
		empleado.setIdEmpleado(1);
		facultad.setEmpleado(empleado);

		System.out.println("-----------*-*-*-*-*-*-*-*--*-*-*-*--*-**-*-");
		System.out.println("nombre de la facultad : " + facultad.getFacultad() + "  " + "telefono:: "
				+ facultad.getTelefono() + " ubicacion:: " + facultad.getUbicacion() + " campus::"
				+ facultad.getCampus().getIdCampus() + "  coordenada::" + facultad.getCoordenadas().getIdCoordenada()
				+ " latitud ::: " + facultad.getCoordenadas().getLatitud() + " longitud ::: "
				+ facultad.getCoordenadas().getLongitud() + "  altitud  " + facultad.getCoordenadas().getAltitud()
				+ "   empleado  :: " + facultad.getEmpleado().getIdEmpleado());
		geografiaService.saveOrUpdateFacultad(facultad);

		ra.addFlashAttribute("mensaje", "Se han guardado los cambios");

		return "redirect:/contacto";
	}

	// OBTENER ID PARA HACER UPDATE HA FACULTAD

	@RequestMapping("/contacto/facultad/{idFacultad}/update")
	public String findIdF(Model model, @PathVariable("idFacultad") int id) {

		Facultad facultad = geografiaService.findByIdF(id);
		List<Facultad> facultadList = geografiaService.allFacultad();
		model.addAttribute("mensaje", "Materia Lista para Actualizar");
		model.addAttribute("facultadList", facultadList);
		model.addAttribute("facultad", facultad);
		return "contacto";
	}

	// ****************************************CAMPUS***********************************

	// GUARDAR CAMPUS

	@RequestMapping(value = "/contacto/campus/save", method = RequestMethod.POST)
	public String guardarActualizarC(@ModelAttribute("campus") Campus campus,
			@ModelAttribute("coordenada") Coordenadas coordenadas, Model model, RedirectAttributes ra) {

		campus.setCoordenadas(coordenadas);
		geografiaService.saveOrUpdateCampus(campus);
		ra.addFlashAttribute("mensaje", "Se han guardado los cambios");

		return "redirect:/contacto";
	}

	// OBTENER ID PARA HACER UPDATE HA CAMPUS

	@RequestMapping("/contacto/campus/{idCampus}/update")
	public String findIdC(Model model, @PathVariable("idCampus") int id) {

		Campus campus = geografiaService.findByIdCp(id);
		List<Campus> campusList = geografiaService.allCampus();
		model.addAttribute("mensaje", "Materia Lista para Actualizar");
		model.addAttribute("campusList", campusList);
		model.addAttribute("campus", campus);
		return "contacto";
	}

	@RequestMapping("/buscarF/{facultadName}/encontrar")
	public String buscarFacultad(@PathVariable("facultadName") String facultadName, RedirectAttributes ra) {

		String nombre = facultadName;

		ra.addAttribute("idFF", nombre);

		return "redirect:/contacto";
	}
}
