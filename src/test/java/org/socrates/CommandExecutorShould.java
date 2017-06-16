package org.socrates;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class CommandExecutorShould {

    @Mock
    private Console console;

    private CommandExecutor commandExecutor;

    @Before
    public void initialise() {
        commandExecutor = new CommandExecutor(console);
    }

    @Test public void
    print_that_there_is_an_exit_north_when_receiving_look_command() {
        commandExecutor.execute("Look");

        verify(console).write("There is an exit to the north");
    }

}