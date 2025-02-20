package Arrays;

public class Clone2dArray {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};

        int Clone2dArray[][] = arr.clone();

        // returns false because it is a shallow copy
        System.out.println(arr==Clone2dArray);

        System.out.println(arr[0] == Clone2dArray[0]);   // returns true because it stores the original copies of the values
        System.out.println(arr[1] == Clone2dArray[1]);

    }
}
