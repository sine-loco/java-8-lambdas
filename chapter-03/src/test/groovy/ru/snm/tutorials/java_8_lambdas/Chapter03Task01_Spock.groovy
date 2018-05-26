package ru.snm.tutorials.java_8_lambdas

import spock.lang.Specification
import spock.lang.Unroll

/**
 * @author sine-loco
 */
class Chapter03Task01_Spock extends Specification {

    @Unroll
    def "checks that addUp calculates sum of #integers = #expectedSum"() {
        when:
        def actualSum = Chapter03Task01.addUp( integers.stream() )

        then:
        actualSum == expectedSum

        where:
        integers    || expectedSum
        []          || 0
        [ 0 ]       || 0
        [ 1 ]       || 1
        [ 0, 0 ]    || 0
        [ 1, 2 ]    || 3
        [ 1, -5 ]   || -4
    }
}
