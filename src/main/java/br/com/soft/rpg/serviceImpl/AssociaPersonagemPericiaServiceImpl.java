package br.com.soft.rpg.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.soft.rpg.dao.AssociaPersonagemPericiaDAO;
import br.com.soft.rpg.dto.AssociaPersonagemPericia;
import br.com.soft.rpg.service.AssociaPersonagemPericiaService;

public class AssociaPersonagemPericiaServiceImpl extends GenericServiceImpl<AssociaPersonagemPericia> implements AssociaPersonagemPericiaService {

	@Autowired
	private AssociaPersonagemPericiaDAO associaPersonagemPericiaDAO;
	
	@Override
	protected JpaRepository<AssociaPersonagemPericia, Integer> getRepository() {
		return associaPersonagemPericiaDAO;
	}

	public void setAssociaPersonagemPericiaDAO(AssociaPersonagemPericiaDAO associaPersonagemPericiaDAO) {
		this.associaPersonagemPericiaDAO = associaPersonagemPericiaDAO;
	}

}