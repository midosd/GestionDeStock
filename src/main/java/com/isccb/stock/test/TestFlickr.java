package com.isccb.stock.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import com.isccb.stock.dao.impl.FlickrDaoImpl;

public class TestFlickr {

	public static void main(String[] args) {
		FlickrDaoImpl flickr = new FlickrDaoImpl();
		
		try {
			InputStream stream = new FileInputStream(new File("D:\\Desert.jpg"));
			String url =  flickr.savePhoto(stream, "My Photo Desert");
			System.out.println("URL : "+url);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
