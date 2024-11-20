import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer age = sc.nextInt();
        if(age > 18){
            System.out.println("He is Adult");
        } else {
            System.out.println("He is minor");
        }
    }
}
