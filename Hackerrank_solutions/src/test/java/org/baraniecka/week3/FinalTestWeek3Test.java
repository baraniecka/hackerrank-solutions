package org.baraniecka.week3;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FinalTestWeek3Test {

    @Test
    void case1(){
        //given
        List<Integer> a = new ArrayList<>(Arrays.asList(2,6));
        List<Integer> b = new ArrayList<>(Arrays.asList(24,36));

        //when
        int result = FinalTestWeek3.getTotalX(a,b);

        //then
        assertEquals(2,result);
    }

    @Test
    void case2(){
        //given
        List<Integer> a = new ArrayList<>(Arrays.asList(2,4));
        List<Integer> b = new ArrayList<>(Arrays.asList(16 ,32, 96));

        //when
        int result = FinalTestWeek3.getTotalX(a,b);

        //then
        assertEquals(3,result);
    }
}
