package com.isccb.stock.services;

import java.util.List;

import com.isccb.stock.entities.CommandeClient;

public interface ICommandeClientService {
	public CommandeClient save(CommandeClient commandeClient);
	public CommandeClient update(CommandeClient commandeClient);
	public void remove(Long id);
	public List<CommandeClient> selectAll();
	public List<CommandeClient> selectAll(String sortField,String sort);
	public CommandeClient getById(Long id);
	public CommandeClient findOne(String paramName,Object paramValue);
	public CommandeClient findOne(String[] paramNames,String[] paramValues);
	public int findCountOne(String paramName,String paramValue);
}
