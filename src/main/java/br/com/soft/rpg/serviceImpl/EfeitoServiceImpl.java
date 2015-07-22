package br.com.soft.rpg.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.com.soft.rpg.dao.EfeitoDAO;
import br.com.soft.rpg.dto.Efeito;
import br.com.soft.rpg.service.EfeitoService;

@Service(value = "efeitoService")
public class EfeitoServiceImpl extends GenericServiceImpl<Efeito> implements EfeitoService {

	@Autowired
	private EfeitoDAO efeitoDAO;

	@Override
	protected JpaRepository<Efeito, Integer> getRepository() {
		return efeitoDAO;
	}

	public void setEfeitoDAO(EfeitoDAO efeitoDAO) {
		this.efeitoDAO = efeitoDAO;
	}

}