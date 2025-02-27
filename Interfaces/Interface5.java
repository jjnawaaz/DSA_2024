// Default Methods in Interface
package Interfaces;

interface TestInterface1{
    final int a = 10;

    // You can declare default methods with default implementation in Interfaces
    default void display(){
        System.out.println("Hello from interface");
    }
}

public class Interface5 implements TestInterface1 {
    public static void main(String[] args) {
    Interface5 t = new Interface5();
    t.display();
}}
