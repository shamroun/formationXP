package fr.excilys.formation.bowliwood;

import java.util.Scanner;

public class Jeu {

	public static boolean checkInterval(int score) {
		boolean inInterval = ((score >= 0) && (score <= 10));
		return inInterval;
	}

	// Fonction qui demande au joueur s'il est sur qu'il a inseré un score
	// correct
	public static int validateInput(Scanner sc, int score) {
		int choice = 0;
		System.out.println(
				"Vous avez saisi un score= " + score + " .Voulez-vous le valider? Tapez 1 si  oui et 0 si non");
		String str = sc.nextLine();
		try {
			choice = Integer.parseInt(str);
		} catch (Exception e) {
			System.out.println("Saisi erronnée, inserer 1 ou 0");
		}

		while ((choice != 0) && (choice != 1)) {
			System.out.println("Erreur.Vous avez saisi un score= " + score
					+ "voulez-vous le valider? Tapez 1 si  oui et 0 si non");
			str = sc.nextLine();

			try {
				choice = Integer.parseInt(str);
			} catch (Exception e) {
				System.out.println("Saisi erronnée, inserer 1 ou 0");

			}
		}

		return choice;

	}

	public static int calculateScore(int round1, Joueur J) {
		int round = round1 - 1;
		int scoreCalculated = 0;

		int somme = J.getquilleLancee1()[round] + J.getquilleLancee2()[round];
		if (somme < 10) {
			J.setTypeDeLaLancee(round, Joueur.typeLancee.NORMAL);
		} else {
			if (J.getquilleLancee1()[round] == 10) {
				J.setTypeDeLaLancee(round, Joueur.typeLancee.STRIKE);
			} else
				J.setTypeDeLaLancee(round, Joueur.typeLancee.SPARE);
		}
		if (round1 != 1) {
			if (J.getTypeDeLaLancee()[round - 1] == Joueur.typeLancee.STRIKE) {
				J.setScoresRound((round - 1), (J.getScoresRound()[round - 1] + somme));
			} else if (J.getTypeDeLaLancee()[round - 1] == Joueur.typeLancee.SPARE) {
				J.setScoresRound((round - 1), (J.getScoresRound()[round - 1] + J.getquilleLancee1()[round]));

			}
		}

		// TODO

		return scoreCalculated;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner sc= new Scanner (System.in);
//		validateInput( sc, 1);
//			sc.close();
	}

}
