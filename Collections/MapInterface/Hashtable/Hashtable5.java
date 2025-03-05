package Collections.MapInterface.Hashtable;

import java.util.*;

public class Hashtable5 {
    public static void main(String[] args) {
        // Initialization of a Hashtable
        Hashtable<Integer,String> ht = new Hashtable<>();

        // Inserting the Elements
        ht.put(1,"Vaibhav");
        ht.put(2,"Kashyap");
        ht.put(3,"Tinz");

        System.out.println("Initial Map : "+ht);

        // Updating the value in hashTable
        ht.put(2,"Junaid");

        System.out.println("Updated Map"+ht);

        // removing the element
        ht.remove(3);
        System.out.println("After Deletion : "+ht);


        // Traversal of a HashTable
        for(Map.Entry<Integer, String> i : ht.entrySet()){
            // gets the whole data 
            System.out.println(i);
            // gets the Key of the object
            System.out.println(i.getKey());
            // Gets the value of the object
            System.out.println(i.getValue());
        }
    }    
}
