package conditionalex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class SuperheroTeam {
    public static void main(String[] args) {
        ArrayList<String> superHeroes = new ArrayList<>();
        ArrayList<String> completedMissions = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        superHeroes.add("Superman");
        superHeroes.add("Wonder Woman");
        superHeroes.add("Flash");
        superHeroes.add("Batman");
        superHeroes.add("Aquaman");

        while (true) {
            System.out.println("\nWat wil je doen?");
            System.out.println("1. Superheld toevoegen");
            System.out.println("2. Superheld verwijderen");
            System.out.println("3. Team bekijken");
            System.out.println("4. Team sorteren");
            System.out.println("5. Missie uitvoeren");
            System.out.println("6. Voltooide missies bekijken");
            System.out.println("7. Afsluiten");
            System.out.print("Maak een keuze: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Typ de naam van de superheld die je wilt toevoegen: ");
                    String newHero = scanner.nextLine();
                    superHeroes.add(newHero);
                    System.out.println(newHero + " is toegevoegd aan het team!");
                    break;

                case 2:
                    System.out.print("Typ de naam van de superheld die je wilt verwijderen: ");
                    String heroToRemove = scanner.nextLine();
                    if (superHeroes.remove(heroToRemove)) {
                        System.out.println(heroToRemove + " is verwijderd uit het team!");
                    } else {
                        System.out.println(heroToRemove + " zit niet in het team.");
                    }
                    break;

                case 3:
                    System.out.println("Huidig team: " + superHeroes);
                    break;

                case 4:
                    System.out.println("Team vóór sortering: " + superHeroes);
                    Collections.sort(superHeroes);
                    System.out.println("Team na sortering: " + superHeroes);
                    break;

                case 5:
                    if (superHeroes.size() < 3) {
                        System.out.println("Je hebt minimaal 3 superhelden nodig om een missie uit te voeren.");
                        break;
                    }
                    System.out.print("Typ een missie (bijv. 'Red de stad'): ");
                    String mission = scanner.nextLine();
                    ArrayList<String> missionTeam = new ArrayList<>();
                    while (missionTeam.size() < 3) {
                        String hero = superHeroes.get(random.nextInt(superHeroes.size()));
                        if (!missionTeam.contains(hero)) {
                            missionTeam.add(hero);
                        }
                    }
                    System.out.println("Superhelden op missie: " + missionTeam + " gaan " + mission + "!");
                    completedMissions.add(mission);
                    break;

                case 6:
                    if (completedMissions.isEmpty()) {
                        System.out.println("Er zijn nog geen missies voltooid.");
                    } else {
                        System.out.println("Voltooide missies: " + completedMissions);
                    }
                    break;

                case 7:
                    System.out.println("Programma afgesloten. Tot ziens!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Ongeldige keuze, probeer opnieuw.");
            }
        }
    }
}
