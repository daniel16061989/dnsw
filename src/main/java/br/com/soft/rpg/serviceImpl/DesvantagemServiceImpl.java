package br.com.soft.rpg.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.com.soft.rpg.dao.DesvantagemDAO;
import br.com.soft.rpg.dto.Desvantagem;
import br.com.soft.rpg.service.DesvantagemService;

@Service(value = "desvantagemService")
public class DesvantagemServiceImpl extends GenericServiceImpl<Desvantagem> implements DesvantagemService {

	@Autowired
	private DesvantagemDAO desvantagemDAO;

	@Override
	protected JpaRepository<Desvantagem, Integer> getRepository() {
		return desvantagemDAO;
	}

	public void setDesvantagemDAO(DesvantagemDAO desvantagemDAO) {
		this.desvantagemDAO = desvantagemDAO;
	}

}