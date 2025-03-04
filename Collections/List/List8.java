// Iterating over List Interface

package Collections.List;

import java.util.*;

public class List8 {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();

        al.add("Hi");
        al.add("Welcome");

        al.add(1,"there");

        for(int i = 0; i < al.size();i++){
            System.out.print(al.get(i)+" ");
        }

        System.out.println();

        for(String str : al){
            System.out.print(str+" ");
        }
    }
}
