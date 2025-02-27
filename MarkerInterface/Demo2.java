/**
 * Cloneable interface is present in java.lang package. 
 * There is a method clone() in Object class.
 * A class that implements the Cloneable interface indicates that it is legal for clone() method to make a field-for-field copy of instances of that class.
 * Invoking Object’s clone method on an instance of the class that does not implement the Cloneable interface results in an exception CloneNotSupportedException being thrown.
 * By convention, classes that implement this interface should override Object.clone() method. 
 */

package MarkerInterface;

class A implements Cloneable{
    int i;
    
    // A class constructor
    public A(int i){
        this.i = i;
    }


    @Override
    protected Object clone() 
    throws CloneNotSupportedException{
        return super.clone();
    }
}


public class Demo2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        A a = new A(20);

        // Cloning A here and holding the value in object reference b
        A b = (A)a.clone();

        System.out.println(b.i);
    }
}
