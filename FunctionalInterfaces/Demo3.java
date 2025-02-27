package FunctionalInterfaces;
import java.util.*;
import java.util.function.Predicate;

public class Demo3 {
    public static void main(String[] args) {
        List<String> n = Arrays.asList("hI","hi","Sush","push","PUSH");
        Predicate<String> p = (s) -> s.startsWith("h");

        for(String st : n){
            if(p.test(st)){
                System.out.println(st);
            }
        }
    }
}
