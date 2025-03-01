// When defining ArrayList, we can specify that this list can take only String objects.

package Generics;

import java.util.ArrayList;

public class Generics6 {
    public static void main(String[] args) {
        ArrayList <String> al = new ArrayList<>();
        al.add("Sachin");
        al.add("Rahul");

        // Compiler doesn't allow this
        // al.add(10);

        String s1 = (String)al.get(0);
        String s2 = (String)al.get(1);
        String s3 = (String)al.get(2);
    }
}
