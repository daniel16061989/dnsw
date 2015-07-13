package br.com.soft.rpg.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.soft.rpg.dto.InformacaoLogin;

public interface InformacaoLoginDAO extends JpaRepository<InformacaoLogin, Integer> {

}
