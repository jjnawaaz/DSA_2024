package Generics;


class Test4<T>{
    T obj; 
    Test4(T obj){ this.obj = obj; }
    public T getObject() { return this.obj; }
}


public class Generics4 {
    public static void main(String[] args) {
        // Instance of Integer type
        Test4<Integer> iObj = new Test4(15);
        System.out.println(iObj.getObject());

        // Instance of String type
        Test4<String> sObj = new Test4("Hi There String");
        System.out.println(sObj.getObject());
        
        // This results in error 
        // iObj = sObj;

    }
}
