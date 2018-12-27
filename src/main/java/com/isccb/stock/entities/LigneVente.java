package com.isccb.stock.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="isccb_ligneVente")
public class LigneVente implements Serializable{
	
	@Id
	@GeneratedValue
	private Long idLigneVente;
	
	@ManyToOne
	@JoinColumn(name="idVente")
	private Vente vente;
	

	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article;

	

	

	public Long getIdLigneVente() {
		return idLigneVente;
	}

	public LigneVente() {
		super();
	}

	public Vente getVente() {
		return vente;
	}

	public void setVente(Vente vente) {
		this.vente = vente;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}
	
	
}
