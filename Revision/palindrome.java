package Revision;

import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str1 = sc.next();
        str1 = str1.toLowerCase();
        String str2 = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            str2 = str2 + str1.charAt(i);
        }

        if (str1.compareTo(str2) == 0) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        System.out.println(str1 + "  " + str2);
    }
}
