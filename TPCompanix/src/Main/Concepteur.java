package Main;

import java.util.Date;

public class Concepteur extends Salarie {
	
	String nbAnneeDev;

	
	public Concepteur(String code, String nom, String prenom, String dateEmbauche, String nbAnneeDev) {
		super(code, nom, prenom, dateEmbauche);
		this.nbAnneeDev = nbAnneeDev;
	}

	
}