package br.com.soft.rpg.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.com.soft.rpg.dao.CampanhaDAO;
import br.com.soft.rpg.dto.Campanha;
import br.com.soft.rpg.service.CampanhaService;

@Service(value = "campanhaService")
public class CampanhaServiceImpl extends GenericServiceImpl<Campanha> implements CampanhaService {

	@Autowired
	private CampanhaDAO campanhaDAO;

	@Override
	protected JpaRepository<Campanha, Integer> getRepository() {
		return campanhaDAO;
	}

	public void setCampanhaDAO(CampanhaDAO campanhaDAO) {
		this.campanhaDAO = campanhaDAO;
	}

}