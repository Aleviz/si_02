package com.cargoacademico.reports;


public class EspEmpleado {
	private String unombre;
	private String ccampus;
	private String enombre_edificio;
	private String ffacultad;
	private String eprimer_nombre;
	private String esegundo_nombre;
	private String eprimer_apellido;
	private String esegundo_apellido;
	private String ecarnet;
	private String tdtipo_docente;
	private String efoto;
	private String ulogo;
	

	public EspEmpleado() {
		super();
	}

	public EspEmpleado(String unombre, String ccampus, String enombre_edificio, String ffacultad, String eprimer_nombre,
			String esegundo_nombre, String eprimer_apellido, String esegundo_apellido, String ecarnet,
			String tdtipo_docente, String efoto, String ulogo) {
		super();
		this.unombre = unombre;
		this.ccampus = ccampus;
		this.enombre_edificio = enombre_edificio;
		this.ffacultad = ffacultad;
		this.eprimer_nombre = eprimer_nombre;
		this.esegundo_nombre = esegundo_nombre;
		this.eprimer_apellido = eprimer_apellido;
		this.esegundo_apellido = esegundo_apellido;
		this.ecarnet = ecarnet;
		this.tdtipo_docente = tdtipo_docente;
		this.efoto = efoto;
		this.ulogo = ulogo;
	}
	
	
	public String getUnombre() {
		return unombre;
	}
	public void setUnombre(String unombre) {
		this.unombre = unombre;
	}
	public String getCcampus() {
		return ccampus;
	}
	public void setCcampus(String ccampus) {
		this.ccampus = ccampus;
	}
	public String getEnombre_edificio() {
		return enombre_edificio;
	}
	public void setEnombre_edificio(String enombre_edificio) {
		this.enombre_edificio = enombre_edificio;
	}
	public String getFfacultad() {
		return ffacultad;
	}
	public void setFfacultad(String ffacultad) {
		this.ffacultad = ffacultad;
	}
	public String getEprimer_nombre() {
		return eprimer_nombre;
	}
	public void setEprimer_nombre(String eprimer_nombre) {
		this.eprimer_nombre = eprimer_nombre;
	}
	public String getEsegundo_nombre() {
		return esegundo_nombre;
	}
	public void setEsegundo_nombre(String esegundo_nombre) {
		this.esegundo_nombre = esegundo_nombre;
	}
	public String getEprimer_apellido() {
		return eprimer_apellido;
	}
	public void setEprimer_apellido(String eprimer_apellido) {
		this.eprimer_apellido = eprimer_apellido;
	}
	public String getEsegundo_apellido() {
		return esegundo_apellido;
	}
	public void setEsegundo_apellido(String esegundo_apellido) {
		this.esegundo_apellido = esegundo_apellido;
	}
	public String getEcarnet() {
		return ecarnet;
	}
	public void setEcarnet(String ecarnet) {
		this.ecarnet = ecarnet;
	}
	public String getTdtipo_docente() {
		return tdtipo_docente;
	}
	public void setTdtipo_docente(String tdtipo_docente) {
		this.tdtipo_docente = tdtipo_docente;
	}
	public String getEfoto() {
		return efoto;
	}
	public void setEfoto(String efoto) {
		this.efoto = efoto;
	}
	public String getUlogo() {
		return ulogo;
	}
	public void setUlogo(String ulogo) {
		this.ulogo = ulogo;
	}
	
	
	
}
