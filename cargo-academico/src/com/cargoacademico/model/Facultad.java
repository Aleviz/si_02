/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cargoacademico.model;
<<<<<<< HEAD

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
=======
// Generated 09-24-2019 09:24:18 AM by Hibernate Tools 5.2.12.Final

import java.util.HashSet;
import java.util.Set;

>>>>>>> Geografico
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
<<<<<<< HEAD
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
=======
import javax.persistence.UniqueConstraint;
>>>>>>> Geografico

/**
 *
 * @author william.raudausam
 */
@Entity
<<<<<<< HEAD
@Table(name = "facultad")
@XmlRootElement
public class Facultad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_facultad")
    private Integer idFacultad;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "facultad")
    private String facultad;
    @Size(max = 20)
    @Column(name = "telefono")
    private String telefono;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "ubicacion")
    private String ubicacion;
    @Lob
    @Column(name = "img")
    private byte[] img;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFacultad")
    private List<Escuela> escuelaList;
    @JoinColumn(name = "campus", referencedColumnName = "id_campus")
    @ManyToOne(optional = false)
    private Campus campus;
    @JoinColumn(name = "decano", referencedColumnName = "id_empleado")
    @ManyToOne(optional = false)
    private Empleado decano;
    @JoinColumn(name = "id_coordenada", referencedColumnName = "id_coordenada")
    @OneToOne(optional = false)
    private Coordenadas idCoordenada;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "facultad")
    private List<Edificio> edificioList;

    public Facultad() {
    }

    public Facultad(Integer idFacultad) {
        this.idFacultad = idFacultad;
    }

    public Integer getIdFacultad() {
        return idFacultad;
    }

    public void setIdFacultad(Integer idFacultad) {
        this.idFacultad = idFacultad;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }

    @XmlTransient
    public List<Escuela> getEscuelaList() {
        return escuelaList;
    }

    public void setEscuelaList(List<Escuela> escuelaList) {
        this.escuelaList = escuelaList;
    }

    public Campus getCampus() {
        return campus;
    }

    public void setCampus(Campus campus) {
        this.campus = campus;
    }

    public Empleado getDecano() {
        return decano;
    }

    public void setDecano(Empleado decano) {
        this.decano = decano;
    }

    public Coordenadas getIdCoordenada() {
        return idCoordenada;
    }

    public void setIdCoordenada(Coordenadas idCoordenada) {
        this.idCoordenada = idCoordenada;
    }

    @XmlTransient
    public List<Edificio> getEdificioList() {
        return edificioList;
    }

    public void setEdificioList(List<Edificio> edificioList) {
        this.edificioList = edificioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFacultad != null ? idFacultad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Facultad)) {
            return false;
        }
        Facultad other = (Facultad) object;
        if ((this.idFacultad == null && other.idFacultad != null) || (this.idFacultad != null && !this.idFacultad.equals(other.idFacultad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cargoacademico.model.Facultad[ idFacultad=" + idFacultad + " ]";
    }
    
=======
@Table(name = "facultad", catalog = "cargo_academico", uniqueConstraints = @UniqueConstraint(columnNames = "id_coordenada"))
public class Facultad implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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

	@ManyToOne(fetch = FetchType.EAGER , cascade = CascadeType.ALL)
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

>>>>>>> Geografico
}
