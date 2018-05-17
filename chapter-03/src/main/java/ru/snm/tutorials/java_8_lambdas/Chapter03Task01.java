package ru.snm.tutorials.java_8_lambdas;

import java.util.stream.Stream;

/**
 * Common Stream operations. Implement the following:
 * 
 * @author sine-loco
 */
public class Chapter03Task01 {
    /** A function that adds up numbers, i.e., int addUp(Stream<Integer> numbers) */
    public static int addUp( Stream<Integer> numbers ) {
        return numbers.reduce( 0, ( a, b ) ->  a + b );
    }
}
