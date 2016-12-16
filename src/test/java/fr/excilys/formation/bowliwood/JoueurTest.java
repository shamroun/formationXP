package fr.excilys.formation.bowliwood;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import org.junit.Rule;
import org.junit.Test;
import org.junit.matchers.JUnitMatchers;
import org.junit.rules.ExpectedException;

public class JoueurTest {
	@Test
	public void testScore()
	{
		System.out.println("TestScore:");
		//ByteArrayInputStream in = new ByteArrayInputStream("0\n1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n".getBytes());
		ByteArrayInputStream in = new ByteArrayInputStream("aa\n0\n".getBytes());
		System.setIn(in);
		Scanner sc= new Scanner(System.in);
		assertEquals(Joueur.score(sc),0);
		//assertEquals(Joueur.score(sc),1);
//		assertEquals(Joueur.score(sc),2);
//		assertEquals(Joueur.score(sc),3);
//		assertEquals(Joueur.score(sc),4);
//		assertEquals(Joueur.score(sc),5);
//		assertEquals(Joueur.score(sc),6);
//		assertEquals(Joueur.score(sc),7);
//		assertEquals(Joueur.score(sc),8);
//		assertEquals(Joueur.score(sc),9);
//		assertEquals(Joueur.score(sc),10);
		sc.close();
	}
	
	
	
	@Test
	public void testPlayersNumber()
	{
		System.out.println("Test du nombre des joueurs:");
		ByteArrayInputStream in = new ByteArrayInputStream("aa\n2\n".getBytes());
		System.setIn(in);
		Scanner sc= new Scanner(System.in);
		assertEquals(Joueur.playersNumber(sc),2);
		sc.close();
	}
	
	@Test
	public void testPlayersNames()
	{
		System.out.println("Test des noms des joueurs:");
		ByteArrayInputStream in = new ByteArrayInputStream("\naa\n".getBytes());
		System.setIn(in);
		Scanner sc= new Scanner(System.in);
		assertEquals(Joueur.playersNames(sc,1)[0],"aa");
		sc.close();
	}

}
