package Collections.MapInterface.Hashtable;

import java.util.*;

public class Hashtable3 {
    public static void main(String[] args) {
        Map<Integer, String> hm = new HashMap<>();

        //Inserting into the map ; Stores data in ascending order
        hm.put(1,"one");
        hm.put(2,"two");
        hm.put(3,"three");

        Hashtable<Integer,String> ht = new Hashtable<>(hm);

        System.out.println("Printing Map : "+hm);
        System.out.println("Printing HashTable : "+ht);
        
        //.get() to get the elements
        System.out.println(ht.get(3));
    }
}
