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
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author william.raudausam
 */
@Entity
<<<<<<< HEAD
@Table(name = "universidad")
@XmlRootElement
public class Universidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_universidad")
    private Integer idUniversidad;
    @Size(max = 25)
    @Column(name = "nombre")
    private String nombre;
    @Lob
    @Column(name = "logo")
    private byte[] logo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "universidad")
    private List<Campus> campusList;

    public Universidad() {
    }

    public Universidad(Integer idUniversidad) {
        this.idUniversidad = idUniversidad;
    }

    public Integer getIdUniversidad() {
        return idUniversidad;
    }

    public void setIdUniversidad(Integer idUniversidad) {
        this.idUniversidad = idUniversidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte[] getLogo() {
        return logo;
    }

    public void setLogo(byte[] logo) {
        this.logo = logo;
    }

    @XmlTransient
    public List<Campus> getCampusList() {
        return campusList;
    }

    public void setCampusList(List<Campus> campusList) {
        this.campusList = campusList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUniversidad != null ? idUniversidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Universidad)) {
            return false;
        }
        Universidad other = (Universidad) object;
        if ((this.idUniversidad == null && other.idUniversidad != null) || (this.idUniversidad != null && !this.idUniversidad.equals(other.idUniversidad))) {
            return false;
        }
        return true;
    }
=======
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
>>>>>>> Geografico

    @Override
    public String toString() {
        return "com.cargoacademico.model.Universidad[ idUniversidad=" + idUniversidad + " ]";
    }
    
}
