package br.com.soft.rpg.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_efeito")
public class Efeito implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue
	@Column(name = "id_efeito")
	private Integer idEfeito;
	
	@Column(name = "nome")
	private String nome;

	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "atributo")
	private String atributo;
	
	@Column(name = "valor")
	private String valor;
	
	@Column(name = "duracao")
	private String duracao;
	
	@Column(name = "gasto")
	private String gasto;

	public Integer getIdEfeito() {
		return idEfeito;
	}

	public void setIdEfeito(Integer idEfeito) {
		this.idEfeito = idEfeito;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getAtributo() {
		return atributo;
	}

	public void setAtributo(String atributo) {
		this.atributo = atributo;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public String getGasto() {
		return gasto;
	}

	public void setGasto(String gasto) {
		this.gasto = gasto;
	}

}