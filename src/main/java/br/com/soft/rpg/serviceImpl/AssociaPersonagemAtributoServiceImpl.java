package br.com.soft.rpg.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.com.soft.rpg.dao.AssociaPersonagemAtributoDAO;
import br.com.soft.rpg.dto.AssociaPersonagemAtributo;
import br.com.soft.rpg.service.AssociaPersonagemAtributoService;

@Service(value = "associaPersonagemAtributoService")
public class AssociaPersonagemAtributoServiceImpl extends GenericServiceImpl<AssociaPersonagemAtributo> implements AssociaPersonagemAtributoService {

	@Autowired
	private AssociaPersonagemAtributoDAO associaPersonagemAtributoDAO;
	
	@Override
	protected JpaRepository<AssociaPersonagemAtributo, Integer> getRepository() {
		return associaPersonagemAtributoDAO;
	}

	public void setAssociaPersonagemAtributoDAO(
			AssociaPersonagemAtributoDAO associaPersonagemAtributoDAO) {
		this.associaPersonagemAtributoDAO = associaPersonagemAtributoDAO;
	}

}