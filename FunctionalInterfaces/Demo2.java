// Functional Interface Annotation @FunctionalInterface

package FunctionalInterfaces;

@FunctionalInterface
interface Square{
    int calculate(int x);
}

public class Demo2 {
 public static void main(String[] args) {
    int a = 5;
    
    // Lambda Expression to calculate method
    Square s = (int x) -> x * x;

    int ans = s.calculate(a);
    System.out.println(ans);
 }   
}
