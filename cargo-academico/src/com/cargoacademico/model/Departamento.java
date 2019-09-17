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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author william.raudausam
 */
@Entity
@Table(name = "departamento")
@XmlRootElement
public class Departamento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_departamento")
    private Integer idDepartamento;
    @Size(max = 175)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 20)
    @Column(name = "telefono")
    private String telefono;
    @JoinColumn(name = "jefe_depto", referencedColumnName = "id_empleado")
    @ManyToOne(optional = false)
    private Empleado jefeDepto;
    @JoinColumn(name = "id_escuela", referencedColumnName = "id_escuela")
    @ManyToOne(optional = false)
    private Escuela idEscuela;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "departamento")
    private List<Materias> materiasList;

    public Departamento() {
    }

    public Departamento(Integer idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public Integer getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Integer idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Empleado getJefeDepto() {
        return jefeDepto;
    }

    public void setJefeDepto(Empleado jefeDepto) {
        this.jefeDepto = jefeDepto;
    }

    public Escuela getIdEscuela() {
        return idEscuela;
    }

    public void setIdEscuela(Escuela idEscuela) {
        this.idEscuela = idEscuela;
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
        hash += (idDepartamento != null ? idDepartamento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Departamento)) {
            return false;
        }
        Departamento other = (Departamento) object;
        if ((this.idDepartamento == null && other.idDepartamento != null) || (this.idDepartamento != null && !this.idDepartamento.equals(other.idDepartamento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cargoacademico.model.Departamento[ idDepartamento=" + idDepartamento + " ]";
    }
    
}
