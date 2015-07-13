package br.com.soft.rpg.service;

import java.util.List;

import br.com.soft.rpg.dao.excecoes.RpgGenericException;
import br.com.soft.rpg.dto.Usuario;

public interface UsuarioService extends GenericService<Usuario>{

	Usuario findByLoginAndSenha(String login, String senha) throws RpgGenericException;
	
	Usuario salvar(Usuario usuario) throws RpgGenericException;
	
	List<Usuario> findByStatusAndTipoUsuario(Character status, Character tipoUsuario) throws RpgGenericException;
}
