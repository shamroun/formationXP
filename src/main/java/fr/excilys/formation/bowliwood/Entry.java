package fr.excilys.formation.bowliwood;

public class Entry {
	public static void main(String... args) {
		Joueur joueur=new Joueur();
		System.out.println("Hello World!!");
		int number=joueur.playersNumber();
		System.out.println("x");
		String [] names=joueur.playersNames(number);
	}
}
