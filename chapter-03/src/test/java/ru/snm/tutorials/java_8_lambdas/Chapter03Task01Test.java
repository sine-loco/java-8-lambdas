package ru.snm.tutorials.java_8_lambdas;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Spliterators;
import java.util.stream.Stream;

import static java.util.stream.StreamSupport.stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author sine-loco
 */
class Chapter03Task01Test {

    @ParameterizedTest
    @MethodSource( "intStreams" )
    @DisplayName( "tests that calculated sum of stream elements is correct" )
    void addUp( Stream<Integer> integers, int expectedSum ) {
        int actualSum = Chapter03Task01.addUp( integers );
        assertEquals( expectedSum, actualSum );
    }

    static Stream<Arguments> intStreams() {
        return Stream.of(
                Arguments.of( Stream.empty(), 0 ),
                Arguments.of( Stream.of( 1 ), 1 ),
                Arguments.of( Stream.of( 0, 0 ), 0 ),
                Arguments.of( Stream.of( 1, 2 ), 3 ),
                Arguments.of( Stream.of( 1, -5 ), -4 )
        );
    }
}