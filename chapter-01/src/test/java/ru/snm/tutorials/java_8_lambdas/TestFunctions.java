package ru.snm.tutorials.java_8_lambdas;

import java.util.Arrays;
import java.util.List;

/**
 * @author sine-loco
 */
abstract class TestFunctions {
    private TestFunctions() {}

    public static List<Integer> of( Integer... args ) {
        return Arrays.asList( args );
    }
}
