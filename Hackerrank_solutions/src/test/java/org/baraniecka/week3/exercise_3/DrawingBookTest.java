package org.baraniecka.week3.exercise_3;

import org.baraniecka.week3.exercise_3_drawing_book.DrawingBook;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DrawingBookTest {

    @Test
    void assertEquals_Given_N_Even_P_Odd() {
        assertEquals(1, DrawingBook.pageCount(6, 5));
    }

    @Test
    void assertEquals_Given_N_Even_P_Even(){
        assertEquals(1,DrawingBook.pageCount(6, 4));
    }

    @Test
    void assertEquals_Given_N_Odd_P_Odd(){
        assertEquals(1, DrawingBook.pageCount(7, 3));
    }

    @Test
    void assertEquals_Given_N_Odd_P_Even(){
        assertEquals(2, DrawingBook.pageCount(13, 8));
    }

    @Test
    void assertEquals_Same_Result_From_Both_Ends(){
        assertEquals(3, DrawingBook.pageCount(13, 6));
    }
}
