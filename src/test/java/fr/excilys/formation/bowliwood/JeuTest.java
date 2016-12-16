package fr.excilys.formation.bowliwood;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import org.junit.Test;

public class JeuTest {
	@Test
	public void testValidateInput()
	{
		System.out.println("Test du nombre des quilles a valider:");
		ByteArrayInputStream in = new ByteArrayInputStream("0\n0\n1\n".getBytes());
		System.setIn(in);
		Scanner sc= new Scanner(System.in);
		assertEquals(Jeu.validateInput(sc, 5),0);
		sc.close();
	}

}
