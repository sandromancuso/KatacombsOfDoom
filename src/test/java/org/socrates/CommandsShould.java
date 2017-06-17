package org.socrates;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.socrates.Direction.NORTH;

@RunWith(MockitoJUnitRunner.class)
public class CommandsShould {

    @Mock LookCommand lookCommand;
    @Mock MoveCommand moveCommand;
    @Mock SuicideCommand suicideCommand;

    private Commands commands;

    @Before
    public void initialise() {
        commands = new Commands(lookCommand, moveCommand, suicideCommand);
    }

    @Test public void
    execute_the_look_command() {
        commands.execute("Look");

        verify(lookCommand).execute();
    }

    @Test public void
    execute_move_north_command() {
        commands.execute("Move North");

        verify(moveCommand).execute(NORTH);
    }

    @Test public void
    execute_suicide_command() {
        commands.execute("Suicide");

        verify(suicideCommand).execute();
    }
}