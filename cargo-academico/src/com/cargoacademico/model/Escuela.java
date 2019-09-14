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
import javax.persistence.Lob;
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
@Table(name = "escuela")
@XmlRootElement
public class Escuela implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_escuela")
    private Integer idEscuela;
    @Size(max = 45)
    @Column(name = "nombre_escuela")
    private String nombreEscuela;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "telefono")
    private String telefono;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 70)
    @Column(name = "direccion")
    private String direccion;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "descripcion")
    private byte[] descripcion;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "campo_de_accion")
    private byte[] campoDeAccion;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "mision")
    private byte[] mision;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "vision")
    private byte[] vision;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "objetivo")
    private byte[] objetivo;
    @JoinColumn(name = "id_facultad", referencedColumnName = "id_facultad")
    @ManyToOne(optional = false)
    private Facultad idFacultad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "carrera")
    private List<CarrerasCiclo> carrerasCicloList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEscuela")
    private List<Departamento> departamentoList;

    public Escuela() {
    }

    public Escuela(Integer idEscuela) {
        this.idEscuela = idEscuela;
    }

    public Escuela(Integer idEscuela, String telefono, String direccion, byte[] descripcion, byte[] campoDeAccion, byte[] mision, byte[] vision, byte[] objetivo) {
        this.idEscuela = idEscuela;
        this.telefono = telefono;
        this.direccion = direccion;
        this.descripcion = descripcion;
        this.campoDeAccion = campoDeAccion;
        this.mision = mision;
        this.vision = vision;
        this.objetivo = objetivo;
    }

    public Integer getIdEscuela() {
        return idEscuela;
    }

    public void setIdEscuela(Integer idEscuela) {
        this.idEscuela = idEscuela;
    }

    public String getNombreEscuela() {
        return nombreEscuela;
    }

    public void setNombreEscuela(String nombreEscuela) {
        this.nombreEscuela = nombreEscuela;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public byte[] getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(byte[] descripcion) {
        this.descripcion = descripcion;
    }

    public byte[] getCampoDeAccion() {
        return campoDeAccion;
    }

    public void setCampoDeAccion(byte[] campoDeAccion) {
        this.campoDeAccion = campoDeAccion;
    }

    public byte[] getMision() {
        return mision;
    }

    public void setMision(byte[] mision) {
        this.mision = mision;
    }

    public byte[] getVision() {
        return vision;
    }

    public void setVision(byte[] vision) {
        this.vision = vision;
    }

    public byte[] getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(byte[] objetivo) {
        this.objetivo = objetivo;
    }

    public Facultad getIdFacultad() {
        return idFacultad;
    }

    public void setIdFacultad(Facultad idFacultad) {
        this.idFacultad = idFacultad;
    }

    @XmlTransient
    public List<CarrerasCiclo> getCarrerasCicloList() {
        return carrerasCicloList;
    }

    public void setCarrerasCicloList(List<CarrerasCiclo> carrerasCicloList) {
        this.carrerasCicloList = carrerasCicloList;
    }

    @XmlTransient
    public List<Departamento> getDepartamentoList() {
        return departamentoList;
    }

    public void setDepartamentoList(List<Departamento> departamentoList) {
        this.departamentoList = departamentoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEscuela != null ? idEscuela.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Escuela)) {
            return false;
        }
        Escuela other = (Escuela) object;
        if ((this.idEscuela == null && other.idEscuela != null) || (this.idEscuela != null && !this.idEscuela.equals(other.idEscuela))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cargoacademico.model.Escuela[ idEscuela=" + idEscuela + " ]";
    }
    
}
