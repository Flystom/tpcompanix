package Main;

import java.util.Date;

public class Analyste extends Salarie {
	
	String nbDeplacementClient;
	
	public Analyste(String code, String nom, String prenom, String dateEmbauche, String nbDeplacementClient) {
		super(code, nom, prenom, dateEmbauche);
		this.nbDeplacementClient = nbDeplacementClient;
	}



	
}
