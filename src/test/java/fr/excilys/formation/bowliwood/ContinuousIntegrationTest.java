package fr.excilys.formation.bowliwood;

import org.junit.Test;


public class ContinuousIntegrationTest {

	@Test
	/**
	 * Failing test. Should be changed for CI.
	 */
	public void main() {
		//fail();
		Joueur joueur=new Joueur();
		System.out.println("Hello World!!");
		int number=joueur.playersNumber();
		System.out.println("x");
		String [] names=joueur.playersNames(number);
	}


	


	



}
