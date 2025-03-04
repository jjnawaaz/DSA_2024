// Adding elements in TreeSet 

package Collections.SetInterface.TreeSet;

import java.util.*;

public class TreeSet1 {
    public static void main(String[] args) {
        Set<String> t = new TreeSet<>();

        t.add("welcome");
        t.add("hi");
        t.add("Hi");
        t.add("Welcome");
      

        System.out.println(t);

        String check = "Hi";
        System.out.println("Contains "+check+""+t.contains(check));
    }
}
