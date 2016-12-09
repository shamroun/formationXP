package fr.excilys.formation.bowliwood;

import java.util.Scanner;

public class Jeu {
    public static boolean checkInterval(int score) {
	boolean inInterval = ((score >= 0) && (score <= 10));
	return inInterval;
    }

    public static int validateInput(int score) {
	int choice = 0;
	System.out.println(
		"Vous avez saisi un score= " + score + " .Voulez-vous le valider? Tapez 1 si  oui et 0 si non");
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

//    public static int calculateScore(int round1, Joueur J) {
//	int round = round1 - 1;
//	int scoreCalculated = 0;
//
//	int somme = J.quilleLancee1[round] + J.quilleLancee2[round];
//	if (somme < 10) {
//	    J.typeDeLaLancee[round] = Joueur.typeLancee.NORMAL;
//	} else {
//	    if (J.quilleLancee1[round] == 10) {
//		J.typeDeLaLancee[round] = Joueur.typeLancee.STRIKE;
//	    } else
//		J.typeDeLaLancee[round] = Joueur.typeLancee.SPARE;
//	}
//	if (round1 != 1) {
//	    if (J.typeDeLaLancee[round - 1] == Joueur.typeLancee.STRIKE) {
//		J.scoresRound[round - 1] = J.scoresRound[round - 1] + somme;
//	    } else if (J.typeDeLaLancee[round - 1] == Joueur.typeLancee.SPARE) {
//		J.scoresRound[round - 1] = J.scoresRound[round - 1] + J.quilleLancee1[round];
//	    }
//	}
//	
//
//    // TODO
//
//    return scoreCalculated;
//
//    }

    public static void main(String[] args) {
	// TODO Auto-generated method stub

    }

}
