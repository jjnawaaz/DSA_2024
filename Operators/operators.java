package Operators;

public class operators {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;

        // Operators
        int sum = a + b; // + 
        int diff = a - b; // -
        int mul = a * b; // *
        int div = a / b; // / 
        int modulus = a % b; // %
        
        // logical operators 
        if(a>b){
            System.out.println("true");  // >
        }
        if(a>=b){
            System.out.println("true");  // >=
        }
        if(a<b){
            System.out.println("true");  // <
        }
        if(a<=b){
            System.out.println("true");  // <=
        }

        if(a==b){
            System.out.println("true");  // >
        }
    
        // Logical AND OR XOR
        if(a>b || a>=b){
            System.out.println("true");  // && AND
        }

        if(a>b || a>=b){
            System.out.println("true");  // || OR
        }

        if(a>b ^ a>=b){
            System.out.println("true");  // ^ XOR
        }

        // post increment
        a++;
        b++;
        System.out.println(a+" "+b);   
        
         // post decrement
         a--;
         b--;
         System.out.println(a+" "+b); 

          // pre increment
        ++a;
        ++b;
        System.out.println(a+" "+b); 

        // pre decrement
        --a;
        --b;
        System.out.println(a+" "+b); 


    }
}
