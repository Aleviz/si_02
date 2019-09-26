/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cargoacademico.model;
<<<<<<< HEAD
=======
// Generated 09-24-2019 09:24:18 AM by Hibernate Tools 5.2.12.Final
>>>>>>> Geografico

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "campus")
@XmlRootElement
public class Campus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_campus")
    private Integer idCampus;
    @Size(max = 35)
    @Column(name = "campus")
    private String campus;
    @Size(max = 20)
    @Column(name = "telefono")
    private String telefono;
    @Size(max = 100)
    @Column(name = "ubicacion")
    private String ubicacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "campus")
    private List<Facultad> facultadList;
    @JoinColumn(name = "universidad", referencedColumnName = "id_universidad")
    @ManyToOne(optional = false)
    private Universidad universidad;
    @JoinColumn(name = "coordenadas", referencedColumnName = "id_coordenada")
    @OneToOne
    private Coordenadas coordenadas;

    public Campus() {
    }

    public Campus(Integer idCampus) {
        this.idCampus = idCampus;
    }

    public Integer getIdCampus() {
        return idCampus;
    }

    public void setIdCampus(Integer idCampus) {
        this.idCampus = idCampus;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
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

    @XmlTransient
    public List<Facultad> getFacultadList() {
        return facultadList;
    }

    public void setFacultadList(List<Facultad> facultadList) {
        this.facultadList = facultadList;
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }

    public Coordenadas getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(Coordenadas coordenadas) {
        this.coordenadas = coordenadas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCampus != null ? idCampus.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Campus)) {
            return false;
        }
        Campus other = (Campus) object;
        if ((this.idCampus == null && other.idCampus != null) || (this.idCampus != null && !this.idCampus.equals(other.idCampus))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cargoacademico.model.Campus[ idCampus=" + idCampus + " ]";
    }
    
=======
@Table(name = "campus", catalog = "cargo_academico", uniqueConstraints = @UniqueConstraint(columnNames = "coordenadas"))
public class Campus implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idCampus;
	private Coordenadas coordenadas;
	private Universidad universidad;
	private String campus;
	private String telefono;
	private String ubicacion;
	private Set<Facultad> facultads = new HashSet<Facultad>(0);

	public Campus() {
	}

	public Campus(Universidad universidad) {
		this.universidad = universidad;
	}

	public Campus(Coordenadas coordenadas, Universidad universidad, String campus, String telefono, String ubicacion,
			Set<Facultad> facultads) {
		this.coordenadas = coordenadas;
		this.universidad = universidad;
		this.campus = campus;
		this.telefono = telefono;
		this.ubicacion = ubicacion;
		this.facultads = facultads;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_campus", unique = true, nullable = false)
	public Integer getIdCampus() {
		return this.idCampus;
	}

	public void setIdCampus(Integer idCampus) {
		this.idCampus = idCampus;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "coordenadas", unique = true)
	public Coordenadas getCoordenadas() {
		return this.coordenadas;
	}

	public void setCoordenadas(Coordenadas coordenadas) {
		this.coordenadas = coordenadas;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "universidad", nullable = false)
	public Universidad getUniversidad() {
		return this.universidad;
	}

	public void setUniversidad(Universidad universidad) {
		this.universidad = universidad;
	}

	@Column(name = "campus", length = 35)
	public String getCampus() {
		return this.campus;
	}

	public void setCampus(String campus) {
		this.campus = campus;
	}

	@Column(name = "telefono", length = 20)
	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Column(name = "ubicacion", length = 100)
	public String getUbicacion() {
		return this.ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "campus")
	public Set<Facultad> getFacultads() {
		return this.facultads;
	}

	public void setFacultads(Set<Facultad> facultads) {
		this.facultads = facultads;
	}

>>>>>>> Geografico
}
