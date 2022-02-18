package console;

import java.util.Scanner;

public class ES {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static int saisir(String msg) {
		afficher(msg);
		int choix = sc.nextInt();
		sc.nextLine();
		return choix;
	}
	
	public static void afficher(String msg) {
		System.out.println(msg);
	}

}
