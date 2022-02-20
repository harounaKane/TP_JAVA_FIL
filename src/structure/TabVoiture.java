package structure;

import java.util.ArrayList;

import metier.DateUser;
import metier.Voiture;



public class TabVoiture {
	private ArrayList<Voiture> tabv = new ArrayList<>();
	
	public TabVoiture() {
		
DateUser d1 = new DateUser(12,12,2222);
		
		System.out.println(d1);
		tabv.add(new Voiture("peugeot",145,  new DateUser(11,2,2021)));
	}
	public void ajouter(Voiture voiture) {
		tabv.add(voiture);
	}
	
	public void supprimer(int indice) {
		tabv.remove(indice);
	}

	public String toString() {
		String str = "";
		for (Voiture v : tabv)
			str += v.toString() + "\n";
		return str;
	}

	public int taille() {
		return tabv.size();
	}

}
