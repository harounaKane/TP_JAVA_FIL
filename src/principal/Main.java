package principal;

import console.ES;

public class Main {

	public static void main(String[] args) {

		int choix;
		do {
			choix = menuGeneral();
			switch (choix) {
			case 1 -> ES.afficher("Menu Personne");
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
