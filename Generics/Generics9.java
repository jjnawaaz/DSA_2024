package Generics;

import java.util.*;

public class Generics9 {
    public static void main(String[] args) {
        // Instance of set using generics
        Set<Integer> set1 = new HashSet<Integer>();

        // Add Elements
        set1.add(100);
        set1.add(Integer.valueOf(101));

        // Create another Set
        Set<String> set2 = new HashSet<String>();

        // Add Elements
        set2.add("Hi there");
        set2.add("Generics");

        // Method 1 to print hashSet()
        for(Integer data : set1){
            System.out.printf("Integer value : %d\n", data);
        }

        for(String data : set2){
            System.out.printf("String value : %s\n", data);
        }

        System.out.println();
        
        System.out.println("Method 2");

        System.out.println();

        // Method 2 
        Iterator<Integer> stringIt1 = set1.iterator();
        Iterator<String> stringIt2 = set2.iterator();

        while(stringIt1.hasNext()){
            System.out.printf("Integer value is : %d\n",stringIt1.next());
        }
        while(stringIt2.hasNext()){
            System.out.printf("String value is : %s\n",stringIt2.next());
        }
    }
}
