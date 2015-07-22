package br.com.soft.rpg.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.soft.rpg.dto.Campanha;

public interface CampanhaDAO extends JpaRepository<Campanha, Integer> {

}
