package Collections.MapInterface.Hashmap;

import java.util.HashMap;

public class Hashmap2 {
    public static void main(String[] args) {
        
        // $ represents initial capacity and 0.75f represents loadFactor
        HashMap<Integer,String> hm = new HashMap<>(4,0.75f);

        hm.put(1,"CSE");
        hm.put(2,"EEE");
        hm.put(3,"ECE");

        System.out.println(hm);
    }
}
