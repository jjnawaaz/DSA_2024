// HashSet

package Collections.SetInterface.HashSet;

import java.util.*;


public class HashSet1 {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(1);
        hs.add(2);
        hs.add(1);
        hs.add(3);
        hs.add(1);
        hs.add(2);

        System.out.println("HashSet Size: "+hs.size());
        System.out.println("Elements in HashSet: "+hs);
    }
}
