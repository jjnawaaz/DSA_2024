package MethodOverriding;

class Parent2{
    private void m1(){
        System.out.println("From Parent's m1() ");
    }
    protected void m2(){
        System.out.println("From Parent's m2() ");
    }
}


class Child2 extends Parent2{
    @Override
    protected void m2(){
        System.out.println("From Child's m2()");
    }

    private void m1(){
        System.out.println("From Child's m1()");
    }
}


public class MethodOverriding3 {
    public static void main(String[] args) {
        Parent2 p = new Parent2();
        
        // p.m1();  Method is private so it cant be accessed 
        p.m2();

        Parent2 p1 = new Child2();
        // p1.m1();  Method is private so it cant be accessed 
        p1.m2();


    }
}
