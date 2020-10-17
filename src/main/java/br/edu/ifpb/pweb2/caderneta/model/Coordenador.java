package br.edu.ifpb.pweb2.caderneta.model;

import java.io.Serializable;

import javax.inject.Named;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Named(value = "tb_coordenador")
public class Coordenador extends Professor implements Serializable {
	private static final long serialVersionUID = 1L;
	
	// ATTRIBUTES
	
	@Column(name = "bo_ativo")
	private Boolean ativo;
	
	// GETTERS AND SETTERS

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	@Override
	public String toString() {
		return "Coordenador [id=" + this.getId() + ", ativo=" + ativo + "]";
	}
	
	// TO STRING, HASHCODE, EQUALS
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.getId() == null) ? 0 : this.getId().hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coordenador other = (Coordenador) obj;
		if (this.getId() == null) {
			if (other.getId() != null)
				return false;
		} else if (!this.getId().equals(other.getId()))
			return false;
		return true;
	}
}
