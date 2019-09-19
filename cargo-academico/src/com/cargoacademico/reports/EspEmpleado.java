package com.cargoacademico.reports;


public class EspEmpleado {
	private int cidcampus;
	private String unombre;
	private String ccampus;
	private String ednombre_edificio;
	private String ffacultad;
	private String eprimer_nombre;
	private String esegundo_nombre;
	private String eprimer_apellido;
	private String esegundo_apellido;
	private String ecarnet;
	private String tdtipo_docente;
	
	//moto la bastarda de la programacion
	
	public EspEmpleado() {
		super();
	}
	
	public EspEmpleado(int cidcampus, String unombre, String ccampus, String ednombre_edificio, String ffacultad,
			String eprimer_nombre, String esegundo_nombre, String eprimer_apellido, String esegundo_apellido,
			String ecarnet, String tdtipo_docente) {
		super();
		this.cidcampus = cidcampus;
		this.unombre = unombre;
		this.ccampus = ccampus;
		this.ednombre_edificio = ednombre_edificio;
		this.ffacultad = ffacultad;
		this.eprimer_nombre = eprimer_nombre;
		this.esegundo_nombre = esegundo_nombre;
		this.eprimer_apellido = eprimer_apellido;
		this.esegundo_apellido = esegundo_apellido;
		this.ecarnet = ecarnet;
		this.tdtipo_docente = tdtipo_docente;
	}
	
	public int getCidcampus() {
		return cidcampus;
	}
	public void setCidcampus(int cidcampus) {
		this.cidcampus = cidcampus;
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
	public String getEdnombre_edificio() {
		return ednombre_edificio;
	}
	public void setEdnombre_edificio(String ednombre_edificio) {
		this.ednombre_edificio = ednombre_edificio;
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
	
}
