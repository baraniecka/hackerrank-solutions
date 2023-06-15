package org.baraniecka.week3.exercise_6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.baraniecka.week3.exercise_6_migratory_birds.MigratoryBirds;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MigratoryBirdsTest {

    @Test
    void bird_occurrence_when_one_result() {

        assertEquals(1, MigratoryBirds.migratoryBirds(List.of(1, 2, 1, 3, 4)));
    }

    @Test
    void bird_occurrence_when_two_equal_results() {
        assertEquals(2, MigratoryBirds.migratoryBirds(List.of(2, 2, 3, 3, 4)));

    }

    @Test
    void bird_occurrence_when_three_equal_results() {
        assertEquals(3, MigratoryBirds.migratoryBirds(List.of(3, 2, 1, 3, 4, 5, 4, 5)));
    }

    @Test
    void bird_occurrence_when_unique_ids() {
        assertEquals(1, MigratoryBirds.migratoryBirds(List.of(1, 2, 3, 4, 5)));
    }
}
