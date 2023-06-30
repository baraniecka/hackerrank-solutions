package org.baraniecka.week5.exercise_4_missing_numbers;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingNumbersTest {

    @Test
    void case_1_missing_numbers() {
        //given
        List<Integer> list1 = new ArrayList<>(Arrays.asList(7, 2, 5, 3, 5, 3));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(7, 2, 5, 4, 6, 3, 5, 3));

        //when
        List<Integer> expected = new ArrayList<>(Arrays.asList(4, 6));
        List<Integer> result = MissingNumbers.missingNumbers(list1, list2);

        //then
        assertEquals(expected, result);
    }

    @Test
    void case_2_missing_numbers() {
        //given
        List<Integer> list1 = new ArrayList<>(Arrays.asList(203, 204, 205, 206, 207, 208, 203, 204, 205, 206));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204));

        //when
        List<Integer> expected = new ArrayList<>(Arrays.asList(204, 205, 206));
        List<Integer> result = MissingNumbers.missingNumbers(list1, list2);

        //then
        assertEquals(expected, result);
    }

    @Test
    void case_3_missing_numbers() {
        //given
        List<Integer> list1 = new ArrayList<>(Arrays.asList(11, 4, 11, 7, 13, 4, 12, 11, 10, 14));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(11, 4, 11, 7, 3, 7, 10, 13, 4, 8, 12, 11, 10, 14, 12));

        //when
        List<Integer> expected = new ArrayList<>(Arrays.asList(3, 7, 8, 10, 12));
        List<Integer> result = MissingNumbers.missingNumbers(list1, list2);

        //then
        assertEquals(expected, result);
    }
}
