package Revision;

import java.util.*;

public class removespaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String str = sc.nextLine();

        // To remove spaces
        str = str.replace(" ", "");
        System.out.println(str);
    }
}
