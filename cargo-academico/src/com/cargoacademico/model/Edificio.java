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
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "edificio")
@XmlRootElement
public class Edificio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_edificio")
    private Integer idEdificio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre_edificio")
    private String nombreEdificio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "edificio")
    private List<Aula> aulaList;
    @JoinColumn(name = "facultad", referencedColumnName = "id_facultad")
    @ManyToOne(optional = false)
    private Facultad facultad;

    public Edificio() {
    }

    public Edificio(Integer idEdificio) {
        this.idEdificio = idEdificio;
    }

    public Edificio(Integer idEdificio, String nombreEdificio) {
        this.idEdificio = idEdificio;
        this.nombreEdificio = nombreEdificio;
    }

    public Integer getIdEdificio() {
        return idEdificio;
    }

    public void setIdEdificio(Integer idEdificio) {
        this.idEdificio = idEdificio;
    }

    public String getNombreEdificio() {
        return nombreEdificio;
    }

    public void setNombreEdificio(String nombreEdificio) {
        this.nombreEdificio = nombreEdificio;
    }

    @XmlTransient
    public List<Aula> getAulaList() {
        return aulaList;
    }

    public void setAulaList(List<Aula> aulaList) {
        this.aulaList = aulaList;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEdificio != null ? idEdificio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Edificio)) {
            return false;
        }
        Edificio other = (Edificio) object;
        if ((this.idEdificio == null && other.idEdificio != null) || (this.idEdificio != null && !this.idEdificio.equals(other.idEdificio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cargoacademico.model.Edificio[ idEdificio=" + idEdificio + " ]";
    }
    
}
