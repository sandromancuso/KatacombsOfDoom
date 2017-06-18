package org.socrates;

import java.util.Optional;

class Maze {

    private Position initialPosition;

    public Maze(Position initialPosition) {
        this.initialPosition = initialPosition;
    }

    Optional<Position> positionAdjacentTo(Position position, Direction north) {
        throw new UnsupportedOperationException();
    }

    Position initialPosition() {
        return initialPosition;
    }

    Room roomAt(Position position) {
        throw new UnsupportedOperationException();
    }
}