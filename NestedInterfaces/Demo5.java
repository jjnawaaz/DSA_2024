package NestedInterfaces;




public class Demo5 {
    public interface NestedInterface{
        public void nestedMethod();
    }

    public static void main(String[] args) {
        NestedInterface nested = new NestedInterface() {
            public void nestedMethod(){
                System.out.println("Hello from inside nested interface");
            }
        };

        nested.nestedMethod();
    }
}
