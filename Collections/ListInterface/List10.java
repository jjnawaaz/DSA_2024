// Vector

package Collections.ListInterface;

import java.io.*;
import java.util.*;

public class List10 {
    public static void main(String[] args) {
        int n = 5;

        List<Integer> v = new Vector<>(n);

        for(int i=1;i<=n;i++){
            v.add(i);
        }

        System.out.println(v);

        v.remove(3);

        System.out.println(v);


        for(int i = 0; i < v.size(); i++){
            System.out.print(v.get(i)+" ");
        }
    }
}
