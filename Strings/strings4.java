package Strings;
public class strings4 {
    public static void main(String[] args) {
        // Comparing two Strings

        String name1 = "Tony";
        String name2 = "Tony";
        
        // string 1 > string 2 it returns a +ve value
        // string 1 == string 2 it returns  0
        // string 1 < string 2 it returns a -ve value
        
        if(name1.compareTo(name2) == 0){
            System.out.println("Strings are same");
        } else {
            System.out.println("Strings are not same");
        }

        // Why we use .compareTo() instead of == 

        // *********************NOTE IMPORTANT PART************************
             
        // This will return equal 
        if (name1 == name2){
                System.out.println("Strings are same");
             } else {
                System.out.println("Strings are not same");
            }

        // This will return unequal strings refer String builder and Objects in Java 

        if (new String("Tony") == new String("Tony")){
                System.out.println("Strings are same");
             } else {
                System.out.println("Strings are not same");
            }



    }
}
