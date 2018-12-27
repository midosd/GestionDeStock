package com.isccb.stock.services;

import java.util.List;

import com.isccb.stock.entities.Utilisateur;

public interface IUtilisateurService {
	public Utilisateur save(Utilisateur utilisateur);
	public Utilisateur update(Utilisateur utilisateur);
	public void remove(Long id);
	public List<Utilisateur> selectAll();
	public List<Utilisateur> selectAll(String sortField,String sort);
	public Utilisateur getById(Long id);
	public Utilisateur findOne(String paramName,Object paramValue);
	public Utilisateur findOne(String[] paramNames,String[] paramValues);
	public int findCountOne(String paramName,String paramValue);
}
