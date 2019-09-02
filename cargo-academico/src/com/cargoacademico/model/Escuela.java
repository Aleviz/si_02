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
 * Escuela generated by hbm2java
 */
@Entity
@Table(name = "escuela", catalog = "cargo_academico")
public class Escuela implements java.io.Serializable {

	private int idEscuela;
	private Facultad facultad;
	private String nombreEscuela;
	private Set<Departamento> departamentos = new HashSet<Departamento>(0);
	private Set<CarrerasCiclo> carrerasCiclos = new HashSet<CarrerasCiclo>(0);

	public Escuela() {
	}

	public Escuela(int idEscuela, Facultad facultad) {
		this.idEscuela = idEscuela;
		this.facultad = facultad;
	}

	public Escuela(int idEscuela, Facultad facultad, String nombreEscuela, Set<Departamento> departamentos,
			Set<CarrerasCiclo> carrerasCiclos) {
		this.idEscuela = idEscuela;
		this.facultad = facultad;
		this.nombreEscuela = nombreEscuela;
		this.departamentos = departamentos;
		this.carrerasCiclos = carrerasCiclos;
	}

	@Id

	@Column(name = "id_escuela", unique = true, nullable = false)
	public int getIdEscuela() {
		return this.idEscuela;
	}

	public void setIdEscuela(int idEscuela) {
		this.idEscuela = idEscuela;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_facultad", nullable = false)
	public Facultad getFacultad() {
		return this.facultad;
	}

	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}

	@Column(name = "nombre_escuela", length = 45)
	public String getNombreEscuela() {
		return this.nombreEscuela;
	}

	public void setNombreEscuela(String nombreEscuela) {
		this.nombreEscuela = nombreEscuela;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "escuela")
	public Set<Departamento> getDepartamentos() {
		return this.departamentos;
	}

	public void setDepartamentos(Set<Departamento> departamentos) {
		this.departamentos = departamentos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "escuela")
	public Set<CarrerasCiclo> getCarrerasCiclos() {
		return this.carrerasCiclos;
	}

	public void setCarrerasCiclos(Set<CarrerasCiclo> carrerasCiclos) {
		this.carrerasCiclos = carrerasCiclos;
	}

}
