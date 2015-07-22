package br.com.soft.rpg.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.com.soft.rpg.dao.AssociaPersonagemClasseDAO;
import br.com.soft.rpg.dto.AssociaPersonagemClasse;
import br.com.soft.rpg.service.AssociaPersonagemClasseService;

@Service(value = "associaPersonagemClasseService")
public class AssociaPersonagemClasseServiceImpl extends GenericServiceImpl<AssociaPersonagemClasse> implements AssociaPersonagemClasseService {

	@Autowired
	private AssociaPersonagemClasseDAO associaPersonagemClasseDAO;
	
	@Override
	protected JpaRepository<AssociaPersonagemClasse, Integer> getRepository() {
		return associaPersonagemClasseDAO;
	}

	public void setAssociaPersonagemClasseDAO(AssociaPersonagemClasseDAO associaPersonagemClasseDAO) {
		this.associaPersonagemClasseDAO = associaPersonagemClasseDAO;
	}

}