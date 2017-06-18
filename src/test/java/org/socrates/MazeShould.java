package org.socrates;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MazeShould {

    private static final Position INITIAL_POSITION = new Position(0, 0);

    @Test public void
    inform_initial_position() {
        Maze maze = new Maze(INITIAL_POSITION);

        assertThat(maze.initialPosition(), is(INITIAL_POSITION));
    }

    

}