// Multiple Inheritance

package Interfaces;

interface Add{
    int add(int a , int b);
}

interface Sub{
    int sub(int a , int b);
}


class Cal implements Add, Sub{
    
    public int add(int a, int b){
        return a + b;
    }
    public int sub(int a, int b){
        return a - b;
    }
}

public class Interface4 {
    public static void main(String[] args) {
        Cal x = new Cal();
        System.out.println(x.add(3, 4));
        System.out.println( x.sub(6, 2));
    }
}
