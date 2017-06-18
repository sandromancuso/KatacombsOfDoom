package org.socrates;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MazeShould {

    private static final Position INITIAL_POSITION = new Position(0, 0);
    private static final Room INITIAL_ROOM = new Room("Initial");

    private Maze maze;

    @Before
    public void initialise() {
        maze = new Maze(INITIAL_POSITION);
    }

    @Test public void
    inform_initial_position() {
        assertThat(maze.initialPosition(), is(INITIAL_POSITION));
    }

    @Ignore
    @Test public void
    return_a_room_for_a_position_with_a_room() {
        assertThat(maze.roomAt(INITIAL_POSITION), is(INITIAL_ROOM));
    }

}