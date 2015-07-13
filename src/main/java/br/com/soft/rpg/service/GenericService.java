package br.com.soft.rpg.service;

import java.util.List;

import br.com.soft.rpg.dao.excecoes.RpgGenericException;

/**
 * Interface da camada de serviço comum a todas as entidades
 */
public interface GenericService<T> {

	T save(T entity) throws RpgGenericException;

	List<T> save(Iterable<T> entities) throws RpgGenericException;

	T findOne(Integer id) throws RpgGenericException;

	boolean exists(Integer id) throws RpgGenericException;

	List<T> findAll() throws RpgGenericException;

	List<T> findAll(Iterable<Integer> ids) throws RpgGenericException;

	long count() throws RpgGenericException;

	void delete(Integer id) throws RpgGenericException;

	void delete(T entity) throws RpgGenericException;

	void delete(Iterable<? extends T> entities) throws RpgGenericException;

	void deleteAll() throws RpgGenericException;
}
