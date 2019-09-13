package com.cargoacademico.model;
// Generated 09-11-2019 08:19:20 AM by Hibernate Tools 5.1.10.Final

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
 * Departamento generated by hbm2java
 */
@Entity
@Table(name = "departamento", catalog = "cargo_academico")
public class Departamento implements java.io.Serializable {

	private Integer idDepartamento;
	private Empleado empleado;
	private Escuela escuela;
	private String nombre;
	private String telefono;
	private Set<Materias> materiases = new HashSet<Materias>(0);

	public Departamento() {
	}

	public Departamento(Empleado empleado, Escuela escuela, String telefono) {
		this.empleado = empleado;
		this.escuela = escuela;
		this.telefono = telefono;
	}

	public Departamento(Empleado empleado, Escuela escuela, String nombre, String telefono, Set<Materias> materiases) {
		this.empleado = empleado;
		this.escuela = escuela;
		this.nombre = nombre;
		this.telefono = telefono;
		this.materiases = materiases;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_departamento", unique = true, nullable = false)
	public Integer getIdDepartamento() {
		return this.idDepartamento;
	}

	public void setIdDepartamento(Integer idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "jefe_depto", nullable = false)
	public Empleado getEmpleado() {
		return this.empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_escuela", nullable = false)
	public Escuela getEscuela() {
		return this.escuela;
	}

	public void setEscuela(Escuela escuela) {
		this.escuela = escuela;
	}

	@Column(name = "nombre", length = 175)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "telefono", nullable = false, length = 9)
	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "departamento")
	public Set<Materias> getMateriases() {
		return this.materiases;
	}

	public void setMateriases(Set<Materias> materiases) {
		this.materiases = materiases;
	}

}
