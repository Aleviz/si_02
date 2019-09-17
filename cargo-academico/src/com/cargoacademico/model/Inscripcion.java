/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cargoacademico.model;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author william.raudausam
 */
@Entity
@Table(name = "inscripcion")
@XmlRootElement
public class Inscripcion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_inscripcion")
    private Integer idInscripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Column(name = "inicio")
    @Temporal(TemporalType.DATE)
    private Date inicio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "final")
    @Temporal(TemporalType.DATE)
    private Date final1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAlumno")
    private List<AlumnoMateria> alumnoMateriaList;
    @JoinColumn(name = "materia_carrera_ciclo", referencedColumnName = "id_materia_carrera_ciclo")
    @ManyToOne(optional = false)
    private MateriaCarreraCiclo materiaCarreraCiclo;
    @JoinColumn(name = "alumno", referencedColumnName = "id_alumno")
    @ManyToOne(optional = false)
    private Alumno alumno;

    public Inscripcion() {
    }

    public Inscripcion(Integer idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public Inscripcion(Integer idInscripcion, Date fecha, Date inicio, Date final1) {
        this.idInscripcion = idInscripcion;
        this.fecha = fecha;
        this.inicio = inicio;
        this.final1 = final1;
    }

    public Integer getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(Integer idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFinal1() {
        return final1;
    }

    public void setFinal1(Date final1) {
        this.final1 = final1;
    }

    @XmlTransient
    public List<AlumnoMateria> getAlumnoMateriaList() {
        return alumnoMateriaList;
    }

    public void setAlumnoMateriaList(List<AlumnoMateria> alumnoMateriaList) {
        this.alumnoMateriaList = alumnoMateriaList;
    }

    public MateriaCarreraCiclo getMateriaCarreraCiclo() {
        return materiaCarreraCiclo;
    }

    public void setMateriaCarreraCiclo(MateriaCarreraCiclo materiaCarreraCiclo) {
        this.materiaCarreraCiclo = materiaCarreraCiclo;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idInscripcion != null ? idInscripcion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inscripcion)) {
            return false;
        }
        Inscripcion other = (Inscripcion) object;
        if ((this.idInscripcion == null && other.idInscripcion != null) || (this.idInscripcion != null && !this.idInscripcion.equals(other.idInscripcion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cargoacademico.model.Inscripcion[ idInscripcion=" + idInscripcion + " ]";
    }
    
}
