/*
 *  Strings are immutable i.e once the string is initialized it cant be modified in the memory immediately 
 *  We have to perform concatenations to make it to our required String 
 *  This is time taking SO we use StringBuilder
 */
package Strings;

public class stringsbuilder1 {
    public static void main(String[] args) {
        // to make a stringbuilder 
        StringBuilder sc = new StringBuilder("Tony");
        System.out.println(sc);

        // to check charAt particular index
        System.out.println(sc.charAt(0));

        // To change the string at char index 0 and replace it with J
        sc.setCharAt(0, 't');
        System.out.println(sc);

        // To insert S at the beginning of the String to make it Stony
        sc.insert(0, 'S');
        System.out.println(sc);

        // to make the string stonny 
        sc.insert(3, 'n');
        System.out.println(sc);

        // to delete a particular char we ll make it back to Stony
        sc.delete(3,4); // Pass the (start,end) index so in char Stonny 0,1,2,  3 we start from here and delete till index 4 so we remove the char "n" 
        System.out.println(sc);

    }
}


// We can pass the required string directly to StringBuilder() making it a StringBuilder