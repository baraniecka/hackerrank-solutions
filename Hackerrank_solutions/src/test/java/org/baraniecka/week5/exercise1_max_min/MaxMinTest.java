package org.baraniecka.week5.exercise1_max_min;

import org.baraniecka.week5.exercise_1_max_min.MaxMin;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxMinTest {

    @Test
    void case_1_where_k_2_expected_1() {
        //given
        List<Integer> arr = Arrays.asList(1, 4, 7, 2);
        int k = 2;
        //when
        int expected = 1;

        //then
        assertEquals(expected, MaxMin.maxMin(k, arr));
    }

    @Test
    void case_2_where_k_4_expected_3() {
        //given
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 10, 20, 30, 40, 100, 200);
        int k = 4;
        //when
        int expected = 3;

        //then
        assertEquals(expected, MaxMin.maxMin(k, arr));
    }

    @Test
    void case_3_where_k_3_expected_20() {
        //given
        List<Integer> arr = Arrays.asList(10, 100, 300, 200, 1000, 20, 30);
        int k = 3;
        //when
        int expected = 20;

        //then
        assertEquals(expected, MaxMin.maxMin(k, arr));
    }

    @Test
    void case_4_where_k_2_expected_0() {
        //given
        List<Integer> arr = Arrays.asList(1, 2, 1, 2, 1);
        int k = 2;
        //when
        int expected = 0;

        //then
        assertEquals(expected, MaxMin.maxMin(k, arr));
    }

    @Test
    void case_5_where_k_3_expected_2() {
        //given
        List<Integer> arr = Arrays.asList(100, 200, 300, 350, 400, 401, 402);
        int k = 3;
        //when
        int expected = 2;

        //then
        assertEquals(expected, MaxMin.maxMin(k, arr));
    }
}
