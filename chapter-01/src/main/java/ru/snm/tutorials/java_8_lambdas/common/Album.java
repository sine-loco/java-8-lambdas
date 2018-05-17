package ru.snm.tutorials.java_8_lambdas.common;

import java.util.List;

/**
 * A single release of music, comprising several tracks.
 * 
 * @author sine-loco
 */
public class Album {
    final String name;

    final List<Track> tracks;

    final List<String> musicians;

    public Album( String name, List<Track> tracks, List<String> musicians ) {
        this.name = name;
        this.tracks = tracks;
        this.musicians = musicians;
    }
}
