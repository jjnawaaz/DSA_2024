/**
 * The Iterable interface was introduced in JDK 1.5. 
 * It belongs to java.lang package. 
 * In general, an object Implementing Iterable allows it to be iterated. An iterable interface allows an object to be the target of enhanced for loop(for-each loop). 
 */

 /**
  * Ways of Iterating

There are three ways in which objects of Iterable can be iterated.

Using enhanced for loop(for-each loop)
Using Iterable forEach loop
Using Iterator<T> interface
  */


// Iterate Iterable using for each enhanced loop

package Collections.Iterable;

import java.util.*;
import java.io.*;

public class Iterable1 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<String>();

        l.add("Hi");
        l.add("there");
        l.add("Welcome");

        for(String i : l){
            System.out.print(i+" ");
        }
    }
}
