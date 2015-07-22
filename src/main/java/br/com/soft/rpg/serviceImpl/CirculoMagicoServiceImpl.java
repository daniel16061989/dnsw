package br.com.soft.rpg.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.com.soft.rpg.dao.CirculoMagicoDAO;
import br.com.soft.rpg.dto.CirculoMagico;
import br.com.soft.rpg.service.CirculoMagicoService;

@Service(value = "campanhaService")
public class CirculoMagicoServiceImpl extends GenericServiceImpl<CirculoMagico> implements CirculoMagicoService {

	@Autowired
	private CirculoMagicoDAO circuloMagicoDAO;

	@Override
	protected JpaRepository<CirculoMagico, Integer> getRepository() {
		return circuloMagicoDAO;
	}

	public void setCirculoMagicoDAO(CirculoMagicoDAO circuloMagicoDAO) {
		this.circuloMagicoDAO = circuloMagicoDAO;
	}

}