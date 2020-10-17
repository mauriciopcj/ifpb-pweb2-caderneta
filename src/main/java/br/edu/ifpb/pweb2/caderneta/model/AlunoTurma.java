package br.edu.ifpb.pweb2.caderneta.model;

import java.io.Serializable;
import java.util.List;

import javax.inject.Named;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@Named(value = "tb_aluno_turma")
public class AlunoTurma implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "nu_id")
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "id_aluno")
	private Aluno aluno;
	
	@ManyToOne
	@JoinColumn(name = "id_turma")
	private Turma turma;
	
	@OneToMany(mappedBy = "alunoTurma")
	private List<Nota> notas;
}
