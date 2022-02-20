package gestionPersonne;

import console.ES;
import metier.Personne;
import metier.Sexe;
import structure.TabPersonne;

public class GestionPersonne {

	public void MenuPersonne(TabPersonne tabPersonne) {
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
					\n""";
			choix = ES.saisir(str + "choix :", 0, 5);
			switch (choix) {
			case 1 -> affichage(tabPersonne);
			case 2 -> affichageParSexe(tabPersonne );
			case 3 -> ajout(tabPersonne);
			case 4 -> suppression(tabPersonne);
			}
		} while (choix != 0);
	}

	public void suppression(TabPersonne tabPersonne) {
		if (tabPersonne.taille() > 0) {
			ES.afficher("Choisir l'option à supprimer" + "[0, " + (tabPersonne.taille() - 1) + "]");
			int indice = ES.saisir("Personne à supprimer:", 0, tabPersonne.taille() - 1);
			tabPersonne.supprimer(indice);
		}
	}

	public void ajout(TabPersonne tabPersonne) {
		String sexe;
		do {
			sexe = ES.saisie("Sexe (H/F)").toUpperCase();
		} while (!sexe.equals("F") && !sexe.equals("H"));

		String prenom = ES.nbreCaractere("prénom: ", 3);
		String nom = ES.nbreCaractere("Nom", 3);
		int age = ES.saisir("Âge ", 21, 55);

		Personne p = new Personne(Sexe.setSexe(sexe), prenom, nom, age);
		tabPersonne.ajouter(p);

	}

	public void affichageParSexe(TabPersonne tabPersonne) {
//		ES.saisir("perso a afficher", Integer.MAX_VALUE);
//		ES.afficher(tabPersonne.toString());
	
	}

	public void affichage(TabPersonne tabPersonne) {

		ES.afficher(tabPersonne.toString());
	}

}
