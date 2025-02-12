package OOPS;

abstract class AB{
    public abstract void view();
}


class B extends AB {
    public void view(){
        System.out.println("B.view");
    }
}

public class abstractexamples {
 public static void main(String args[]){
     B obj1 = new B();
     obj1.view();
 }
}
