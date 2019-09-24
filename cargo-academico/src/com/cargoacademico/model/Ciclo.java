package com.cargoacademico.model;
// Generated 09-24-2019 09:07:03 AM by Hibernate Tools 5.2.12.Final

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
 * Ciclo generated by hbm2java
 */
@Entity
@Table(name = "ciclo", catalog = "cargo_academico")
public class Ciclo implements java.io.Serializable {

	private Integer idCiclo;
	private String ciclo;
	private String duracion;
	private Set<CarrerasCiclo> carrerasCiclos = new HashSet<CarrerasCiclo>(0);

	public Ciclo() {
	}

	public Ciclo(String ciclo, String duracion, Set<CarrerasCiclo> carrerasCiclos) {
		this.ciclo = ciclo;
		this.duracion = duracion;
		this.carrerasCiclos = carrerasCiclos;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_ciclo", unique = true, nullable = false)
	public Integer getIdCiclo() {
		return this.idCiclo;
	}

	public void setIdCiclo(Integer idCiclo) {
		this.idCiclo = idCiclo;
	}

	@Column(name = "ciclo", length = 10)
	public String getCiclo() {
		return this.ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}

	@Column(name = "duracion", length = 10)
	public String getDuracion() {
		return this.duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ciclo")
	public Set<CarrerasCiclo> getCarrerasCiclos() {
		return this.carrerasCiclos;
	}

	public void setCarrerasCiclos(Set<CarrerasCiclo> carrerasCiclos) {
		this.carrerasCiclos = carrerasCiclos;
	}

}
