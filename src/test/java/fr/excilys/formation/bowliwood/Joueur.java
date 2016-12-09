package fr.excilys.formation.bowliwood;

import java.util.Scanner;

public class Joueur {

	public static int playersNumber() {
		int number=0;
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		number=Integer.parseInt(str); 
		//sc.close();
		return number;
	}
	
	public static String[] playersNames(int numberOfPlayers)
	{
		String names[]=new String[numberOfPlayers];
		for(int i=0; i<numberOfPlayers;i++)
		{
			System.out.println("Joueur numéro: "+(i+1));
			Scanner sc1 = new Scanner(System.in);
			String str = sc1.nextLine();
			names[i]=str;
			System.out.println(names[i]);
			//sc1.close();

		}
		return names;
	}
	
	public static int score() {
		int score=0;
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		score=Integer.parseInt(str); 
		//sc.close();
		return score;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
