// Abstract List 

package Collections.ListInterface;

import java.util.AbstractList;
import java.util.ArrayList;

public class List13 {
    public static void main(String[] args) {
       
        AbstractList<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("there");
        list.add("Welcome");
        list.add("10");

        System.out.println(list);
    }
}
