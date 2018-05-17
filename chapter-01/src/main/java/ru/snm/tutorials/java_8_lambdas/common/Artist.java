package ru.snm.tutorials.java_8_lambdas.common;

import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * An individual or group who creates music.
 *
 * @author sine-loco
 */
public class Artist {
    final String name;

    final List<String> members;

    final String origin;


    public Artist( String name, List<String> members, String origin ) {
        this.name = name;
        this.members = members;
        this.origin = origin;
    }

    public Artist( String name, String origin ) {
        this( name, Collections.emptyList(), origin );
    }
}
