// Abstract Sequential List


package Collections.ListInterface;

import java.util.AbstractSequentialList;
import java.util.LinkedList;

public class List16 {
    public static void main(String[] args) {
        AbstractSequentialList<Integer> a = new LinkedList<>();
        
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);

        System.out.println(a);
    }
}
