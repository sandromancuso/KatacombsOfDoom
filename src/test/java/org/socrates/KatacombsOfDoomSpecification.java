package org.socrates;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class KatacombsOfDoomSpecification {

    @Mock Console console;

    KatacombsOfDoom katacombsOfDoom;

    @Before
    public void initialise() {
        given(console.read()).willReturn("Suicide");
        Player player = new Player();

        LookCommand lookCommand = new LookCommand(console);
        SuicideCommand suicideCommand = new SuicideCommand(console);
        MoveNorthCommand moveNorthCommand = new MoveNorthCommand(player);
        Commands commands = new Commands(lookCommand, moveNorthCommand, suicideCommand);

        Room initialRoom = new Room("Initial room");

        katacombsOfDoom = new KatacombsOfDoom(initialRoom, commands, console);
    }

    @Test
    public void
    quit_when_receiving_suicide_command() {
        given(console.read()).willReturn("Suicide");

        katacombsOfDoom.start();

        verify(console).write("See you in hell.");
    }

    @Test public void
    print_there_is_an_exit_north_when_receiving_look_command() {
        given(console.read()).willReturn("Look", "Suicide");

        katacombsOfDoom.start();

        verify(console).write("There is an exit to the north");
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

    @Ignore
    @Test public void
    displays_the_name_of_the_room_on_entrance() {
        given(console.read()).willReturn("Move North", "Suicide");

        katacombsOfDoom.start();

        InOrder inOrder = inOrder(console);
        inOrder.verify(console).write("You are in Initial room");
        inOrder.verify(console).write("You are in North room");
        inOrder.verify(console).write("See you in hell.");
    }
    
}
