package br.com.soft.rpg.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.com.soft.rpg.dao.ItemDAO;
import br.com.soft.rpg.dto.Item;
import br.com.soft.rpg.service.ItemService;

@Service(value = "itemService")
public class ItemServiceImpl extends GenericServiceImpl<Item> implements ItemService {

	@Autowired
	private ItemDAO itemDAO;

	@Override
	protected JpaRepository<Item, Integer> getRepository() {
		return itemDAO;
	}

	public void setItemDAO(ItemDAO itemDAO) {
		this.itemDAO = itemDAO;
	}

}