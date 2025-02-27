package NestedInterfaces;

class Parent1{
    interface Test1{
        void show();
    }
}

class Child1 implements Parent1.Test1{
    public void show(){
        System.out.println("Show method of Interface");
    }
}


public class Demo1 {
    public static void main(String[] args) {
        Parent1.Test1 obj1;

        Child1 t = new Child1();
        obj1 = t;
        obj1.show();
    }
}
