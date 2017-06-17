package org.socrates;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Optional;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.socrates.Direction.NORTH;

@RunWith(MockitoJUnitRunner.class)
public class GameStateShould {

    @Mock Room initialRoom;
    @Mock Room northRoom;
    @Mock Maze maze;

    private GameState gameState;

    @Before
    public void initialise() {
        given(maze.initialRoom()).willReturn(initialRoom);
        gameState = new GameState(maze);
    }

    @Test public void
    start_on_initial_room() {
        assertThat(gameState.currentRoom(), is(initialRoom));
    }

    @Test public void
    move_north_when_room_has_north_exit() {
        given(maze.roomAdjacentTo(initialRoom, NORTH)).willReturn(Optional.of(northRoom));

        gameState.move(NORTH);

        assertThat(gameState.currentRoom(), is(northRoom));
    }

    @Test public void
    not_move_north_when_room_does_not_have_north_exit() {
        given(maze.roomAdjacentTo(initialRoom, NORTH)).willReturn(Optional.empty());

        gameState.move(NORTH);

        assertThat(gameState.currentRoom(), is(initialRoom));
    }

}