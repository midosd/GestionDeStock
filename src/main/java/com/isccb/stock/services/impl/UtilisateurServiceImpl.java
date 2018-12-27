package com.isccb.stock.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.isccb.stock.dao.IUtilisateurDao;
import com.isccb.stock.entities.Utilisateur;
import com.isccb.stock.services.IUtilisateurService;

@Transactional
public class UtilisateurServiceImpl implements IUtilisateurService{

	private IUtilisateurDao dao;
	
	
	public void setDao(IUtilisateurDao dao) {
		this.dao = dao;
	}

	@Override
	public Utilisateur save(Utilisateur utilisateur) {
		return dao.save(utilisateur);
	}

	@Override
	public Utilisateur update(Utilisateur utilisateur) {
		return dao.update(utilisateur);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public List<Utilisateur> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<Utilisateur> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public Utilisateur getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public Utilisateur findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public Utilisateur findOne(String[] paramNames, String[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountOne(String paramName, String paramValue) {
		return dao.findCountOne(paramName, paramValue);
	}

}
