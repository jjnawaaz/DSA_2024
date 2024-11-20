import java.util.Scanner;

public class switcher {
    public static void main(String[] args){
        System.out.println("Enter a button from 1,2,3");
        Scanner sc = new Scanner(System.in);
        Integer button = sc.nextInt();
        switch(button){
            case 1: System.out.println("Pressed 1");
            break;
            case 2: System.out.println("Pressed 2");
            break;
            case 3: System.out.println("Pressed 3");
            break;
            default: System.out.println("Invalid Choice");
            break;
        }

    }
}
