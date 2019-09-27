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
 * Usuarios generated by hbm2java
 */
@Entity
@Table(name = "usuarios", catalog = "cargo_academico")
public class Usuarios implements java.io.Serializable {

	private Integer idUsuario;
	private Roles roles;
	private String username;
	private String pass;
	private Set<Empleado> empleados = new HashSet<Empleado>(0);

	public Usuarios() {
	}

	public Usuarios(Roles roles) {
		this.roles = roles;
	}

	public Usuarios(Roles roles, String username, String pass, Set<Empleado> empleados) {
		this.roles = roles;
		this.username = username;
		this.pass = pass;
		this.empleados = empleados;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_usuario", unique = true, nullable = false)
	public Integer getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "rol", nullable = false)
	public Roles getRoles() {
		return this.roles;
	}

	public void setRoles(Roles roles) {
		this.roles = roles;
	}

	@Column(name = "username", length = 25)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "pass", length = 50)
	public String getPass() {
		return this.pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuarios")
	public Set<Empleado> getEmpleados() {
		return this.empleados;
	}

	public void setEmpleados(Set<Empleado> empleados) {
		this.empleados = empleados;
	}

}
