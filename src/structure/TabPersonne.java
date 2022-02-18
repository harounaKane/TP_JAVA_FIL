package structure;

import java.util.ArrayList;

import metier.Personne;


public class TabPersonne {

	private ArrayList<Personne> tabPers = new ArrayList<>();
	
	public void ajouter() {
		System.out.println("ajouter");
	}
	
	
	public String toString() {
		String str = "";
		for(Personne p : tabPers)
			str += p.toString()+"\n";
		return str;
	}
	public int taille() {
		return tabPers.size();
	}
	
}
