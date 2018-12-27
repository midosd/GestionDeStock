package com.isccb.stock.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.isccb.stock.dao.IVenteDao;
import com.isccb.stock.entities.Vente;
import com.isccb.stock.services.IVenteService;

@Transactional
public class VenteServiceImpl implements IVenteService {

	private IVenteDao dao;
	
	
	public void setDao(IVenteDao dao) {
		this.dao = dao;
	}

	@Override
	public Vente save(Vente vente) {
		return dao.save(vente);
	}

	@Override
	public Vente update(Vente vente) {
		return dao.update(vente);
	}

	@Override
	public void remove(Long id) {	
		dao.remove(id);
	}

	@Override
	public List<Vente> selectAll() {
		return dao.selectAll()
				;
	}

	@Override
	public List<Vente> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public Vente getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public Vente findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public Vente findOne(String[] paramNames, String[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountOne(String paramName, String paramValue) {
		return dao.findCountOne(paramName, paramValue);
	}

}
