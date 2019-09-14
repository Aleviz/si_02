package com.cargoacademico.model;
// Generated 09-13-2019 04:06:38 PM by Hibernate Tools 5.1.10.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * AlumnoMateria generated by hbm2java
 */
@Entity
@Table(name = "alumno_materia", catalog = "cargo_academico")
public class AlumnoMateria implements java.io.Serializable {

	private Integer idAlumnoMateria;
	private AulaEmpleado aulaEmpleado;
	private Inscripcion inscripcion;
	private String estado;

	public AlumnoMateria() {
	}

	public AlumnoMateria(AulaEmpleado aulaEmpleado, Inscripcion inscripcion) {
		this.aulaEmpleado = aulaEmpleado;
		this.inscripcion = inscripcion;
	}

	public AlumnoMateria(AulaEmpleado aulaEmpleado, Inscripcion inscripcion, String estado) {
		this.aulaEmpleado = aulaEmpleado;
		this.inscripcion = inscripcion;
		this.estado = estado;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_alumno_materia", unique = true, nullable = false)
	public Integer getIdAlumnoMateria() {
		return this.idAlumnoMateria;
	}

	public void setIdAlumnoMateria(Integer idAlumnoMateria) {
		this.idAlumnoMateria = idAlumnoMateria;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_horario", nullable = false)
	public AulaEmpleado getAulaEmpleado() {
		return this.aulaEmpleado;
	}

	public void setAulaEmpleado(AulaEmpleado aulaEmpleado) {
		this.aulaEmpleado = aulaEmpleado;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_alumno", nullable = false)
	public Inscripcion getInscripcion() {
		return this.inscripcion;
	}

	public void setInscripcion(Inscripcion inscripcion) {
		this.inscripcion = inscripcion;
	}

	@Column(name = "estado", length = 9)
	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
