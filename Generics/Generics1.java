/**
 * Generics means parameterized types. 
 * The idea is to allow a type (like Integer, String, etc., or user-defined types) to be a parameter to methods, classes, and interfaces. 
 * Using Generics, it is possible to create classes that work with different data types. 
 * An entity such as a class, interface, or method that operates on a parameterized type is a generic entity.
 * 
 * Java program to show working of user defined
 * Generic classes
 * 
 * 
 */

package Generics;

class Test1<T>{
    // An Object of Type T is declared
    T obj;
    // Constructor 
    Test1(T obj){
        this.obj = obj;
    }
    public T getObject(){
        return this.obj;
    }
}



public class Generics1 {

    public static void main(String[] args) {
        
        // Instance of Integer Type
        Test1<Integer> iObj = new Test1<Integer>(15);
        System.out.println(iObj.getObject());

        // Instance of String Type
        Test1<String> sObj = new Test1<String>("Junaid");
        System.out.println(sObj.getObject());
    }
    
}