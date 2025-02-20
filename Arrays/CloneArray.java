package Arrays;

public class CloneArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3};

        int CloneArray[] = arr.clone();

        System.out.println(arr == CloneArray);        // Will print false as shallow copy is created

        for(int i: CloneArray){
            System.out.println(i);
        }
    }
}
