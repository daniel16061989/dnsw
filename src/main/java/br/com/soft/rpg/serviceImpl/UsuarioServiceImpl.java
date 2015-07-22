package br.com.soft.rpg.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.soft.rpg.dao.UsuarioDAO;
import br.com.soft.rpg.dao.excecoes.RpgGenericException;
import br.com.soft.rpg.dto.Usuario;
import br.com.soft.rpg.service.UsuarioService;

@Service(value = "usuarioService")
public class UsuarioServiceImpl extends GenericServiceImpl<Usuario> implements UsuarioService{

	@Autowired
	private UsuarioDAO usuarioDAO;
	
	@Override
	protected JpaRepository<Usuario, Integer> getRepository() {
		return usuarioDAO;
	}

	public Usuario findByLoginAndSenha(String login, String senha) throws RpgGenericException {
		try {
			return usuarioDAO.findByLoginAndSenha(login, senha);
		} catch (Exception e) {
			throw new RpgGenericException(e.getMessage(), e);
		}
	}

	public List<Usuario> findByStatusAndTipoUsuario(Character status, Character tipoUsuario) throws RpgGenericException {
		try {
			return usuarioDAO.findByStatusAndTipoUsuario(status, tipoUsuario);
		} catch (Exception e) {
			throw new RpgGenericException(e.getMessage(), e);
		}
	}
	
	public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
		this.usuarioDAO = usuarioDAO;
	}

	@Transactional(rollbackFor = {Throwable.class})
	@Override
	public Usuario salvar(Usuario usuario) throws RpgGenericException {
		validarUsuario(usuario);
		return save(usuario);
	}

	private void validarUsuario(Usuario usuario) throws RpgGenericException{
		if(usuario == null)
			throw new RpgGenericException("Usu�rio vazio n�o pode ser salvo");
		
		List<String> erros = new ArrayList<String>();
		
		if(!(usuario.getLogin() != null && !usuario.getLogin().trim().equals("")))
			erros.add(" LOGIN");
		if(!(usuario.getSenha() != null && !usuario.getSenha().trim().equals("")))
			erros.add(" SENHA");
		if(!(usuario.getStatus() != null && !usuario.getStatus().equals(' ')))
			erros.add(" STATUS");
	}
}
