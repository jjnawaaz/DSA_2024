// Taking input from the user

package Strings;

import java.util.Scanner;

public class strings2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String fullName = sc.nextLine();
        System.out.println("Your name is "+name);
        System.out.println(fullName);
    }
}
