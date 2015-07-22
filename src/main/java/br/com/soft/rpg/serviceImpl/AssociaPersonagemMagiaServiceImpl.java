package br.com.soft.rpg.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.com.soft.rpg.dao.AssociaPersonagemMagiaDAO;
import br.com.soft.rpg.dto.AssociaPersonagemMagia;
import br.com.soft.rpg.service.AssociaPersonagemMagiaService;

@Service(value = "associaPersonagemMagiaService")
public class AssociaPersonagemMagiaServiceImpl extends GenericServiceImpl<AssociaPersonagemMagia> implements AssociaPersonagemMagiaService {

	@Autowired
	private AssociaPersonagemMagiaDAO associaPersonagemMagiaDAO;
	
	@Override
	protected JpaRepository<AssociaPersonagemMagia, Integer> getRepository() {
		return associaPersonagemMagiaDAO;
	}

	public void setAssociaPersonagemMagiaDAO(AssociaPersonagemMagiaDAO associaPersonagemMagiaDAO) {
		this.associaPersonagemMagiaDAO = associaPersonagemMagiaDAO;
	}

}