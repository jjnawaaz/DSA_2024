// Search elements in a List indexOf()

package Collections.ListInterface;

import java.util.*;

public class List4 {
    public static void main(String[] args) {
        // create a list of integers
        List<Integer> al = new ArrayList<>();

        // Add some integers to the list
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(2);

        // use indexOf() to find the occurence of an element
        int i = al.indexOf(2);

        System.out.println("First Occurence of 2 is at Index : "+i);

        int l = al.lastIndexOf(2);

        System.out.println("Last Occurence of 2 is at Index : "+l);
    }
}
