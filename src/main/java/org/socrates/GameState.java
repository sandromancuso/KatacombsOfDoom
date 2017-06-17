package org.socrates;

class GameState {

    private final Maze maze;
    private Room currentRoom;

    GameState(Maze maze) {
        this.maze = maze;
        this.currentRoom = maze.initialRoom();
    }

    void move(Direction direction) {
        this.currentRoom = maze.roomAdjacentTo(this.currentRoom, direction).orElse(currentRoom);
    }

    Room currentRoom() {
         return currentRoom;
    }
}
