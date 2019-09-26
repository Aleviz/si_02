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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author william.raudausam
 */
@Entity
@Table(name = "temario")
@XmlRootElement
public class Temario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_temario")
    private Integer idTemario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 175)
    @Column(name = "nombre_temario")
    private String nombreTemario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "temario")
    private List<Unidad> unidadList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "temario")
    private List<Materias> materiasList;

    public Temario() {
    }

    public Temario(Integer idTemario) {
        this.idTemario = idTemario;
    }

    public Temario(Integer idTemario, String nombreTemario) {
        this.idTemario = idTemario;
        this.nombreTemario = nombreTemario;
    }

    public Integer getIdTemario() {
        return idTemario;
    }

    public void setIdTemario(Integer idTemario) {
        this.idTemario = idTemario;
    }

    public String getNombreTemario() {
        return nombreTemario;
    }

    public void setNombreTemario(String nombreTemario) {
        this.nombreTemario = nombreTemario;
    }

    @XmlTransient
    public List<Unidad> getUnidadList() {
        return unidadList;
    }

    public void setUnidadList(List<Unidad> unidadList) {
        this.unidadList = unidadList;
    }

    @XmlTransient
    public List<Materias> getMateriasList() {
        return materiasList;
    }

    public void setMateriasList(List<Materias> materiasList) {
        this.materiasList = materiasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTemario != null ? idTemario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Temario)) {
            return false;
        }
        Temario other = (Temario) object;
        if ((this.idTemario == null && other.idTemario != null) || (this.idTemario != null && !this.idTemario.equals(other.idTemario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cargoacademico.model.Temario[ idTemario=" + idTemario + " ]";
    }
    
}
