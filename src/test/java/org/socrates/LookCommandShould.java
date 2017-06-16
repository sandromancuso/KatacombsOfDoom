package org.socrates;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class LookCommandShould {

    @Mock
    private Console console;

    private LookCommand lookCommand;

    @Before
    public void initialise() {
        lookCommand = new LookCommand(console);
    }

    @Test public void
    print_there_is_an_exit_to_the_north() {
        lookCommand.execute();

        verify(console).write("There is an exit to the north");
    }

}