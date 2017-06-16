package org.socrates;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class CommandsShould {

    @Mock LookCommand lookCommand;
    @Mock MoveNorthCommand moveNorthCommand;

    private Commands commands;

    @Before
    public void initialise() {
        commands = new Commands(lookCommand, moveNorthCommand);
    }

    @Test public void
    execute_the_look_command() {
        commands.execute("Look");

        verify(lookCommand).execute();
    }

    @Test public void
    execute_move_north_command() {
        commands.execute("Move North");

        verify(moveNorthCommand).execute();
    }

}