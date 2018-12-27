package com.isccb.stock.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="isccb_utilisateur")
public class Utilisateur implements Serializable{

	@Id
	@GeneratedValue
	private Long idUtilisateur;
	
	private String nom;
	private String prenom;
	private String email;
	private String password;
	private String photo;

	public Utilisateur() {
		super();
	}

	

	

	public Long getIdUtilisateur() {
		return idUtilisateur;
	}





	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	
}
