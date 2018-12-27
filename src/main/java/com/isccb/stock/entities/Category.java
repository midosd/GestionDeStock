package com.isccb.stock.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="isccb_category")
public class Category implements Serializable{



	@Id
	@GeneratedValue
	private Long idCategory;
	
	private String code;
	private String name;
	
	@OneToMany(mappedBy="category")
	private List<Article> articles;
	

	public Category() {
		super();
	}

	

	public Long getIdCategory() {
		return idCategory;
	}



	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	

	
	
	
	
}
