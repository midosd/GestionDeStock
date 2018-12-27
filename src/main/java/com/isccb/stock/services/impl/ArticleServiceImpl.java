package com.isccb.stock.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.isccb.stock.dao.IArticleDao;
import com.isccb.stock.entities.Article;
import com.isccb.stock.services.IArticleService;

@Transactional
public class ArticleServiceImpl implements IArticleService {

	private IArticleDao dao;	
	
	public void setDao(IArticleDao dao) {
		this.dao = dao;
	}

	@Override
	public Article save(Article article) {
		return dao.save(article);
	}

	@Override
	public Article update(Article article) {
		return dao.update(article);
	}

	@Override
	public void remove(Long id) {	
		dao.remove(id);
	}

	@Override
	public List<Article> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<Article> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public Article getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public Article findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public Article findOne(String[] paramNames, String[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountOne(String paramName, String paramValue) {
		return dao.findCountOne(paramName, paramValue);
	}

}
