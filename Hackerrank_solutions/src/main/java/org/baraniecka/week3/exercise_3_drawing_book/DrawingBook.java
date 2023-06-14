package org.baraniecka.week3.exercise_3_drawing_book;

public class DrawingBook {

    public static int pageCount(int n, int p) {
        // Write your code here

        if(n%2 == 0){
            n +=1;
        }

        int counterToStart = 0;
        int page1 = p;
        while (page1 > 1) {
            page1 -= 2;
            counterToStart++;
        }

        int counterToEnd = 0;
        int page2 = p;
        while (page2 < n-1){
            page2 += 2;
            counterToEnd++;
        }

        return Math.min(counterToStart, counterToEnd);
    }

    public static void main(String[] args) {
        System.out.println(pageCount(5, 3));
    }
}
