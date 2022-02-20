package gestionPersonne;

import console.ES;
import metier.DateUser;
import metier.Voiture;
import structure.TabVoiture;

public class GestionVoiture {

	public void MenuVoiture(TabVoiture tabVoiture) {
		int choix;
		do {
			String str = """
					\t**** MENU Voiture ****\n
					1. Affichage
					2. Affichage par Marque
					3. Ajout
					4. Suppression
					5. ...
					0. Quitter
					\n""";
			choix = ES.saisir(str + "choix :", 0, 5);
			switch (choix) {
			case 1 -> affichage(tabVoiture);
			case 2 -> affichageParMarque(tabVoiture);
			case 3 -> ajout(tabVoiture);
			case 4 -> suppression(tabVoiture);
			}
		} while (choix != 0);
	}

	private void suppression(TabVoiture tabVoiture) {

		if (tabVoiture.taille() > 0) {
			ES.afficher("Choisir l'option à supprimer" + "[0, " + (tabVoiture.taille() - 1) + "]");
			int indice = ES.saisir("Voiture à supprimer:", 0, tabVoiture.taille() - 1);
			tabVoiture.supprimer(indice);
		}
	}

	private void ajout(TabVoiture tabVoiture) {

		String marque = ES.saisie("Marque :");
		double prix = ES.saisir("Prix: ", 1, Double.MAX_VALUE);
		

		Voiture v = new Voiture(marque, prix, new DateUser());
		tabVoiture.ajouter(v);
	}

	private void affichageParMarque(TabVoiture tabVoiture) {

	}
	private void affichage(TabVoiture tabVoiture) {
		ES.afficher(tabVoiture.toString());

	}

}
