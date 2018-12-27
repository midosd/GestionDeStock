package com.isccb.stock.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="isccb_mouvementStock")
public class MouvementStock implements Serializable{
	
	public static final int ENTREE = 1;
	public static final int SORTIE = 2;

	@Id
	@GeneratedValue
	private Long idMouvementStock;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateMouvement;
	
	private BigDecimal quantite;
	
	private int typeMouvement;
	
	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article;
	

	public MouvementStock() {
		super();
	}

	
	

	public Long getIdMouvementStock() {
		return idMouvementStock;
	}




	public Date getDateMouvement() {
		return dateMouvement;
	}

	public void setDateMouvement(Date dateMouvement) {
		this.dateMouvement = dateMouvement;
	}

	public BigDecimal getQuantite() {
		return quantite;
	}

	public void setQuantite(BigDecimal quantite) {
		this.quantite = quantite;
	}

	public int getTypeMouvement() {
		return typeMouvement;
	}

	public void setTypeMouvement(int typeMouvement) {
		this.typeMouvement = typeMouvement;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}
	
	
	
	
}
