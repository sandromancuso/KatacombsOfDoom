package org.socrates;

class GameState {

    private final Maze maze;
    private Position currentPosition;

    GameState(Maze maze) {
        this.maze = maze;
        this.currentPosition = maze.initialPosition();
    }

    void move(Direction direction) {
        this.currentPosition = maze.positionAdjacentTo(this.currentPosition, direction).orElse(currentPosition);
    }

    Room currentRoom() {
         return maze.roomAt(currentPosition);
    }
}
