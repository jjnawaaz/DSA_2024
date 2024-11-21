package Arrays;

public class array1 {
    public static void main(String[] args) {
        // int[] marks = new int[3];  // Different Syntax
        int marks[] = new int[3];     // Different Syntax
        marks[0] = 95;
        marks[1] = 98;
        marks[2] = 91;
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        for(int i =0; i < 3; i++){
            System.out.println(marks[i]);   // Using for loop to print array
        }
    }
}
