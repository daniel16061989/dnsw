package br.com.soft.rpg.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.com.soft.rpg.dao.AssociaEfeitoMagiaDAO;
import br.com.soft.rpg.dto.AssociaEfeitoMagia;
import br.com.soft.rpg.service.AssociaEfeitoMagiaService;

@Service(value = "associaEfeitoMagiaService")
public class AssociaEfeitoMagiaServiceImpl extends GenericServiceImpl<AssociaEfeitoMagia> implements AssociaEfeitoMagiaService {

	@Autowired
	private AssociaEfeitoMagiaDAO associaEfeitoMagiaDAO;
	
	@Override
	protected JpaRepository<AssociaEfeitoMagia, Integer> getRepository() {
		return associaEfeitoMagiaDAO;
	}

	public void setAssociaEfeitoMagiaDAO(AssociaEfeitoMagiaDAO associaEfeitoMagiaDAO) {
		this.associaEfeitoMagiaDAO = associaEfeitoMagiaDAO;
	}

}