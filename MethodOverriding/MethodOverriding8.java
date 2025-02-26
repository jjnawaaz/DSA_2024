package MethodOverriding;

class Parent8{
    void m1(){
        System.out.println("From parent m1()");
    }

    void m2(){
        System.out.println("From parent m2()");
    }
}


class Child8 extends Parent8{
    @Override
    void m1() throws ArithmeticException{
        System.out.println("From child m1()");
    }


    // This will throw error as superclass method doesnt have any exception
    // We can get away with Arithmetic Exception because it is an unchecked Exception
    // @Override
    // void m2() throws Exception{
    //     System.out.println("From child m2()");
    // }


}


public class MethodOverriding8 {
    public static void main(String[] args) {
        Parent8 p = new Parent8();
        p.m1();
        p.m2();

        Child8 c = new Child8();
        c.m1();
        c.m2();    // Parent m2 gets called
    }
}
