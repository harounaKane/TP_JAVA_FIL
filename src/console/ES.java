package console;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ES {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static int saisir(String msg, int inf, int sup) throws Exception {
		afficher(msg);
		int choix;
		
		do{
			try {
				choix = sc.nextInt();
				sc.nextLine();
				if(choix >= inf && choix <= sup)
					break;
				afficher("*** SAISIE HORS INTERVALLE ***");
		
			}catch(InputMismatchException e) {
				afficher("\n*** SAISIR DES ENTIERS ***");
				sc.nextLine();
			}
		}while(true);
		
		return choix;
	}
	
	public static String saisie(String msg) {
		afficher(msg);
		return sc.nextLine();
	}

	public static void afficher(String msg) {
		System.out.println(msg);
	}

}
