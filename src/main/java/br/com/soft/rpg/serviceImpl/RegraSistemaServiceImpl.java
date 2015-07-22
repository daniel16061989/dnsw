package br.com.soft.rpg.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.com.soft.rpg.dao.RegraSistemaDAO;
import br.com.soft.rpg.dto.RegraSistema;
import br.com.soft.rpg.service.RegraSistemaService;

@Service(value = "regraSistemaService")
public class RegraSistemaServiceImpl extends GenericServiceImpl<RegraSistema> implements RegraSistemaService {

	@Autowired
	private RegraSistemaDAO regraSistemaDAO;

	@Override
	protected JpaRepository<RegraSistema, Integer> getRepository() {
		return regraSistemaDAO;
	}

	public void setRegraSistemaDAO(RegraSistemaDAO regraSistemaDAO) {
		this.regraSistemaDAO = regraSistemaDAO;
	}

}