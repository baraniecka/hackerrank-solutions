package org.baraniecka.week5.exercise_3_smart_number_2;

import java.util.Scanner;

public class SmartNumber2 {

    /*
    In this challenge, the task is to debug the existing code to successfully execute
    all provided test files.
    A number is called a smart number if it has an odd number of factors.
    Given some numbers, find whether they are smart numbers or not.

    Debug the given function is_smart_number to correctly check if a given number
    is a smart number.
     */

    public class Solution {
        public static boolean isSmartNumber(int num) {
            int val = (int) Math.sqrt(num);
            if ((float)num / val == val) //changed from num / val == 1
                return true;
            return false;
        }

        public static void main(String[] args) {
            int test_cases;
            Scanner in = new Scanner(System.in);
            test_cases = in.nextInt();
            int num;
            for (int i = 0; i < test_cases; i++) {
                num = in.nextInt();
                boolean ans = isSmartNumber(num);
                if (ans) {
                    System.out.println("YES");
                } else System.out.println("NO");
            }
        }
    }
}
