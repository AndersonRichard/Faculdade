package models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Cliente {
	@Id
	private String cpf;
	@Column
	private String nome;
	@Column
	private String telefone;
	@Column
	private String endereco;
	
	
	@OneToMany
	@JoinTable(name="cliente_carro", joinColumns = @JoinColumn(name = "cliente_cpf"), inverseJoinColumns = @JoinColumn (name= "carro_chassi"))
	private List<Carro> carro;
	
	
	private Cliente(){
		
	}

	public Cliente(String cpf, String nome, String telefone, String endereco) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public List<Carro> getCarro() {
		return carro;
	}
	
	public void adicionaCarro(Carro c) {
    	carro.add(c);
    }
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	

	@Override
	public String toString() {
		return "Cliente [cpf=" + cpf + ", nome=" + nome + ", telefone=" + telefone + ", endereco=" + endereco + "]";
	}
	
	
}
