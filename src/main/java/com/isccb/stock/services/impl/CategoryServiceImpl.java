package com.isccb.stock.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.isccb.stock.dao.ICategoryDao;
import com.isccb.stock.entities.Category;
import com.isccb.stock.services.ICategoryService;

@Transactional
public class CategoryServiceImpl implements ICategoryService{

	private ICategoryDao dao;		
	
	public void setDao(ICategoryDao dao) {
		this.dao = dao;
	}

	@Override
	public Category save(Category category) {
		return dao.save(category);
	}

	@Override
	public Category update(Category category) {
		return dao.update(category);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);		
	}

	@Override
	public List<Category> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<Category> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public Category getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public Category findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue)
				;
	}

	@Override
	public Category findOne(String[] paramNames, String[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountOne(String paramName, String paramValue) {
		return dao.findCountOne(paramName, paramValue);
	}

}
