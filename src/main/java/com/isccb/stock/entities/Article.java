package com.isccb.stock.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="isccb_article")
public class Article implements Serializable{

	@Id
	@GeneratedValue
	private Long idArticle;
	
	private String code;
	private String designation;
	private BigDecimal prixUnitaireHT;
	private BigDecimal tauxTva;
	private BigDecimal prixUnitaireTTC;
	private String photo;
	
	
	@ManyToOne
	@JoinColumn(name="idCategory")
	private Category category;

	@OneToMany(mappedBy="article")
	private List<LigneCommandeClient> ligneCommandeClients;
	
	@OneToMany(mappedBy="article")
	private List<LigneCommandeFournisseur> ligneCommandeFournisseurs;

	@OneToMany(mappedBy="article")
	private List<LigneVente> ligneVentes ;
	
	@OneToMany(mappedBy="article")
	private List<MouvementStock> mouvementStocks ;

	

	public Article() {
		super();
	}


	
	
	public Long getIdArticle() {
		return idArticle;
	}




	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public BigDecimal getPrixUnitaireHT() {
		return prixUnitaireHT;
	}

	public void setPrixUnitaireHT(BigDecimal prixUnitaireHT) {
		this.prixUnitaireHT = prixUnitaireHT;
	}

	public BigDecimal getTauxTva() {
		return tauxTva;
	}

	public void setTauxTva(BigDecimal tauxTva) {
		this.tauxTva = tauxTva;
	}

	public BigDecimal getPrixUnitaireTTC() {
		return prixUnitaireTTC;
	}

	public void setPrixUnitaireTTC(BigDecimal prixUnitaireTTC) {
		this.prixUnitaireTTC = prixUnitaireTTC;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}


	public List<LigneCommandeClient> getLigneCommandeClients() {
		return ligneCommandeClients;
	}


	public void setLigneCommandeClients(List<LigneCommandeClient> ligneCommandeClients) {
		this.ligneCommandeClients = ligneCommandeClients;
	}


	public List<LigneCommandeFournisseur> getLigneCommandeFournisseurs() {
		return ligneCommandeFournisseurs;
	}


	public void setLigneCommandeFournisseurs(List<LigneCommandeFournisseur> ligneCommandeFournisseurs) {
		this.ligneCommandeFournisseurs = ligneCommandeFournisseurs;
	}


	public List<LigneVente> getLigneVentes() {
		return ligneVentes;
	}


	public void setLigneVentes(List<LigneVente> ligneVentes) {
		this.ligneVentes = ligneVentes;
	}


	public List<MouvementStock> getMouvementStocks() {
		return mouvementStocks;
	}


	public void setMouvementStocks(List<MouvementStock> mouvementStocks) {
		this.mouvementStocks = mouvementStocks;
	}


	
	
	
	
	
}
