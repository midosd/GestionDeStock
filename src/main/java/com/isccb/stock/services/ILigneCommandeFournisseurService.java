package com.isccb.stock.services;

import java.util.List;

import com.isccb.stock.entities.LigneCommandeFournisseur;

public interface ILigneCommandeFournisseurService {
	public LigneCommandeFournisseur save(LigneCommandeFournisseur ligneCommandeFournisseur);
	public LigneCommandeFournisseur update(LigneCommandeFournisseur ligneCommandeFournisseur);
	public void remove(Long id);
	public List<LigneCommandeFournisseur> selectAll();
	public List<LigneCommandeFournisseur> selectAll(String sortField,String sort);
	public LigneCommandeFournisseur getById(Long id);
	public LigneCommandeFournisseur findOne(String paramName,Object paramValue);
	public LigneCommandeFournisseur findOne(String[] paramNames,String[] paramValues);
	public int findCountOne(String paramName,String paramValue);
}
