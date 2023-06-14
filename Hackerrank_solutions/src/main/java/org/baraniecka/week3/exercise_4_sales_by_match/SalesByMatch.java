package org.baraniecka.week3.exercise_4_sales_by_match;

import java.util.List;

public class SalesByMatch {

    public static int sockMerchant(int n, List<Integer> ar) {

        List<Integer> sorted = ar.stream().sorted().toList();

        int pairs = 0;

        for (int i = 0; i < n-1; i++){

            if(sorted.get(i).equals(sorted.get(i+1))){
                pairs++;
                i++;
            }

        }
        return pairs;
    }
}
