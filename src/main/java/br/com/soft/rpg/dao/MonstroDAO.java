package br.com.soft.rpg.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.soft.rpg.dto.Monstro;

public interface MonstroDAO extends JpaRepository<Monstro, Integer> {

}
