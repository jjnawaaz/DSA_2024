package Strings;

public class ReverseString {
    public static void main(String[] args) {
        String a = "Junaid";
        
        String b = "";

       for(int i = a.length() - 1; i >= 0;i--){
        // Extract the current character
        char ch = a.charAt(i);

        // Convert the character to String Object
        String ch1 = Character.toString(ch);


        // Concatenate String Object
        b = b.concat(ch1);
       }

       System.out.println(a);
       System.out.println(b);
    }
}
