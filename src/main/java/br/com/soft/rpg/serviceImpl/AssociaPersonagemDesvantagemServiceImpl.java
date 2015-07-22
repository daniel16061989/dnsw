package br.com.soft.rpg.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.com.soft.rpg.dao.AssociaPersonagemDesvantagemDAO;
import br.com.soft.rpg.dto.AssociaPersonagemDesvantagem;
import br.com.soft.rpg.service.AssociaPersonagemDesvantagemService;

@Service(value = "associaPersonagemDesvantagemService")
public class AssociaPersonagemDesvantagemServiceImpl extends GenericServiceImpl<AssociaPersonagemDesvantagem> implements AssociaPersonagemDesvantagemService {

	@Autowired
	private AssociaPersonagemDesvantagemDAO associaPersonagemDesvantagemDAO;
	
	@Override
	protected JpaRepository<AssociaPersonagemDesvantagem, Integer> getRepository() {
		return associaPersonagemDesvantagemDAO;
	}

	public void setAssociaPersonagemDesvantagemDAO(AssociaPersonagemDesvantagemDAO associaPersonagemDesvantagemDAO) {
		this.associaPersonagemDesvantagemDAO = associaPersonagemDesvantagemDAO;
	}

}