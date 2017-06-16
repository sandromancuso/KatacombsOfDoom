package org.socrates;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class KatacombsOfDoomShould {

    @Mock
    private Console console;
    private KatacombsOfDoom katacombsOfDoom;

    @Before
    public void initialise() {
        given(console.read()).willReturn("Suicide");
        katacombsOfDoom = new KatacombsOfDoom(console);
    }

    @Test public void
    prompt_player_that_he_is_in_a_room() {
        katacombsOfDoom.start();

        verify(console).write("You are in a room.");
    }

    @Test public void
    print_there_is_an_exit_north_when_receiving_look_command() {
        given(console.read()).willReturn("Look", "Suicide");

        katacombsOfDoom.start();

        verify(console).write("There is an exit to the north");
    }

    @Test public void
    quit_when_receiving_suicide_command() {
        given(console.read()).willReturn("Suicide");

        katacombsOfDoom.start();

        verify(console).write("See you in hell.");
    }

    @Test public void
    executes_user_commands_until_user_commits_suicide() {
        given(console.read()).willReturn("Look", "Look", "Suicide", "Look");

        katacombsOfDoom.start();

        InOrder inOrder = inOrder(console);
        inOrder.verify(console).write("There is an exit to the north");
        inOrder.verify(console).write("There is an exit to the north");
        inOrder.verify(console).write("See you in hell.");
    }

}
