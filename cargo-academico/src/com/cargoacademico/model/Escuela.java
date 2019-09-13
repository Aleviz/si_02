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
 * Escuela generated by hbm2java
 */
@Entity
@Table(name = "escuela", catalog = "cargo_academico")
public class Escuela implements java.io.Serializable {

	private Integer idEscuela;
	private Facultad facultad;
	private String nombreEscuela;
	private String telefono;
	private String direccion;
	private String descripcion;
	private String campoDeAccion;
	private String mision;
	private String vision;
	private String objetivo;
	private Set<Departamento> departamentos = new HashSet<Departamento>(0);
	private Set<CarrerasCiclo> carrerasCiclos = new HashSet<CarrerasCiclo>(0);

	public Escuela() {
	}

	public Escuela(Facultad facultad, String telefono, String direccion, String descripcion, String campoDeAccion,
			String mision, String vision, String objetivo) {
		this.facultad = facultad;
		this.telefono = telefono;
		this.direccion = direccion;
		this.descripcion = descripcion;
		this.campoDeAccion = campoDeAccion;
		this.mision = mision;
		this.vision = vision;
		this.objetivo = objetivo;
	}

	public Escuela(Facultad facultad, String nombreEscuela, String telefono, String direccion, String descripcion,
			String campoDeAccion, String mision, String vision, String objetivo, Set<Departamento> departamentos,
			Set<CarrerasCiclo> carrerasCiclos) {
		this.facultad = facultad;
		this.nombreEscuela = nombreEscuela;
		this.telefono = telefono;
		this.direccion = direccion;
		this.descripcion = descripcion;
		this.campoDeAccion = campoDeAccion;
		this.mision = mision;
		this.vision = vision;
		this.objetivo = objetivo;
		this.departamentos = departamentos;
		this.carrerasCiclos = carrerasCiclos;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_escuela", unique = true, nullable = false)
	public Integer getIdEscuela() {
		return this.idEscuela;
	}

	public void setIdEscuela(Integer idEscuela) {
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

	@Column(name = "telefono", nullable = false, length = 9)
	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Column(name = "direccion", nullable = false, length = 70)
	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Column(name = "descripcion", nullable = false, length = 65535)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "campo_de_accion", nullable = false, length = 65535)
	public String getCampoDeAccion() {
		return this.campoDeAccion;
	}

	public void setCampoDeAccion(String campoDeAccion) {
		this.campoDeAccion = campoDeAccion;
	}

	@Column(name = "mision", nullable = false, length = 65535)
	public String getMision() {
		return this.mision;
	}

	public void setMision(String mision) {
		this.mision = mision;
	}

	@Column(name = "vision", nullable = false, length = 65535)
	public String getVision() {
		return this.vision;
	}

	public void setVision(String vision) {
		this.vision = vision;
	}

	@Column(name = "objetivo", nullable = false, length = 65535)
	public String getObjetivo() {
		return this.objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
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
