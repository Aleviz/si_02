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
<<<<<<< HEAD
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
    
=======
@Table(name = "escuela", catalog = "cargo_academico")
public class Escuela implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idEscuela;
	private Facultad facultad;
	private String nombreEscuela;
	private String telefono;
	private String direccion;
	private String descripcion;
	private String campoDeAccion;
	private String mision;
	private String vision;
	private String objetivo;
	private Set<Departamento> departamentos = new HashSet<Departamento>(0);
	private Set<CarrerasCiclo> carrerasCiclos = new HashSet<CarrerasCiclo>(0);

	public Escuela() {
	}

	public Escuela(Facultad facultad, String telefono, String direccion, String descripcion, String campoDeAccion,
			String mision, String vision, String objetivo) {
		this.facultad = facultad;
		this.telefono = telefono;
		this.direccion = direccion;
		this.descripcion = descripcion;
		this.campoDeAccion = campoDeAccion;
		this.mision = mision;
		this.vision = vision;
		this.objetivo = objetivo;
	}

	public Escuela(Facultad facultad, String nombreEscuela, String telefono, String direccion, String descripcion,
			String campoDeAccion, String mision, String vision, String objetivo, Set<Departamento> departamentos,
			Set<CarrerasCiclo> carrerasCiclos) {
		this.facultad = facultad;
		this.nombreEscuela = nombreEscuela;
		this.telefono = telefono;
		this.direccion = direccion;
		this.descripcion = descripcion;
		this.campoDeAccion = campoDeAccion;
		this.mision = mision;
		this.vision = vision;
		this.objetivo = objetivo;
		this.departamentos = departamentos;
		this.carrerasCiclos = carrerasCiclos;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_escuela", unique = true, nullable = false)
	public Integer getIdEscuela() {
		return this.idEscuela;
	}

	public void setIdEscuela(Integer idEscuela) {
		this.idEscuela = idEscuela;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_facultad", nullable = false)
	public Facultad getFacultad() {
		return this.facultad;
	}

	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}

	@Column(name = "nombre_escuela", length = 45)
	public String getNombreEscuela() {
		return this.nombreEscuela;
	}

	public void setNombreEscuela(String nombreEscuela) {
		this.nombreEscuela = nombreEscuela;
	}

	@Column(name = "telefono", nullable = false, length = 20)
	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Column(name = "direccion", nullable = false, length = 70)
	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Column(name = "descripcion", nullable = false, length = 65535)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "campo_de_accion", nullable = false, length = 65535)
	public String getCampoDeAccion() {
		return this.campoDeAccion;
	}

	public void setCampoDeAccion(String campoDeAccion) {
		this.campoDeAccion = campoDeAccion;
	}

	@Column(name = "mision", nullable = false, length = 65535)
	public String getMision() {
		return this.mision;
	}

	public void setMision(String mision) {
		this.mision = mision;
	}

	@Column(name = "vision", nullable = false, length = 65535)
	public String getVision() {
		return this.vision;
	}

	public void setVision(String vision) {
		this.vision = vision;
	}

	@Column(name = "objetivo", nullable = false, length = 65535)
	public String getObjetivo() {
		return this.objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "escuela")
	public Set<Departamento> getDepartamentos() {
		return this.departamentos;
	}

	public void setDepartamentos(Set<Departamento> departamentos) {
		this.departamentos = departamentos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "escuela")
	public Set<CarrerasCiclo> getCarrerasCiclos() {
		return this.carrerasCiclos;
	}

	public void setCarrerasCiclos(Set<CarrerasCiclo> carrerasCiclos) {
		this.carrerasCiclos = carrerasCiclos;
	}

>>>>>>> Geografico
}
