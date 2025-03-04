package Collections.Basic;

import java.io.*;
import java.util.*;


public class Basic1 {
    public static void main(String[] args) {
        int arr[] = new int[] {1,2,3,4};
        Vector<Integer> v = new Vector<>();
        Hashtable<Integer, String> h = new Hashtable<>();

        // Adding Elements into the Vector
        v.addElement(1);
        v.addElement(2);

        // Adding Element into the Hash Table
        h.put(1, "Junaid");
        h.put(2, "Nawaz");

        System.out.println(arr[0]);
        System.out.println(v.elementAt(0));
        System.out.println(h.get(2));
    }
}
