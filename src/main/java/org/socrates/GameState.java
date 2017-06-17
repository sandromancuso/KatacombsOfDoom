package org.socrates;

class GameState {

    private final Maze maze;
    private Room currentRoom;

    GameState(Maze maze) {
        this.maze = maze;
        this.currentRoom = maze.initialRoom();
    }

    void move(Direction north) {
        this.currentRoom = maze.roomNorthOf(this.currentRoom).orElse(currentRoom);
    }

    Room currentRoom() {
         return currentRoom;
    }
}
