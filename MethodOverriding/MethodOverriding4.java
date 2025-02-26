// Final Methods cannot be overridden 
package MethodOverriding;


class Test1{
    void demo(){
        System.out.println("From test1");
    }
    // Cannot Override these methods
    final void demo2(){
        System.out.println("From test1");
    }
}

class Child3 extends Test1{
    @Override
    // void demo2(){

    // } will create an error 

    void demo(){
        System.out.println("From child");
    }
} 

public class MethodOverriding4 {
    public static void main(String[] args) {
        Test1 a = new Test1();
        a.demo();
        a.demo2();

        Test1 a1 = new Child3();
        a1.demo();
        a1.demo2();

    }
}
