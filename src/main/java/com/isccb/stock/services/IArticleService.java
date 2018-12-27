package com.isccb.stock.services;

import java.util.List;

import com.isccb.stock.entities.Article;

public interface IArticleService {

	public Article save(Article article);
	public Article update(Article article);
	public void remove(Long id);
	public List<Article> selectAll();
	public List<Article> selectAll(String sortField,String sort);
	public Article getById(Long id);
	public Article findOne(String paramName,Object paramValue);
	public Article findOne(String[] paramNames,String[] paramValues);
	public int findCountOne(String paramName,String paramValue);
	
}
