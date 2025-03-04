// Use of List


package Collections.ListInterface;

import java.util.*;
import java.io.*;

public class List1 {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>();

        // Adding elements in the List
        li.add("Java");
        li.add("JavaScript");
        li.add("Python");
        li.add("C++");

        // Iterating through the List
        System.out.println("Elements in the list are : "+li);

        // Accessing elements
        System.out.println("Element at index 1 : "+li.get(1));

        // Updating elements
        li.set(1,"Ruby on Rails");
        System.out.println("Updated List : "+li);

        // Removing elements
        li.remove("C++");
        System.out.println("List after removing elements : "+li);

    }
}
