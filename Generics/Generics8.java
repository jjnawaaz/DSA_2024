package Generics;

public class Generics8 {
    public static void main(String[] args) {
        
        Integer[] a = {100, 22, 58, 41, 6, 50};

        Character[] c = {'v','g','a','c','x','d','t'};

        String[] s = {"Virat","Rohit","Abhinay","Chandu","Sam","Bharat","Kalam"};
        
        System.out.print("Sorted Integer array : ");
        sort_generics(a);
        
        System.out.print("Sorted Character array : ");
        sort_generics(c);

        System.out.print("Sorted String array : ");
        sort_generics(s);

    }


    public static <T extends Comparable<T>> void sort_generics(T[] a)
    {
        
        // We use Comparable class because we are using non primitive data types

        // Bubble Sort Logic
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length - i - 1;j++){
                if(a[j].compareTo(a[j + 1]) > 0){
                    swap(j, j + 1, a);
                }
            }
        }

        // Printing Elements

        for(T i : a){
            System.out.print(i +", ");
        }
        System.out.println();
    }

    public static <T> void swap(int i , int j , T[] a)
    {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
