package com.cargoacademico.model;
// Generated 09-27-2019 01:09:44 PM by Hibernate Tools 5.2.12.Final

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
 * TipoDocentes generated by hbm2java
 */
@Entity
@Table(name = "tipo_docentes", catalog = "cargo_academico")
public class TipoDocentes implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idTipoDocente;
	private String tipoDocente;
	private Set<Empleado> empleados = new HashSet<Empleado>(0);

	public TipoDocentes() {
	}

	public TipoDocentes(String tipoDocente, Set<Empleado> empleados) {
		this.tipoDocente = tipoDocente;
		this.empleados = empleados;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_tipo_docente", unique = true, nullable = false)
	public Integer getIdTipoDocente() {
		return this.idTipoDocente;
	}

	public void setIdTipoDocente(Integer idTipoDocente) {
		this.idTipoDocente = idTipoDocente;
	}

	@Column(name = "tipo_docente", length = 15)
	public String getTipoDocente() {
		return this.tipoDocente;
	}

	public void setTipoDocente(String tipoDocente) {
		this.tipoDocente = tipoDocente;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoDocentes")
	public Set<Empleado> getEmpleados() {
		return this.empleados;
	}

	public void setEmpleados(Set<Empleado> empleados) {
		this.empleados = empleados;
	}

}
