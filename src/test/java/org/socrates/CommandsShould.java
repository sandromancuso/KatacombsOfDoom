package org.socrates;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class CommandsShould {

    @Mock
    private Console console;

    @Mock
    private LookCommand lookCommand;

    private Commands commands;

    @Before
    public void initialise() {
        commands = new Commands(lookCommand);
    }

    @Test public void
    execute_the_look_command() {
        commands.execute("Look");

        verify(lookCommand).execute();
    }

}