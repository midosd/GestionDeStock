package com.isccb.stock.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.isccb.stock.dao.ILigneCommandeFournisseurDao;
import com.isccb.stock.entities.LigneCommandeFournisseur;
import com.isccb.stock.services.ILigneCommandeFournisseurService;

@Transactional
public class LigneCommandeFournisseurServiceImpl implements ILigneCommandeFournisseurService {

	private ILigneCommandeFournisseurDao dao;
	
	public void setDao(ILigneCommandeFournisseurDao dao) {
		this.dao = dao;
	}

	@Override
	public LigneCommandeFournisseur save(LigneCommandeFournisseur ligneCommandeFournisseur) {
		return dao.save(ligneCommandeFournisseur);
	}

	@Override
	public LigneCommandeFournisseur update(LigneCommandeFournisseur ligneCommandeFournisseur) {
		return dao.update(ligneCommandeFournisseur);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public List<LigneCommandeFournisseur> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<LigneCommandeFournisseur> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public LigneCommandeFournisseur getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public LigneCommandeFournisseur findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public LigneCommandeFournisseur findOne(String[] paramNames, String[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountOne(String paramName, String paramValue) {
		return dao.findCountOne(paramName, paramValue);
	}

}
