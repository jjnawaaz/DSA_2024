package Method;

class Test3{
    String n = "";
    
    // Using the test method to initialize instance variable n 
    void test(String n){
        this.n = n;
    }
}


public class Instancemethod {
    public static void main(String[] args) {
        
        Test3 obj = new Test3();

        obj.test("Junaid");
        System.out.println(obj.n);
    }
}
