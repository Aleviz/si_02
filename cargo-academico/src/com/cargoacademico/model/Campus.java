/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cargoacademico.model;

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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author william.raudausam
 */
@Entity
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
    
}
