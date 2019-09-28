package com.cargoacademico.model;

public class UnidadesCopia {
	private Integer idUnidad;
	private String nombreUnidad;
	private String objetivo;
	
	public UnidadesCopia() {

	}
	
	public UnidadesCopia(Integer idUnidad, String nombreUnidad, String objetivo) {
		this.idUnidad = idUnidad;
		this.nombreUnidad = nombreUnidad;
		this.objetivo = objetivo;
	}

	public Integer getIdUnidad() {
		return idUnidad;
	}

	public void setIdUnidad(Integer idUnidad) {
		this.idUnidad = idUnidad;
	}

	public String getNombreUnidad() {
		return nombreUnidad;
	}

	public void setNombreUnidad(String nombreUnidad) {
		this.nombreUnidad = nombreUnidad;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
}
