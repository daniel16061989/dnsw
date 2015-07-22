package br.com.soft.rpg.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.com.soft.rpg.dao.RacaDAO;
import br.com.soft.rpg.dto.Raca;
import br.com.soft.rpg.service.RacaService;

@Service(value = "racaService")
public class RacaServiceImpl extends GenericServiceImpl<Raca> implements RacaService {

	@Autowired
	private RacaDAO racaDAO;

	@Override
	protected JpaRepository<Raca, Integer> getRepository() {
		return racaDAO;
	}

	public void setRacaDAO(RacaDAO racaDAO) {
		this.racaDAO = racaDAO;
	}

}