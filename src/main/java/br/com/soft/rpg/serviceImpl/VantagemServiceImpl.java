package br.com.soft.rpg.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.com.soft.rpg.dao.VantagemDAO;
import br.com.soft.rpg.dto.Vantagem;
import br.com.soft.rpg.service.VantagemService;

@Service(value = "vantagemService")
public class VantagemServiceImpl extends GenericServiceImpl<Vantagem> implements VantagemService {

	@Autowired
	private VantagemDAO vantagemDAO;

	@Override
	protected JpaRepository<Vantagem, Integer> getRepository() {
		return vantagemDAO;
	}

	public void setVantagemDAO(VantagemDAO vantagemDAO) {
		this.vantagemDAO = vantagemDAO;
	}

}