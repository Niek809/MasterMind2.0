package conditionalex;

import java.util.Scanner;

public class WatchMovie {

    public static void main(String args[]) {
    	
    	Scanner sc = new Scanner(System.in);
    	
//    	System.out.print("Enter the movie ticket price \n");
//    	int moviePrice = sc.nextInt();
//    	
//    	System.out.print("Enter the movie rating \n");
//    	int movieRating = sc.nextInt();
//    	
//        if (moviePrice >= 12 && movieRating == 5) {
//            System.out.println("I'm interested in watching the movie.");
//        } else {
//            System.out.println("I'm not interested in watching the movie.");
//        }
//    }
    	
//    	System.out.println("Put here your number:");
//    	int input = sc.nextInt();
//    	String [] maanden = {"Januari", "februari", "Maart", "April", "Mei", "juni", "juli", "Augustes", "September", "Oktober", "November", "December"};	
//    	if (input >= 1 && input <=12) {
//    		System.out.println(maanden[input - 1]);
//    	} else {
//    		System.out.println("Invalid Month");
//    	}
    	
    	char option = 'A';
        int aCount = 0, bCount = 0, cCount = 0;
        switch (option) {
            case 'A':
                aCount++;
                System.out.println("Count of A  " + aCount);
            case 'B':
                bCount++;
                System.out.println("Count of B  " + bCount);
            case 'C':
                cCount++;
                System.out.println("Count of B  " + cCount);
       
        }
    	
    	
    	
    }
}


    
    	
        	

