package org.baraniecka.week1.exercise_5_breaking_the_records;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Result {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        List<Integer> result = new ArrayList<>();
        int maxCounter = 0;
        int minCounter = 0;
        int maxValue = scores.get(0);
        int minValue = scores.get(0);


        for(int i = 1; i < scores.size(); i++){
            if(scores.get(i) > maxValue){
                maxCounter++;
                maxValue = scores.get(i);
            }
            if (scores.get(i) < minValue){
                minCounter++;
                minValue = scores.get(i);
            }
        }

        result.add(maxCounter);
        result.add(minCounter);

        return result;
    }

    public static void main(String[] args) {

        List<Integer> scores = new ArrayList<>(Arrays.asList(3, 4, 21, 36, 10, 28, 35, 5, 24, 42));
        System.out.println(Result.breakingRecords(scores));
    }
}
