package com.cargoacademico.reports;

public class EspMayaCurricular {
	
	private int esidescuela;
	private String esnombreescuela;
	private String estelefono;
	private String esdescripcion;
	private String escampodeaccion;
	private String esmision;
	private String esvision;
	private String esobjectivo;
	private String ffacultad;
	

	public EspMayaCurricular() {
		super();
	}


	public EspMayaCurricular(int esidescuela, String esnombreescuela, String estelefono, String esdescripcion,
			String escampodeaccion, String esmision, String esvision, String esobjectivo, String ffacultad) {
		super();
		this.esidescuela = esidescuela;
		this.esnombreescuela = esnombreescuela;
		this.estelefono = estelefono;
		this.esdescripcion = esdescripcion;
		this.escampodeaccion = escampodeaccion;
		this.esmision = esmision;
		this.esvision = esvision;
		this.esobjectivo = esobjectivo;
		this.ffacultad = ffacultad;
	}
	
	
	public int getEsidescuela() {
		return esidescuela;
	}
	public void setEsidescuela(int esidescuela) {
		this.esidescuela = esidescuela;
	}
	public String getEsnombreescuela() {
		return esnombreescuela;
	}
	public void setEsnombreescuela(String esnombreescuela) {
		this.esnombreescuela = esnombreescuela;
	}
	public String getEstelefono() {
		return estelefono;
	}
	public void setEstelefono(String estelefono) {
		this.estelefono = estelefono;
	}
	public String getEsdescripcion() {
		return esdescripcion;
	}
	public void setEsdescripcion(String esdescripcion) {
		this.esdescripcion = esdescripcion;
	}
	public String getEscampodeaccion() {
		return escampodeaccion;
	}
	public void setEscampodeaccion(String escampodeaccion) {
		this.escampodeaccion = escampodeaccion;
	}
	public String getEsmision() {
		return esmision;
	}
	public void setEsmision(String esmision) {
		this.esmision = esmision;
	}
	public String getEsvision() {
		return esvision;
	}
	public void setEsvision(String esvision) {
		this.esvision = esvision;
	}
	public String getEsobjectivo() {
		return esobjectivo;
	}
	public void setEsobjectivo(String esobjectivo) {
		this.esobjectivo = esobjectivo;
	}
	public String getFfacultad() {
		return ffacultad;
	}
	public void setFfacultad(String ffacultad) {
		this.ffacultad = ffacultad;
	}
	
	
}
