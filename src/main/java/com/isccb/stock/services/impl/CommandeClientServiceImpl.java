package com.isccb.stock.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.isccb.stock.dao.ICommandeClientDao;
import com.isccb.stock.entities.CommandeClient;
import com.isccb.stock.services.ICommandeClientService;

@Transactional
public class CommandeClientServiceImpl implements ICommandeClientService{

	private ICommandeClientDao dao;		
	
	public void setDao(ICommandeClientDao dao) {
		this.dao = dao;
	}

	@Override
	public CommandeClient save(CommandeClient commandeClient) {
		return dao.save(commandeClient);
	}

	@Override
	public CommandeClient update(CommandeClient commandeClient) {
		return dao.update(commandeClient);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public List<CommandeClient> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<CommandeClient> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public CommandeClient getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public CommandeClient findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public CommandeClient findOne(String[] paramNames, String[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountOne(String paramName, String paramValue) {
		return dao.findCountOne(paramName, paramValue);
	}

}
