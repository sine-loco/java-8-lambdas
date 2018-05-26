package ru.snm.tutorials.java_8_lambdas;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.snm.tutorials.java_8_lambdas.TestFunctions.*;


/**
 * @author sine-loco
 */
@RunWith( JUnitPlatform.class )
class Chapter03Task01_Junit5 {

    @ParameterizedTest
    @MethodSource( "intStreams" )
    @DisplayName( "tests that calculated sum of stream elements is correct" )
    void addUp( List<Integer> integers, int expectedSum ) {
        // when
        int actualSum = Chapter03Task01.addUp( integers.stream() );

        // then
        assertEquals( expectedSum, actualSum );
    }

    private static Stream<Arguments> intStreams() {
        return Stream.of(
                Arguments.of( Collections.emptyList(), 0 ),
                Arguments.of( of( 0 ), 0 ),
                Arguments.of( of( 1 ), 1 ),
                Arguments.of( of( 0, 0 ), 0 ),
                Arguments.of( of( 1, 2 ), 3 ),
                Arguments.of( of( 1, -5 ), -4 )
        );
    }

}