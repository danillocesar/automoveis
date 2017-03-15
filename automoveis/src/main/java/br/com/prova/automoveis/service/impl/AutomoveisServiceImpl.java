package br.com.prova.automoveis.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.prova.automoveis.dao.AutomoveisDao;
import br.com.prova.automoveis.entity.Automoveis;
import br.com.prova.automoveis.service.AutomoveisService;
 
@Service("automoveisService")
public class AutomoveisServiceImpl implements AutomoveisService {

    private AutomoveisDao dao;
    
	@Override
	public Automoveis getById(int id) {
		dao = new AutomoveisDao();
		return dao.getById(id);
	}

	@Override
	public List<Automoveis> lista() {
		dao = new AutomoveisDao();
		return dao.listAll();
	}

	@Override
	public void save(Automoveis automovel) {
		dao = new AutomoveisDao();
		dao.save(automovel);
	}

	@Override
	public void delete(Automoveis automovel) {
		dao = new AutomoveisDao();
		dao.remove(automovel);
	}

}