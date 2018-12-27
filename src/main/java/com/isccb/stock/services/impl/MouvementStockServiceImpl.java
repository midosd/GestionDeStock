package com.isccb.stock.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.isccb.stock.dao.IMouvementStockDao;
import com.isccb.stock.entities.MouvementStock;
import com.isccb.stock.services.IMouvementStockService;

@Transactional
public class MouvementStockServiceImpl implements IMouvementStockService {

	private IMouvementStockDao dao;
	
	
	public void setDao(IMouvementStockDao dao) {
		this.dao = dao;
	}

	@Override
	public MouvementStock save(MouvementStock mouvementStock) {
		return dao.save(mouvementStock);
	}

	@Override
	public MouvementStock update(MouvementStock mouvementStock) {
		return dao.update(mouvementStock);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public List<MouvementStock> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<MouvementStock> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public MouvementStock getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public MouvementStock findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public MouvementStock findOne(String[] paramNames, String[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountOne(String paramName, String paramValue) {
		return dao.findCountOne(paramName, paramValue);
	}

}
