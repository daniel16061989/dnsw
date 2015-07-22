package br.com.soft.rpg.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.com.soft.rpg.dao.AssociaEfeitoVantagemDAO;
import br.com.soft.rpg.dto.AssociaEfeitoVantagem;
import br.com.soft.rpg.service.AssociaEfeitoVantagemService;

@Service(value = "associaEfeitoVantagemService")
public class AssociaEfeitoVantagemServiceImpl extends GenericServiceImpl<AssociaEfeitoVantagem> implements AssociaEfeitoVantagemService {

	@Autowired
	private AssociaEfeitoVantagemDAO associaEfeitoVantagemDAO;
	
	@Override
	protected JpaRepository<AssociaEfeitoVantagem, Integer> getRepository() {
		return associaEfeitoVantagemDAO;
	}

	public void setAssociaEfeitoVantagemDAO(AssociaEfeitoVantagemDAO associaEfeitoVantagemDAO) {
		this.associaEfeitoVantagemDAO = associaEfeitoVantagemDAO;
	}

}