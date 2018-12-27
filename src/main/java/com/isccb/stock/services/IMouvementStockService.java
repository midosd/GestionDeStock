package com.isccb.stock.services;

import java.util.List;

import com.isccb.stock.entities.MouvementStock;

public interface IMouvementStockService {
	public MouvementStock save(MouvementStock mouvementStock);
	public MouvementStock update(MouvementStock mouvementStock);
	public void remove(Long id);
	public List<MouvementStock> selectAll();
	public List<MouvementStock> selectAll(String sortField,String sort);
	public MouvementStock getById(Long id);
	public MouvementStock findOne(String paramName,Object paramValue);
	public MouvementStock findOne(String[] paramNames,String[] paramValues);
	public int findCountOne(String paramName,String paramValue);
}
