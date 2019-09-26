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
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author william.raudausam
 */
@Entity
@Table(name = "aula")
@XmlRootElement
public class Aula implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_aula")
    private Integer idAula;
    @Size(max = 13)
    @Column(name = "codigo")
    private String codigo;
    @JoinColumn(name = "edificio", referencedColumnName = "id_edificio")
    @ManyToOne(optional = false)
    private Edificio edificio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAula")
    private List<AulaEmpleado> aulaEmpleadoList;

    public Aula() {
    }

    public Aula(Integer idAula) {
        this.idAula = idAula;
    }

    public Integer getIdAula() {
        return idAula;
    }

    public void setIdAula(Integer idAula) {
        this.idAula = idAula;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Edificio getEdificio() {
        return edificio;
    }

    public void setEdificio(Edificio edificio) {
        this.edificio = edificio;
    }

    @XmlTransient
    public List<AulaEmpleado> getAulaEmpleadoList() {
        return aulaEmpleadoList;
    }

    public void setAulaEmpleadoList(List<AulaEmpleado> aulaEmpleadoList) {
        this.aulaEmpleadoList = aulaEmpleadoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAula != null ? idAula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aula)) {
            return false;
        }
        Aula other = (Aula) object;
        if ((this.idAula == null && other.idAula != null) || (this.idAula != null && !this.idAula.equals(other.idAula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cargoacademico.model.Aula[ idAula=" + idAula + " ]";
    }
    
}
