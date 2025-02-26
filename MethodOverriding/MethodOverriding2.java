package MethodOverriding;


class Parent1{
    void show(){
        System.out.println("Parent's show()");
    }
}

class Child1 extends Parent1{
    @Override void show(){
        System.out.println("Child's show()");
    }
}

public class MethodOverriding2 {
    public static void main(String[] args) {
        Parent1 p1 = new Child1();
        p1.show();


        Parent1 p2 = new Parent1();
        p2.show();
    }
}
