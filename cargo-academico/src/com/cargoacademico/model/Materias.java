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

/**
 *
 * @author william.raudausam
 */
@Entity
@Table(name = "materias")
@XmlRootElement
public class Materias implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_materia")
    private Integer idMateria;
    @Size(max = 175)
    @Column(name = "materia")
    private String materia;
    @Size(max = 8)
    @Column(name = "codigo")
    private String codigo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "unidad_valorativa")
    private int unidadValorativa;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "materia")
    private List<MateriaHorario> materiaHorarioList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "materia")
    private List<MateriaCarreraCiclo> materiaCarreraCicloList;
    @OneToMany(mappedBy = "corequisito")
    private List<Materias> materiasList;
    @JoinColumn(name = "corequisito", referencedColumnName = "id_materia")
    @ManyToOne
    private Materias corequisito;
    @JoinColumn(name = "temario", referencedColumnName = "id_temario")
    @ManyToOne(optional = false)
    private Temario temario;
    @OneToMany(mappedBy = "prerequisito")
    private List<Materias> materiasList1;
    @JoinColumn(name = "prerequisito", referencedColumnName = "id_materia")
    @ManyToOne
    private Materias prerequisito;
    @JoinColumn(name = "departamento", referencedColumnName = "id_departamento")
    @ManyToOne(optional = false)
    private Departamento departamento;

    public Materias() {
    }

    public Materias(Integer idMateria) {
        this.idMateria = idMateria;
    }

    public Materias(Integer idMateria, int unidadValorativa) {
        this.idMateria = idMateria;
        this.unidadValorativa = unidadValorativa;
    }

    public Integer getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Integer idMateria) {
        this.idMateria = idMateria;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getUnidadValorativa() {
        return unidadValorativa;
    }

    public void setUnidadValorativa(int unidadValorativa) {
        this.unidadValorativa = unidadValorativa;
    }

    @XmlTransient
    public List<MateriaHorario> getMateriaHorarioList() {
        return materiaHorarioList;
    }

    public void setMateriaHorarioList(List<MateriaHorario> materiaHorarioList) {
        this.materiaHorarioList = materiaHorarioList;
    }

    @XmlTransient
    public List<MateriaCarreraCiclo> getMateriaCarreraCicloList() {
        return materiaCarreraCicloList;
    }

    public void setMateriaCarreraCicloList(List<MateriaCarreraCiclo> materiaCarreraCicloList) {
        this.materiaCarreraCicloList = materiaCarreraCicloList;
    }

    @XmlTransient
    public List<Materias> getMateriasList() {
        return materiasList;
    }

    public void setMateriasList(List<Materias> materiasList) {
        this.materiasList = materiasList;
    }

    public Materias getCorequisito() {
        return corequisito;
    }

    public void setCorequisito(Materias corequisito) {
        this.corequisito = corequisito;
    }

    public Temario getTemario() {
        return temario;
    }

    public void setTemario(Temario temario) {
        this.temario = temario;
    }

    @XmlTransient
    public List<Materias> getMateriasList1() {
        return materiasList1;
    }

    public void setMateriasList1(List<Materias> materiasList1) {
        this.materiasList1 = materiasList1;
    }

    public Materias getPrerequisito() {
        return prerequisito;
    }

    public void setPrerequisito(Materias prerequisito) {
        this.prerequisito = prerequisito;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMateria != null ? idMateria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Materias)) {
            return false;
        }
        Materias other = (Materias) object;
        if ((this.idMateria == null && other.idMateria != null) || (this.idMateria != null && !this.idMateria.equals(other.idMateria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cargoacademico.model.Materias[ idMateria=" + idMateria + " ]";
    }
    
}
