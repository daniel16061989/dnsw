package br.com.soft.rpg.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.com.soft.rpg.dao.MagiaDAO;
import br.com.soft.rpg.dto.Magia;
import br.com.soft.rpg.service.MagiaService;

@Service(value = "magiaService")
public class MagiaServiceImpl extends GenericServiceImpl<Magia> implements MagiaService {

	@Autowired
	private MagiaDAO magiaDAO;

	@Override
	protected JpaRepository<Magia, Integer> getRepository() {
		return magiaDAO;
	}

	public void setMagiaDAO(MagiaDAO magiaDAO) {
		this.magiaDAO = magiaDAO;
	}

}