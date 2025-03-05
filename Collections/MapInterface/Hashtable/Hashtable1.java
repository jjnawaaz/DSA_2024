package Collections.MapInterface.Hashtable;

import java.util.*;

public class Hashtable1 {
    public static void main(String[] args) {
        Hashtable<String, Integer> ht = new Hashtable<>();

        // Adding into hashtable use put()
        ht.put("One",1);
        ht.put("Two", 2);
        ht.put("Three", 3);

        System.out.println(ht);
    }
}
