/**
 * A functional interface in Java is an interface that contains only one abstract method. 
 * Functional interfaces can have multiple default or static methods, but only one abstract method. 
 * Runnable, ActionListener, and Comparator are common examples of Java functional interfaces. 
 * From Java 8 onwards, lambda expressions and method references can be used to represent the instance of a functional interface.
 * 
 */
package Interfaces;

public class Interfaces9 {
    public static void main(String[] args) {
        // Lambda expression to make a new Thread and implement runnable
        new Thread(() -> System.out.println("New Thread Created")).start();
    }
}
