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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author william.raudausam
 */
@Entity
@Table(name = "facultad")
@XmlRootElement
public class Facultad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_facultad")
    private Integer idFacultad;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "facultad")
    private String facultad;
    @Size(max = 20)
    @Column(name = "telefono")
    private String telefono;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "ubicacion")
    private String ubicacion;
    @Lob
    @Column(name = "img")
    private byte[] img;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFacultad")
    private List<Escuela> escuelaList;
    @JoinColumn(name = "campus", referencedColumnName = "id_campus")
    @ManyToOne(optional = false)
    private Campus campus;
    @JoinColumn(name = "decano", referencedColumnName = "id_empleado")
    @ManyToOne(optional = false)
    private Empleado decano;
    @JoinColumn(name = "id_coordenada", referencedColumnName = "id_coordenada")
    @OneToOne(optional = false)
    private Coordenadas idCoordenada;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "facultad")
    private List<Edificio> edificioList;

    public Facultad() {
    }

    public Facultad(Integer idFacultad) {
        this.idFacultad = idFacultad;
    }

    public Integer getIdFacultad() {
        return idFacultad;
    }

    public void setIdFacultad(Integer idFacultad) {
        this.idFacultad = idFacultad;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }

    @XmlTransient
    public List<Escuela> getEscuelaList() {
        return escuelaList;
    }

    public void setEscuelaList(List<Escuela> escuelaList) {
        this.escuelaList = escuelaList;
    }

    public Campus getCampus() {
        return campus;
    }

    public void setCampus(Campus campus) {
        this.campus = campus;
    }

    public Empleado getDecano() {
        return decano;
    }

    public void setDecano(Empleado decano) {
        this.decano = decano;
    }

    public Coordenadas getIdCoordenada() {
        return idCoordenada;
    }

    public void setIdCoordenada(Coordenadas idCoordenada) {
        this.idCoordenada = idCoordenada;
    }

    @XmlTransient
    public List<Edificio> getEdificioList() {
        return edificioList;
    }

    public void setEdificioList(List<Edificio> edificioList) {
        this.edificioList = edificioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFacultad != null ? idFacultad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Facultad)) {
            return false;
        }
        Facultad other = (Facultad) object;
        if ((this.idFacultad == null && other.idFacultad != null) || (this.idFacultad != null && !this.idFacultad.equals(other.idFacultad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cargoacademico.model.Facultad[ idFacultad=" + idFacultad + " ]";
    }
    
}
