package br.com.soft.rpg.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.soft.rpg.dto.Usuario;

public interface UsuarioDAO extends JpaRepository<Usuario, Integer> {
	
	Usuario findByLoginAndSenha(String login, String senha);
	
	List<Usuario> findByStatusAndTipoUsuario(Character status, Character tipoUsuario);
}
