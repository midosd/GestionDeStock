package com.isccb.stock.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.isccb.stock.dao.IFournisseurDao;
import com.isccb.stock.entities.Fournisseur;
import com.isccb.stock.services.IFournisseurService;

@Transactional
public class FournisseurServiceImpl implements IFournisseurService {

	private IFournisseurDao dao;
	
	
	public void setDao(IFournisseurDao dao) {
		this.dao = dao;
	}

	@Override
	public Fournisseur save(Fournisseur fournisseur) {
		return dao.save(fournisseur);
	}

	@Override
	public Fournisseur update(Fournisseur fournisseur) {
		return dao.update(fournisseur);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public List<Fournisseur> selectAll() {
		return dao.selectAll()
				;
	}

	@Override
	public List<Fournisseur> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public Fournisseur getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public Fournisseur findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public Fournisseur findOne(String[] paramNames, String[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountOne(String paramName, String paramValue) {
		return dao.findCountOne(paramName, paramValue);
	}

}
