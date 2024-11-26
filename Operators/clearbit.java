/*  CLEAR BIT


 * Clear the digit using Bit operators 
 * eg 0110 find the number in 3rd pos here 3 pos is 0,1,2 from right that is 1 and clear it
 * to do that we have to follow this logic 
 * first we make a bitmask which is 1<<pos hre pos is 1,2,3 or whatever
 * then we perform bitwise NOT and then AND
 * eg 1010 and pos 2
 * first we create bitmask 1<<2 which is 0001 shifted 3 digits to right which makes it 0100
 * Now we perform NOT on bitmask 
 * ~(0 1 0 0) which is 1 0 1 1 
 * now we perform AND with the new bitmask
 * 1 0 1 1
 * 0 1 0 1
 * -------
 * 0 0 0 1 which clears the bit at pos 2 from 1 0 1 0
 * 
 */


package Operators;

public class clearbit {
    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        int bitmask = 1<<pos;
        bitmask = ~(bitmask);
        int answer = bitmask & n;
        System.out.println(answer);
    }
}
