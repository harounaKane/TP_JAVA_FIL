package metier;

import java.util.Calendar;

public class DateUser {
	public static void main(String[] args) {
		DateUser d1 = new DateUser(12,12,2222);
		
		System.out.println(d1);
	}
	
	int jour, mois, annee;

	public DateUser(int jour, int mois, int annee) {
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
	}
	
	public DateUser() {
		Calendar cal = Calendar.getInstance();
		this.jour = cal.get(Calendar.DAY_OF_MONTH);
		this.mois = cal.get(Calendar.MONTH)+1;
		this.annee = cal.get(Calendar.YEAR);
	}

	public int getJour() {
		return jour;
	}

	public void setJour(int jour) {
		this.jour = jour;
	}

	public int getMois() {
		return mois;
	}

	public void setMois(int mois) {
		this.mois = mois;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	@Override
	public String toString() {
		return jour+"/"+mois+"/"+annee;
	}
	
	

}
