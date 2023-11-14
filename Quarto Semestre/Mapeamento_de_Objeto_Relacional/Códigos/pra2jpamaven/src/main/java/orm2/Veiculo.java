package orm2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Veiculo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer chassi;
	@Column(name="Fabricante")
	private String fabricante;
	@Column(name="Descricao")
	private String descricao;
	@Column(name="Versao")
	private String versao;
	@Column(name="Modelo")
	private String modelo;
	@Column(name="Ano")
	private String ano;
	@Column(name="Quantidade")
	private Integer quantidade;
	
	public Veiculo() {
		  
	  }
		
	public Veiculo(String fabricante, String descricao, String versao, String modelo, String ano,
			Integer quantidade) {
		this.fabricante = fabricante;
		this.descricao = descricao;
		this.versao = versao;
		this.modelo = modelo;
		this.ano = ano;
		this.quantidade = quantidade;
	}
	
	public Integer getChassi() {
		return chassi;
	}
	
	public void setChassi(Integer chassi) {
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
	
	public String getVersao() {
		return versao;
	}
	
	public void setVersao(String versao) {
		this.versao = versao;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getAno() {
		return ano;
	}
	
	public void setAno(String ano) {
		this.ano = ano;
	}
	
	public Integer getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	@Override
	public String toString() {
		return "Veiculo [chassi=" + chassi + ", fabricante=" + fabricante + ", descricao=" + descricao + ", versao="
				+ versao + ", modelo=" + modelo + ", ano=" + ano + ", quantidade=" + quantidade + "]";
	}
	
	
	
}
