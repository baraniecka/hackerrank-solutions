package org.baraniecka.week4.exercise_2_left_rotation;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeftRotationTest {

    @Test
    void shit_list_2_times(){
        //given
        int shift = 2;
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        //when
        List<Integer> result = LeftRotation.rotateLeft(shift, list);
        List<Integer> expected = Arrays.asList(3, 4, 5, 1, 2);
        //then
        assertEquals(expected, result);
    }
}
