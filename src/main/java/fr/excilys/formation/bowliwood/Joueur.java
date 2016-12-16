package fr.excilys.formation.bowliwood;

import java.util.Scanner;

public class Joueur {
    	public enum typeLancee {NORMAL,STRIKE,SPARE }
    	
    	int [] quilleLancee1= new int[10];
    	int [] quilleLancee2= new int[10];
    	int [] scoresRound= new int[10];
    	typeLancee [] typeDeLaLancee = new typeLancee[10];
    	
//    	public Joueur(int [] quilleLancee1, int [] quilleLancee2, int [] scoresRound, typeLancee [] typeDeLaLancee )
//    	
//    	{
//    	    this.quilleLancee1 = quilleLancee1;
//    	    this.quilleLancee2 = quilleLancee2;
//    	    this.typeDeLaLancee = typeDeLaLancee;
//    	    this.scoresRound= scoresRound;
//    	}
    	
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

	public static int playersNumber() {
		int number = 0;
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		number=Integer.parseInt(str); 
		//sc.close();
		return number;
	}
	
	public static String[] playersNames(int numberOfPlayers)
	{
		String names[]=new String[numberOfPlayers];
		for(int i=0 ; i<numberOfPlayers ; i++)
		{
			System.out.println("Joueur numéro: " + (i + 1));
			Scanner sc1 = new Scanner(System.in);
			String str = sc1.nextLine();
			names[i] = str;
			System.out.println(names[i]);
			//sc1.close();

		}
		return names;
	}
	
	public static int score() {
		int score=0;
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
	score = Integer.parseInt(str);
	// sc.close();
		return score;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
