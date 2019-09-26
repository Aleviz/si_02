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
    
=======
@Table(name = "materias", catalog = "cargo_academico", uniqueConstraints = @UniqueConstraint(columnNames = "codigo"))
public class Materias implements java.io.Serializable {

	private Integer idMateria;
	private Departamento departamento;
	private Materias materiasByCorequisito;
	private Materias materiasByPrerequisito;
	private Temario temario;
	private String materia;
	private String codigo;
	private int unidadValorativa;
	private Set<MateriaHorario> materiaHorarios = new HashSet<MateriaHorario>(0);
	private Set<Materias> materiasesForCorequisito = new HashSet<Materias>(0);
	private Set<Materias> materiasesForPrerequisito = new HashSet<Materias>(0);
	private Set<MateriaCarreraCiclo> materiaCarreraCiclos = new HashSet<MateriaCarreraCiclo>(0);

	public Materias() {
	}

	public Materias(Departamento departamento, Temario temario, int unidadValorativa) {
		this.departamento = departamento;
		this.temario = temario;
		this.unidadValorativa = unidadValorativa;
	}

	public Materias(Departamento departamento, Materias materiasByCorequisito, Materias materiasByPrerequisito,
			Temario temario, String materia, String codigo, int unidadValorativa, Set<MateriaHorario> materiaHorarios,
			Set<Materias> materiasesForCorequisito, Set<Materias> materiasesForPrerequisito,
			Set<MateriaCarreraCiclo> materiaCarreraCiclos) {
		this.departamento = departamento;
		this.materiasByCorequisito = materiasByCorequisito;
		this.materiasByPrerequisito = materiasByPrerequisito;
		this.temario = temario;
		this.materia = materia;
		this.codigo = codigo;
		this.unidadValorativa = unidadValorativa;
		this.materiaHorarios = materiaHorarios;
		this.materiasesForCorequisito = materiasesForCorequisito;
		this.materiasesForPrerequisito = materiasesForPrerequisito;
		this.materiaCarreraCiclos = materiaCarreraCiclos;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_materia", unique = true, nullable = false)
	public Integer getIdMateria() {
		return this.idMateria;
	}

	public void setIdMateria(Integer idMateria) {
		this.idMateria = idMateria;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "departamento", nullable = false)
	public Departamento getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "corequisito")
	public Materias getMateriasByCorequisito() {
		return this.materiasByCorequisito;
	}

	public void setMateriasByCorequisito(Materias materiasByCorequisito) {
		this.materiasByCorequisito = materiasByCorequisito;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "prerequisito")
	public Materias getMateriasByPrerequisito() {
		return this.materiasByPrerequisito;
	}

	public void setMateriasByPrerequisito(Materias materiasByPrerequisito) {
		this.materiasByPrerequisito = materiasByPrerequisito;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "temario", nullable = false)
	public Temario getTemario() {
		return this.temario;
	}

	public void setTemario(Temario temario) {
		this.temario = temario;
	}

	@Column(name = "materia", length = 175)
	public String getMateria() {
		return this.materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	@Column(name = "codigo", unique = true, length = 8)
	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Column(name = "unidad_valorativa", nullable = false)
	public int getUnidadValorativa() {
		return this.unidadValorativa;
	}

	public void setUnidadValorativa(int unidadValorativa) {
		this.unidadValorativa = unidadValorativa;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "materias")
	public Set<MateriaHorario> getMateriaHorarios() {
		return this.materiaHorarios;
	}

	public void setMateriaHorarios(Set<MateriaHorario> materiaHorarios) {
		this.materiaHorarios = materiaHorarios;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "materiasByCorequisito")
	public Set<Materias> getMateriasesForCorequisito() {
		return this.materiasesForCorequisito;
	}

	public void setMateriasesForCorequisito(Set<Materias> materiasesForCorequisito) {
		this.materiasesForCorequisito = materiasesForCorequisito;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "materiasByPrerequisito")
	public Set<Materias> getMateriasesForPrerequisito() {
		return this.materiasesForPrerequisito;
	}

	public void setMateriasesForPrerequisito(Set<Materias> materiasesForPrerequisito) {
		this.materiasesForPrerequisito = materiasesForPrerequisito;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "materias")
	public Set<MateriaCarreraCiclo> getMateriaCarreraCiclos() {
		return this.materiaCarreraCiclos;
	}

	public void setMateriaCarreraCiclos(Set<MateriaCarreraCiclo> materiaCarreraCiclos) {
		this.materiaCarreraCiclos = materiaCarreraCiclos;
	}

>>>>>>> Geografico
}
