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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author william.raudausam
 */
@Entity
@Table(name = "materia_horario")
@XmlRootElement
public class MateriaHorario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_materia_horario")
    private Integer idMateriaHorario;
    @Size(max = 30)
    @Column(name = "horario")
    private String horario;
    @JoinColumn(name = "materia", referencedColumnName = "id_materia")
    @ManyToOne(optional = false)
    private Materias materia;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "idMateria")
    private EmpleadoMateria empleadoMateria;

    public MateriaHorario() {
    }

    public MateriaHorario(Integer idMateriaHorario) {
        this.idMateriaHorario = idMateriaHorario;
    }

    public Integer getIdMateriaHorario() {
        return idMateriaHorario;
    }

    public void setIdMateriaHorario(Integer idMateriaHorario) {
        this.idMateriaHorario = idMateriaHorario;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Materias getMateria() {
        return materia;
    }

    public void setMateria(Materias materia) {
        this.materia = materia;
    }

    public EmpleadoMateria getEmpleadoMateria() {
        return empleadoMateria;
    }

    public void setEmpleadoMateria(EmpleadoMateria empleadoMateria) {
        this.empleadoMateria = empleadoMateria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMateriaHorario != null ? idMateriaHorario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MateriaHorario)) {
            return false;
        }
        MateriaHorario other = (MateriaHorario) object;
        if ((this.idMateriaHorario == null && other.idMateriaHorario != null) || (this.idMateriaHorario != null && !this.idMateriaHorario.equals(other.idMateriaHorario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cargoacademico.model.MateriaHorario[ idMateriaHorario=" + idMateriaHorario + " ]";
    }
    
}
