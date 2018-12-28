package com.isccb.stock.dao.impl;

import java.io.InputStream;

import javax.swing.JOptionPane;

import org.scribe.model.Token;
import org.scribe.model.Verifier;

import com.flickr4java.flickr.Flickr;
import com.flickr4java.flickr.FlickrException;
import com.flickr4java.flickr.REST;
import com.flickr4java.flickr.RequestContext;
import com.flickr4java.flickr.auth.Auth;
import com.flickr4java.flickr.auth.AuthInterface;
import com.flickr4java.flickr.auth.Permission;
import com.flickr4java.flickr.uploader.UploadMetaData;
import com.isccb.stock.dao.IFlickrDao;

public class FlickrDaoImpl implements IFlickrDao{
	
	private Flickr flickr ;
	
	private UploadMetaData uploadMetaData = new UploadMetaData();
	private String apiKey="d666660388f5bb233bac8ee54c0c368b";
	private String sharedSecret="5425d8de152626a0";
	
	private void connect() {
		flickr = new Flickr(apiKey, sharedSecret, new REST());
		Auth auth = new Auth();
		auth.setPermission(Permission.READ);
		auth.setToken("72157703617380621-a51ff42e55b15c6c");
		auth.setTokenSecret("e8cd51ca13c1b226");
		
		RequestContext requestContext = RequestContext.getRequestContext();
		requestContext.setAuth(auth);
		flickr.setAuth(auth);
	}

	@Override
	public String savePhoto(InputStream photo, String title) throws Exception {
		connect();
		uploadMetaData.setTitle(title);
		String photoId= flickr.getUploader().upload(photo, uploadMetaData);
		return flickr.getPhotosInterface().getPhoto(photoId).getMedium640Url();
	}
	
	public void auth() {
		
		flickr = new Flickr(apiKey, sharedSecret, new REST());
		AuthInterface authInterface = flickr.getAuthInterface();
		Token token = authInterface.getRequestToken();
		System.out.println("token: "+token);
		String url = authInterface.getAuthorizationUrl(token, Permission.DELETE);
		System.out.println("Follow this URL to authorise yourself on Flickr");
		System.out.println(url);
		System.out.println("Paste in the token it gives you: ");
		System.out.println(">>");
		
		String tokenKey = JOptionPane.showInputDialog(null);
		Token requestToken = authInterface.getAccessToken(token, new Verifier(tokenKey));
		System.out.println("Authentification success");
		Auth auth = null;
		
		try {
			auth = authInterface.checkToken(requestToken);
		}catch (FlickrException e) {
			e.printStackTrace();
		}
		
		// This token can be used untill the user revokees it
		
		System.out.println("Token: "+requestToken.getToken());
		System.out.println("Secret: "+requestToken.getSecret());
		System.out.println("nsid: "+auth.getUser().getId());
		System.out.println("Realname: "+auth.getUser().getRealName());
		System.out.println("Username: "+auth.getUser().getUsername());
		System.out.println("Permission: "+auth.getPermission().getType());
		
	}

}
