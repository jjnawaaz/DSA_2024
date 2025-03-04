package Collections.SetInterface.TreeSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSet2 {
    public static void main(String[] args) {
        NavigableSet<String> ts = new TreeSet<>();

        ts.add("hi");
        ts.add("there");
        ts.add("welcome");
        ts.add("Hi");
        ts.add("Hi"); // Duplicate values are not allowed so it doesnt get added
        ts.add("Welcome");
        ts.add("There");

        System.out.println(ts);

        String check = "hi";

        System.out.println("Contains : "+check+" "+ts.contains(check));

        System.out.println("First Value : "+ts.first());

        System.out.println("Last Value : "+ts.last());

        String val = "hi"; 

        // Find the values just greater
        // and smaller than the above string
        System.out.println("Higher "+ts.higher(val));
        System.out.println("Lower "+ts.lower(val));

        // remove last element in the tree
        ts.pollLast();

        // remove the first element
        ts.pollFirst();

        System.out.println(ts);

        // Iterating
        for(String i : ts){
            System.out.print(i+" ");
        }
    }
}
