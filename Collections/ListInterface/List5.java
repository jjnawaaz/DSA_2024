// Remove Elements

package Collections.ListInterface;

import java.util.*;

public class List5 {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();

        // add
        al.add("Hi");
        al.add("Welcome");

        // adding at 1st index
        al.add(1,"there");

        System.out.println("Initial ArrayList "+al);

        // remove 
        al.remove(1);
        System.out.println("After the Index Removal "+al);

        al.remove("Hi");

        System.out.println("After the Object Removal "+al);
    }
}
