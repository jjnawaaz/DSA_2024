package Strings;

public class stringsbuilder2 {
    public static void main(String[] args) {
        // To change a string using normal String str 
        /* The main difference here is the space complexity issue
           Every time we concatenate the string we are actually making a new 
           space in the heap memory and assigning it new value i.e he hel hell hello
           This increases the time if the operations are huge so to make it faster 
           We are using String Builder       
        */ 
        // imagining if it takes 1 byte of space then
        String str = "h";   // this will take 1 byte
        str = str + "e";    // this will take 1 byte
        str = str + "l";    // this will take 1 byte
        str = str + "l";    // this will take 1 byte
        str = str + "o";    // this will take 1 byte
        // So here totally we are using 5 bytes 
        System.out.println(str);
        
        // To change string using String Builder
        /*
         * Here we are using String Builder the main difference here is we arent making
         * new memory spaces everytime we insert/ append a new char/ string 
         * we are pointing to the same memory location and changing the string 
         */
        StringBuilder sb = new StringBuilder("h"); // here we reserve only 1 byte of memory in space and only use it 
        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");
        System.out.println(sb);


        // To find length 
        System.out.println(sb.length());
    }
}
