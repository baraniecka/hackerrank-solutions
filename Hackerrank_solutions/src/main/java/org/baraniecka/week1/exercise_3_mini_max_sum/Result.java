package org.baraniecka.week1.exercise_3_mini_max_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long minSum = arr.stream()
                .map(i -> Long.valueOf(i))
                .sorted().limit(arr.size() - 1)
                .reduce(0L, Long::sum);

        long maxSum = arr.stream()
                .map(i -> Long.valueOf(i))
                .sorted().skip(1)
                .reduce(0L, Long::sum);

        System.out.println(minSum + " " + maxSum);
    }

    public static void main(String[] args) {
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
        List<Integer> arr = new ArrayList<>(Arrays.asList(156873294, 719583602, 581240736, 605827319, 895647130));

        Result.miniMaxSum(arr);

//            bufferedReader.close();

    }


}
