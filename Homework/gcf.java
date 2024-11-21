package Homework;

import java.util.Scanner;

public class gcf {
   
   public static void GCF(int a, int b) {
    int greater = 0;
    int smaller = 0;
    if(a>b){
            greater = a;
            smaller = b;
        } else{
            greater = b;
            smaller = a;
    }
    while (smaller != 0) {
        int modulus = greater % smaller;
        greater = smaller;
        smaller = modulus;
    }

    System.out.println(greater);
    
    return;
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        GCF(a, b);
    }
}
