package MethodOverriding;

class Parent10{
    void show(){
        System.out.println("Parent's show()");
    }
}


class Child10 extends Parent10{
    void show(){
        System.out.println("Child's show()");
    }
}


class GrandChild10 extends Parent10{
    void show(){
        System.out.println("GrandChild's show()");
    }
}


public class MethodOverriding10 {
    public static void main(String[] args) {
        Parent10 o = new GrandChild10();
        o.show();
    }
}
