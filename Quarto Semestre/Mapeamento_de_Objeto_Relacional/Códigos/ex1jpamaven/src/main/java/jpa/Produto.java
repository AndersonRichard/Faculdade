package jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Produto{
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  public Integer cod;
  
  @Column(name="nomeprod")
  public String nome;
  
  @Column(name="categprod")
  public Integer categoria;
  
  public Produto() {
	  
  }
  
  public Produto(Integer cod, 
		        String nome, 
		        Integer categoria) {
	  this.cod = cod;
	  this.nome = nome;
	  this.categoria = categoria;
  }

  public Integer getCod() {
  	  return cod;
  }

  public void setCod(Integer cod) {
	  this.cod = cod;
  }

  public String getNome() {
	  return nome;
  }

  public void setNome(String nome) {
	  this.nome = nome;
  }

  public Integer getCategoria() {
	  return categoria;
  }

  public void setCategoria(Integer categoria) {
 	  this.categoria = categoria; 
  }

  @Override
  public String toString() {
 	  return "Produto [cod=" + cod + ", nome=" + nome + ", categoria=" + categoria + "]";
  }
  
  
}