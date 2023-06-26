package org.baraniecka.week4.exercise_3_number_line_jumps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberLineJumpsTest {

    @Test
    void case_1_where_YES(){

        //given
        int x1 = 2;
        int v1 = 1;
        int x2 = 1;
        int v2 = 2;

        //when
        String result = NumberLineJumps.kangaroo(x1, v1, x2, v2);
        String expected = "YES";

        //then
        assertEquals(expected, result);
    }

    @Test
    void case_2_where_NO(){

        //given
        int x1 = 0;
        int v1 = 2;
        int x2 = 5;
        int v2 = 3;

        //when
        String result = NumberLineJumps.kangaroo(x1, v1, x2, v2);
        String expected = "NO";

        //then
        assertEquals(expected, result);
    }

    @Test
    void case_3_where_YES(){

        //given
        int x1 = 0;
        int v1 = 3;
        int x2 = 4;
        int v2 = 2;

        //when
        String result = NumberLineJumps.kangaroo(x1, v1, x2, v2);
        String expected = "YES";

        //then
        assertEquals(expected, result);
    }

    @Test
    void case_4_where_NO(){

        //given
        int x1 = 43;
        int v1 = 2;
        int x2 = 70;
        int v2 = 2;

        //when
        String result = NumberLineJumps.kangaroo(x1, v1, x2, v2);
        String expected = "NO";

        //then
        assertEquals(expected, result);
    }
}
