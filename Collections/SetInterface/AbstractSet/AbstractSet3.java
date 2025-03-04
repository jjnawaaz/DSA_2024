// Methods in Abstract Set


package Collections.SetInterface.AbstractSet;
import java.util.*;


public class AbstractSet3 {
    public static void main(String[] args) {
        // Creating a LinkedHashSet
        AbstractSet<Integer> set = new HashSet<>();

        // Adding Elements to the Abstract Set
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        System.out.println(set);


        set.remove(30);

        System.out.println(set);

        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(5);


        // removes elements in set which are similar to l
        set.removeAll(l);
        System.out.println("Set after removeAll() : "+set);



        // Iterating in HashSet
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        // Iterate using for each
        for (Integer integer : set) {
            System.out.print(integer+ " ");
        }

        System.out.println();
        set.forEach(state -> System.out.print(state+" "));
    }
}
