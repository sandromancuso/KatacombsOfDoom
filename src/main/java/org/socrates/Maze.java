package org.socrates;

public class Maze {
    public Maze() {
    }

    Room roomNorthOf(Room currentRoom) {
        return currentRoom.north().orElse(currentRoom);
    }
}