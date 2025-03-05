package Collections.MapInterface.Hashtable;
import java.util.*;
public class Hashtable4 {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht = new Hashtable<>();
        ht.put(1,"Vaibhav");
        ht.put(2,"Kashyap");
        ht.put(3,"Tinz");

        System.out.println("Size of the map is : "+ht.size());
        System.out.println(ht);

        if(ht.contains("Tinz")){
           // Get Key from value
           Integer key = null;
           String value = "Tinz";
           for(Map.Entry<Integer,String> entry: ht.entrySet()){
                if(value.equals(entry.getValue())){
                    key = entry.getKey();
                    break;
                }
           }

           System.out.println("The value is "+ht.get(key));
        }


        if(ht.contains("Kashyap")){
            String value = "Kashyap";
            
            // Get Key from value
            for(Integer key : ht.keySet()){
                if(ht.get(key).equals(value)){
                    System.out.println(ht.get(key));
                }
            }
        }
    }
}
