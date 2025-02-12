import java.util.*;

public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "Arizona";
        String str2 = "Maria";
        String newString = "";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    newString = newString + str1.charAt(i);
                }
            }
        }

        System.out.println(newString);
    }
}
