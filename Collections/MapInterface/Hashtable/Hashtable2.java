package Collections.MapInterface.Hashtable;
import java.util.*;
public class Hashtable2 {
    public static void main(String[] args) {
        //(3,0.75) 3 represents the size of the hashTable and 0.75 represents loadFactor
        // LoadFactor -  The load factor is a measure of how full the hash table is allowed to get before its capacity is automatically increased. 
        // The initial capacity and load factor parameters are merely hints to the implementation. 
        Hashtable<Integer,String> ht1 = new Hashtable<>(3,0.75f);
        Hashtable<Integer,String> ht2 = new Hashtable<>(2,0.5f);

        // Inserting elements into the hashTable
        ht1.put(1,"One");
        ht1.put(2,"Two");
        ht1.put(3,"Three");

        // Inserting the Elements using put()
        ht2.put(4,"Four");
        ht2.put(5,"Five");
        ht2.put(6,"Six");

        System.out.println("Table 1 : "+ht1);
        System.out.println("Table 2 : "+ht2);
    }
}
