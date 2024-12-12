package Revision;

import java.util.*;

public class gcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        int smaller = 0;
        int greater = 0;
        if (a > b) {
            greater = a;
            smaller = b;
        } else {
            smaller = a;
            greater = b;
        }

        while (smaller != 0) {
            int modulus = greater % smaller;
            greater = smaller;
            smaller = modulus;
        }

        System.out.println(greater);
    }
}