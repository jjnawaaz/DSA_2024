package Collections.MapInterface.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap2 {
    public static void main(String[] args) {
        
        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();
        
        // Adding Elements 
        lhm.put(1,"CSE");
        lhm.put(2,"ECE");
        lhm.put(3,"EEE");

        // Print Map
        System.out.println(lhm);

        // Update Map
        lhm.put(3,"Civil");

        lhm.put(4,"EEE");

        System.out.println(lhm);

        // Remove Map
        lhm.remove(3);

        System.out.println(lhm);

        // Add 
        lhm.put(3,"Civil");
        System.out.println(lhm);

        // Iterate Map
        for(Map.Entry<Integer,String> entry : lhm.entrySet()){
            System.out.println("Key and Values are : "+entry);
            System.out.println("Key is : "+entry.getKey());
            System.out.println("Value is : "+entry.getValue());
        }
    }
}
