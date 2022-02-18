package principal;

import console.ES;
import gestionPersonne.GestionPersonne;

public class Main {

	public static void main(String[] args) {

		GestionPersonne gestionPers= new GestionPersonne();
		
		int choix;
		do {
			choix = menuGeneral();
			switch (choix) {
			case 1 -> gestionPers.MenuPersonne();
			case 2 -> ES.afficher("Menu inconnu");
		
			}
		}while(choix != 0);

	}

	public static int menuGeneral() {
		String str = """
				\t**** MENU GENERAL ****\n
				1. Personne
				2. Voiture
				0. Fin
				""";
		int choix = ES.saisir(str);
		return choix;
	}
}
