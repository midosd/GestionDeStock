package com.isccb.stock.services.impl;

import java.io.InputStream;

import com.isccb.stock.dao.IFlickrDao;
import com.isccb.stock.services.IFlickrService;

public class FlickrServiceImpl implements IFlickrService {
	
	private IFlickrDao dao;
	
	public void setDao(IFlickrDao dao) {
		this.dao = dao;
	}

	@Override
	public String savePhoto(InputStream photo, String title) throws Exception {
		return dao.savePhoto(photo, title);
	}

}
