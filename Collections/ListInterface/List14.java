// Abstract List 2

package Collections.ListInterface;

import java.util.AbstractList;
import java.util.LinkedList;

public class List14 {
    public static void main(String[] args) {
        // Initialize a Abstract list
        AbstractList<String> list = new LinkedList<>();

        // add elements in the list
        list.add("Hello");
        list.add("there");
        list.add("Welcome");
        list.add("202");

        // Output the list
        System.out.println("Abstract List : "+list);

        // Remove the head using remove()
        list.remove(3);

        //Print the final list
        System.out.println("Final Abstract List : "+list);

        // getting the last occurence using lastIndexOf method
        int lastIndex = list.lastIndexOf("Welcome");

        System.out.println("Last index is : "+lastIndex);

        
    }
}
