package ru.snm.tutorials.java_8_lambdas;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

import static java.util.Collections.emptyList;
import static org.testng.Assert.assertEquals;
import static ru.snm.tutorials.java_8_lambdas.TestFunctions.of;

/**
 * @author sine-loco
 */
public class Chapter03Task01_TestNgJava {

    @Test( dataProvider = "forAddUp" )
    public void testAddUp( List<Integer> numbers, int expectedSum ) {
        // when
        int actualSum = Chapter03Task01.addUp( numbers.stream() );

        // then
        assertEquals( actualSum, expectedSum );
    }

    @DataProvider
    static Object[][] forAddUp() {
        //      numbers         expected sum
        return new Object[][] {
                { emptyList(),  0 },
                { of( 0 ),      0 },
                { of( 1 ),      1 },
                { of( 0, 0 ),   0 },
                { of( 1, 2 ),   3 },
                { of( 1, -5 ),  -4 },
        };
    }
}