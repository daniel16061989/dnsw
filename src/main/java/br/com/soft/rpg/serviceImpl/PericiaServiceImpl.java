package br.com.soft.rpg.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.com.soft.rpg.dao.PericiaDAO;
import br.com.soft.rpg.dto.Pericia;
import br.com.soft.rpg.service.PericiaService;

@Service(value = "periciaService")
public class PericiaServiceImpl extends GenericServiceImpl<Pericia> implements PericiaService {

	@Autowired
	private PericiaDAO periciaDAO;

	@Override
	protected JpaRepository<Pericia, Integer> getRepository() {
		return periciaDAO;
	}

	public void setPericiaDAO(PericiaDAO periciaDAO) {
		this.periciaDAO = periciaDAO;
	}

}