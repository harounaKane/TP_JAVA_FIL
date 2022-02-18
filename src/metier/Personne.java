package metier;

public class Personne {
	private String identifiant;
	private Sexe sexe;
	private String prenom;
	private String nom;
	private int age;
	
	private static int id = 1000;
	
	public Personne() {
	}

	public Personne(Sexe sexe, String prenom, String nom, int age) {
		this.sexe = sexe;
		this.prenom = prenom;
		this.nom = nom;
		this.age = age;
		this.identifiant = generate();
	}
	
	private String generate() {
		return this.prenom.substring(0, 2) + this.nom.substring(0, 2) + id++;
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public Sexe getSexe() {
		return sexe;
	}

	public void setSexe(Sexe sexe) {
		this.sexe = sexe;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Personne [identifiant=" + identifiant + ", sexe=" + sexe + ", prenom=" + prenom + ", nom=" + nom
				+ ", age=" + age + "]";
	}
	
	
	
}
