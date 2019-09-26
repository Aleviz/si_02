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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author william.raudausam
 */
@Entity
@Table(name = "materia_carrera_ciclo")
@XmlRootElement
public class MateriaCarreraCiclo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_materia_carrera_ciclo")
    private Integer idMateriaCarreraCiclo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "materiaCarreraCiclo")
    private List<Inscripcion> inscripcionList;
    @JoinColumn(name = "carrera_ciclo", referencedColumnName = "id_carrera_ciclo")
    @ManyToOne(optional = false)
    private CarrerasCiclo carreraCiclo;
    @JoinColumn(name = "materia", referencedColumnName = "id_materia")
    @ManyToOne(optional = false)
    private Materias materia;

    public MateriaCarreraCiclo() {
    }

    public MateriaCarreraCiclo(Integer idMateriaCarreraCiclo) {
        this.idMateriaCarreraCiclo = idMateriaCarreraCiclo;
    }

    public Integer getIdMateriaCarreraCiclo() {
        return idMateriaCarreraCiclo;
    }

    public void setIdMateriaCarreraCiclo(Integer idMateriaCarreraCiclo) {
        this.idMateriaCarreraCiclo = idMateriaCarreraCiclo;
    }

    @XmlTransient
    public List<Inscripcion> getInscripcionList() {
        return inscripcionList;
    }

    public void setInscripcionList(List<Inscripcion> inscripcionList) {
        this.inscripcionList = inscripcionList;
    }

    public CarrerasCiclo getCarreraCiclo() {
        return carreraCiclo;
    }

    public void setCarreraCiclo(CarrerasCiclo carreraCiclo) {
        this.carreraCiclo = carreraCiclo;
    }

    public Materias getMateria() {
        return materia;
    }

    public void setMateria(Materias materia) {
        this.materia = materia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMateriaCarreraCiclo != null ? idMateriaCarreraCiclo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MateriaCarreraCiclo)) {
            return false;
        }
        MateriaCarreraCiclo other = (MateriaCarreraCiclo) object;
        if ((this.idMateriaCarreraCiclo == null && other.idMateriaCarreraCiclo != null) || (this.idMateriaCarreraCiclo != null && !this.idMateriaCarreraCiclo.equals(other.idMateriaCarreraCiclo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cargoacademico.model.MateriaCarreraCiclo[ idMateriaCarreraCiclo=" + idMateriaCarreraCiclo + " ]";
    }
    
}
