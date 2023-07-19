import java.util.*;

public class BitManipulation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        {
            // Get the 3rd bit(position =2) of a number n.(n=0101)

            System.out.println("Enter the operBit 0 or 1:");
            int oper = sc.nextInt(); // oper=1:set and oper=0:clear
            int n = 5;// 0101
            int pos = 1;
            int bitMask = 1 << pos;

            // if ((bitMask & n) == 0) {
            // System.out.println("Bit is zero");
            // } else {
            // System.out.println("Bit is one");
            // }

            // setbit
            // int newNumber = (bitMask | n);
            // System.out.println(newNumber);

            // Clear bit
            // int newNumber = ~(bitMask);
            // System.out.println(newNumber & n);

            // update bit
            if (oper == 1) { // set
                int newNumber = bitMask | n;
                System.out.println(newNumber);
            } else {// clear
                int newBitMask = ~(bitMask);
                int newNumber = newBitMask & n;
                System.out.println(newNumber);
            }

        }
        sc.close();
    }

}
