package com.cargoacademico.model;
// Generated 09-13-2019 04:06:38 PM by Hibernate Tools 5.1.10.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Actividades generated by hbm2java
 */
@Entity
@Table(name = "actividades", catalog = "cargo_academico")
public class Actividades implements java.io.Serializable {

	private Integer idActividad;
	private TipoActividad tipoActividad;
	private Unidad unidad;
	private String actividad;
	private String descripcion;
	private int ponderacion;
	private String recursos;

	public Actividades() {
	}

	public Actividades(TipoActividad tipoActividad, Unidad unidad, String actividad, String descripcion,
			int ponderacion) {
		this.tipoActividad = tipoActividad;
		this.unidad = unidad;
		this.actividad = actividad;
		this.descripcion = descripcion;
		this.ponderacion = ponderacion;
	}

	public Actividades(TipoActividad tipoActividad, Unidad unidad, String actividad, String descripcion,
			int ponderacion, String recursos) {
		this.tipoActividad = tipoActividad;
		this.unidad = unidad;
		this.actividad = actividad;
		this.descripcion = descripcion;
		this.ponderacion = ponderacion;
		this.recursos = recursos;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_actividad", unique = true, nullable = false)
	public Integer getIdActividad() {
		return this.idActividad;
	}

	public void setIdActividad(Integer idActividad) {
		this.idActividad = idActividad;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tipo_actividad", nullable = false)
	public TipoActividad getTipoActividad() {
		return this.tipoActividad;
	}

	public void setTipoActividad(TipoActividad tipoActividad) {
		this.tipoActividad = tipoActividad;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "unidad", nullable = false)
	public Unidad getUnidad() {
		return this.unidad;
	}

	public void setUnidad(Unidad unidad) {
		this.unidad = unidad;
	}

	@Column(name = "actividad", nullable = false, length = 45)
	public String getActividad() {
		return this.actividad;
	}

	public void setActividad(String actividad) {
		this.actividad = actividad;
	}

	@Column(name = "descripcion", nullable = false, length = 150)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "ponderacion", nullable = false)
	public int getPonderacion() {
		return this.ponderacion;
	}

	public void setPonderacion(int ponderacion) {
		this.ponderacion = ponderacion;
	}

	@Column(name = "recursos", length = 65535)
	public String getRecursos() {
		return this.recursos;
	}

	public void setRecursos(String recursos) {
		this.recursos = recursos;
	}

}
