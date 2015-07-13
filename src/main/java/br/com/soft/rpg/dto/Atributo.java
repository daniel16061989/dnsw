package br.com.soft.rpg.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_atributo")
public class Atributo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue
	@Column(name = "id_atributo")
	private Integer idAtributo;

	@Column(name = "habilidade")
	private Integer habilidade;
	
	@Column(name = "fortitude")
	private Integer fortitude;
	
	@Column(name = "reflexo")
	private Integer reflexo;
	
	@Column(name = "vontade")
	private Integer vontade;
	
	@ManyToOne
	@JoinColumn(name = "id_sistema")
	private Sistema sistema;
	
	@Column(name = "flag_ativo")
	private Boolean flagAtivo;

	public Integer getIdAtributo() {
		return idAtributo;
	}

	public void setIdAtributo(Integer idAtributo) {
		this.idAtributo = idAtributo;
	}

	public Integer getHabilidade() {
		return habilidade;
	}

	public void setHabilidade(Integer habilidade) {
		this.habilidade = habilidade;
	}

	public Integer getFortitude() {
		return fortitude;
	}

	public void setFortitude(Integer fortitude) {
		this.fortitude = fortitude;
	}

	public Integer getReflexo() {
		return reflexo;
	}

	public void setReflexo(Integer reflexo) {
		this.reflexo = reflexo;
	}

	public Integer getVontade() {
		return vontade;
	}

	public void setVontade(Integer vontade) {
		this.vontade = vontade;
	}

	public Sistema getSistema() {
		return sistema;
	}

	public void setSistema(Sistema sistema) {
		this.sistema = sistema;
	}

	public Boolean getFlagAtivo() {
		return flagAtivo;
	}

	public void setFlagAtivo(Boolean flagAtivo) {
		this.flagAtivo = flagAtivo;
	}

}