package com.isccb.stock.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.isccb.stock.dao.ILigneCommandeClientDao;
import com.isccb.stock.entities.LigneCommandeClient;
import com.isccb.stock.services.ILigneCommandeClientService;

@Transactional
public class LigneCommandeClientServiceImpl implements ILigneCommandeClientService{

	private ILigneCommandeClientDao dao;
	
	
	public void setDao(ILigneCommandeClientDao dao) {
		this.dao = dao;
	}

	@Override
	public LigneCommandeClient save(LigneCommandeClient ligneCommandeClient) {
		return dao.save(ligneCommandeClient);
	}

	@Override
	public LigneCommandeClient update(LigneCommandeClient ligneCommandeClient) {
		return dao.update(ligneCommandeClient);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public List<LigneCommandeClient> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<LigneCommandeClient> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public LigneCommandeClient getById(Long id) {
		return dao.getById(id)
				;
	}

	@Override
	public LigneCommandeClient findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public LigneCommandeClient findOne(String[] paramNames, String[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountOne(String paramName, String paramValue) {
		return dao.findCountOne(paramName, paramValue);
	}

}
