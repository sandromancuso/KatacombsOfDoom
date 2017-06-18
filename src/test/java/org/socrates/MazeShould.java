package org.socrates;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.socrates.Direction.NORTH;

public class MazeShould {

    private static final Position INITIAL_POSITION = new Position(0, 0);
    private static final Position NORTH_POSITION = new Position(0, 1);
    private static final Room INITIAL_ROOM = new Room("Initial");
    private static final Room NORTH_ROOM = new Room("North");

    private Maze maze;

    @Before
    public void initialise() {
        Map<Position, Room> rooms = new HashMap<>();
        rooms.put(INITIAL_POSITION, INITIAL_ROOM);
        rooms.put(NORTH_POSITION, NORTH_ROOM);
        maze = new Maze(INITIAL_POSITION, rooms);
    }

    @Test public void
    inform_initial_position() {
        assertThat(maze.initialPosition(), is(INITIAL_POSITION));
    }

    @Test public void
    return_a_room_for_a_position_with_a_room() {
        assertThat(maze.roomAt(INITIAL_POSITION), is(INITIAL_ROOM));
    }

    @Test public void
    can_find_position_adjacent() {
        assertThat(maze.positionAdjacentTo(INITIAL_POSITION, NORTH), is(Optional.of(NORTH_POSITION)));
    }

}