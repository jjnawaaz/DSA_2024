import java.util.*;
public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name to be displayed");
        String name = sc.next();
        System.out.println(name);
        // If you are using sc.next() only then you can only print one word in that sentence i.e if the sentence is Junaid is eating then only Junaid gets printed to avoid it we use .nextLine()
        System.out.println("Enter your sentence to be displayed");
        String name2 = sc.nextLine();
        System.out.println(name2);

        // Note you cannot use two inputs i.e user cant enter two inputs for now 
    }
}
