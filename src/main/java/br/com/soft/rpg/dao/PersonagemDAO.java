package br.com.soft.rpg.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.soft.rpg.dto.Personagem;

public interface PersonagemDAO extends JpaRepository<Personagem, Integer> {

}
