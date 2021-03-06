package br.com.soft.rpg.session;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import br.com.soft.rpg.constant.Constantes;
import br.com.soft.rpg.dto.InformacaoLogin;
import br.com.soft.rpg.dto.Usuario;

@Component(value = Constantes.CHAVE_USUARIO_LOGADO)
@Scope(value = WebApplicationContext.SCOPE_SESSION)
public class UsuarioLogado implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Usuario usuario;

	private Object object;
	
	private Boolean autenticado = Boolean.FALSE;
	
	private InformacaoLogin informacaoLogin;
	
	private Integer quantidadeMensagens;

	public UsuarioLogado() {
		// carrega os dados daquele usuário
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public Boolean getAutenticado() {
		return autenticado;
	}

	public void setAutenticado(Boolean autenticado) {
		this.autenticado = autenticado;
	}

	public InformacaoLogin getInformacaoLogin() {
		return informacaoLogin;
	}

	public void setInformacaoLogin(InformacaoLogin informacaoLogin) {
		this.informacaoLogin = informacaoLogin;
	}

	public Integer getQuantidadeMensagens() {
		return quantidadeMensagens;
	}

	public void setQuantidadeMensagens(Integer quantidadeMensagens) {
		this.quantidadeMensagens = quantidadeMensagens;
	}

}
