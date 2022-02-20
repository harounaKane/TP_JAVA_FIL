package principal;

import console.ES;
import gestionPersonne.GestionPersonne;
import gestionPersonne.GestionVoiture;
import structure.TabPersonne;
import structure.TabVoiture;

public class Main {

	public static void main(String[] args) {

		GestionPersonne gestionPers= new GestionPersonne();
		
		TabPersonne tabPersonne = new TabPersonne();
         
		GestionVoiture gestionVoiture = new GestionVoiture();
		
		TabVoiture tabVoiture = new TabVoiture();
		int choix;
		do {
			choix = menuGeneral();
			switch (choix) {
			case 1 -> gestionPers.MenuPersonne(tabPersonne);
			case 2 -> gestionVoiture.MenuVoiture(tabVoiture);
		
			}
		}while(choix != 0);
		
		ES.afficher("***\tAUREVOIR\t***");

	}

	public static int menuGeneral(){
		String str = """
				\t**** MENU GENERAL ****\n
				1. Personne
				2. Voiture
				0. Fin
				""";
		int choix = ES.saisir(str, 0, 2);
		return choix;
	}
}
