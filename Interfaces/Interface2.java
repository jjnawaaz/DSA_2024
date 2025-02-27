package Interfaces;


interface testInterface{
    // you can use public static and final
    final int a = 10;

    // public and abstract
    void display();
}


class TestClass implements testInterface{
    public void display(){
        System.out.println("Hi there from class using interface");
    }
}

public class Interface2 {
    public static void main(String[] args) {
        TestClass t = new TestClass();
        t.display();
        System.out.println(t.a);
    }
}
