// Abstract Classes Concept (Calling Abstract Methods)


package Method;


abstract class Help{
    abstract void check(String n);
}



public class Callmethod extends Help {
    public static void main(String[] args) {
        Callmethod obj = new Callmethod();
        obj.check("Nawaz");
    }

    @Override void check(String n){
        System.out.println(n);
    }
}
