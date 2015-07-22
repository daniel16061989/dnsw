package br.com.soft.rpg.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.com.soft.rpg.dao.MonstroDAO;
import br.com.soft.rpg.dto.Monstro;
import br.com.soft.rpg.service.MonstroService;

@Service(value = "monstroService")
public class MonstroServiceImpl extends GenericServiceImpl<Monstro> implements MonstroService {

	@Autowired
	private MonstroDAO monstroDAO;

	@Override
	protected JpaRepository<Monstro, Integer> getRepository() {
		return monstroDAO;
	}

	public void setMonstroDAO(MonstroDAO monstroDAO) {
		this.monstroDAO = monstroDAO;
	}

}