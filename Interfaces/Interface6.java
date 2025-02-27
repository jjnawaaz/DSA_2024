package Interfaces;

interface TestInterface2{
    final int a = 10;
    static void display(){
        System.out.println("hello");
    }
}




public class Interface6 implements TestInterface2{
    public static void main(String[] args) {
        TestInterface2.display();  // Call the method from interface directly 
    }
}
