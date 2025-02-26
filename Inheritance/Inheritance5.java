// Example of Hierarchial Inheritance

package Inheritance;

class A{
    public void printA(){
        System.out.println("Hi from class A");
    }
}


class B extends A{
    public void printB(){
        System.out.println("Hi from class B extending class A");
    }
}

class C extends A{
    public void printC(){
        System.out.println("Hi from class C extending class A");
    }
}


class D extends A{
    public void printD(){
        System.out.println("Hi from class D extending class A");
    }
}



public class Inheritance5 {
    public static void main(String[] args) {
        D d = new D();
        d.printD();

        C c = new C();
        c.printC();

        B b = new B();
        b.printB();
    }
}
