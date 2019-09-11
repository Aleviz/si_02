package com.cargoacademico.model;
// Generated 09-04-2019 10:57:02 AM by Hibernate Tools 5.2.10.Final

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
import javax.persistence.UniqueConstraint;

/**
 * AulaEmpleado generated by hbm2java
 */
@Entity
@Table(name = "aula_empleado", catalog = "cargo_academico", uniqueConstraints = @UniqueConstraint(columnNames = "id_empleado_materia"))
public class AulaEmpleado implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idAulaEmpleado;
	private Aula aula;
	private EmpleadoMateria empleadoMateria;
	private int cupo;
	private Set<AlumnoMateria> alumnoMaterias = new HashSet<AlumnoMateria>(0);

	public AulaEmpleado() {
	}

	public AulaEmpleado(Aula aula, EmpleadoMateria empleadoMateria, int cupo) {
		this.aula = aula;
		this.empleadoMateria = empleadoMateria;
		this.cupo = cupo;
	}

	public AulaEmpleado(Aula aula, EmpleadoMateria empleadoMateria, int cupo, Set<AlumnoMateria> alumnoMaterias) {
		this.aula = aula;
		this.empleadoMateria = empleadoMateria;
		this.cupo = cupo;
		this.alumnoMaterias = alumnoMaterias;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_aula_empleado", unique = true, nullable = false)
	public Integer getIdAulaEmpleado() {
		return this.idAulaEmpleado;
	}

	public void setIdAulaEmpleado(Integer idAulaEmpleado) {
		this.idAulaEmpleado = idAulaEmpleado;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_aula", nullable = false)
	public Aula getAula() {
		return this.aula;
	}

	public void setAula(Aula aula) {
		this.aula = aula;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_empleado_materia", unique = true, nullable = false)
	public EmpleadoMateria getEmpleadoMateria() {
		return this.empleadoMateria;
	}

	public void setEmpleadoMateria(EmpleadoMateria empleadoMateria) {
		this.empleadoMateria = empleadoMateria;
	}

	@Column(name = "cupo", nullable = false)
	public int getCupo() {
		return this.cupo;
	}

	public void setCupo(int cupo) {
		this.cupo = cupo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "aulaEmpleado")
	public Set<AlumnoMateria> getAlumnoMaterias() {
		return this.alumnoMaterias;
	}

	public void setAlumnoMaterias(Set<AlumnoMateria> alumnoMaterias) {
		this.alumnoMaterias = alumnoMaterias;
	}

}
