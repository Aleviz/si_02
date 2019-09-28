package com.cargoacademico.model;
// Generated 09-27-2019 01:09:44 PM by Hibernate Tools 5.2.12.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TipoActividad generated by hbm2java
 */
@Entity
@Table(name = "tipo_actividad", catalog = "cargo_academico")
public class TipoActividad implements java.io.Serializable {

	private int idTipoActividad;
	private String descripcion;
	private String actividad;
	private Set<Actividades> actividadeses = new HashSet<Actividades>(0);

	public TipoActividad() {
	}

	public TipoActividad(int idTipoActividad, String actividad) {
		this.idTipoActividad = idTipoActividad;
		this.actividad = actividad;
	}

	public TipoActividad(int idTipoActividad, String descripcion, String actividad, Set<Actividades> actividadeses) {
		this.idTipoActividad = idTipoActividad;
		this.descripcion = descripcion;
		this.actividad = actividad;
		this.actividadeses = actividadeses;
	}

	@Id

	@Column(name = "id_tipo_actividad", unique = true, nullable = false)
	public int getIdTipoActividad() {
		return this.idTipoActividad;
	}

	public void setIdTipoActividad(int idTipoActividad) {
		this.idTipoActividad = idTipoActividad;
	}

	@Column(name = "descripcion", length = 65535)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "actividad", nullable = false, length = 45)
	public String getActividad() {
		return this.actividad;
	}

	public void setActividad(String actividad) {
		this.actividad = actividad;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoActividad")
	public Set<Actividades> getActividadeses() {
		return this.actividadeses;
	}

	public void setActividadeses(Set<Actividades> actividadeses) {
		this.actividadeses = actividadeses;
	}

}
