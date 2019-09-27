package com.cargoacademico.model;
// Generated 09-26-2019 02:36:50 PM by Hibernate Tools 5.1.10.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Campus generated by hbm2java
 */
@Entity
@Table(name = "campus", catalog = "cargo_academico")
public class Campus implements java.io.Serializable {

	private Integer idCampus;
	private Coordenadas coordenadas;
	private Universidad universidad;
	private String campus;
	private int telefono;
	private String ubicacion;
	private Set<Facultad> facultads = new HashSet<Facultad>(0);

	public Campus() {
	}

	public Campus(Universidad universidad, int telefono) {
		this.universidad = universidad;
		this.telefono = telefono;
	}

	public Campus(Coordenadas coordenadas, Universidad universidad, String campus, int telefono, String ubicacion,
			Set<Facultad> facultads) {
		this.coordenadas = coordenadas;
		this.universidad = universidad;
		this.campus = campus;
		this.telefono = telefono;
		this.ubicacion = ubicacion;
		this.facultads = facultads;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_campus", unique = true, nullable = false)
	public Integer getIdCampus() {
		return this.idCampus;
	}

	public void setIdCampus(Integer idCampus) {
		this.idCampus = idCampus;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "coordenadas")
	public Coordenadas getCoordenadas() {
		return this.coordenadas;
	}

	public void setCoordenadas(Coordenadas coordenadas) {
		this.coordenadas = coordenadas;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "universidad", nullable = false)
	public Universidad getUniversidad() {
		return this.universidad;
	}

	public void setUniversidad(Universidad universidad) {
		this.universidad = universidad;
	}

	@Column(name = "campus", length = 35)
	public String getCampus() {
		return this.campus;
	}

	public void setCampus(String campus) {
		this.campus = campus;
	}

	@Column(name = "telefono", nullable = false)
	public int getTelefono() {
		return this.telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	@Column(name = "ubicacion", length = 100)
	public String getUbicacion() {
		return this.ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "campus")
	public Set<Facultad> getFacultads() {
		return this.facultads;
	}

	public void setFacultads(Set<Facultad> facultads) {
		this.facultads = facultads;
	}

}
