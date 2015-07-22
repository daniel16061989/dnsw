package br.com.soft.rpg.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.com.soft.rpg.dao.SistemaDAO;
import br.com.soft.rpg.dto.Sistema;
import br.com.soft.rpg.service.SistemaService;

@Service(value = "sistemaService")
public class SistemaServiceImpl extends GenericServiceImpl<Sistema> implements SistemaService {

	@Autowired
	private SistemaDAO sistemaDAO;

	@Override
	protected JpaRepository<Sistema, Integer> getRepository() {
		return sistemaDAO;
	}

	public void setSistemaDAO(SistemaDAO sistemaDAO) {
		this.sistemaDAO = sistemaDAO;
	}

}