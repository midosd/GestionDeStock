package com.isccb.stock.services;

import java.util.List;

import com.isccb.stock.entities.Vente;

public interface IVenteService {
	public Vente save(Vente vente);
	public Vente update(Vente vente);
	public void remove(Long id);
	public List<Vente> selectAll();
	public List<Vente> selectAll(String sortField,String sort);
	public Vente getById(Long id);
	public Vente findOne(String paramName,Object paramValue);
	public Vente findOne(String[] paramNames,String[] paramValues);
	public int findCountOne(String paramName,String paramValue);
}
