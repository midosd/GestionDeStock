package com.isccb.stock.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.isccb.stock.dao.IClientDao;
import com.isccb.stock.entities.Client;
import com.isccb.stock.services.IClientService;

@Transactional
public class ClientServiceImpl implements IClientService {

	private IClientDao dao;		
	
	public void setDao(IClientDao dao) {
		this.dao = dao;
	}

	@Override
	public Client save(Client client) {
		return dao.save(client);
	}

	@Override
	public Client update(Client client) {
		return dao.update(client);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public List<Client> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<Client> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public Client getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public Client findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public Client findOne(String[] paramNames, String[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountOne(String paramName, String paramValue) {
		return dao.findCountOne(paramName, paramValue);
	}

}
