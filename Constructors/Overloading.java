package Constructors;

class B{
    B(String name){
        System.out.println("From single parameter constructor"+name);
    }

    // Constructor Overloading 1 
    B(String name, int age){
        System.out.println("From double parameter constructor"+name+age);
    }

     // Constructor Overloading 2 
    B(String name, int age,int salary){
        System.out.println("From double parameter constructor"+name+age+salary);
    }
}

public class Overloading {
public static void main(String[] args) {
    B obj1 = new B("Junaid");
    B obj2 = new B("Junaid",20);
    B obj3 = new B("Junaid",20,9999);
}
}
