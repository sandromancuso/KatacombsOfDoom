package org.socrates;

class GameState {

    private final Maze maze;
    private Room currentRoom;

    GameState(Room initialRoom, Maze maze) {
        this.currentRoom = initialRoom;
        this.maze = maze;
    }

    void moveNorth() {
        this.currentRoom = maze.roomNorthOf(this.currentRoom);
    }

    Room currentRoom() {
         return currentRoom;
    }
}
