// ArrayList

package Collections.List;

import java.util.*;

public class List9 {
    public static void main(String[] args) {
        int n = 5;

        List<Integer> al = new ArrayList<>(n);

        for(int i=1;i<=n;i++){
            al.add(i);
        }

        System.out.println(al);

        al.remove(3);

        System.out.println(al);

        for(int i = 0; i < al.size();i++){
            System.out.print(al.get(i)+" ");
        }
    }
}
