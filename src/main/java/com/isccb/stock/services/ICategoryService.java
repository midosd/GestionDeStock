package com.isccb.stock.services;

import java.util.List;

import com.isccb.stock.entities.Category;


public interface ICategoryService  {

	public Category save(Category category);
	public Category update(Category category);
	public void remove(Long id);
	public List<Category> selectAll();
	public List<Category> selectAll(String sortField,String sort);
	public Category getById(Long id);
	public Category findOne(String paramName,Object paramValue);
	public Category findOne(String[] paramNames,String[] paramValues);
	public int findCountOne(String paramName,String paramValue);
}
