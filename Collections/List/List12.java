// Linked List

package Collections.List;

import java.util.*;
import java.io.*;

public class List12 {
    public static void main(String[] args) {
        int n = 5;
        List<Integer> li = new LinkedList<>();

        for(int i = 1; i <= n; i++){
            li.add(i);
        }

        System.out.println(li);

        li.remove(3);

        System.out.println(li);

        for(int i = 0; i < li.size(); i++){
            System.out.print(li.get(i)+" ");
        }
    }
}
