/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cargoacademico.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author william.raudausam
 */
@Entity
@Table(name = "coordenadas")
@XmlRootElement
public class Coordenadas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_coordenada")
    private Integer idCoordenada;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "latitud")
    private String latitud;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "longitud")
    private String longitud;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "altitud")
    private String altitud;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "idCoordenada")
    private Facultad facultad;
    @OneToOne(mappedBy = "coordenadas")
    private Campus campus;

    public Coordenadas() {
    }

    public Coordenadas(Integer idCoordenada) {
        this.idCoordenada = idCoordenada;
    }

    public Coordenadas(Integer idCoordenada, String latitud, String longitud, String altitud) {
        this.idCoordenada = idCoordenada;
        this.latitud = latitud;
        this.longitud = longitud;
        this.altitud = altitud;
    }

    public Integer getIdCoordenada() {
        return idCoordenada;
    }

    public void setIdCoordenada(Integer idCoordenada) {
        this.idCoordenada = idCoordenada;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getAltitud() {
        return altitud;
    }

    public void setAltitud(String altitud) {
        this.altitud = altitud;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    public Campus getCampus() {
        return campus;
    }

    public void setCampus(Campus campus) {
        this.campus = campus;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCoordenada != null ? idCoordenada.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Coordenadas)) {
            return false;
        }
        Coordenadas other = (Coordenadas) object;
        if ((this.idCoordenada == null && other.idCoordenada != null) || (this.idCoordenada != null && !this.idCoordenada.equals(other.idCoordenada))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cargoacademico.model.Coordenadas[ idCoordenada=" + idCoordenada + " ]";
    }
    
}
