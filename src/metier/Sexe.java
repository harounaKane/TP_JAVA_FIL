package metier;

public enum Sexe {
	F, H;
	
	public static Sexe setSexe(String s) {
		return Sexe.valueOf(s);
	}
}
