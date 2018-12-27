package com.isccb.stock.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.isccb.stock.dao.ILigneVenteDao;
import com.isccb.stock.entities.LigneVente;
import com.isccb.stock.services.ILigneVenteService;

@Transactional
public class LigneVenteServiceImpl implements ILigneVenteService{

	private ILigneVenteDao dao;
	
	
	public void setDao(ILigneVenteDao dao) {
		this.dao = dao;
	}

	@Override
	public LigneVente save(LigneVente ligneVente) {
		return dao.save(ligneVente);
	}

	@Override
	public LigneVente update(LigneVente ligneVente) {
		return dao.update(ligneVente);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public List<LigneVente> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<LigneVente> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public LigneVente getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public LigneVente findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public LigneVente findOne(String[] paramNames, String[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountOne(String paramName, String paramValue) {
		return dao.findCountOne(paramName, paramValue);
	}

}
