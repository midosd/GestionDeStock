package com.isccb.stock;

import com.isccb.stock.dao.impl.FlickrDaoImpl;

public class Test {

	public static void main(String[] args) {
		FlickrDaoImpl dao = new FlickrDaoImpl();
		dao.auth();
	}

}
