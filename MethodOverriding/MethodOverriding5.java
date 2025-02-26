package MethodOverriding;


class Parent4{
    static void m1(){
        System.out.println("From Parent static m1()");
    }

    void m2(){
        System.out.println("From Parent m2()");
    }
}


class Child4 extends Parent4{
    // This method hides m1() in Parent 
    static void m1(){
        System.out.println("From child static m1()");
    }

    @Override
    void m2(){
        System.out.println("From child static m2()");
    }
}


public class MethodOverriding5 {
    public static void main(String[] args) {
        Parent4 obj = new Child4();
        obj.m1();
        obj.m2();
    }
}
