package br.com.soft.rpg.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_personagem")
public class Personagem implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue
	@Column(name = "id_personagem")
	private Integer idPersonagem;

	@Column(name = "nome")
	private String nome;
	
	@Column(name = "idade")
	private Integer idade;
	
	@Column(name = "altura")
	private Integer altura;
	
	@Column(name = "experiencia")
	private Integer experiencia;
	
	@Column(name = "dinheiro")
	private Double dinheiro;

	public Integer getIdPersonagem() {
		return idPersonagem;
	}

	public void setIdPersonagem(Integer idPersonagem) {
		this.idPersonagem = idPersonagem;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Integer getAltura() {
		return altura;
	}

	public void setAltura(Integer altura) {
		this.altura = altura;
	}

	public Integer getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(Integer experiencia) {
		this.experiencia = experiencia;
	}

	public Double getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(Double dinheiro) {
		this.dinheiro = dinheiro;
	}

}