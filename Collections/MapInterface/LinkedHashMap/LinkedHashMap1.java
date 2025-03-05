// Difference between LinkedHashMap and HashMap is that order of insertion is maintained in LinkedHashMap

package Collections.MapInterface.LinkedHashMap;


import java.util.LinkedHashMap;

public class LinkedHashMap1 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();

        // Adding Elements in Linked Hashmap
        lhm.put(1,"Java");
        lhm.put(2,"Python");
        lhm.put(3,"Javascript");

        System.out.println(lhm);
    }
}
