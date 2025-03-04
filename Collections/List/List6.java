// Accessing Elements

package Collections.List;

import java.util.*;

public class List6 {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();

        // Add
        al.add("Hi");
        al.add("there");
        al.add("Welcome");

        // Accessing elements using get()
        String first = al.get(0);
        String second = al.get(1);
        String third = al.get(2);

        //Printing elements
        //List interface Object
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(al);
    }
}
