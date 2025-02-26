// EXAMPLE OF SINGLE INHERITANCE
package Inheritance;

class One{
    public void print1(){
        System.out.println("Hello from One");
    }
}


class Two extends One{
    public void print2(){
        System.out.println("Hi from Two extending One");
    }
}


public class Inheritance3 {
    public static void main(String[] args) {
        Two a = new Two();
        a.print1();
        a.print2();
    }
}
