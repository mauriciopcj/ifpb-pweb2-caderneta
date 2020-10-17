package br.edu.ifpb.pweb2.caderneta.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_nota")
public class Nota implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "nu_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	// ATTRIBUTES
	
	@Column(name = "nu_nota")
	private Integer nota;
	
	@ManyToOne
	@JoinColumn(name = "id_aluno_turma")
	private AlunoTurma alunoTurma;
	
	// GETTERS AND SETTERS
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}
	
	// TO STRING, HASHCODE, EQUALS
	
	@Override
	public String toString() {
		return "Nota [id=" + id + ", nota=" + nota + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Nota other = (Nota) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
