// Iterate through HashSet

package Collections.SetInterface.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet4 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("Hi");
        hs.add("there");
        hs.add("Java");


        System.out.println(hs);

        Iterator<String> iterator = hs.iterator();

        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();

        System.out.println("Using for each loop");

        for(String element: hs){
            System.out.print(element+" , ");
        }
    }
}
