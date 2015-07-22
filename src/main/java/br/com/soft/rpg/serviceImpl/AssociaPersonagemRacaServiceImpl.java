package br.com.soft.rpg.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.soft.rpg.dao.AssociaPersonagemRacaDAO;
import br.com.soft.rpg.dto.AssociaPersonagemRaca;
import br.com.soft.rpg.service.AssociaPersonagemRacaService;

public class AssociaPersonagemRacaServiceImpl extends GenericServiceImpl<AssociaPersonagemRaca> implements AssociaPersonagemRacaService {

	@Autowired
	private AssociaPersonagemRacaDAO associaPersonagemRacaDAO;
	
	@Override
	protected JpaRepository<AssociaPersonagemRaca, Integer> getRepository() {
		return associaPersonagemRacaDAO;
	}

	public void setAssociaPersonagemRacaDAO(
			AssociaPersonagemRacaDAO associaPersonagemRacaDAO) {
		this.associaPersonagemRacaDAO = associaPersonagemRacaDAO;
	}
}