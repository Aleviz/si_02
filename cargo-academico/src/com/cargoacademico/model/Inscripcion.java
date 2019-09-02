package com.cargoacademico.model;
// Generated 08-30-2019 02:25:21 PM by Hibernate Tools 5.2.10.Final

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Inscripcion generated by hbm2java
 */
@Entity
@Table(name = "inscripcion", catalog = "cargo_academico")
public class Inscripcion implements java.io.Serializable {

	private int idInscripcion;
	private Alumno alumno;
	private MateriaCarreraCiclo materiaCarreraCiclo;
	private Date fecha;
	private Date inicio;
	private Date final_;
	private Set<AlumnoMateria> alumnoMaterias = new HashSet<AlumnoMateria>(0);

	public Inscripcion() {
	}

	public Inscripcion(int idInscripcion, Alumno alumno, MateriaCarreraCiclo materiaCarreraCiclo, Date fecha,
			Date inicio, Date final_) {
		this.idInscripcion = idInscripcion;
		this.alumno = alumno;
		this.materiaCarreraCiclo = materiaCarreraCiclo;
		this.fecha = fecha;
		this.inicio = inicio;
		this.final_ = final_;
	}

	public Inscripcion(int idInscripcion, Alumno alumno, MateriaCarreraCiclo materiaCarreraCiclo, Date fecha,
			Date inicio, Date final_, Set<AlumnoMateria> alumnoMaterias) {
		this.idInscripcion = idInscripcion;
		this.alumno = alumno;
		this.materiaCarreraCiclo = materiaCarreraCiclo;
		this.fecha = fecha;
		this.inicio = inicio;
		this.final_ = final_;
		this.alumnoMaterias = alumnoMaterias;
	}

	@Id

	@Column(name = "id_inscripcion", unique = true, nullable = false)
	public int getIdInscripcion() {
		return this.idInscripcion;
	}

	public void setIdInscripcion(int idInscripcion) {
		this.idInscripcion = idInscripcion;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "alumno", nullable = false)
	public Alumno getAlumno() {
		return this.alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "materia_carrera_ciclo", nullable = false)
	public MateriaCarreraCiclo getMateriaCarreraCiclo() {
		return this.materiaCarreraCiclo;
	}

	public void setMateriaCarreraCiclo(MateriaCarreraCiclo materiaCarreraCiclo) {
		this.materiaCarreraCiclo = materiaCarreraCiclo;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha", nullable = false, length = 10)
	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "inicio", nullable = false, length = 10)
	public Date getInicio() {
		return this.inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "final", nullable = false, length = 10)
	public Date getFinal_() {
		return this.final_;
	}

	public void setFinal_(Date final_) {
		this.final_ = final_;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "inscripcion")
	public Set<AlumnoMateria> getAlumnoMaterias() {
		return this.alumnoMaterias;
	}

	public void setAlumnoMaterias(Set<AlumnoMateria> alumnoMaterias) {
		this.alumnoMaterias = alumnoMaterias;
	}

}
