// Checking if an element is present

package Collections.List;

import java.util.*;

public class List7 {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();

        al.add("Hi");
        al.add("there");
        al.add("Welcome");

        boolean isPresent = al.contains("there");

        System.out.println("Is present? "+isPresent);
    }
}
