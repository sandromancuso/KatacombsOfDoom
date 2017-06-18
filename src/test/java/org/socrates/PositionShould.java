package org.socrates;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class PositionShould {

    @Test
    @Parameters({
            "NORTH, 0, 1",
            "SOUTH, 0, -1",
            "WEST, -1, 0",
            "EAST, 1, 0",
    })
    public void
    blah(Direction direction, int x, int y) {
        Position position = new Position(0, 0);
        
        assertThat(position.next(direction), is(new Position(x, y)));
    }

}