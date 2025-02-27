package NestedInterfaces;

class Parent2{
    protected interface Test{
        void show();
    }
}


class Child2 implements Parent2.Test{
    public void show(){
        System.out.println("Show method of interface");
    }
}


public class Demo2 {
    public static void main(String[] args) {
        Parent2.Test obj;
        Child2 c = new Child2();

        obj = c;
        obj.show();
    }
}
