package org.baraniecka.week2.exercise_1_lonely_integer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        a = a.stream().sorted().collect(Collectors.toList());
        int result = 0;
        boolean found = false;

        if(a.size() == 1){
            result = a.get(0);
            return result;
        }

        for (int i = 0; i < a.size()-2; i=i+2) {
            int x = a.get(i);
            int y = a.get(i+1);

            if(x !=y){
                result = x;
                found = true;
                return result;
            }
            if (i == a.size()-3 && !found){
                result = a.get(a.size()-1);
            }
        }
        return result;
    }


    public static void main(String[] args) {

        List<Integer> listOfInts = new ArrayList<>(Arrays.asList(59, 88, 14, 8, 85, 1, 94, 74, 57, 96, 39, 2, 47, 43, 35,
                17, 53, 52, 92, 31, 99, 48, 94, 30, 92, 60, 32, 45, 88, 13, 39, 50, 22, 65, 89, 46, 65, 76, 57, 67,
                99, 35, 76, 46, 85, 82, 45, 62, 53, 80, 74, 22, 31, 52, 82, 13, 41, 96, 2, 1, 80, 62, 4, 20, 50, 89,
                59, 67, 60, 8, 41, 14, 47, 48, 17, 4, 43, 30, 32));



        System.out.println(lonelyinteger(listOfInts));
    }

}
