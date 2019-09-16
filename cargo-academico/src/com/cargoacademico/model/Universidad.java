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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Universidad generated by hbm2java
 */
@Entity
@Table(name = "universidad", catalog = "cargo_academico")
public class Universidad implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idUniversidad;
	private String nombre;
	private byte[] logo;
	private Set<Campus> campuses = new HashSet<Campus>(0);

	public Universidad() {
	}

	public Universidad(String nombre, byte[] logo, Set<Campus> campuses) {
		this.nombre = nombre;
		this.logo = logo;
		this.campuses = campuses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_universidad", unique = true, nullable = false)
	public Integer getIdUniversidad() {
		return this.idUniversidad;
	}

	public void setIdUniversidad(Integer idUniversidad) {
		this.idUniversidad = idUniversidad;
	}

	@Column(name = "nombre", length = 25)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "logo")
	public byte[] getLogo() {
		return this.logo;
	}

	public void setLogo(byte[] logo) {
		this.logo = logo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "universidad")
	public Set<Campus> getCampuses() {
		return this.campuses;
	}

	public void setCampuses(Set<Campus> campuses) {
		this.campuses = campuses;
	}

}
