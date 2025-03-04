// AbstractSet Class 


package Collections.SetInterface.AbstractSet;
import java.util.*;


abstract class AbstractSet01{
    
    public abstract void insert(int element);

    public abstract void display();
}

class MySet01 extends AbstractSet01{
    // set to hold elements
    private Set<Integer> elements;

    // Constructor
    public MySet01(){
        elements = new HashSet<>();
    }

    //Implement the insert method
    public void insert(int element){
        elements.add(element);
    }

    //Implement the display method
    public void display(){
        for(Integer element : elements){
            System.out.println(element);
        }
    }
}

public class AbstractSet1 {
    public static void main(String[] args) {
        MySet01 s = new MySet01();

        s.insert(10);
        s.insert(20);
        s.insert(30);

        System.out.println("Elements in the set are : ");
        s.display();
    }
}
