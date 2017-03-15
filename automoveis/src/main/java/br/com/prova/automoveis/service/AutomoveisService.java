package br.com.prova.automoveis.service;

import java.util.List;

import br.com.prova.automoveis.entity.Automoveis;

public interface AutomoveisService {
	Automoveis getById(int id);
	List<Automoveis> lista();
	void save(Automoveis processo);
	void delete(Automoveis processo);
	
}