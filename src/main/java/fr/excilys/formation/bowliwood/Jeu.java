package fr.excilys.formation.bowliwood;

public class Jeu {
    public static boolean checkInterval(int score)
    {
	boolean inInterval = ( (score >=0 ) &&  (score <=10 ) );
	return inInterval;
    }
    
    public static void main(String[] args) {
	// TODO Auto-generated method stub

    }

}
