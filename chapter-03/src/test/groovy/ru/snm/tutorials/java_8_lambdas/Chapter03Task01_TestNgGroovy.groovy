package ru.snm.tutorials.java_8_lambdas

import org.testng.Assert
import org.testng.annotations.DataProvider
import org.testng.annotations.Test;

import static org.testng.Assert.*

/**
 * @author sine-loco
 */
class Chapter03Task01_TestNgGroovy {

    @Test( dataProvider = 'forAddUp' )
    void testAddUp( List<Integer> numbers, int expectedSum ) {
        // when
        def actualSum = Chapter03Task01.addUp numbers.stream()

        // then
        assertEquals actualSum, expectedSum
    }

    @DataProvider
    static Object[][] forAddUp() {
        //   numbers        expected sum
        [
            [ [],           0 ],
            [ [ 0 ],        0 ],
            [ [ 1 ],        1 ],
            [ [ 0, 0 ],     0 ],
            [ [ 1, 2 ],     3 ],
            [ [ 1, -5 ],    -4 ],
        ]
    }
}