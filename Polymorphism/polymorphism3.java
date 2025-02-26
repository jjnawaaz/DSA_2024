// Method Overriding

package Polymorphism;


class Parent{
    void Print(){
        System.out.println("Parent Class");
    }
}

class subclass1 extends Parent{
    void Print(){
        System.out.println("Child 1 Class");
    }
}

class subclass2 extends Parent{
    void Print(){
        System.out.println("Child 2 Class");
    }
}

public class polymorphism3 {
    public static void main(String[] args) {
        Parent a;
        a = new subclass1();
        a.Print();

        a = new subclass2();
        a.Print();
    }
}
