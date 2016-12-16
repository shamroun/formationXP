package fr.excilys.formation.bowliwood;

import java.util.Scanner;

public class Joueur {
	public enum typeLancee {
		NORMAL, STRIKE, SPARE
	}

	int[] quilleLancee1 = new int[10];
	int[] quilleLancee2 = new int[10];
	int[] scoresRound = new int[10];
	typeLancee[] typeDeLaLancee = new typeLancee[10];

	// public Joueur(int [] quilleLancee1, int [] quilleLancee2, int []
	// scoresRound, typeLancee [] typeDeLaLancee )
	//
	// {
	// this.quilleLancee1 = quilleLancee1;
	// this.quilleLancee2 = quilleLancee2;
	// this.typeDeLaLancee = typeDeLaLancee;
	// this.scoresRound= scoresRound;
	// }

	public int[] getScoresRound() {
		return scoresRound;
	}

	public void setScoresRound(int i, int valeur) {
		this.scoresRound[i] = valeur;
	}

	public int[] getquilleLancee1() {
		return quilleLancee1;
	}

	public void setquilleLancee1(int i, int valeur) {
		this.quilleLancee1[i] = valeur;
	}

	public int[] getquilleLancee2() {
		return quilleLancee2;
	}

	public void setquilleLancee2(int i, int valeur) {
		this.quilleLancee2[i] = valeur;
	}

	public typeLancee[] getTypeDeLaLancee() {
		return typeDeLaLancee;
	}

	public void setTypeDeLaLancee(int i, Joueur.typeLancee valeur) {
		this.typeDeLaLancee[i] = valeur;
	}

	public static int playersNumber(Scanner sc) {
		int number = -1;
		boolean isANumber = false;
		while (isANumber == false) {
			String str = sc.nextLine();
			try {
				number = Integer.parseInt(str);
				if(number>=1)
				{
					System.out.println("saisi acceptée");
					isANumber = true;
				}
				else 
				{
					System.out.println("Nombre de joueurs doit etre > ou egal a 1");
					isANumber = false;
				}
			} catch (Exception e) {
				System.out.println("Saisi erronnée, veuillez réessayer d'inserer le nombre de joueurs");

			}
		}

		return number;
	}

	public static String[] playersNames(Scanner sc, int numberOfPlayers) {
		String names[] = new String[numberOfPlayers];
		for (int i = 0; i < numberOfPlayers; i++) {
			System.out.println("Joueur numéro: " + (i + 1));
			String str = sc.nextLine();
			names[i] = str;
			System.out.println(names[i]);

		}
		return names;
	}

	public static int score(Scanner sc) {
		int score = -1;
		boolean isANumber = false;
		while (isANumber == false) {
			String str = sc.nextLine();
			try {
				score = Integer.parseInt(str);
				System.out.println("saisi acceptée");
				isANumber = true;
			} catch (Exception e) {
				System.out.println("Saisi erronnée, veuillez réessayer");
			}
		}
		return score;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner sc = new Scanner(System.in);
//		score(sc);
//		playersNumber(sc);
//		sc.close();
	}

}
