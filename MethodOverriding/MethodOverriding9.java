package MethodOverriding;

class Parent9{
    void m1() throws RuntimeException
    {
        System.out.println("From parent m1()");
    }
}

class Child91 extends Parent9{
    @Override void m1() throws RuntimeException
    {
        System.out.println("From child91 m1() ");
    }
}

class Child92 extends Parent9{
    @Override void m1() throws ArithmeticException
    {
        System.out.println("From child92 m1()");
    }
}

class Child93 extends Parent9{
    @Override void m1() 
    {
        System.out.println("From child93 m1()");
    }
}


class Child94 extends Parent9{
    // @Override void m1() throws Exception
    // {   
    //     // This will cause Compile-Time Error because parent class didnt declare exception. 
    //     System.out.println("From child92 m1()");
    // }
}

public class MethodOverriding9 {
    public static void main(String[] args) {
        Parent9 p1 = new Child91();
        Parent9 p2 = new Child92();
        Parent9 p3 = new Child93();
        Parent9 p4 = new Child94();

        try{
            p1.m1();
        }
        catch(RuntimeException e){
            System.out.println("Exception Caught : "+e);
        }

        try{
            p2.m1();
        }  catch(RuntimeException e){
            System.out.println("Exception Caught : "+e);
        }
        try{
            p3.m1();
        }  catch(Exception e){
            System.out.println("Exception Caught : "+e);
        }


        try{
            p4.m1();
        } catch(Exception e){
            System.out.println("Exception Caught : "+e);
        }
    }
}
