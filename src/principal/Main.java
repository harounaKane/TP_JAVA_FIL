package principal;

import metier.Personne;
import metier.Sexe;

public class Main {

	public static void main(String[] args) {
		Personne p = new Personne(Sexe.H, "Harouna", "Kane", 60);
		Personne p2 = new Personne(Sexe.H, "Djim", "Dem", 60);
		
		System.out.println(p.toString());

	}

}
