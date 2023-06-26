package org.baraniecka.week4;

import org.baraniecka.week4.exercise_1_picking_numbers.PickingNumbers;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PickingNumbersTest {

    @Test
    void longest_subsequence_case_1() {
        //given
        List<Integer> list = Arrays.asList(4, 6, 5, 3, 3, 1);
        int result = PickingNumbers.pickingNumbers(list);

        //when
        int expected = 3;

        //then
        assertEquals(expected, result);
    }

    @Test
    void longest_subsequence_case_2() {
        //given
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 1, 2);
        int result = PickingNumbers.pickingNumbers(list);

        //when
        int expected = 5;

        //then
        assertEquals(expected, result);
    }

    @Test
    void longest_subsequence_case_3() {
        //given
        List<Integer> list = Arrays.asList(1, 1, 2, 2, 4, 4, 5, 5, 5);
        int result = PickingNumbers.pickingNumbers(list);

        //when
        int expected = 5;

        //then
        assertEquals(expected, result);
    }

}
