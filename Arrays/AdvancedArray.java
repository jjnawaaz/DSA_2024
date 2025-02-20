// Using InputStream interface to create array

package Arrays;

import java.util.Arrays;

public class AdvancedArray {
    public static void main(String[] args) {
       
       // Using array IntStream.range() puts elements less than the second limit
        int[] arr = java.util.stream.IntStream.range(1,5).toArray();  
        for(int i : arr){
            System.out.println(i);
        }


        //Using array IntStream.rangeClosed() puts elements less than or equal to second limit
        int[] arr2 = java.util.stream.IntStream.rangeClosed(1,4).toArray();
        for(int i : arr2){
            System.out.println(i);
        }

        // Using array IntStream.of() puts elements directly mentioned
        int arr3[] = java.util.stream.IntStream.of(4,5,6,7).toArray();

        for (int i : arr3) {
            System.out.println(i);
        }
    }
}
