package masterMind2_0;

import java.util.*;

public class master {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int i;

		String[] computerColors = { "Rood", "Blauw", "Groen", "Geel", "Paars", "Oranje" };
		Random rnd = new Random();

		String[] code = new String[4];
		for (int j = 0; j < code.length; j++) {
			code[j] = computerColors[rnd.nextInt(computerColors.length)];
			System.out.println(code[j]);
			}
		
		int pegsInRightPosition = 0;
		int pegsMisplaced = 0;
		String[] userColors = new String[4];
		
		System.out.println("Welkom bij mastermind in java, ik hoop dat jullie het een leuk spel gaan vinden, succes met oplossen!");
		System.out.println("U heeft 10 pogingen om mijn code te raden, u moet 4 cijfer in typen om te spelen. (kies uit Rood, Geel, Oranje, Paars, Groen, Blauw)");
		System.out.println("Zwart betekend dar u het kleuren op de goede plek heeft staan, Wit betekend dat de kleuren goed is maar hij staat niet op de goede plek, en - is dat dat kleuren er niet in zit.");
		
		for (i = 1; i <= 10; i++) {
			
			System.out.println(" ");
			System.out.println("Typ hier je gok: ");
			System.out.println("poging: " + i);
			
			pegsInRightPosition = 0;
			pegsMisplaced = 0;
			
			for (int j = 0; j < 4; j++) {
			userColors[j] = input.next();}
			pegsInRightPosition = 0;
			pegsMisplaced = 0;
			
			for (int j = 0; j < userColors.length; j++) {
			    if (userColors[j].equals(code[j])) {
			        System.out.print("zwart ");
			        pegsInRightPosition++;
			    } else {
			        int x;
			        for (x = 0; x < code.length; x++) {
			            if (userColors[j].equals(code[x]) && j != x) {
			                System.out.print("wit ");
			                break;
			            }
			        }
			        
			        if (x == code.length) {
			            System.out.print(" - ");
			        }
			    }
			}
			
			if (pegsInRightPosition == 4) {
				i = 11;
			}
		}
		
		if (pegsInRightPosition == 4) {
			System.out.println(" ");
			System.out.println("Zo ik ben verbaast, goed gedaan!");
		} else {
			System.out.println(" ");
			System.out.println("Dat is niet best, volgende keer beter.");
		}
	}
}