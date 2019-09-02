package com.cargoacademico.model;
// Generated 08-30-2019 02:25:21 PM by Hibernate Tools 5.2.10.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Unidad generated by hbm2java
 */
@Entity
@Table(name = "unidad", catalog = "cargo_academico")
public class Unidad implements java.io.Serializable {

	private int idUnidad;
	private Temario temario;
	private String nombreUnidad;
	private String objetivo;
	private int duracion;
	private Set<Actividades> actividadeses = new HashSet<Actividades>(0);
	private Set<Tema> temas = new HashSet<Tema>(0);

	public Unidad() {
	}

	public Unidad(int idUnidad, Temario temario, String nombreUnidad, String objetivo, int duracion) {
		this.idUnidad = idUnidad;
		this.temario = temario;
		this.nombreUnidad = nombreUnidad;
		this.objetivo = objetivo;
		this.duracion = duracion;
	}

	public Unidad(int idUnidad, Temario temario, String nombreUnidad, String objetivo, int duracion,
			Set<Actividades> actividadeses, Set<Tema> temas) {
		this.idUnidad = idUnidad;
		this.temario = temario;
		this.nombreUnidad = nombreUnidad;
		this.objetivo = objetivo;
		this.duracion = duracion;
		this.actividadeses = actividadeses;
		this.temas = temas;
	}

	@Id

	@Column(name = "id_unidad", unique = true, nullable = false)
	public int getIdUnidad() {
		return this.idUnidad;
	}

	public void setIdUnidad(int idUnidad) {
		this.idUnidad = idUnidad;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "temario", nullable = false)
	public Temario getTemario() {
		return this.temario;
	}

	public void setTemario(Temario temario) {
		this.temario = temario;
	}

	@Column(name = "nombre_unidad", nullable = false, length = 45)
	public String getNombreUnidad() {
		return this.nombreUnidad;
	}

	public void setNombreUnidad(String nombreUnidad) {
		this.nombreUnidad = nombreUnidad;
	}

	@Column(name = "objetivo", nullable = false, length = 150)
	public String getObjetivo() {
		return this.objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	@Column(name = "duracion", nullable = false)
	public int getDuracion() {
		return this.duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "unidad")
	public Set<Actividades> getActividadeses() {
		return this.actividadeses;
	}

	public void setActividadeses(Set<Actividades> actividadeses) {
		this.actividadeses = actividadeses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "unidad")
	public Set<Tema> getTemas() {
		return this.temas;
	}

	public void setTemas(Set<Tema> temas) {
		this.temas = temas;
	}

}
