package Collections.SetInterface.AbstractSet;

abstract class AbstractSet02{
    protected AbstractSet02(){
        System.out.println("Abstract set constructor called");
    }

    public abstract void display();
}

class MySet02 extends AbstractSet02{
    
    public MySet02(){
        super();
        System.out.println("MySet02 constructor called");
    }

    @Override
    public void display(){
        System.out.println("Displaying elements in MySet");
    }


}


public class AbstractSet2 {
    public static void main(String[] args) {
        MySet02 set = new MySet02();
        set.display();
    }
}
