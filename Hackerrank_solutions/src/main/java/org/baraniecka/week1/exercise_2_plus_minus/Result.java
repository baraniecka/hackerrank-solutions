package org.baraniecka.week1.exercise_2_plus_minus;

import java.util.ArrayList;
import java.util.List;

public class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        double positive = 0.0;
        double negative = 0.0;
        double zeros = 0.0;

        int size = arr.size();

        for (int value : arr){
            if (value == 0){
                zeros++;
            }
            if (value < 0){
                negative++;
            }
            if(value > 0){
                positive++;
            }
        }


        System.out.printf("%.6f\n", positive/size);
        System.out.printf("%.6f\n", negative/size);
        System.out.printf("%.6f", zeros/size);
    }

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>(List.of(-4, 3, -9, 0, 4, 1));
        Result.plusMinus(arr);
    }
}

