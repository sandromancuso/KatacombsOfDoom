package org.socrates;

import static org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode;
import static org.socrates.Direction.NORTH;
import static org.socrates.Direction.SOUTH;
import static org.socrates.Direction.WEST;

class Position {
    private final int x;
    private final int y;

    Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Position next(Direction direction) {
        if (direction == NORTH)
            return new Position(0, y + 1);
        if (direction == SOUTH)
            return new Position(0, y - 1);
        if (direction == WEST)
            return new Position(x - 1, y);
        return new Position(x + 1, y);
    }

    @Override
    public boolean equals(Object other) {
        return reflectionEquals(this, other);
    }

    @Override
    public int hashCode() {
        return reflectionHashCode(this);
    }

    @Override
    public String toString() {
        return "Position{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
