package metier;

import java.util.Random;

public class Voiture {

	private String matricule;
	private String marque;
	private double prix;
	private DateUser ann�eFabrication;

	public static int mat = 100;

	public Voiture() {
	}

	public Voiture(String marque, double prix, DateUser ann�eFabrication) {
		super();

		this.marque = marque;
		this.prix = prix;
		this.ann�eFabrication=ann�eFabrication;
		this.matricule = generate();
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	private String generate() {
		
		Random rand = new Random();
		String str = "";
		for (int i = 0; i < 7; i++) {
			char c = (char) (rand.nextInt(26) + 'A');
			str = str + c;
			// str += c ;

		}
		return str = str + "-" + mat++;
		// return str += mat++ ;
		}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public DateUser getAnn�eFabrication() {
		return ann�eFabrication;
	}

	public void setAnn�eFabrication(DateUser ann�eFabrication) {
		this.ann�eFabrication = ann�eFabrication;
	}

	@Override
	public String toString() {
		return  "matricule=" + matricule + ", marque=" + marque + ", prix=" + prix + ", ann�eFabrication="
				+ ann�eFabrication;
	}

}

