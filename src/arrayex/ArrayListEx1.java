package arrayex;

import java.util.ArrayList;

public class ArrayListEx1 {

    public static void main(String[] args) {
        ArrayList<String> Students = new ArrayList<String>();
        
        Students.add("Amy");
        Students.add("Bob");
        Students.add("Cindy");
        Students.add("David");
        
        System.out.println("Studentenlijst: " + Students);
        System.out.println("Aantal studenten: " + Students.size());
        
        Students.add(0, "Nick");
        Students.add(1, "Mike");
        
        Students.remove(3);
        
        System.out.println("Aangepaste studentenlijst: " + Students);
        System.out.println("Aantal studenten na wijzigingen: " + Students.size());
        
    }
    
}
