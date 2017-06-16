package org.socrates;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class KatacombsOfDoomShould {

    @Mock Console console;
    @Mock
    Commands commands;
    private KatacombsOfDoom katacombsOfDoom;

    @Before
    public void initialise() {
        given(console.read()).willReturn("Suicide");
        katacombsOfDoom = new KatacombsOfDoom(console, commands);
    }

    @Test public void
    prompt_player_that_he_is_in_a_room() {
        katacombsOfDoom.start();

        verify(console).write("You are in a room.");
    }

    @Test public void
    execute_user_command() {
        given(console.read()).willReturn("Look", "Suicide");

        katacombsOfDoom.start();

        verify(commands).execute("Look");
    }

}
