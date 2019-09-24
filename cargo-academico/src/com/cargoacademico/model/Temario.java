package com.cargoacademico.model;
// Generated 09-24-2019 09:24:18 AM by Hibernate Tools 5.2.12.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Temario generated by hbm2java
 */
@Entity
@Table(name = "temario", catalog = "cargo_academico")
public class Temario implements java.io.Serializable {

	private Integer idTemario;
	private String nombreTemario;
	private Set<Unidad> unidads = new HashSet<Unidad>(0);
	private Set<Materias> materiases = new HashSet<Materias>(0);

	public Temario() {
	}

	public Temario(String nombreTemario) {
		this.nombreTemario = nombreTemario;
	}

	public Temario(String nombreTemario, Set<Unidad> unidads, Set<Materias> materiases) {
		this.nombreTemario = nombreTemario;
		this.unidads = unidads;
		this.materiases = materiases;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_temario", unique = true, nullable = false)
	public Integer getIdTemario() {
		return this.idTemario;
	}

	public void setIdTemario(Integer idTemario) {
		this.idTemario = idTemario;
	}

	@Column(name = "nombre_temario", nullable = false, length = 175)
	public String getNombreTemario() {
		return this.nombreTemario;
	}

	public void setNombreTemario(String nombreTemario) {
		this.nombreTemario = nombreTemario;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "temario")
	public Set<Unidad> getUnidads() {
		return this.unidads;
	}

	public void setUnidads(Set<Unidad> unidads) {
		this.unidads = unidads;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "temario")
	public Set<Materias> getMateriases() {
		return this.materiases;
	}

	public void setMateriases(Set<Materias> materiases) {
		this.materiases = materiases;
	}

}
