package org.socrates;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.socrates.Direction.NORTH;
import static org.socrates.Direction.SOUTH;

@RunWith(MockitoJUnitRunner.class)
public class MoveCommandShould {

    @Mock GameState gameState;
    @Mock Console console;

    private MoveCommand moveCommand;

    @Before
    public void initialise() {
        Room northRoom = new Room("North room");
        given(gameState.currentRoom()).willReturn(northRoom);
        moveCommand = new MoveCommand(gameState, console);
    }

    @Test
    public void move_player_north() {
        moveCommand.execute(NORTH);

        verify(gameState).move(NORTH);
    }

    @Test
    public void move_player_south() {
        moveCommand.execute(SOUTH);

        verify(gameState).move(SOUTH);
    }

    @Test public void
    display_current_room_after_moving() {
        moveCommand.execute(NORTH);

        verify(console).write("You are in North room");
    }
}