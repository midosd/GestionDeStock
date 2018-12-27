package com.isccb.stock.services;

import java.util.List;

import com.isccb.stock.entities.LigneVente;

public interface ILigneVenteService {
	public LigneVente save(LigneVente ligneVente);
	public LigneVente update(LigneVente ligneVente);
	public void remove(Long id);
	public List<LigneVente> selectAll();
	public List<LigneVente> selectAll(String sortField,String sort);
	public LigneVente getById(Long id);
	public LigneVente findOne(String paramName,Object paramValue);
	public LigneVente findOne(String[] paramNames,String[] paramValues);
	public int findCountOne(String paramName,String paramValue);
}
