package org.baraniecka.week2.exercise_3_flipping_bits;

public class Solution {

    public static long flippingBits(long n) {
        // Write your code here
        String longToBinary = Long.toBinaryString(n);
        char[] bitsArray = new char[32];
        StringBuilder builder = new StringBuilder();
        int arrayIndex = 31;

        for (int i = longToBinary.length() - 1; i > -1; i--) {
            if (longToBinary.charAt(i) == '0')
                bitsArray[arrayIndex] = '1';
            else {
                bitsArray[arrayIndex] = '0';
            }
            arrayIndex--;
        }
        if (longToBinary.length() < 32) {
            int index = 32 - longToBinary.length() - 1;
            for (int i = index; i > -1; i--) {
                bitsArray[i] = '1';
            }
        }
        for (char bit : bitsArray) {
            builder.append(bit);
        }

        return Long.parseLong(builder.toString(), 2);
    }

    public static void main(String[] args) {
        long myLongExample = 12L;
        String longToBinary = Long.toBinaryString(myLongExample);
        char[] bitsArray = new char[32];
        StringBuilder builder = new StringBuilder();
        long afterFlipping = flippingBits(myLongExample);

        int arrayIndex = 31;
        for (int i = longToBinary.length() - 1; i > -1; i--) {
            if (longToBinary.charAt(i) == '0')
                bitsArray[arrayIndex] = '1';
            else {
                bitsArray[arrayIndex] = '0';
            }
            arrayIndex--;
        }
        if (longToBinary.length() < 32) {
            int index = 32 - longToBinary.length() - 1;
            for (int i = index; i > -1; i--) {
                bitsArray[i] = '1';
            }
        }
        for (char bit : bitsArray) {
            builder = builder.append(bit);
        }

        String flipped = builder.toString();


        System.out.printf("MyLongExample: %d in binary representations is: %s\n", myLongExample, longToBinary);
        System.out.println("---------------------------------------------------------");
//        System.out.println(flipped);
//        System.out.println("---------------------------------------------------------");
        System.out.printf("MyLongExample after flipping bits is: %s\n", afterFlipping);
        System.out.println("---------------------------------------------------------");

    }

}
