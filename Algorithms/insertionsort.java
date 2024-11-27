/*
 * Keep one side a sorted and second side unsorted array 
 * Backtrack the current element with sorted side if the element is smaller then push that element + 1 index 
 * repeat till whole array is sorted
 */



package Algorithms;

public class insertionsort {
   
         // Printing the array 

         public static void printArray(int arr[]) {
            for(int i = 0; i < arr.length; i++){  
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        
        
   
    public static void main(String[] args) {
        int arr[] = {3,4,6,1,2};
        // Iterating over array 

        for(int i = 1; i < arr.length; i++){
            int current = arr[i];
            int j;
            for(j = i - 1; j >=0 && current < arr[j]; j--){
                arr[j + 1] = arr[j];
            }

            // Placing
            arr[j + 1] = current;

        }

        printArray(arr);
    }
}
