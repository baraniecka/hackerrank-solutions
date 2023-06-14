package org.baraniecka.week2.exercise_6_counting_valleys;

public class Solution {

    public static int countingValleys(int steps, String path) {
        // Write your code here

        int level = 0;
        int valleyCount = 0;
        char UP = 'U';
        char DOWN = 'D';

        for (int i = 0; i < steps; i++){
            if (path.charAt(i) == UP){
                level++;
                if (level == 0){
                    valleyCount++;
                }
            }
            if (path.charAt(i) == DOWN){
                level--;
            }

        }

        return valleyCount;
    }

    public static void main(String[] args) {

        String path = "UDDDUDUU";

        System.out.println(countingValleys(8, path));
    }

}
