package org.baraniecka.week1.exercise_1_sparse_arrays;

import java.util.ArrayList;
import java.util.List;

class Result {

    /*
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY strings
     *  2. STRING_ARRAY queries
     */

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        List<Integer> result = new ArrayList<>();

//        for (int q = 1; q < queries.size(); q++) {
//            int counter = 0;
//            for (int s = 1; s < strings.size(); s++) {
//                if (strings.get(s).equals(queries.get(q))) {
//                    counter++;
//                }
//            }
//            result.add(counter);
//        }
        for (int q = 1; q < queries.size(); q++) {
            int finalQ = q;
            int counter = (int)strings.stream()
                    .filter(string -> string.equals(queries.get(finalQ)))
                    .count();
            result.add(counter);
        }
        return result;

    }

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("4", "aba", "baba", "aba", "xzxb"));
        List<String> queries = new ArrayList<>(List.of("3", "aba", "xzxb", "ab"));
        List<Integer> result = Result.matchingStrings(strings, queries);
        System.out.println(result);
    }
}