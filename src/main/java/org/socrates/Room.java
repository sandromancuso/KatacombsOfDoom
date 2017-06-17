package org.socrates;

import java.util.Optional;

public class Room {
    private String name;

    Room(String name) {
        this.name = name;
    }

    String name() {
        return name;
    }

    Optional<Room> north() {
        throw new UnsupportedOperationException();
    }
}
