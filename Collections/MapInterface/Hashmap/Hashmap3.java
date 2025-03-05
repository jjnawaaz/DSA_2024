package Collections.MapInterface.Hashmap;

import java.util.HashMap;
import java.util.Map;

public class Hashmap3 {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();

        // Adding elements in HashMap
        hm.put(1,"CSE");
        hm.put(2,"EEE");
        hm.put(3,"ECE");

        // Printing the HashMap
        System.out.println(hm);

        // Update the element in Hashmap
        hm.put(2,"CIVIL");

        hm.put(4,"EEE");

        System.out.println("After Updating : "+hm);


        // Remove element from HashMap
       
        System.out.println("Removed Element is : "+ hm.remove(4));

        // Iterating the HashMap
        for(Map.Entry<Integer,String> entry : hm.entrySet()){
            System.out.println("Both key and value is : "+entry);
            System.out.println("The key is : "+entry.getKey());
            System.out.println("The value is : "+entry.getValue());
        }
    }
}
