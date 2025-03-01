// Java program to show multiple
// type parameters in Java Generics

package Generics;

class Test2<T, U>{
    // An object of type T and U
    T obj1;
    U obj2;

    // constructor
    Test2(T obj1, U obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    // To print objects of T and U
    public void print()
    {
        System.out.println(obj1);
        System.out.println(obj2);
    }
}


public class Generics2 {
    public static void main(String[] args) {
        Test2 <String, Integer> obj = new Test2("Hi There", 25);
        obj.print();
    }
}
