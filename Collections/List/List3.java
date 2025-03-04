// Update Elements to a List 
package Collections.List;

import java.util.*;
import java.io.*;

public class List3 {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();

        // Adding 
        al.add("Hi");
        al.add("Hi");
        al.add("Welcome");

        System.out.println("Initial ArrayList "+al);

        // Update ArrayList
        al.set(1,"there");

        System.out.println("Update ArrayList "+al);
    }
}
