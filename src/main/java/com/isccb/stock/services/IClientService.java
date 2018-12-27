package com.isccb.stock.services;

import java.util.List;

import com.isccb.stock.entities.Client;

public interface IClientService {

	public Client save(Client client);
	public Client update(Client client);
	public void remove(Long id);
	public List<Client> selectAll();
	public List<Client> selectAll(String sortField,String sort);
	public Client getById(Long id);
	public Client findOne(String paramName,Object paramValue);
	public Client findOne(String[] paramNames,String[] paramValues);
	public int findCountOne(String paramName,String paramValue);
}
