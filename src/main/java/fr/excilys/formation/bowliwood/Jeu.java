package fr.excilys.formation.bowliwood;

import java.util.Scanner;

public class Jeu {
    public static boolean checkInterval(int score) {
	boolean inInterval = ((score >= 0) && (score <= 10));
	return inInterval;
    }

    public static int validateInput(int score) {
	int choice = 0;
	System.out
		.println("Vous avez saisi un score= " + score + " .Voulez-vous le valider? Tapez 1 si  oui et 0 si non");
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	choice = Integer.parseInt(str);
	while ((choice != 0) && (choice != 1)) {
	    System.out.println("Erreur.Vous avez saisi un score= " + score
		    + "voulez-vous le valider? Tapez 1 si  oui et 0 si non");
	    str = sc.nextLine();
	    choice = Integer.parseInt(str);
	}
	
	return choice;

    }
    
    public static int calculateScore(int score)
    {
	int scoreCalculated=0;
	
	return scoreCalculated;
    }

    public static void main(String[] args) {
	// TODO Auto-generated method stub

    }

}
