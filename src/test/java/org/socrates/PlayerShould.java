package org.socrates;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PlayerShould {

    @Test public void
    start_on_initial_room() {
        Room initialRoom = new Room("Initial room");
        Player player = new Player(initialRoom);

        assertThat(player.currentRoom(), is(initialRoom));
    }

}