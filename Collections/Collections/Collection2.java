// Adding Elements to Collection

package Collections.Collections;

import java.util.*;
import java.io.*;

public class Collection2 {
    public static void main(String[] args) {
        // Creating Collection 1
        Collection<Integer> c = new ArrayList<>(5);

        // Add 
        c.add(1);
        c.add(2);
        c.add(3);

        for(Integer i : c){
            System.out.print(i+" ");
        }
        System.out.println();
        // Creating Collection 2
        Collection<Integer> l2 = new ArrayList<>();
        l2.addAll(c);

        System.out.println("The new ArrayList is : "+l2);

    }
}
