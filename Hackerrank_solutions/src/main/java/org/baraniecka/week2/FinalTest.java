package org.baraniecka.week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FinalTest {

    public static int maxMatrixSum(List<List<Integer>> matrix) {

        int rows = matrix.size();
        int columns = matrix.get(0).size();

        List<Integer> list1 = new ArrayList<>();

        list1.add(matrix.get(0).get(0));
        list1.add(matrix.get(0).get(columns - 1));
        list1.add(matrix.get(rows - 1).get(0));
        list1.add(matrix.get(rows - 1).get(columns - 1));

        int max1 = getMax(list1);

        List<Integer> list2 = new ArrayList<>();

        for (int i = 1; i < columns - 1; i++) {
            list2.add(matrix.get(0).get(i));
            list2.add(matrix.get(rows - 1).get(i));
        }

        int max2 = getMax(list2);

        List<Integer> list3 = new ArrayList<>();

        for (int i = 1; i < rows - 1; i++) {
            list3.add(matrix.get(i).get(0));
            list3.add(matrix.get(i).get(columns - 1));
        }

        int max3 = getMax(list3);

        int max4 = matrix.get(1).get(1);


        return max1 + max2 + max3 + max4;
    }

    private static int getMax(List<Integer> list) {
        return list.stream().max(Integer::compareTo).get();
    }

//    private static List<Integer> flipVertical(List<Integer> listToFLip) {
//        int bound = Math.round(listToFLip.size() / 2);
//        int maxIndx = listToFLip.size() - 1;
//
//        for (int i = 0; i < bound; i++) {
//            int temp = listToFLip.get(i);
//
//            listToFLip.set(i, listToFLip.get(maxIndx - i));
//            listToFLip.set(maxIndx - i, temp);
//        }
//
//        return listToFLip;
//    }
//
//    private static List<List<Integer>> flipHorizontal(List<List<Integer>> listToFLip, int column) {
//
//        int bound = Math.round(listToFLip.size() / 2);
//
//        for (int i = 0; i < bound; i++) {
//            List<Integer> innerListUp = listToFLip.get(i);
//            int tempU = innerListUp.get(column);
//
//            List<Integer> innerListBottom = listToFLip.get(listToFLip.size() - i);
//            int tempB = innerListBottom.get(column);
//            innerListBottom.set(column, tempU);
//            innerListUp.set(column, tempB);
//        }
//
//
//        return listToFLip;
//    }

    public static void main(String[] args) {
        List<Integer> test = Arrays.asList(107, 54, 128, 15);
        List<Integer> test1 = Arrays.asList(12, 75, 110, 138);
        List<Integer> test2 = Arrays.asList(100, 96, 34, 85);
        List<Integer> test3 = Arrays.asList(75, 15, 28, 112);

        List<List<Integer>> matrix = List.of(test, test1, test2, test3);

        System.out.println(maxMatrixSum(matrix));

    }


}
