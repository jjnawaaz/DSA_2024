// Methods in Abstract Linked List


package Collections.ListInterface;

import java.util.AbstractSequentialList;
import java.util.LinkedList;

public class List17 {
    public static void main(String[] args) {
        AbstractSequentialList<String> list = new LinkedList<>();

        list.add("Hello 1");
        list.add("Hello 2");
        list.add("Hello 3");

        // output the list 
        System.out.println(list);

        list.remove(2);

        list.remove("Hello 1");

        System.out.println(list);

        list.add("Hello 3");
        list.add("Hello 4");
        list.add("Hello 5");
        list.add("Hello 6");
        System.out.println("The element at index 3 is : "+list.get(3));


    }
}
