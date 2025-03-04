// Abstract List Class Example only need to implement get() and size() method

package Collections.ListInterface;

import java.util.*;

public class List15 extends AbstractList<Integer>{

    private int size;

    public List15(int size){
        this.size = size;
    }
    @Override
    public Integer get(int index){
        return index;
    }

    @Override
    public int size(){
        return size;
    }

    public static void main(String[] args) {
        List<Integer> list = new List15(5);
        for(int i : list){
            System.out.print(i+" ");
        }
    }
}
