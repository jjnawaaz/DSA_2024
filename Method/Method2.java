package Method;

class Test{
    public static int i = 0;

    Test(){
        i++;
    }

    public static int get(){
        return i;
    }

    public int m1(){
        System.out.println("This message is from m1");
        this.m2();
        return 1;
    }

    public void m2(){
        System.out.println("Printing this from m2");
    }
}



public class Method2 {
    public static void main(String[] args) {
        Test obj = new Test();
        // Test obj1 = new Test();

        int i = obj.m1();
        System.out.println("After using m1 to call even m2 ");

        // int j = obj1.m1();

        int o = Test.get();
        System.out.println("No of instances "+o);
    }
}
