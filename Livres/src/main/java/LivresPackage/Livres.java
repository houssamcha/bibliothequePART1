package LivresPackage;

import java.sql.Date;

public class Livres {
	int id_livre;
	String titre;
	String auteur;
	String editeur;
	Date annee_publication;
	public Livres() {
		super();
	}
	public Livres(int id_livre, String titre, String auteur, String editeur, Date annee) {
		super();
		this.id_livre = id_livre;
		this.titre = titre;
		this.auteur = auteur;
		this.editeur = editeur;
		this.annee_publication = annee;
	}
	public int getId_livre() {
		return id_livre;
	}
	public void setId_livre(int id_livre) {
		this.id_livre = id_livre;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public String getEditeur() {
		return editeur;
	}
	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}
	public Date getAnnee_publication() {
		return annee_publication;
	}
	public void setAnnee_publication(Date annee_publication) {
		this.annee_publication = annee_publication;
	}
	
}
