package Recursion;

public class arraysorted {
   
   public static void checkArray(int arr[], int idx) {
        if( idx == arr.length - 1){
            System.out.println("Array is sorted");
        return;
        }

        if(arr[idx] > arr[idx + 1]){
            System.out.println("Array is not sorted ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
        } else {
            checkArray(arr, idx + 1);
        }

   }
    public static void main(String[] args) {
        int idx = 0;
        int arr[] = {1,2,3,4,5};
        checkArray(arr, idx);
    }
}
