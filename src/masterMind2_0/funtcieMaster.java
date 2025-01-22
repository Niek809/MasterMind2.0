package masterMind2_0;

import java.util.*;

public class funtcieMaster {
	String[] computerColors = { "Rood", "Blauw", "Groen", "Geel", "Paars", "Oranje" };
	String[] code = new String[4];
	Random rnd = new Random();
	public static Scanner input = new Scanner(System.in);
	int pegsInRightPosition = 0;
	int pegsMisplaced = 0;
	String[] userColors = new String[4];
	int i = 0;
	
	
	
	public String[] randomcodemaker() {
		
		for (int j = 0; j < code.length; j++) {
            code[j] = computerColors[rnd.nextInt(computerColors.length)];
        }
        return code;
        
        
	}
	public String[] randomcodezelf() {
		for (int j = 0; j < 4; j++) {
            code[j] = input.next();
        }
		return code;
	}
	
	public String [] input() {
		for (int j = 0; j < 4; j++) {
			userColors[j] = input.next();}
			pegsInRightPosition = 0;
			pegsMisplaced = 0;
			return userColors;
	}
	
	public void checker() {
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
	}
	
	public boolean eind() {
		return  pegsInRightPosition == 4;
		
		
	}
	
	public void uitkomst(boolean gewonnen) {
	    if (gewonnen) {
	        System.out.println(" ");
	        System.out.println("Zo ik ben verbaasd, goed gedaan!");
	    } else {
	        System.out.println(" ");
	        System.out.println("Dat is niet best, volgende keer beter.");
	    }
	}

}