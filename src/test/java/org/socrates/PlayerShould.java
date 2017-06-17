package org.socrates;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Optional;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;

@RunWith(MockitoJUnitRunner.class)
public class PlayerShould {

    @Mock Room initialRoom;

    private Player player;

    @Before
    public void initialise() {
        player = new Player(initialRoom);
    }

    @Test public void
    start_on_initial_room() {
        assertThat(player.currentRoom(), is(initialRoom));
    }

    @Test public void
    move_north_when_room_has_north_exit() {
        Room northRoom = new Room("North room", Optional.empty());
        given(initialRoom.north()).willReturn(Optional.of(northRoom));

        player.moveNorth();

        assertThat(player.currentRoom(), is(northRoom));
    }

    @Test public void
    not_move_north_when_room_does_not_have_north_exit() {
        given(initialRoom.north()).willReturn(Optional.empty());

        player.moveNorth();

        assertThat(player.currentRoom(), is(initialRoom));
    }

}