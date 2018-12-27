package com.isccb.stock.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.isccb.stock.dao.ICommandeFournisseurDao;
import com.isccb.stock.entities.CommandeFournisseur;
import com.isccb.stock.services.ICommandeFournisseurService;

@Transactional
public class CommandeFournisseurServiceImpl implements ICommandeFournisseurService{

	private ICommandeFournisseurDao dao;	

	public void setDao(ICommandeFournisseurDao dao) {
		this.dao = dao;
	}

	@Override
	public CommandeFournisseur save(CommandeFournisseur commandeFournisseur) {
		return dao.save(commandeFournisseur);
	}

	@Override
	public CommandeFournisseur update(CommandeFournisseur commandeFournisseur) {
		return dao.update(commandeFournisseur);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);		
	}

	@Override
	public List<CommandeFournisseur> selectAll() {
		return dao.selectAll()
				;
	}

	@Override
	public List<CommandeFournisseur> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public CommandeFournisseur getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public CommandeFournisseur findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public CommandeFournisseur findOne(String[] paramNames, String[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountOne(String paramName, String paramValue) {
		return dao.findCountOne(paramName, paramValue);
	}	
	
	

}
