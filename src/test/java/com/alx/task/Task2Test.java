package com.alx.task;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task2Test {


    public static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(List.of(
                        Interval.of(1, 5),
                        Interval.of(7, 11),
                        Interval.of(6, 10)), 2
                ),
                Arguments.of(List.of(
                        Interval.of(1, 5),
                        Interval.of(7, 11),
                        Interval.of(13, 15)), 1
                ),
                Arguments.of(List.of(
                        Interval.of(1, 3),
                        Interval.of(2, 7),
                        Interval.of(3, 6)), 3
                ),
                Arguments.of(List.of(
                        Interval.of(1, 3),
                        Interval.of(2, 4),
                        Interval.of(4, 8),
                        Interval.of(5, 7),
                        Interval.of(8, 12)), 2
                )
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void getMinParkingCapacity(List<Interval> input, int expected) {
        assertEquals(expected, Task2.getMinParkingCapacity(input));
    }
}