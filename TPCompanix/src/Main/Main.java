package Main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {
	
	public static void main(String args[]) {
		
		ArrayList<String> liste = new ArrayList<String>();

		Map<String, Salarie> dicSal = new HashMap<String, Salarie>();
		Scanner scanner = new Scanner(System.in);
		boolean boucle = true;

		while(boucle) {
			
			
			System.out.println("1 : Ajouter un concepteur");
			System.out.println("2 : Supprimer un concepteur");
			System.out.println("3 : Liste des concepteurs existants");
			System.out.println("4 : Ajouter un analyste");
			System.out.println("5 : Supprimer un analyste");
			System.out.println("6 : Liste ces salariés existants en mettant en évidence la fonction (Concepteur ou Analyste)");
			System.out.println("7 : Quitter");

			
			System.out.println("Choisir l'option");
			String choix = scanner.nextLine();
			System.out.println(choix);
	
			
			switch(choix) {
				case "1" : addConcepteur(dicSal);
				break;
				case "2" : deleteConcepteur(dicSal);
					break;
				case "3" : listeConcepteur(dicSal);
					break;
				case "4" : addAnalyste(dicSal);
					break;
				case "5" : deleteAnalyste(dicSal);
					break;
				case "6" : listeComplete(dicSal);
					break;
				case "7" : boucle = false;
					break;
			}
		}
	}
		
	
	
	static void addConcepteur(Map<String, Salarie> dicSal) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Saisir le code, nom, prénom, date d’embauche et nombre d’année de développement");
		String addC = scanner.nextLine();
		System.out.println(addC);
		
		String valeur[] = addC.split("-");
		if(dicSal.containsKey(valeur[0])) {
			System.out.println("Ce concepteur existe deja");
		}
		else {
			Concepteur unConcepteur = new Concepteur(valeur[0],valeur[1],valeur[2],valeur[3],valeur[4]);
			dicSal.put(valeur[0],unConcepteur);
		}
		
		
	}
	
	static void deleteConcepteur(Map<String, Salarie> dicSal) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Saisir le code du concepteur à supprimer");
		String delC = scanner.nextLine();
		System.out.println(delC);
		

		if(dicSal.containsKey(delC)){
			if(dicSal.get(delC) instanceof Analyste) {
				System.out.println("Attention, c'est un analyste");
			}
			else{
				dicSal.remove(delC);
			}
		}
		else {
			System.out.println("Ce concepteur n'éxiste pas");
		}
		
	}
	
	
	static void listeConcepteur(Map<String, Salarie> dicSal) {
		Set listKeys=dicSal.keySet(); 
		Iterator iterateur=listKeys.iterator();
		while(iterateur.hasNext())
		{
			Object key= iterateur.next();
			if(dicSal.get(key) instanceof Concepteur) {
				System.out.println (key+"=>"+ dicSal.get(key).getPrenom());
			}
		}
	}

	static void addAnalyste(Map<String, Salarie> dicSal) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Saisir le code, nom, prénom, date d’embauche et nombre de déplacement client");
		String addA = scanner.nextLine();
		System.out.println(addA);
		
		String valeur[] = addA.split("-");
		if(dicSal.containsKey(valeur[0])) {
			System.out.println("Cet analyste existe deja");
		}
		else {
		Analyste unAnalyste = new Analyste(valeur[0],valeur[1],valeur[2],valeur[3],valeur[4]);
		dicSal.put(valeur[0],unAnalyste);
		}
	}
	
	static void deleteAnalyste(Map<String, Salarie> dicSal) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Saisir le code de l'analyste à supprimer");
		String delA = scanner.nextLine();
		System.out.println(delA);
		
		if(dicSal.containsKey(delA)) {
			if(dicSal.get(delA) instanceof Concepteur) {
				System.out.println("Attention, c'est un concepteur");
			}
			else{
				dicSal.remove(delA);
			}
		}
		else {
			System.out.println("Cet analyste n'éxiste pas");
		}
	}
		
		
	static void listeComplete(Map<String, Salarie> dicSal) {
		Map<String,Salarie> dicSalSorted = new TreeMap<String,Salarie>(dicSal);
		Set listKeys = dicSalSorted.keySet(); 
		Iterator iterateur = listKeys.iterator();
		while(iterateur.hasNext())
		{
			Object key= iterateur.next();
			if(dicSalSorted.get(key) instanceof Concepteur) {
				System.out.println ("Concepteur " + key+"=>"+ dicSalSorted.get(key).getPrenom());
			}
			if(dicSalSorted.get(key) instanceof Analyste) {
				System.out.println ("Analyste " + key+"=>"+ dicSalSorted.get(key).getPrenom());
			}
		}
	}
	
		
}
	

	
	

