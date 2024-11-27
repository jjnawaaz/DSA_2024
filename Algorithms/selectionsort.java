/*
 * Find min element in the array while iterating  
 * Place it in the appropriate index 
 * repeat till array is sorted 
 * 
 */



package Algorithms;

public class selectionsort {
   // Printing the array 

    public static void printArray(int arr[]) {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};

        // Selection Sort 
        for (int i = 0; i < arr.length - 1; i++) {
            // This for loop is to iterate through the whole array 
            int smallest = i;   // storing the index 
            // Loop runs from the i + 1 index i,e the next element
            for (int j = i + 1; j < arr.length ; j++) {
                if(arr[smallest] > arr[j]){  // We check if the number is greater if yes we track the index using smallest 
                    {
                        smallest = j;
                    }
                }
            }
            // We use smallest index and using that we swap here 

            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
        printArray(arr);
    }
}
