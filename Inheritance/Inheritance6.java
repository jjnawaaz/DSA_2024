// Multiple Inheritance Example

package Inheritance;


interface One1{
    public void print1();
}

interface Two1{
    public void print2();
}

interface Three1 extends One1,Two1{
    public void print1();
}


class Child implements Three1{
    @Override
    public void print1(){
        System.out.println("hi there from interfaces One and Three");
    }

    public void print2(){
        System.out.println("hi there from two");
    }
}

public class Inheritance6 {
    public static void main(String[] args) {
        Child c = new Child();
        c.print1();
        c.print2();
    }
}
