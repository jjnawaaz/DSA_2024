package Strings;

public class strings5 {
    public static void main(String[] args) {
        // compare substring
        String sentence = "My name is Junaid";
      
        // substring(beg index, end index); Note the letters in beginning and ending index are not included and ignored in substring
        
        String name = sentence.substring(11,sentence.length());
        System.out.println(sentence);
        System.out.println(name);

        // Strings are immutable in Java
    }
}
