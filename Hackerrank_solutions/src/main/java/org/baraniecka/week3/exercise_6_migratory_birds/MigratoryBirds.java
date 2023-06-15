package org.baraniecka.week3.exercise_6_migratory_birds;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MigratoryBirds {

    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here

        Map<Integer, Integer> birdTypes = new HashMap<>
                (Map.of(1, 0, 2, 0, 3, 0, 4, 0, 5, 0));


        for (Integer type : arr) {
            birdTypes.put(type, birdTypes.get(type) + 1);
        }

        return birdTypes
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .stream()
                .min(Map.Entry.comparingByKey())
                .get()
                .getKey();
    }

}
