// Type Conversion

/**
 * Priority 
 * 1.Object
 * 2.Double
 * 3.Float
 * 4.Long
 * 5.Integer
 * 6. Short and Character
 * 7.Byte
 * 
 */

package MethodOverloading;

class Test{
    
    
    public void show(int x){
        System.out.println("In int " +x);
    }

    public void show(String s){
        System.out.println("In String " +s);
    }

    public void show(byte x){
        System.out.println("In byte " +x);
    }


}

public class MethodOverloading5 {
    public static void main(String[] args) {
        byte a = 25;
        Test obj = new Test();
        obj.show(a);            // Byte
        obj.show("Hello");    // String  
        obj.show(250);        // Integer 

        // Since char is
        // not available, so the datatype
        // higher than char in terms of
        // range is int.
        obj.show('A');     // Will print ascii value of A


        obj.show("A");     // String



        // obj.show(7.5); Will throw error since there is no method preceding the float value 
    }
}
