package org.baraniecka.week5.exercise_2_strong_password;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrongPasswordTest {

    @Test
    void case_1_given_length_shorter_than_6_not_all_characters_expected_2(){
        //given
        String password = "2bbbb";
        int length = 5;

        //when
        int expected = 2;

        //then
        assertEquals(expected, StrongPassword.minimumNumber(length,password));
    }
    @Test
    void case_2_given_shorter_length_than_6_all_characters_expected_2(){
        //given
        String password = "2bB!";
        int length = 4;

        //when
        int expected = 2;

        //then
        assertEquals(expected, StrongPassword.minimumNumber(length,password));
    }

    @Test
    void case_3_given_length_6_not_all_characters_expected_3(){
        //given
        String password = "bbbbbb";
        int length = 6;

        //when
        int expected = 3;

        //then
        assertEquals(expected, StrongPassword.minimumNumber(length,password));
    }

    @Test
    void case_4_given_length_6_all_characters_expected_0(){
        //given
        String password = "2bT%5b";
        int length = 6;

        //when
        int expected = 0;

        //then
        assertEquals(expected, StrongPassword.minimumNumber(length,password));
    }

    @Test
    void case_5_given_length_greater_than_6_not_all_characters_expected_1(){
        //given
        String password = "!?%654JJJ";
        int length = 9;

        //when
        int expected = 1;

        //then
        assertEquals(expected, StrongPassword.minimumNumber(length,password));
    }

    @Test
    void case_6_given_length_greater_than_6_all_characters_expected_0(){
        //given
        String password = "!?%654JoJ";
        int length = 9;

        //when
        int expected = 0;

        //then
        assertEquals(expected, StrongPassword.minimumNumber(length,password));
    }

    @Test
    void case_7_given_length_shorter_than_6_not_all_characters_expected_4(){
        //given
        String password = "!J";
        int length = 2;

        //when
        int expected = 4;

        //then
        assertEquals(expected, StrongPassword.minimumNumber(length,password));
    }
}
