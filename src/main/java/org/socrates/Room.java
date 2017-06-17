package org.socrates;

import java.util.Optional;

public class Room {
    private String name;
    private Optional<Room> northExit;

    Room(String name, Optional<Room> northExit) {
        this.name = name;
        this.northExit = northExit;
    }

    String name() {
        return name;
    }

    Optional<Room> north() {
        return northExit;
    }
}
