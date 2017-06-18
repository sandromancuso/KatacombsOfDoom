package org.socrates;

import java.util.Map;
import java.util.Optional;

class Maze {

    private Position initialPosition;
    private Map<Position, Room> rooms;

    public Maze(Position initialPosition, Map<Position, Room> rooms) {
        this.initialPosition = initialPosition;
        this.rooms = rooms;
    }

    Optional<Position> positionAdjacentTo(Position position, Direction north) {
        throw new UnsupportedOperationException();
    }

    Position initialPosition() {
        return initialPosition;
    }

    Room roomAt(Position position) {
        return rooms.get(position);
    }
}