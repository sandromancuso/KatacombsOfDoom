package org.socrates;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;

import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;

@RunWith(JUnitParamsRunner.class)
public class CommandsShould {

    @Mock LookCommand lookCommand;
    @Mock MoveCommand moveCommand;
    @Mock SuicideCommand suicideCommand;

    private Commands commands;

    @Before
    public void initialise() {
        initMocks(this);
        commands = new Commands(lookCommand, moveCommand, suicideCommand);
    }

    @Test public void
    execute_the_look_command() {
        commands.execute("Look");

        verify(lookCommand).execute();
    }

    @Test
    @Parameters({
            "Move North, NORTH",
            "Move South, SOUTH",
            "Move East, EAST",
            "Move West, WEST"
    })
    public void
    execute_move_north_command(String command , Direction direction) {
        commands.execute(command);

        verify(moveCommand).execute(direction);
    }

    @Test public void
    execute_suicide_command() {
        commands.execute("Suicide");

        verify(suicideCommand).execute();
    }
}