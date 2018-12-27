package com.isccb.stock.services;

import java.util.List;

import com.isccb.stock.entities.LigneCommandeClient;

public interface ILigneCommandeClientService {
	public LigneCommandeClient save(LigneCommandeClient ligneCommandeClient);
	public LigneCommandeClient update(LigneCommandeClient ligneCommandeClient);
	public void remove(Long id);
	public List<LigneCommandeClient> selectAll();
	public List<LigneCommandeClient> selectAll(String sortField,String sort);
	public LigneCommandeClient getById(Long id);
	public LigneCommandeClient findOne(String paramName,Object paramValue);
	public LigneCommandeClient findOne(String[] paramNames,String[] paramValues);
	public int findCountOne(String paramName,String paramValue);
}
