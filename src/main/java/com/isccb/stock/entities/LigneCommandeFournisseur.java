package com.isccb.stock.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="isccb_ligneCommandeFournisseur")
public class LigneCommandeFournisseur implements Serializable{

	@Id
	@GeneratedValue
	private Long idLigneCommandeFournisseur;
	
	@ManyToOne
	@JoinColumn(name="idCommandeFournisseur")
	private CommandeFournisseur commandeFournisseur;
	
	
	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article;

	public LigneCommandeFournisseur() {
		super();
	}

	

	

	public Long getIdLigneCommandeFournisseur() {
		return idLigneCommandeFournisseur;
	}





	public CommandeFournisseur getCommandeFournisseur() {
		return commandeFournisseur;
	}

	public void setCommandeFournisseur(CommandeFournisseur commandeFournisseur) {
		this.commandeFournisseur = commandeFournisseur;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}
	
	
}
