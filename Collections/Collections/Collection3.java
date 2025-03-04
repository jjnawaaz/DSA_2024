// Removing elements from a collection 
package Collections.Collections;

import java.util.*;

public class Collection3 {
    public static void main(String[] args) {
        Collection<Integer> hs1 = new HashSet<>();

        // Add into Collection
        hs1.add(1);
        hs1.add(2);
        hs1.add(3);
        hs1.add(4);
        hs1.add(5);

        System.out.println("Initial set : "+hs1);

        // remove 
        hs1.remove(4);

        System.out.println("Set after removing 4 : "+hs1);

        //Creating another collection of HashSet
        Collection<Integer> hs2 = new HashSet<>();
        hs2.add(1);
        hs2.add(2);
        hs2.add(3);

        System.out.println("Collection Elements to be removed : "+hs2);

        // Removing elements from hs1 specified in hs2
        hs1.removeAll(hs2);

        System.out.println("Set 1 after removal : "+hs1);
    }
}
