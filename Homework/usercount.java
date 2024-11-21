package Homework;

import java.util.Scanner;

public class usercount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = 1;
        int positiveCount = 0;
        int negetiveCount = 0;
        int zeroCount = 0;
        do{
           System.out.println("Enter your number");
           int num = sc.nextInt();
           if(num>0){
            positiveCount++;
           }else if(num<0){
            negetiveCount++;
           } else{
            zeroCount++;
           }

           System.out.println("Do you wish to continue entering numbers? Yes(1) No(0)");
           button = sc.nextInt();
           System.out.println(button);
        }while(button == 1);

        System.out.println("The total number of positives is: "+positiveCount+" The total number of negetives is: "+negetiveCount+" The total number of zeros is: "+zeroCount);
    }
}
