package br.com.soft.rpg.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.com.soft.rpg.dao.AtributoDAO;
import br.com.soft.rpg.dto.Atributo;
import br.com.soft.rpg.service.AtributoService;

@Service(value = "atributoService")
public class AtributoServiceImpl extends GenericServiceImpl<Atributo> implements AtributoService {

	@Autowired
	private AtributoDAO atributoDAO;

	@Override
	protected JpaRepository<Atributo, Integer> getRepository() {
		return atributoDAO;
	}

	public void setAtributoDAO(AtributoDAO atributoDAO) {
		this.atributoDAO = atributoDAO;
	}

}