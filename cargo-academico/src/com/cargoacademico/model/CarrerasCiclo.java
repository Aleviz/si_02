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
<<<<<<< HEAD
@Table(name = "carreras_ciclo")
@XmlRootElement
public class CarrerasCiclo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_carrera_ciclo")
    private Integer idCarreraCiclo;
    @JoinColumn(name = "carrera", referencedColumnName = "id_escuela")
    @ManyToOne(optional = false)
    private Escuela carrera;
    @JoinColumn(name = "ciclo", referencedColumnName = "id_ciclo")
    @ManyToOne(optional = false)
    private Ciclo ciclo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "carreraCiclo")
    private List<MateriaCarreraCiclo> materiaCarreraCicloList;

    public CarrerasCiclo() {
    }

    public CarrerasCiclo(Integer idCarreraCiclo) {
        this.idCarreraCiclo = idCarreraCiclo;
    }

    public Integer getIdCarreraCiclo() {
        return idCarreraCiclo;
    }

    public void setIdCarreraCiclo(Integer idCarreraCiclo) {
        this.idCarreraCiclo = idCarreraCiclo;
    }

    public Escuela getCarrera() {
        return carrera;
    }

    public void setCarrera(Escuela carrera) {
        this.carrera = carrera;
    }

    public Ciclo getCiclo() {
        return ciclo;
    }

    public void setCiclo(Ciclo ciclo) {
        this.ciclo = ciclo;
    }

    @XmlTransient
    public List<MateriaCarreraCiclo> getMateriaCarreraCicloList() {
        return materiaCarreraCicloList;
    }

    public void setMateriaCarreraCicloList(List<MateriaCarreraCiclo> materiaCarreraCicloList) {
        this.materiaCarreraCicloList = materiaCarreraCicloList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCarreraCiclo != null ? idCarreraCiclo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CarrerasCiclo)) {
            return false;
        }
        CarrerasCiclo other = (CarrerasCiclo) object;
        if ((this.idCarreraCiclo == null && other.idCarreraCiclo != null) || (this.idCarreraCiclo != null && !this.idCarreraCiclo.equals(other.idCarreraCiclo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cargoacademico.model.CarrerasCiclo[ idCarreraCiclo=" + idCarreraCiclo + " ]";
    }
    
=======
@Table(name = "carreras_ciclo", catalog = "cargo_academico")
public class CarrerasCiclo implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idCarreraCiclo;
	private Ciclo ciclo;
	private Escuela escuela;
	private Set<MateriaCarreraCiclo> materiaCarreraCiclos = new HashSet<MateriaCarreraCiclo>(0);

	public CarrerasCiclo() {
	}

	public CarrerasCiclo(Ciclo ciclo, Escuela escuela) {
		this.ciclo = ciclo;
		this.escuela = escuela;
	}

	public CarrerasCiclo(Ciclo ciclo, Escuela escuela, Set<MateriaCarreraCiclo> materiaCarreraCiclos) {
		this.ciclo = ciclo;
		this.escuela = escuela;
		this.materiaCarreraCiclos = materiaCarreraCiclos;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_carrera_ciclo", unique = true, nullable = false)
	public Integer getIdCarreraCiclo() {
		return this.idCarreraCiclo;
	}

	public void setIdCarreraCiclo(Integer idCarreraCiclo) {
		this.idCarreraCiclo = idCarreraCiclo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ciclo", nullable = false)
	public Ciclo getCiclo() {
		return this.ciclo;
	}

	public void setCiclo(Ciclo ciclo) {
		this.ciclo = ciclo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "carrera", nullable = false)
	public Escuela getEscuela() {
		return this.escuela;
	}

	public void setEscuela(Escuela escuela) {
		this.escuela = escuela;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "carrerasCiclo")
	public Set<MateriaCarreraCiclo> getMateriaCarreraCiclos() {
		return this.materiaCarreraCiclos;
	}

	public void setMateriaCarreraCiclos(Set<MateriaCarreraCiclo> materiaCarreraCiclos) {
		this.materiaCarreraCiclos = materiaCarreraCiclos;
	}

>>>>>>> Geografico
}
