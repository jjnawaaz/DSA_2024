// Add elements to a List

package Collections.List;

import java.util.*;
import java.io.*;

public class List2 {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();

        al.add("Hi");
        al.add("Welcome");
        al.add(1,"there");

        System.out.println(al);
    }
}
