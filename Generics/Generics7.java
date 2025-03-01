package Generics;

import java.util.*;

public class Generics7 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();

        al.add("Sachin");
        al.add("Rahul");

        String s1 = al.get(0);
        String s2 = al.get(1);

        System.out.println(s1+" "+s2);
    }
}
