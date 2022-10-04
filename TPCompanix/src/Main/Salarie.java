package Main;

import java.util.Date;

public class Salarie {
	String code;
	String nom = "";
	String prenom = "";
	String dateEmbauche;
	
	Salarie(String code, String nom, String prenom, String dateEmbauche){
		this.code = code;
		this.nom = nom;
		this.prenom = prenom;
		this.dateEmbauche = dateEmbauche;
	}


	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public String getDateEmbauche() {
		return dateEmbauche;
	}

	public void setDateEmbauche(String dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}

}


