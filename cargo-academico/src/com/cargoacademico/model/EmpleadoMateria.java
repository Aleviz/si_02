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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author william.raudausam
 */
@Entity
@Table(name = "empleado_materia")
@XmlRootElement
public class EmpleadoMateria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_emp_mate")
    private Integer idEmpMate;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "idEmpleadoMateria")
    private AulaEmpleado aulaEmpleado;
    @JoinColumn(name = "id_materia", referencedColumnName = "id_materia_horario")
    @OneToOne(optional = false)
    private MateriaHorario idMateria;
    @JoinColumn(name = "empleado", referencedColumnName = "id_empleado")
    @ManyToOne(optional = false)
    private Empleado empleado;

    public EmpleadoMateria() {
    }

    public EmpleadoMateria(Integer idEmpMate) {
        this.idEmpMate = idEmpMate;
    }

    public Integer getIdEmpMate() {
        return idEmpMate;
    }

    public void setIdEmpMate(Integer idEmpMate) {
        this.idEmpMate = idEmpMate;
    }

    public AulaEmpleado getAulaEmpleado() {
        return aulaEmpleado;
    }

    public void setAulaEmpleado(AulaEmpleado aulaEmpleado) {
        this.aulaEmpleado = aulaEmpleado;
    }

    public MateriaHorario getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(MateriaHorario idMateria) {
        this.idMateria = idMateria;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpMate != null ? idEmpMate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmpleadoMateria)) {
            return false;
        }
        EmpleadoMateria other = (EmpleadoMateria) object;
        if ((this.idEmpMate == null && other.idEmpMate != null) || (this.idEmpMate != null && !this.idEmpMate.equals(other.idEmpMate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cargoacademico.model.EmpleadoMateria[ idEmpMate=" + idEmpMate + " ]";
    }
    
}
