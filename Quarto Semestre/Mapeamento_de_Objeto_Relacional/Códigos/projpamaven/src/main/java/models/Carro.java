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
public class Carro {
	@Id
	private String chassi;
	
	@Column
	private String fabricante;
	
	@Column
	private String descricao;
	
	@Column
	private Integer ano;
	
	@Column
	private String modelo;
	
	@Column
	private String cor;
	
	@ManyToOne
	@JoinColumn(name = "cpf_cliente")
	private Cliente cliente;
	
	
	public Carro(){
		
	}

	public Carro(String chassi, String fabricante, String descricao, Integer ano, String modelo, String cor, Cliente cliente) {
		this.chassi = chassi;
		this.fabricante = fabricante;
		this.descricao = descricao;
		this.ano = ano;
		this.modelo = modelo;
		this.cor = cor;
		this.cliente = cliente;
	}
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public String getChassi() {
		return chassi;
	}


	public void setChassi(String chassi) {
		this.chassi = chassi;
	}


	public String getFabricante() {
		return fabricante;
	}


	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public Integer getAno() {
		return ano;
	}


	public void setAno(Integer ano) {
		this.ano = ano;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	@Override
	public String toString() {
		return "Carro [chassi=" + chassi + ", fabricante=" + fabricante + ", descricao=" + descricao + ", ano=" + ano
				+ ", modelo=" + modelo + ", cor=" + cor + "]";
	}
	
	
}
