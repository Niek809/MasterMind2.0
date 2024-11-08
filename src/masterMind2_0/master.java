package masterMind2_0;

import java.util.*;

public class master {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int i;

		int computerColor1;
		int computerColor2;
		int computerColor3;
		int computerColor4;

		computerColor1 = 2;
		computerColor2 = 3;
		computerColor3 = 4;
		computerColor4 = 4;
		int pegsInRightPosition = 0;
		int pegsMisplaced;
		int userColor1;
		int userColor2;
		int userColor3;
		int userColor4;

		System.out.println("Welkom bij mastermind in flowgorithm, ik hoop dat jullie het een leuk spel gaan vinden, succes met oplossen!");
		System.out.println("U heeft 10 pogingen om mijn code te raden, u moet 4 cijfer in typen om te spelen. (kies uit 1t/m6)");
		System.out.println("Zwart betekend dar u het cijfer op de goede plek heeft staan, Wit betekend dat de cijfer goed is maar hij staat niet op de goede plek, en - is dat dat cijfer er niet in zit.");
		for (i = 1; i <= 10; i++) {
			System.out.println("Typ hier je gok: ");
			System.out.println("poging: " + i);
			userColor1 = input.nextInt();
			userColor2 = input.nextInt();
			userColor3 = input.nextInt();
			userColor4 = input.nextInt();
			pegsInRightPosition = 0;
			pegsMisplaced = 0;
			if (userColor1 == computerColor1) {
				System.out.print("zwart ");
				pegsInRightPosition = pegsInRightPosition + 1;
			} else {
				if (userColor1 == computerColor2) {
					System.out.print("wit ");
				} else {
					if (userColor1 == computerColor3) {
						System.out.print("wit ");
					} else {
						if (userColor1 == computerColor4) {
							System.out.print("wit ");
						} else {
							System.out.print(" - ");
						}

					}
				}
			}
			if (userColor2 == computerColor2) {
				System.out.print("zwart ");
				pegsInRightPosition = pegsInRightPosition + 1;
			} else {
				if (userColor2 == computerColor1) {
					System.out.print("wit ");
				} else {
					if (userColor2 == computerColor3) {
						System.out.print("wit ");
					} else {
						if (userColor2 == computerColor4) {
							System.out.print("wit ");
						} else {
							System.out.print(" - ");
						}
					}
				}
			}
			if (userColor3 == computerColor3) {
				System.out.print("zwart ");
				pegsInRightPosition = pegsInRightPosition + 1;
			} else {
				if (userColor3 == computerColor2) {
					System.out.print("wit ");
				} else {
					if (userColor3 == computerColor1) {
						System.out.print("wit ");
					} else {
						if (userColor3 == computerColor4) {
							System.out.print("wit ");
						} else {
							System.out.print(" - ");
						}
					}
				}
			}
			if (userColor4 == computerColor4) {
				System.out.println("zwart ");
				pegsInRightPosition = pegsInRightPosition + 1;
			} else {
				if (userColor4 == computerColor2) {
					System.out.println("wit ");
				} else {
					if (userColor4 == computerColor3) {
						System.out.println("wit ");
					} else {
						if (userColor4 == computerColor1) {
							System.out.println("wit ");
						} else {
							System.out.println(" - ");
						}
					}
				}
			}
			if (pegsInRightPosition == 4) {
				i = 11;
			}
			
		}
		if (pegsInRightPosition == 4) {
			System.out.println("Zo ik ben verbaast, goed gedaan!");
		} else {
			System.out.println("Dat is niet best, volgende keer beter.");
		}
	}
}
