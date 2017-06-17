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

@RunWith(MockitoJUnitRunner.class)
public class GameStateShould {

    @Mock Room initialRoom;

    private GameState gameState;

    @Before
    public void initialise() {
        gameState = new GameState(initialRoom, new Maze());
    }

    @Test public void
    start_on_initial_room() {
        assertThat(gameState.currentRoom(), is(initialRoom));
    }

    @Test public void
    move_north_when_room_has_north_exit() {
        Room northRoom = new Room("North room", Optional.empty());
        given(initialRoom.north()).willReturn(Optional.of(northRoom));

        gameState.moveNorth();

        assertThat(gameState.currentRoom(), is(northRoom));
    }

    @Test public void
    not_move_north_when_room_does_not_have_north_exit() {
        given(initialRoom.north()).willReturn(Optional.empty());

        gameState.moveNorth();

        assertThat(gameState.currentRoom(), is(initialRoom));
    }

}