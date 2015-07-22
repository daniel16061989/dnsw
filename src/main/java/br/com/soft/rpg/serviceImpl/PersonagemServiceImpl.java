package br.com.soft.rpg.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.com.soft.rpg.dao.PersonagemDAO;
import br.com.soft.rpg.dto.Personagem;
import br.com.soft.rpg.service.PersonagemService;

@Service(value = "personagemService")
public class PersonagemServiceImpl extends GenericServiceImpl<Personagem> implements PersonagemService {

	@Autowired
	private PersonagemDAO personagemDAO;

	@Override
	protected JpaRepository<Personagem, Integer> getRepository() {
		return personagemDAO;
	}

	public void setPersonagemDAO(PersonagemDAO personagemDAO) {
		this.personagemDAO = personagemDAO;
	}

}