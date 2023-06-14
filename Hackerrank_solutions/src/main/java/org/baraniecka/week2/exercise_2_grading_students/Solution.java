package org.baraniecka.week2.exercise_2_grading_students;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> roundedGrades = new ArrayList<>();
//
        for (Integer grade : grades) {
            int roundedGrade = grade;
            if (roundedGrade >= 38 && roundedGrade % 5 != 0) {
                int modulo = roundedGrade % 5;
                if (modulo >= 3) {
                    roundedGrade = roundedGrade + (5 - modulo);
                }
            }
            roundedGrades.add(roundedGrade);
        }
        return roundedGrades;
    }


    public static void main(String[] args) {
        List<Integer> gradesList = new ArrayList<>(Arrays.asList(45, 40, 67, 88, 91, 69, 34, 99, 62, 51, 77));

        System.out.println("---------------BEFORE---------------");
        System.out.println(gradesList);
        System.out.println("----------------AFTER----------------");
        System.out.println(gradingStudents(gradesList));
    }
}
