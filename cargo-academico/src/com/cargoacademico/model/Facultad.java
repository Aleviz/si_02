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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Facultad generated by hbm2java
 */
@Entity
@Table(name = "facultad", catalog = "cargo_academico", uniqueConstraints = @UniqueConstraint(columnNames = "id_coordenada"))
public class Facultad implements java.io.Serializable {

	private Integer idFacultad;
	private Campus campus;
	private Coordenadas coordenadas;
	private Empleado empleado;
	private String facultad;
	private String telefono;
	private String ubicacion;
	private byte[] img;
	private Set<Edificio> edificios = new HashSet<Edificio>(0);
	private Set<Escuela> escuelas = new HashSet<Escuela>(0);

	public Facultad() {
	}

	public Facultad(Campus campus, Coordenadas coordenadas, Empleado empleado) {
		this.campus = campus;
		this.coordenadas = coordenadas;
		this.empleado = empleado;
	}

	public Facultad(Campus campus, Coordenadas coordenadas, Empleado empleado, String facultad, String telefono,
			String ubicacion, byte[] img, Set<Edificio> edificios, Set<Escuela> escuelas) {
		this.campus = campus;
		this.coordenadas = coordenadas;
		this.empleado = empleado;
		this.facultad = facultad;
		this.telefono = telefono;
		this.ubicacion = ubicacion;
		this.img = img;
		this.edificios = edificios;
		this.escuelas = escuelas;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_facultad", unique = true, nullable = false)
	public Integer getIdFacultad() {
		return this.idFacultad;
	}

	public void setIdFacultad(Integer idFacultad) {
		this.idFacultad = idFacultad;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "campus", nullable = false)
	public Campus getCampus() {
		return this.campus;
	}

	public void setCampus(Campus campus) {
		this.campus = campus;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_coordenada", unique = true, nullable = false)
	public Coordenadas getCoordenadas() {
		return this.coordenadas;
	}

	public void setCoordenadas(Coordenadas coordenadas) {
		this.coordenadas = coordenadas;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "decano", nullable = false)
	public Empleado getEmpleado() {
		return this.empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	@Column(name = "facultad")
	public String getFacultad() {
		return this.facultad;
	}

	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}

	@Column(name = "telefono", length = 20)
	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Column(name = "ubicacion")
	public String getUbicacion() {
		return this.ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	@Column(name = "img")
	public byte[] getImg() {
		return this.img;
	}

	public void setImg(byte[] img) {
		this.img = img;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "facultad")
	public Set<Edificio> getEdificios() {
		return this.edificios;
	}

	public void setEdificios(Set<Edificio> edificios) {
		this.edificios = edificios;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "facultad")
	public Set<Escuela> getEscuelas() {
		return this.escuelas;
	}

	public void setEscuelas(Set<Escuela> escuelas) {
		this.escuelas = escuelas;
	}

}
