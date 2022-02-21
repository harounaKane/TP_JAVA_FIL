package structure;

import java.util.ArrayList;
import java.util.List;

import metier.Personne;
import metier.Sexe;

public class TabPersonne {

	private ArrayList<Personne> tabPers = new ArrayList<>();

	public TabPersonne() {
		//tabPers.add(new Personne(Sexe.H, "Jean", "Claude", 25));
	}

	public void ajouter(Personne personne) {
		tabPers.add(personne);
	}

	public void supprimer(int indice) {
		tabPers.remove(indice);
	}

	public String toString() {
		String str = "";
		for (Personne p : tabPers)
			str += p.toString() + "\n";
		return str;
	}

	public int taille() {
		return tabPers.size();
	}

	public TabPersonne parSexe(String sexe) {
		TabPersonne sexes = new TabPersonne();
		
		for(Personne p : tabPers) {
			if(p.getSexe() == Sexe.setSexe(sexe)) {
				sexes.ajouter(p);
			}
		}
		return sexes;
	}

}