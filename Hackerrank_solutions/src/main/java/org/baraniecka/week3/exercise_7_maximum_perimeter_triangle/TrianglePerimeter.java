package org.baraniecka.week3.exercise_7_maximum_perimeter_triangle;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TrianglePerimeter {

    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
        int a;
        int b;
        int c;

        List<Integer> result = new ArrayList<>();

        sticks = sticks.stream().sorted().collect(Collectors.toList());


       biggest: for (int s = sticks.size() -1; s > 1; s--){

            a = sticks.get(s);

            for (int i = s - 1; i > 0; i--){

                b = sticks.get(i);
                c = sticks.get(i - 1);

                if ( b + c > a){
                    result.add(c);
                    result.add(b);
                    result.add(a);
                    return result;
                }
                else continue biggest;
            }
        }

        result.add(-1);

        return result;
    }

    public static void main(String[] args) {

        List<Integer> test = List.of(1, 1, 1, 3, 3, 10);

        System.out.println(TrianglePerimeter.maximumPerimeterTriangle(test));
    }
}
