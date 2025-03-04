package Collections.SetInterface.HashSet;


import java.util.*;

public class HashSet2 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        hs.add("Hi");
        hs.add("there");
        hs.add("Welcome");


        System.out.println("Elements in the HashSet are : "+hs);
    }
}
