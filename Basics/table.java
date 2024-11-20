import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        int mul = 0;
        for(int i = 1; i <=10; i++){
            mul = n * i;
            System.out.println(mul);
        }

    }
}
