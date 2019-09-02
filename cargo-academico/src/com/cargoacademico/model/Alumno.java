package com.cargoacademico.model;
// Generated 08-30-2019 02:25:21 PM by Hibernate Tools 5.2.10.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Alumno generated by hbm2java
 */
@Entity
@Table(name = "alumno", catalog = "cargo_academico")
public class Alumno implements java.io.Serializable {

	private int idAlumno;
	private String primerNombre;
	private String segundoNombre;
	private String primerApellido;
	private String segundoApellido;
	private Date fechaNacimiento;
	private String nit;
	private String dui;
	private String carnet;
	private byte[] foto;
	private Set<Inscripcion> inscripcions = new HashSet<Inscripcion>(0);

	public Alumno() {
	}

	public Alumno(int idAlumno, String primerNombre, String primerApellido, Date fechaNacimiento, String nit,
			String carnet) {
		this.idAlumno = idAlumno;
		this.primerNombre = primerNombre;
		this.primerApellido = primerApellido;
		this.fechaNacimiento = fechaNacimiento;
		this.nit = nit;
		this.carnet = carnet;
	}

	public Alumno(int idAlumno, String primerNombre, String segundoNombre, String primerApellido,
			String segundoApellido, Date fechaNacimiento, String nit, String dui, String carnet, byte[] foto,
			Set<Inscripcion> inscripcions) {
		this.idAlumno = idAlumno;
		this.primerNombre = primerNombre;
		this.segundoNombre = segundoNombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.fechaNacimiento = fechaNacimiento;
		this.nit = nit;
		this.dui = dui;
		this.carnet = carnet;
		this.foto = foto;
		this.inscripcions = inscripcions;
	}

	@Id

	@Column(name = "id_alumno", unique = true, nullable = false)
	public int getIdAlumno() {
		return this.idAlumno;
	}

	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}

	@Column(name = "primer_nombre", nullable = false, length = 25)
	public String getPrimerNombre() {
		return this.primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	@Column(name = "segundo_nombre", length = 25)
	public String getSegundoNombre() {
		return this.segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	@Column(name = "primer_apellido", nullable = false, length = 25)
	public String getPrimerApellido() {
		return this.primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	@Column(name = "segundo_apellido", length = 25)
	public String getSegundoApellido() {
		return this.segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_nacimiento", nullable = false, length = 10)
	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Column(name = "nit", nullable = false, length = 15)
	public String getNit() {
		return this.nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	@Column(name = "dui", length = 10)
	public String getDui() {
		return this.dui;
	}

	public void setDui(String dui) {
		this.dui = dui;
	}

	@Column(name = "carnet", nullable = false, length = 10)
	public String getCarnet() {
		return this.carnet;
	}

	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}

	@Column(name = "foto")
	public byte[] getFoto() {
		return this.foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "alumno")
	public Set<Inscripcion> getInscripcions() {
		return this.inscripcions;
	}

	public void setInscripcions(Set<Inscripcion> inscripcions) {
		this.inscripcions = inscripcions;
	}

}
