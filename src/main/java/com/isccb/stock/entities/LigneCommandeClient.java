package com.isccb.stock.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="isccb_ligneCommandeClient")
public class LigneCommandeClient implements Serializable{

	@Id
	@GeneratedValue
	private Long idLigneCommandeClient;
	
	@ManyToOne
	@JoinColumn(name="idCommandeClient")
	private CommandeClient commandeClient;
	
	
	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article;

	public LigneCommandeClient() {
		super();
	}

	
	

	public Long getIdLigneCommandeClient() {
		return idLigneCommandeClient;
	}




	public CommandeClient getCommandeClient() {
		return commandeClient;
	}

	public void setCommandeClient(CommandeClient commandeClient) {
		this.commandeClient = commandeClient;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}
	
	
}
