package org.socrates;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class MoveNorthCommandShould {
    @Mock Player player;

    @Test
    public void execute_should_move_player_north() {
        MoveNorthCommand moveNorthCommand = new MoveNorthCommand(player);

        moveNorthCommand.execute();

        verify(player).moveNorth();
    }
}