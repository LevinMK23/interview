package com.alx.task1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {


    public static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of("()(())((()))", true),
                Arguments.of("(())()()(()())", true),
                Arguments.of("(()", false),
                Arguments.of("", false),
                Arguments.of(null, true)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void isValidSequenceTest1(String src, boolean expected) {
        String source = "(())()";
        assertEquals(expected, Task1.isValidSequence(src));
    }
}