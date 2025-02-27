/**
 * Serializable interface is present in java.io package. 
 * It is used to make an object eligible for saving its state into a file. 
 * This is called Serialization. 
 * Classes that do not implement this interface will not have any of their state serialized or deserialized.
 * All subtypes of a serializable class are themselves serializable.
 */


package MarkerInterface;

import java.io.*;


class A2 implements Serializable{
    int i;
    String s;

    public A2(int i, String s){
        this.i = i;
        this.s = s;
    }
}


public class Demo3 {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        A2 a = new A2(20,"Hello");

        //Serialization 'a'
        FileOutputStream fos = new FileOutputStream("xyx.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a);

        //De- Serialization 'a'

        FileInputStream fis = new FileInputStream("xyx.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        A2 b = (A2)ois.readObject();


        System.out.println(b.i+" "+b.s);

        oos.close();
        ois.close();

    }
}
