package com.isccb.stock.services;

import java.util.List;

import com.isccb.stock.entities.Fournisseur;

public interface IFournisseurService {
	public Fournisseur save(Fournisseur fournisseur);
	public Fournisseur update(Fournisseur fournisseur);
	public void remove(Long id);
	public List<Fournisseur> selectAll();
	public List<Fournisseur> selectAll(String sortField,String sort);
	public Fournisseur getById(Long id);
	public Fournisseur findOne(String paramName,Object paramValue);
	public Fournisseur findOne(String[] paramNames,String[] paramValues);
	public int findCountOne(String paramName,String paramValue);
}
