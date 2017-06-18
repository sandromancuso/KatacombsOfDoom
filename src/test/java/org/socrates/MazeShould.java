package org.socrates;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MazeShould {

    private static final Position INITIAL_POSITION = new Position(0, 0);
    private static final Room INITIAL_ROOM = new Room("Initial");

    private Maze maze;

    @Before
    public void initialise() {
        Map<Position, Room> rooms = new HashMap<>();
        rooms.put(INITIAL_POSITION, INITIAL_ROOM);
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

}