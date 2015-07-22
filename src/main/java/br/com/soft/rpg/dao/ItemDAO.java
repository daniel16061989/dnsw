package br.com.soft.rpg.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.soft.rpg.dto.Item;

public interface ItemDAO extends JpaRepository<Item, Integer> {

}
