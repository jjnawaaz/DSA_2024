// Java program to show working of user defined
// Generic functions

package Generics;

public class Generics3 {
    
        // A Generic method example
        static <T> void genericDisplay(T element)
        {
            System.out.println(element.getClass().getName()+" = "+element);
        }
    public static void main(String[] args) {
        // Calling generic method with Integer argument
        genericDisplay(11);

        // Calling generic method with String argument
        genericDisplay("Hi there String");

        // Calling generic method with double argument
        genericDisplay(2.02);

    }
}
