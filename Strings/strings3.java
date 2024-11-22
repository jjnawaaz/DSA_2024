package Strings;
import java.util.Scanner;

public class strings3 {
    public static void main(String[] args) {
        
        // String Concatenation

        Scanner sc = new Scanner(System.in);
        String name1 = sc.next();
        String name2 = sc.next();
        String fullName = name1 + name2;
        System.out.println(fullName);

        // Length To find the length of the string
        System.out.println(fullName.length());

        // charAt to find charAt particular index
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }
    }
}
