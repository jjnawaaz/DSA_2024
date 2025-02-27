package NestedInterfaces;


interface Parent3{
    interface Test3{
        void show();
    }
}


class Child3 implements Parent3.Test3{
    public void show(){
        System.out.println("Show method of Instance");
    }
}


public class Demo3 {
    public static void main(String args[]){
        Parent3.Test3 obj ;
        Child3 c = new Child3();
        obj = c;
        obj.show();
    }
}
