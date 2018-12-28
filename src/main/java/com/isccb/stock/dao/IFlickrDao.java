package com.isccb.stock.dao;

import java.io.InputStream;

public interface IFlickrDao {

	public String savePhoto(InputStream photo,String title) throws Exception;
}
