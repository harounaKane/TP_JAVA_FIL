package principal;

import console.ES;

public class Main {

	public static void main(String[] args) throws Exception {

		int choix;
		do {
			choix = menuGeneral();
			switch (choix) {
			case 1 -> ES.afficher("Menu Personne");
			case 2 -> ES.afficher("Menu inconnu");
		
			}
		}while(choix != 0);
		
		ES.afficher("***\tAUREVOIR\t***");

	}

	public static int menuGeneral() throws Exception {
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
