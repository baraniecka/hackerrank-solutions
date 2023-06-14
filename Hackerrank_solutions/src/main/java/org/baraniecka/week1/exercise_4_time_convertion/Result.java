package org.baraniecka.week1.exercise_4_time_convertion;

public class Result {


    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        if (s.contains("12:") && s.toUpperCase().contains("AM")) {
            s = s.replaceFirst("12", "00");

        } else if (!s.contains("12") && s.toUpperCase().contains("PM")) {
            String hour = String.valueOf(Integer.parseInt(s.substring(0, 2)) + 12);
            StringBuilder newS = new StringBuilder();
            s = newS.append(hour).append(s.substring(2)).toString();
        }
        return s.substring(0, s.length() - 2);
    }


    public static void main(String[] args){

        String s = "01:01:00pm";

        String result = Result.timeConversion(s);

        System.out.println(result);
    }
}

