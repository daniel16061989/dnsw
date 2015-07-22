package br.com.soft.rpg.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.com.soft.rpg.dao.ClasseDAO;
import br.com.soft.rpg.dto.Classe;
import br.com.soft.rpg.service.ClasseService;

@Service(value = "classeService")
public class ClasseServiceImpl extends GenericServiceImpl<Classe> implements ClasseService {

	@Autowired
	private ClasseDAO classeDAO;

	@Override
	protected JpaRepository<Classe, Integer> getRepository() {
		return classeDAO;
	}

	public void setClasseDAO(ClasseDAO classeDAO) {
		this.classeDAO = classeDAO;
	}

}