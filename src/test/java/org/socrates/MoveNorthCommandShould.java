package org.socrates;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Optional;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class MoveNorthCommandShould {
    @Mock Player player;
    @Mock Console console;

    private MoveNorthCommand moveNorthCommand;

    @Before
    public void initialise() {
        Room northRoom = new Room("North room", Optional.empty());
        given(player.currentRoom()).willReturn(northRoom);
        moveNorthCommand = new MoveNorthCommand(player, console);
    }

    @Test
    public void move_player_north() {
        moveNorthCommand.execute();

        verify(player).moveNorth();
    }

    @Test public void
    display_current_room_after_moving() {
        moveNorthCommand.execute();

        verify(console).write("You are in North room");
    }
}