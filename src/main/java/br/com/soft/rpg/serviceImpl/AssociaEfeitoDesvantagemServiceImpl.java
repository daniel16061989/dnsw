package br.com.soft.rpg.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.com.soft.rpg.dao.AssociaEfeitoDesvantagemDAO;
import br.com.soft.rpg.dto.AssociaEfeitoDesvantagem;
import br.com.soft.rpg.service.AssociaEfeitoDesvantagemService;

@Service(value = "associaEfeitoDesvantagemService")
public class AssociaEfeitoDesvantagemServiceImpl extends GenericServiceImpl<AssociaEfeitoDesvantagem> implements AssociaEfeitoDesvantagemService {

	@Autowired
	private AssociaEfeitoDesvantagemDAO associaEfeitoDesvantagemDAO;
	
	@Override
	protected JpaRepository<AssociaEfeitoDesvantagem, Integer> getRepository() {
		return associaEfeitoDesvantagemDAO;
	}

	public void setAssociaEfeitoDesvantagemDAO(AssociaEfeitoDesvantagemDAO associaEfeitoDesvantagemDAO) {
		this.associaEfeitoDesvantagemDAO = associaEfeitoDesvantagemDAO;
	}

}