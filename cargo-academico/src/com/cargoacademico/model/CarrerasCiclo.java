package com.cargoacademico.model;
// Generated 09-13-2019 04:06:38 PM by Hibernate Tools 5.1.10.Final

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
 * CarrerasCiclo generated by hbm2java
 */
@Entity
@Table(name = "carreras_ciclo", catalog = "cargo_academico")
public class CarrerasCiclo implements java.io.Serializable {

	private Integer idCarreraCiclo;
	private Ciclo ciclo;
	private Escuela escuela;
	private Set<MateriaCarreraCiclo> materiaCarreraCiclos = new HashSet<MateriaCarreraCiclo>(0);

	public CarrerasCiclo() {
	}

	public CarrerasCiclo(Ciclo ciclo, Escuela escuela) {
		this.ciclo = ciclo;
		this.escuela = escuela;
	}

	public CarrerasCiclo(Ciclo ciclo, Escuela escuela, Set<MateriaCarreraCiclo> materiaCarreraCiclos) {
		this.ciclo = ciclo;
		this.escuela = escuela;
		this.materiaCarreraCiclos = materiaCarreraCiclos;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_carrera_ciclo", unique = true, nullable = false)
	public Integer getIdCarreraCiclo() {
		return this.idCarreraCiclo;
	}

	public void setIdCarreraCiclo(Integer idCarreraCiclo) {
		this.idCarreraCiclo = idCarreraCiclo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ciclo", nullable = false)
	public Ciclo getCiclo() {
		return this.ciclo;
	}

	public void setCiclo(Ciclo ciclo) {
		this.ciclo = ciclo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "carrera", nullable = false)
	public Escuela getEscuela() {
		return this.escuela;
	}

	public void setEscuela(Escuela escuela) {
		this.escuela = escuela;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "carrerasCiclo")
	public Set<MateriaCarreraCiclo> getMateriaCarreraCiclos() {
		return this.materiaCarreraCiclos;
	}

	public void setMateriaCarreraCiclos(Set<MateriaCarreraCiclo> materiaCarreraCiclos) {
		this.materiaCarreraCiclos = materiaCarreraCiclos;
	}

}
