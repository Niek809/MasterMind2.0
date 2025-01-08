package masterMind2_0;

import java.util.*;

public class master {
	private static Scanner input = new Scanner(System.in);	

	public static void main(String[] args) {
		funtcieMaster mm = new funtcieMaster();
		int i;
	        System.out.println("Welkom bij mastermind in java, ik hoop dat jullie het een leuk spel gaan vinden, succes met oplossen!");
	        System.out.println("Wil je een (1) willekeurige code krijgen of (2) zelf een code bedenken?");
	        int choice = input.nextInt();
	        
	        switch (choice) {
	            case 1:
	            	mm.randomcodemaker();
	                break;
	            case 2:
	                System.out.println("Typ hier je 4-cijferige code (kies uit Rood, Geel, Oranje, Paars, Groen, Blauw):");
	                mm.randomcodezelf();
	                break;
	            default:
	                System.out.println("Ongeldige keuze. Voer 1 of 2 in.");
	                return;
	        }

	        System.out.println("Je hebt 10 pogingen om mijn code te raden. U moet 4 cijfers invoeren (kies uit Rood, Geel, Oranje, Paars, Groen, Blauw).");
	        System.out.println("Zwart betekend dat u het juiste kleur op de goede plek heeft, Wit betekend dat het kleur correct is maar niet op de juiste plek, en - betekent dat het kleur er niet in zit.");

		for (i = 1; i <= 10; i++) {
			
			System.out.println(" ");
			System.out.println("Typ hier je gok: ");
			System.out.println("poging: " + i);
			
			mm.input();
			mm.checker();
			mm.eind();
		}
		mm.uitkomst();
	}
}