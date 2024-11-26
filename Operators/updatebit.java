/*  UPDATE BIT


 * Update the digit using Bit operators 
 * eg 0110 find the number in 3rd pos here 3 pos is 0,1,2 from right that is 1 and update it to either 1 or 0
 * to do that we have to follow this logic 
 * first we make a bitmask which is 1<<pos hre pos is 1,2,3 or whatever
 * if it is 0 then we should perform AND with NOT
 * if it is 1 then we have to perform OR
 * 
 */

package Operators;

public class updatebit {
    public static void main(String[] args) {
        int n = 5;
        int pos = 1;
        int bitmask = 1<<pos;
        
        // Change it to 1 
        int answer = bitmask | n;
        System.out.println(answer);

        // Change it to 0
        int answer2 = ~(bitmask) & n;
        System.out.println(answer2);
    }
}
