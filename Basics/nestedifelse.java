import java.util.Scanner;

public class nestedifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer number = sc.nextInt();
        if(number % 2 == 0){
            System.out.println("number is divisible by 2");
        } else if(number % 3 == 0){
            System.out.println("Number is divisible by 3");
        } else {
            System.out.println("Number is not divisible by 2 or 3");
        }
    }
}


