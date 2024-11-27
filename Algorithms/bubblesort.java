
/*
 *  Iterate over the array 
 *  Find max first
 *  compare with the next element
 *  if greater then swap else continue iteration
 *  
 *  
 */

package Algorithms;

public class bubblesort {
      // Printing the array 

    public static void printArray(int arr[]) {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    
    
    public static void main(String[] args) {
        int arr[] ={7,8,3,1,2};

        // Iterating the array 

        for(int i = 0; i < arr.length ;i++){
            // Iterating the array checking the condition 
            for (int j = 0; j < arr.length- i - 1 ; j++) {   // Loop condition is to ignore the greatest most element that is sorted
                if(arr[j] > arr[j+1]){    // Swapping if the condition is met 
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);
        }
}
