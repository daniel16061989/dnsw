package br.com.soft.rpg.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.com.soft.rpg.dao.AssociaPersonagemVantagemDAO;
import br.com.soft.rpg.dto.AssociaPersonagemVantagem;
import br.com.soft.rpg.service.AssociaPersonagemVantagemService;

@Service(value = "associaPersonagemVantagemService")
public class AssociaPersonagemVantagemServiceImpl extends GenericServiceImpl<AssociaPersonagemVantagem> implements AssociaPersonagemVantagemService {

	@Autowired
	private AssociaPersonagemVantagemDAO associaPersonagemRacaDAO;

	@Override
	protected JpaRepository<AssociaPersonagemVantagem, Integer> getRepository() {
		return associaPersonagemRacaDAO;
	}

	public void setAssociaPersonagemRacaDAO(AssociaPersonagemVantagemDAO associaPersonagemRacaDAO) {
		this.associaPersonagemRacaDAO = associaPersonagemRacaDAO;
	}

}