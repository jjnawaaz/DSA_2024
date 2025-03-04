package Collections.Collections;

import java.util.*;
import java.io.*;

public class Collection4 {
    public static void main(String[] args) {
        Collection<String> l = new LinkedList<>();
        l.add("Hi");
        l.add("there");
        l.add("Welcome");

        System.out.println("The list is : "+l);


        // Method 1 using iterator
        Iterator<String> it = l.iterator();

        System.out.println("\nThe iterator values" + " of list are: ");
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }

        System.out.println();
        
        // Method 2 using for 
        for(String i : l){
            System.out.print(i+" ");
        }

        System.out.println();
        // Method 3 using forEach
        l.forEach(i -> System.out.print(i+" "));
    }
}
