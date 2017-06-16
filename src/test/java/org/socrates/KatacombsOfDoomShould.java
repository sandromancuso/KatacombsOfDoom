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
    @Mock Commands commands;

    private KatacombsOfDoom katacombsOfDoom;
    private Room room;

    @Before
    public void initialise() {
        given(console.read()).willReturn("Suicide");
        room = new Room("Library");
        katacombsOfDoom = new KatacombsOfDoom(room, commands, console);
    }

    @Test public void
    prompt_player_that_he_is_in_a_room_with_a_given_name() {
        katacombsOfDoom.start();

        verify(console).write("You are in " + room.name());
    }

    @Test public void
    execute_user_command() {
        given(console.read()).willReturn("Look", "Suicide");

        katacombsOfDoom.start();

        verify(commands).execute("Look");
    }

}
