// Iterate Using forEach loop

package Collections.Iterable;

import java.util.ArrayList;
import java.util.*;
import java.io.*;

public class Iterable3 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();

        // Add 
        l.add("Hello");
        l.add("there");
        l.add("Welcome");

        l.forEach(e -> System.out.print(e+" "));
    }
}
