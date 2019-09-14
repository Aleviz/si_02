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
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author william.raudausam
 */
@Entity
@Table(name = "aula_empleado")
@XmlRootElement
public class AulaEmpleado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_aula_empleado")
    private Integer idAulaEmpleado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cupo")
    private int cupo;
    @JoinColumn(name = "id_aula", referencedColumnName = "id_aula")
    @ManyToOne(optional = false)
    private Aula idAula;
    @JoinColumn(name = "id_empleado_materia", referencedColumnName = "id_emp_mate")
    @OneToOne(optional = false)
    private EmpleadoMateria idEmpleadoMateria;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idHorario")
    private List<AlumnoMateria> alumnoMateriaList;

    public AulaEmpleado() {
    }

    public AulaEmpleado(Integer idAulaEmpleado) {
        this.idAulaEmpleado = idAulaEmpleado;
    }

    public AulaEmpleado(Integer idAulaEmpleado, int cupo) {
        this.idAulaEmpleado = idAulaEmpleado;
        this.cupo = cupo;
    }

    public Integer getIdAulaEmpleado() {
        return idAulaEmpleado;
    }

    public void setIdAulaEmpleado(Integer idAulaEmpleado) {
        this.idAulaEmpleado = idAulaEmpleado;
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public Aula getIdAula() {
        return idAula;
    }

    public void setIdAula(Aula idAula) {
        this.idAula = idAula;
    }

    public EmpleadoMateria getIdEmpleadoMateria() {
        return idEmpleadoMateria;
    }

    public void setIdEmpleadoMateria(EmpleadoMateria idEmpleadoMateria) {
        this.idEmpleadoMateria = idEmpleadoMateria;
    }

    @XmlTransient
    public List<AlumnoMateria> getAlumnoMateriaList() {
        return alumnoMateriaList;
    }

    public void setAlumnoMateriaList(List<AlumnoMateria> alumnoMateriaList) {
        this.alumnoMateriaList = alumnoMateriaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAulaEmpleado != null ? idAulaEmpleado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AulaEmpleado)) {
            return false;
        }
        AulaEmpleado other = (AulaEmpleado) object;
        if ((this.idAulaEmpleado == null && other.idAulaEmpleado != null) || (this.idAulaEmpleado != null && !this.idAulaEmpleado.equals(other.idAulaEmpleado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cargoacademico.model.AulaEmpleado[ idAulaEmpleado=" + idAulaEmpleado + " ]";
    }
    
}
