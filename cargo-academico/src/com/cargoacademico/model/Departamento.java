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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author william.raudausam
 */
@Entity
<<<<<<< HEAD
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
    
=======
@Table(name = "departamento", catalog = "cargo_academico")
public class Departamento implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idDepartamento;
	private Empleado empleado;
	private Escuela escuela;
	private String nombre;
	private String telefono;
	private Set<Materias> materiases = new HashSet<Materias>(0);

	public Departamento() {
	}

	public Departamento(Empleado empleado, Escuela escuela) {
		this.empleado = empleado;
		this.escuela = escuela;
	}

	public Departamento(Empleado empleado, Escuela escuela, String nombre, String telefono, Set<Materias> materiases) {
		this.empleado = empleado;
		this.escuela = escuela;
		this.nombre = nombre;
		this.telefono = telefono;
		this.materiases = materiases;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_departamento", unique = true, nullable = false)
	public Integer getIdDepartamento() {
		return this.idDepartamento;
	}

	public void setIdDepartamento(Integer idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "jefe_depto", nullable = false)
	public Empleado getEmpleado() {
		return this.empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_escuela", nullable = false)
	public Escuela getEscuela() {
		return this.escuela;
	}

	public void setEscuela(Escuela escuela) {
		this.escuela = escuela;
	}

	@Column(name = "nombre", length = 175)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "telefono", length = 20)
	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "departamento")
	public Set<Materias> getMateriases() {
		return this.materiases;
	}

	public void setMateriases(Set<Materias> materiases) {
		this.materiases = materiases;
	}

>>>>>>> Geografico
}
