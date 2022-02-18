package principal;

import console.ES;
import gestionPersonne.GestionPersonne;
import structure.TabPersonne;

public class Main {

	public static void main(String[] args) {

		GestionPersonne gestionPers= new GestionPersonne();
		
		TabPersonne tabPersonne = new TabPersonne();
		
		int choix;
		do {
			choix = menuGeneral();
			switch (choix) {
			case 1 -> gestionPers.MenuPersonne(tabPersonne);
			case 2 -> ES.afficher("Menu inconnu");
		
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
