package Collections.SetInterface.LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {
    public static void main(String[] args) {
        LinkedHashSet<String> h = new LinkedHashSet<>();

        h.add("Hi");
        h.add("there");
        h.add("Welcome");
        h.add("to");
        h.add("Java");
        h.add("Programming");

        System.out.println(h);

        h.remove("to");

        System.out.println("After removing the element : "+h);

        // Iterating 
        Iterator<String> i = h.iterator();
        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }

        System.out.println();
        // Iterating using for
        for(String ih : h){
            System.out.print(ih+" ");
        }

        System.out.println();
        h.forEach(it->System.out.print(it+" "));
    }
}
