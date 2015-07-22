package br.com.soft.rpg.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.com.soft.rpg.dao.AssociaEfeitoItemDAO;
import br.com.soft.rpg.dto.AssociaEfeitoItem;
import br.com.soft.rpg.service.AssociaEfeitoItemService;

@Service(value = "associaEfeitoItemService")
public class AssociaEfeitoItemServiceImpl extends GenericServiceImpl<AssociaEfeitoItem> implements AssociaEfeitoItemService {

	@Autowired
	private AssociaEfeitoItemDAO associaEfeitoItemDAO;
	
	@Override
	protected JpaRepository<AssociaEfeitoItem, Integer> getRepository() {
		return associaEfeitoItemDAO;
	}

	public void setAssociaEfeitoItemDAO(AssociaEfeitoItemDAO associaEfeitoItemDAO) {
		this.associaEfeitoItemDAO = associaEfeitoItemDAO;
	}

}