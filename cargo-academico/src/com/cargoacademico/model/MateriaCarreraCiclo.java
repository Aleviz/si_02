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
 * MateriaCarreraCiclo generated by hbm2java
 */
@Entity
@Table(name = "materia_carrera_ciclo", catalog = "cargo_academico")
public class MateriaCarreraCiclo implements java.io.Serializable {

	private Integer idMateriaCarreraCiclo;
	private CarrerasCiclo carrerasCiclo;
	private Materias materias;
	private Set<Inscripcion> inscripcions = new HashSet<Inscripcion>(0);

	public MateriaCarreraCiclo() {
	}

	public MateriaCarreraCiclo(CarrerasCiclo carrerasCiclo, Materias materias) {
		this.carrerasCiclo = carrerasCiclo;
		this.materias = materias;
	}

	public MateriaCarreraCiclo(CarrerasCiclo carrerasCiclo, Materias materias, Set<Inscripcion> inscripcions) {
		this.carrerasCiclo = carrerasCiclo;
		this.materias = materias;
		this.inscripcions = inscripcions;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_materia_carrera_ciclo", unique = true, nullable = false)
	public Integer getIdMateriaCarreraCiclo() {
		return this.idMateriaCarreraCiclo;
	}

	public void setIdMateriaCarreraCiclo(Integer idMateriaCarreraCiclo) {
		this.idMateriaCarreraCiclo = idMateriaCarreraCiclo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "carrera_ciclo", nullable = false)
	public CarrerasCiclo getCarrerasCiclo() {
		return this.carrerasCiclo;
	}

	public void setCarrerasCiclo(CarrerasCiclo carrerasCiclo) {
		this.carrerasCiclo = carrerasCiclo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "materia", nullable = false)
	public Materias getMaterias() {
		return this.materias;
	}

	public void setMaterias(Materias materias) {
		this.materias = materias;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "materiaCarreraCiclo")
	public Set<Inscripcion> getInscripcions() {
		return this.inscripcions;
	}

	public void setInscripcions(Set<Inscripcion> inscripcions) {
		this.inscripcions = inscripcions;
	}

}
