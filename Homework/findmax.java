package Homework;

public class findmax {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,205};
        int result = findMax(arr);
        System.out.println(result);
    }

    public static int findMax(int n[]){
        int max = n[0];

        for(int i : n){
            if(i > max){
                max = i;
            }
        }
        return max;
    }
}
