package arrayex;
import java.util.ArrayList;

public class ArrayListEx2 {
    public static void main(String args[]) {
    	ArrayList<Integer> cijfers = new ArrayList<Integer>();
    	
    	for (int i = 0; i < cijfers.size(); i++) {
			
    	
    	cijfers.add(9);
    	cijfers.add(2);
    	cijfers.add(5);
    	cijfers.add(93);
    	cijfers.add(10);
    	cijfers.add(567);
    	cijfers.add(26);
    	cijfers.add(67);
    	cijfers.add(2911);
    	
    	
        cijfers.removeIf(num -> num % 2 == 0);
        
        System.out.println("Inhoud van de ArrayList (na verwijderen van even nummers):");
        for (int num : cijfers) {
            System.out.print(num + " ");
        }
        System.out.println();
		}
    	ArrayList<E>
    }
}
