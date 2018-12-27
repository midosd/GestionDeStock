package com.isccb.stock.services;

import java.util.List;

import com.isccb.stock.entities.CommandeFournisseur;

public interface ICommandeFournisseurService {
	public CommandeFournisseur save(CommandeFournisseur commandeFournisseur);
	public CommandeFournisseur update(CommandeFournisseur commandeFournisseur);
	public void remove(Long id);
	public List<CommandeFournisseur> selectAll();
	public List<CommandeFournisseur> selectAll(String sortField,String sort);
	public CommandeFournisseur getById(Long id);
	public CommandeFournisseur findOne(String paramName,Object paramValue);
	public CommandeFournisseur findOne(String[] paramNames,String[] paramValues);
	public int findCountOne(String paramName,String paramValue);
}
