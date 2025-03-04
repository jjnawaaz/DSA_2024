// Iterate using Iterator

package Collections.Iterable;

import java.io.*;
import java.util.*;


public class Iterable2 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();

        l.add("Hi");
        l.add("there");
        l.add("Welcome");
        
        Iterator<String> iterator = l.iterator();
        while(iterator.hasNext()){
            // String element = iterator.next();
            System.out.println(iterator.next());
            System.out.println(iterator.hasNext());
        }

        l.add("After iteration"); // Cannot add a new element in Iterator and expect it to get printed should make a new Iterator or update the old one to add new elements and print
        iterator = l.iterator();

        iterator.forEachRemaining(name -> System.out.println(name));
    }
}
