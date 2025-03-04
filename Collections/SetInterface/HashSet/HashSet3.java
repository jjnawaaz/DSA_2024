// Methods on HashSet

package Collections.SetInterface.HashSet;

import java.util.*;

public class HashSet3 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        hs.add("Hi");
        hs.add("there");
        hs.add("Welcome");
        hs.add("to");
        hs.add("Java");
        hs.add("Programming");

        System.out.println(hs);

        hs.remove("to");
        
        System.out.println(hs);

        System.out.println(hs.remove("A"));

        System.out.println(hs);
    }
}
