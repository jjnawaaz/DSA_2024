// MULTI-LEVEL INHERITANCE

package Inheritance;


class One{
    public void print1(){
        System.out.println("Hi from one");
    }
}


class Two extends One{
    public void print2(){
        System.out.println("Hi from Two extended from One");
    }
}


class Three extends Two{
    public void print3(){
        System.out.println("Hello from three extended from two as base class which can still use one");
    }
}



public class Inheritance4 {
    public static void main(String[] args) {
        Three a = new Three();
        a.print1();
        a.print2();
        a.print3();
    }
}
