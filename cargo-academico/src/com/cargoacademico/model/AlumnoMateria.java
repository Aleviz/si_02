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

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author william.raudausam
 */
@Entity
@Table(name = "alumno_materia")
@XmlRootElement
public class AlumnoMateria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_alumno_materia")
    private Integer idAlumnoMateria;
    @Size(max = 9)
    @Column(name = "estado")
    private String estado;
    @JoinColumn(name = "id_horario", referencedColumnName = "id_aula_empleado")
    @ManyToOne(optional = false)
    private AulaEmpleado idHorario;
    @JoinColumn(name = "id_alumno", referencedColumnName = "id_inscripcion")
    @ManyToOne(optional = false)
    private Inscripcion idAlumno;

    public AlumnoMateria() {
    }

    public AlumnoMateria(Integer idAlumnoMateria) {
        this.idAlumnoMateria = idAlumnoMateria;
    }

    public Integer getIdAlumnoMateria() {
        return idAlumnoMateria;
    }

    public void setIdAlumnoMateria(Integer idAlumnoMateria) {
        this.idAlumnoMateria = idAlumnoMateria;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public AulaEmpleado getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(AulaEmpleado idHorario) {
        this.idHorario = idHorario;
    }

    public Inscripcion getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Inscripcion idAlumno) {
        this.idAlumno = idAlumno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAlumnoMateria != null ? idAlumnoMateria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AlumnoMateria)) {
            return false;
        }
        AlumnoMateria other = (AlumnoMateria) object;
        if ((this.idAlumnoMateria == null && other.idAlumnoMateria != null) || (this.idAlumnoMateria != null && !this.idAlumnoMateria.equals(other.idAlumnoMateria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cargoacademico.model.AlumnoMateria[ idAlumnoMateria=" + idAlumnoMateria + " ]";
    }
    
}
