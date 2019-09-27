/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cargoacademico.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "tipo_docente")
@XmlRootElement
public class TipoDocente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipo_docente")
    private Integer idTipoDocente;
    @Size(max = 15)
    @Column(name = "tipo_docente")
    private String tipoDocente;
    @OneToMany(mappedBy = "tipoDocente")
    private List<Empleado> empleadoList;

    public TipoDocente() {
    }

    public TipoDocente(Integer idTipoDocente) {
        this.idTipoDocente = idTipoDocente;
    }

    public Integer getIdTipoDocente() {
        return idTipoDocente;
    }

    public void setIdTipoDocente(Integer idTipoDocente) {
        this.idTipoDocente = idTipoDocente;
    }

    public String getTipoDocente() {
        return tipoDocente;
    }

    public void setTipoDocente(String tipoDocente) {
        this.tipoDocente = tipoDocente;
    }

    @XmlTransient
    public List<Empleado> getEmpleadoList() {
        return empleadoList;
    }

    public void setEmpleadoList(List<Empleado> empleadoList) {
        this.empleadoList = empleadoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoDocente != null ? idTipoDocente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoDocente)) {
            return false;
        }
        TipoDocente other = (TipoDocente) object;
        if ((this.idTipoDocente == null && other.idTipoDocente != null) || (this.idTipoDocente != null && !this.idTipoDocente.equals(other.idTipoDocente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cargoacademico.model.TipoDocente[ idTipoDocente=" + idTipoDocente + " ]";
    }
    
}
