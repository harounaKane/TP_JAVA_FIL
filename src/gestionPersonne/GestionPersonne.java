package gestionPersonne;

import console.ES;

public class GestionPersonne {
	
	public void MenuPersonne() {
		int choix;
		do {
			String str = """
					\t**** MENU PERSONNE ****\n
					1. Affichage
					2. Affichage par sexe
					3. Ajout
					4. Suppression
					5. ...
					0. Quitter
					""";
			choix = ES.saisir(str);
			switch(choix) {
			case 1 -> affichage();
			case 2 -> affichageParSexe();
			case 3 -> ajout();
			case 4 -> suppression();
			}
		}while(choix != 0);	
	}

	public void suppression() {
		// TODO Auto-generated method stub
	}

	public void ajout() {
		// TODO Auto-generated method stub
	}

	public void affichageParSexe() {
		// TODO Auto-generated method stub
	}

	public  void affichage() {
		// TODO Auto-generated method stub
	}
	
	
	
}
