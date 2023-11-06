package orm1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Aluno {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer matricula;
	@Column(name="NomeAluno")
	private String nome;
	@Column(name="Turma")
	private Integer turma;
	
	
	
	public Aluno(String nome, Integer turma) {
		this.nome = nome;
		this.turma = turma;
	}

	public Integer getMatricula() {
		return matricula;
	}
	
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer getTurma() {
		return turma;
	}
	
	public void setTurma(Integer turma) {
		this.turma = turma;
	}

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + ", turma=" + turma + "]";
	}
	
	
}
