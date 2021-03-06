package model;

// Generated 28 avr. 2015 00:46:40 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.Proxy;

/**
 * Role generated by hbm2java
 */
@Entity
@Table(name = "role", catalog = "ibm_pfe")
@XmlRootElement

public class Role implements java.io.Serializable {

	private int idRole;
	private String designation;
	private Set<Agent> agents = new HashSet<Agent>(0);
	private Set<Expert> experts = new HashSet<Expert>(0);

	public Role() {
	}

	public Role(int idRole) {
		this.idRole = idRole;
	}

	public Role(int idRole, String designation, Set<Agent> agents,
			Set<Expert> experts) {
		this.idRole = idRole;
		this.designation = designation;
		this.agents = agents;
		this.experts = experts;
	}

	@Id
	@Column(name = "id_role", unique = true, nullable = false)
	public int getIdRole() {
		return this.idRole;
	}

	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}

	@Column(name = "designation", length = 254)
	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "role")
	public Set<Agent> getAgents() {
		return this.agents;
	}

	public void setAgents(Set<Agent> agents) {
		this.agents = agents;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "role")
	public Set<Expert> getExperts() {
		return this.experts;
	}

	public void setExperts(Set<Expert> experts) {
		this.experts = experts;
	}

}
