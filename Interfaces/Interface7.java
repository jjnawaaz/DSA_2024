// Interface extending interface 

package Interfaces;

interface A{
    void method1();
    void method2();
}

interface B extends A{
    void method3();
}

public class Interface7 implements B {
    public void method1(){
        System.out.println("Method 1");
    }

    public void method2(){
        System.out.println("Method 2");
    }

    public void method3(){
        System.out.println("Method 3");
    }

    public static void main(String[] args) {
        Interface7 t = new Interface7();
        t.method1();
        t.method2();
        t.method3();
    }
}
